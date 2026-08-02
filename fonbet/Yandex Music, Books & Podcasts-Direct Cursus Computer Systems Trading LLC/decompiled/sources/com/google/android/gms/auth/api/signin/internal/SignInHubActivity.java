package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.t;
import com.connectsdk.service.DeviceService;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.dzw;
import defpackage.ihr;
import defpackage.ozw;
import defpackage.q4r;
import defpackage.rgg;
import defpackage.sgg;
import defpackage.tgg;
import defpackage.tmd;
import defpackage.ugg;
import defpackage.vgg;
import defpackage.xq0;
import defpackage.z6n;
import java.lang.reflect.Modifier;
import java.util.Set;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends t {
    public static boolean f = false;
    public boolean a = false;
    public SignInConfiguration b;
    public boolean c;
    public int d;
    public Intent e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dzf, java.lang.Object] */
    public final void j() {
        rgg supportLoaderManager = getSupportLoaderManager();
        z6n z6nVar = new z6n(20, this);
        vgg vggVar = (vgg) supportLoaderManager;
        ?? r2 = vggVar.a;
        ugg uggVar = vggVar.b;
        boolean z = uggVar.l;
        q4r q4rVar = uggVar.k;
        if (z) {
            xq0.q("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            xq0.q("initLoader must be called on the main thread");
            return;
        }
        sgg sggVar = (sgg) q4rVar.c(0);
        if (sggVar == 0) {
            try {
                uggVar.l = true;
                Set set = tmd.a;
                synchronized (set) {
                }
                dzw dzwVar = new dzw(this, set);
                if (dzw.class.isMemberClass() && !Modifier.isStatic(dzw.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dzwVar);
                }
                sgg sggVar2 = new sgg(dzwVar);
                q4rVar.e(0, sggVar2);
                uggVar.l = false;
                tgg tggVar = new tgg(sggVar2.l, z6nVar);
                sggVar2.f(r2, tggVar);
                tgg tggVar2 = sggVar2.n;
                if (tggVar2 != null) {
                    sggVar2.j(tggVar2);
                }
                sggVar2.m = r2;
                sggVar2.n = tggVar;
            } catch (Throwable th) {
                uggVar.l = false;
                throw th;
            }
        } else {
            tgg tggVar3 = new tgg(sggVar.l, z6nVar);
            sggVar.f(r2, tggVar3);
            tgg tggVar4 = sggVar.n;
            if (tggVar4 != null) {
                sggVar.j(tggVar4);
            }
            sggVar.m = r2;
            sggVar.n = tggVar3;
        }
        f = false;
    }

    public final void k(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f = false;
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.a) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                ozw F = ozw.F(this);
                GoogleSignInOptions googleSignInOptions = this.b.b;
                synchronized (F) {
                    ((ihr) F.b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.c = true;
                this.d = i2;
                this.e = intent;
                j();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                k(intExtra);
                return;
            }
        }
        k(8);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            k(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            k(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(DeviceService.KEY_CONFIG);
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(DeviceService.KEY_CONFIG);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.b = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.c = z;
            if (z) {
                this.d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.e = intent2;
                    j();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f) {
            setResult(0);
            k(12502);
            return;
        }
        f = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra(DeviceService.KEY_CONFIG, this.b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            k(17);
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f = false;
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.c);
        if (this.c) {
            bundle.putInt("signInResultCode", this.d);
            bundle.putParcelable("signInResultData", this.e);
        }
    }
}
