package com.yandex.passport.internal.ui.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.a;
import com.yandex.passport.common.browser.c;
import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.analytics.q0;
import com.yandex.passport.internal.analytics.t;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* loaded from: classes4.dex */
public class SocialBrowserActivity extends Activity {
    public static WeakReference d;
    public q0 a;
    public final a b = new a(8, this);
    public static final Handler c = new Handler();
    public static final String e = "uri";

    public static Intent a(Context context, Uri uri) {
        Intent intent = new Intent(context, (Class<?>) SocialBrowserActivity.class);
        intent.setData(uri);
        return intent;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q0 socialBrowserReporter = com.yandex.passport.internal.di.a.a().getSocialBrowserReporter();
        this.a = socialBrowserReporter;
        if (bundle != null) {
            socialBrowserReporter.getClass();
            socialBrowserReporter.a(t.d, new Pair("task_id", String.valueOf(getTaskId())));
            return;
        }
        if (getIntent().getData() == null) {
            q0 q0Var = this.a;
            q0Var.getClass();
            q0Var.a(t.c, new Pair("task_id", String.valueOf(getTaskId())));
            finish();
            return;
        }
        Uri data = getIntent().getData();
        data.getClass();
        Uri uri = c.a;
        b.Companion.getClass();
        String uri2 = data.toString();
        uri2.getClass();
        Object d2 = c.d(this, uri2);
        r7o r7oVar = z7o.b;
        if (!(d2 instanceof t7o)) {
            d2 = new com.yandex.passport.common.browser.a((String) d2);
        }
        if (d2 instanceof t7o) {
            d2 = null;
        }
        com.yandex.passport.common.browser.a aVar = (com.yandex.passport.common.browser.a) d2;
        q0 q0Var2 = this.a;
        if (aVar == null) {
            ActivityNotFoundException activityNotFoundException = new ActivityNotFoundException();
            q0Var2.getClass();
            q0Var2.a(t.e, new Pair("error", Log.getStackTraceString(activityNotFoundException)));
            setResult(0);
            finish();
            return;
        }
        String str = aVar.a;
        q0Var2.getClass();
        t tVar = t.f;
        if (str == null) {
            str = "null";
        }
        q0Var2.a(tVar, new Pair("target_package_name", str), new Pair("task_id", String.valueOf(getTaskId())));
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri uri = (Uri) intent.getParcelableExtra(e);
        if (uri == null) {
            setResult(0);
            q0 q0Var = this.a;
            q0Var.getClass();
            q0Var.a(t.h, new Pair("task_id", String.valueOf(getTaskId())));
        } else {
            Intent intent2 = new Intent();
            intent2.setData(uri);
            setResult(-1, intent2);
            q0 q0Var2 = this.a;
            q0Var2.getClass();
            q0Var2.a(t.i, new Pair("task_id", String.valueOf(getTaskId())));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onPause() {
        d = null;
        c.removeCallbacks(this.b);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        a aVar = this.b;
        d = new WeakReference(aVar);
        c.post(aVar);
    }
}
