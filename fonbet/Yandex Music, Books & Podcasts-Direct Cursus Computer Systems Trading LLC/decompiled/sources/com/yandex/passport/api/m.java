package com.yandex.passport.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.passport.internal.report.te;
import com.yandex.passport.internal.report.ye;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class m {
    public static final com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.c;
    public static final com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.e;

    public static com.yandex.passport.internal.impl.r0 a(Context context) {
        IReporterYandex b2 = ye.b(context);
        Thread.setDefaultUncaughtExceptionHandler(new com.yandex.passport.internal.n(new te(context, b2)));
        com.yandex.passport.internal.v.c(context, b2);
        return new com.yandex.passport.internal.impl.r0(context.getApplicationContext(), b2);
    }

    public static q b(Intent intent) {
        if (intent == null) {
            throw new com.yandex.passport.api.exception.t("intent is null");
        }
        List stringArrayListExtra = intent.getStringArrayListExtra("com.yandex.auth.FLOW_ERRORS");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = Collections.EMPTY_LIST;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES");
        if (stringArrayExtra != null) {
            throw new com.yandex.passport.api.exception.t(TextUtils.join(", ", stringArrayExtra), stringArrayListExtra);
        }
        if (intent.getStringExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN") == null) {
            throw new com.yandex.passport.api.exception.t("intent does'n contains token", stringArrayListExtra);
        }
        if (intent.getStringExtra("com.yandex.auth.CLIENT_ID") == null) {
            throw new com.yandex.passport.api.exception.t("intent does'n contains clientId", stringArrayListExtra);
        }
        if (intent.getStringExtra("com.yandex.auth.JWT_TOKEN") == null) {
            throw new com.yandex.passport.api.exception.t("intent does'n contains jwtToken", stringArrayListExtra);
        }
        if (intent.getStringArrayListExtra("com.yandex.auth.GRANTED_SCOPES") == null) {
            throw new com.yandex.passport.api.exception.t("intent does'n contains grantedScopes", stringArrayListExtra);
        }
        stringArrayListExtra.getClass();
        return new q();
    }
}
