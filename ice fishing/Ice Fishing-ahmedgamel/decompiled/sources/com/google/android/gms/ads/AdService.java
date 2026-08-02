package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import s2.C4929f;
import s2.C4945n;
import s2.C4949p;
import x2.i;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C4945n c4945n = C4949p.f40498g.f40500b;
            BinderC3487kd binderC3487kd = new BinderC3487kd();
            c4945n.getClass();
            ((InterfaceC3274ge) new C4929f(c4945n, this, binderC3487kd).d(this, false)).m0(intent);
        } catch (RemoteException e9) {
            i.c("RemoteException calling handleNotificationIntent: ".concat(e9.toString()));
        }
    }
}
