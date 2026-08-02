package com.google.android.gms.ads;

import Y2.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC3596me;
import s2.C4923c;
import s2.C4945n;
import s2.C4949p;
import x2.i;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3596me f24333n;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        try {
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.r3(i, i4, intent);
            }
        } catch (Exception e9) {
            i.i("#007 Could not call remote method.", e9);
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                if (!interfaceC3596me.e()) {
                    return;
                }
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
        super.onBackPressed();
        try {
            InterfaceC3596me interfaceC3596me2 = this.f24333n;
            if (interfaceC3596me2 != null) {
                interfaceC3596me2.o();
            }
        } catch (RemoteException e10) {
            i.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.d3(new b(configuration));
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.a("AdActivity onCreate");
        C4945n c4945n = C4949p.f40498g.f40500b;
        c4945n.getClass();
        C4923c c4923c = new C4923c(c4945n, this);
        Intent intent = getIntent();
        boolean z6 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z6 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            i.c("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC3596me interfaceC3596me = (InterfaceC3596me) c4923c.d(this, z6);
        this.f24333n = interfaceC3596me;
        if (interfaceC3596me == null) {
            i.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC3596me.A0(bundle);
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i.a("AdActivity onDestroy");
        try {
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.I();
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.k();
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.p1(i, strArr, iArr);
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.g();
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.j();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.x1(bundle);
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.n();
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.E();
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
            InterfaceC3596me interfaceC3596me = this.f24333n;
            if (interfaceC3596me != null) {
                interfaceC3596me.d();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        InterfaceC3596me interfaceC3596me = this.f24333n;
        if (interfaceC3596me != null) {
            try {
                interfaceC3596me.I0();
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        InterfaceC3596me interfaceC3596me = this.f24333n;
        if (interfaceC3596me != null) {
            try {
                interfaceC3596me.I0();
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC3596me interfaceC3596me = this.f24333n;
        if (interfaceC3596me != null) {
            try {
                interfaceC3596me.I0();
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }
}
