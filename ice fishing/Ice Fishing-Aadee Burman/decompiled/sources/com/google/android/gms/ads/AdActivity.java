package com.google.android.gms.ads;

import W2.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC3573me;
import q2.C4874c;
import q2.C4896n;
import q2.C4900p;
import v2.i;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3573me f23553n;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i6, Intent intent) {
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.x3(i, i6, intent);
            }
        } catch (Exception e9) {
            i.i("#007 Could not call remote method.", e9);
        }
        super.onActivityResult(i, i6, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                if (!interfaceC3573me.e()) {
                    return;
                }
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
        super.onBackPressed();
        try {
            InterfaceC3573me interfaceC3573me2 = this.f23553n;
            if (interfaceC3573me2 != null) {
                interfaceC3573me2.o();
            }
        } catch (RemoteException e10) {
            i.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.I0(new b(configuration));
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.a("AdActivity onCreate");
        C4896n c4896n = C4900p.f40196g.f40198b;
        c4896n.getClass();
        C4874c c4874c = new C4874c(c4896n, this);
        Intent intent = getIntent();
        boolean z3 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z3 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            i.c("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC3573me interfaceC3573me = (InterfaceC3573me) c4874c.d(this, z3);
        this.f23553n = interfaceC3573me;
        if (interfaceC3573me == null) {
            i.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC3573me.D0(bundle);
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i.a("AdActivity onDestroy");
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.J();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        i.a("AdActivity onPause");
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.k();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.q1(i, strArr, iArr);
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        i.a("AdActivity onRestart");
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.g();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        i.a("AdActivity onResume");
        super.onResume();
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.j();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.F1(bundle);
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        i.a("AdActivity onStart");
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.n();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        i.a("AdActivity onStop");
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.E();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC3573me interfaceC3573me = this.f23553n;
            if (interfaceC3573me != null) {
                interfaceC3573me.d();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        InterfaceC3573me interfaceC3573me = this.f23553n;
        if (interfaceC3573me != null) {
            try {
                interfaceC3573me.L0();
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        InterfaceC3573me interfaceC3573me = this.f23553n;
        if (interfaceC3573me != null) {
            try {
                interfaceC3573me.L0();
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC3573me interfaceC3573me = this.f23553n;
        if (interfaceC3573me != null) {
            try {
                interfaceC3573me.L0();
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }
}
