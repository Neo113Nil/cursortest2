package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import s2.C4929f;
import s2.C4945n;
import s2.C4949p;
import x2.i;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C4945n c4945n = C4949p.f40498g.f40500b;
            BinderC3487kd binderC3487kd = new BinderC3487kd();
            c4945n.getClass();
            InterfaceC3274ge interfaceC3274ge = (InterfaceC3274ge) new C4929f(c4945n, this, binderC3487kd).d(this, false);
            if (interfaceC3274ge == null) {
                i.c("OfflineUtils is null");
            } else {
                interfaceC3274ge.m0(getIntent());
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
