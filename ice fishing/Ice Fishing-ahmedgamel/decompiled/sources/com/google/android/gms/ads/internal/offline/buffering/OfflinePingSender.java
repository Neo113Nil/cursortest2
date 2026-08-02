package com.google.android.gms.ads.internal.offline.buffering;

import J0.m;
import J0.p;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import s2.C4929f;
import s2.C4945n;
import s2.C4949p;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3274ge f24339u;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C4945n c4945n = C4949p.f40498g.f40500b;
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        c4945n.getClass();
        this.f24339u = (InterfaceC3274ge) new C4929f(c4945n, context, binderC3487kd).d(context, false);
    }

    @Override // androidx.work.Worker
    public final p doWork() {
        try {
            this.f24339u.h();
            return p.a();
        } catch (RemoteException unused) {
            return new m();
        }
    }
}
