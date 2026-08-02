package com.google.android.play.core.hsdp.service;

import N3.B;
import N3.C;
import N3.g;
import N3.o;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.HashMap;
import java.util.Objects;
import l4.q;

/* loaded from: classes2.dex */
public class HsdpShimActivity extends Activity {

    /* renamed from: n, reason: collision with root package name */
    public String f36948n = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36949u = false;

    public final void a(boolean z6) {
        HashMap hashMap;
        o oVar;
        IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            throw new IllegalStateException("windowToken is null");
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("target_package_name");
        if (stringExtra == null) {
            throw new IllegalStateException("targetPackageName is null");
        }
        B U8 = C.U(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        if (!z6 && stringExtra.equals(this.f36948n) && (oVar = (o) ((g) U8).f1973c.get(stringExtra)) != null && oVar.f2004a == 2) {
            if (Log.isLoggable("HsdpShimActivity", 4)) {
                Log.i("HsdpShimActivity", "HSDP is already showing for " + stringExtra + ", ignore.");
                return;
            }
            return;
        }
        this.f36948n = stringExtra;
        this.f36949u = false;
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
        int T8 = C.T(this, getResources().getConfiguration().screenWidthDp);
        int W3 = C.W(this);
        q qVar = new q();
        qVar.f38945n = stringExtra;
        qVar.f38946u = stringExtra2;
        qVar.f38947v = hashMap;
        Objects.requireNonNull(this);
        qVar.f38948w = this;
        ((g) U8).a(stringExtra, stringExtra3, windowToken, T8, W3, booleanExtra, qVar);
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
        setContentView(C5248R.layout.hsdp_shim_activity);
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
