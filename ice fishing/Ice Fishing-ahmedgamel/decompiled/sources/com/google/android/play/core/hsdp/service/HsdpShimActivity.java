package com.google.android.play.core.hsdp.service;

import L3.E;
import L3.F;
import L3.g;
import L3.r;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.icefishing.icefishingbigwin.C5275R;
import d6.c;
import j4.q;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public class HsdpShimActivity extends Activity {

    /* renamed from: n, reason: collision with root package name */
    public String f36181n = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36182u = false;

    public final void a(boolean z3) {
        HashMap hashMap;
        r rVar;
        IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            throw new IllegalStateException("windowToken is null");
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("target_package_name");
        if (stringExtra == null) {
            throw new IllegalStateException("targetPackageName is null");
        }
        E t6 = F.t(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        if (!z3 && stringExtra.equals(this.f36181n) && (rVar = (r) ((g) t6).f1694c.get(stringExtra)) != null && rVar.f1731a == 2) {
            if (Log.isLoggable("HsdpShimActivity", 4)) {
                Log.i("HsdpShimActivity", "HSDP is already showing for " + stringExtra + ", ignore.");
                return;
            }
            return;
        }
        this.f36181n = stringExtra;
        this.f36182u = false;
        String stringExtra2 = intent.getStringExtra("referrer");
        if (stringExtra2 == null) {
            throw new IllegalStateException("referrer is null");
        }
        String stringExtra3 = intent.getStringExtra("deeplink_url");
        if (stringExtra3 == null) {
            throw new IllegalStateException("deeplinkUrl is null");
        }
        boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
        Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
        if (bundleExtra != null) {
            hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                String string = bundleExtra.getString(str);
                if (string == null) {
                    string = "";
                }
                hashMap.put(str, string);
            }
        } else {
            hashMap = null;
        }
        int s9 = c.s(this, getResources().getConfiguration().screenWidthDp);
        int t9 = c.t(this);
        q qVar = new q();
        qVar.f38433n = stringExtra;
        qVar.f38434u = stringExtra2;
        qVar.f38435v = hashMap;
        Objects.requireNonNull(this);
        qVar.f38436w = this;
        ((g) t6).a(stringExtra, stringExtra3, windowToken, s9, t9, booleanExtra, qVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("HsdpShimActivity", "shim activity onAttachedToWindow");
        a(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.i("HsdpShimActivity", "shim activity onConfigurationChanged");
        a(true);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.hsdp_shim_activity);
        Window window = getWindow();
        window.setLayout(-1, -1);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Log.i("HsdpShimActivity", "shim activity onDestroy");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("HsdpShimActivity", "shim activity onNewIntent");
        setIntent(intent);
        a(false);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        Log.i("HsdpShimActivity", "shim activity onPause");
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Log.i("HsdpShimActivity", "shim activity onResume");
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Log.i("HsdpShimActivity", "shim activity onStart");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        Log.i("HsdpShimActivity", "shim activity onStop");
    }
}
