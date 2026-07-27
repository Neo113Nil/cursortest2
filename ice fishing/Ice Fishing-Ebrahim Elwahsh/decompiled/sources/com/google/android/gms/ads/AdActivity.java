package com.google.android.gms.ads;

import V2.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC3424je;
import q2.C4881c;
import q2.C4903n;
import q2.C4907p;
import u2.i;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3424je f23709n;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.l1(i, i4, intent);
            }
        } catch (Exception e6) {
            i.i("#007 Could not call remote method.", e6);
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                if (!interfaceC3424je.e()) {
                    return;
                }
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
        super.onBackPressed();
        try {
            InterfaceC3424je interfaceC3424je2 = this.f23709n;
            if (interfaceC3424je2 != null) {
                interfaceC3424je2.c();
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.F(new b(configuration));
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.a("AdActivity onCreate");
        C4903n c4903n = C4907p.f40108g.f40110b;
        c4903n.getClass();
        C4881c c4881c = new C4881c(c4903n, this);
        Intent intent = getIntent();
        boolean z8 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z8 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            i.c("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC3424je interfaceC3424je = (InterfaceC3424je) c4881c.d(this, z8);
        this.f23709n = interfaceC3424je;
        if (interfaceC3424je == null) {
            i.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC3424je.r3(bundle);
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i.a("AdActivity onDestroy");
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.y();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        i.a("AdActivity onPause");
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.k();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.d1(i, strArr, iArr);
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        i.a("AdActivity onRestart");
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.l();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        i.a("AdActivity onResume");
        super.onResume();
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.j();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.g1(bundle);
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        i.a("AdActivity onStart");
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.h();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        i.a("AdActivity onStop");
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.I();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC3424je interfaceC3424je = this.f23709n;
            if (interfaceC3424je != null) {
                interfaceC3424je.f();
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        InterfaceC3424je interfaceC3424je = this.f23709n;
        if (interfaceC3424je != null) {
            try {
                interfaceC3424je.w();
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        InterfaceC3424je interfaceC3424je = this.f23709n;
        if (interfaceC3424je != null) {
            try {
                interfaceC3424je.w();
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC3424je interfaceC3424je = this.f23709n;
        if (interfaceC3424je != null) {
            try {
                interfaceC3424je.w();
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
        }
    }
}
