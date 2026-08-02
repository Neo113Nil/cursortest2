package com.yandex.passport.internal.social;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.report.sb;
import com.yandex.passport.internal.report.tb;
import com.yandex.passport.internal.report.ub;
import defpackage.xy0;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes4.dex */
public abstract class NativeSocialHelper {
    public static final xy0 a;

    static {
        xy0 xy0Var = new xy0(0);
        a = xy0Var;
        xy0Var.put(w1.a, "com.yandex.passport.action.NATIVE_SOCIAL_VKONTAKTE_AUTH");
        xy0Var.put(w1.b, "com.yandex.passport.action.NATIVE_SOCIAL_FACEBOOK_AUTH");
        xy0Var.put(w1.f, "com.yandex.passport.action.NATIVE_SOCIAL_GOOGLE_AUTH");
        xy0Var.put(w1.i, "com.yandex.passport.action.NATIVE_MAILISH_GOOGLE_AUTH");
    }

    public static void onCancel(@NonNull Activity activity) {
        activity.setResult(0);
        activity.finish();
        a1 socialReporter = com.yandex.passport.internal.di.a.a().getSocialReporter();
        socialReporter.getClass();
        socialReporter.p(sb.d);
    }

    public static void onFailure(@NonNull Activity activity, @NonNull Exception exc) {
        exc.getClass();
        com.yandex.passport.legacy.a.e(6, "Error native auth", exc);
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, exc);
        activity.setResult(0, intent);
        activity.finish();
        a1 socialReporter = com.yandex.passport.internal.di.a.a().getSocialReporter();
        socialReporter.getClass();
        socialReporter.n(tb.d, new ff(exc));
    }

    public static void onNativeNotSupported(@NonNull Activity activity) {
        com.yandex.passport.legacy.a.e(6, "Native auth not supported", null);
        activity.setResult(100);
        activity.finish();
        a1 socialReporter = com.yandex.passport.internal.di.a.a().getSocialReporter();
        socialReporter.getClass();
        socialReporter.p(ub.d);
    }

    public static void onTokenReceived(@NonNull Activity activity, @NonNull String str, @NonNull String str2) {
        Intent intent = new Intent();
        intent.putExtra("social-token", str);
        intent.putExtra("application-id", str2);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
