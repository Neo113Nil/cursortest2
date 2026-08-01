package com.google.android.gms.ads.internal.offline.buffering;

import J0.n;
import J0.q;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import q2.C4880f;
import q2.C4896n;
import q2.C4900p;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3251ge f23559u;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C4896n c4896n = C4900p.f40199g.f40201b;
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        c4896n.getClass();
        this.f23559u = (InterfaceC3251ge) new C4880f(c4896n, context, binderC3464kd).d(context, false);
    }

    @Override // androidx.work.Worker
    public final q doWork() {
        try {
            this.f23559u.h();
            return q.a();
        } catch (RemoteException unused) {
            return new n();
        }
    }
}
