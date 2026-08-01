package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import q2.C4880f;
import q2.C4896n;
import q2.C4900p;
import v2.i;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C4896n c4896n = C4900p.f40199g.f40201b;
            BinderC3464kd binderC3464kd = new BinderC3464kd();
            c4896n.getClass();
            ((InterfaceC3251ge) new C4880f(c4896n, this, binderC3464kd).d(this, false)).m0(intent);
        } catch (RemoteException e9) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e9.toString()));
        }
    }
}
