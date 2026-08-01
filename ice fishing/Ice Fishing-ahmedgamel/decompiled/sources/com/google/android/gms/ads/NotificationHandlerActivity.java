package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import q2.C4880f;
import q2.C4896n;
import q2.C4900p;
import v2.i;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C4896n c4896n = C4900p.f40199g.f40201b;
            BinderC3464kd binderC3464kd = new BinderC3464kd();
            c4896n.getClass();
            InterfaceC3251ge interfaceC3251ge = (InterfaceC3251ge) new C4880f(c4896n, this, binderC3464kd).d(this, false);
            if (interfaceC3251ge == null) {
                i.c("OfflineUtils is null");
            } else {
                interfaceC3251ge.m0(getIntent());
            }
        } catch (RemoteException e9) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e9.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
