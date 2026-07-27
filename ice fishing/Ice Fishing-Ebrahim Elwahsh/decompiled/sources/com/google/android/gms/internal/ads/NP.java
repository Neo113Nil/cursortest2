package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class NP {

    /* renamed from: a, reason: collision with root package name */
    public final BQ f26543a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f26544b;

    public /* synthetic */ NP(CopyOnWriteArrayList copyOnWriteArrayList, BQ bq) {
        this.f26544b = copyOnWriteArrayList;
        this.f26543a = bq;
    }

    public void a(InterfaceC3273gn interfaceC3273gn) {
        Iterator it = this.f26544b.iterator();
        while (it.hasNext()) {
            DQ dq = (DQ) it.next();
            RunnableC3903sP runnableC3903sP = new RunnableC3903sP(4, interfaceC3273gn, dq.f24442b);
            Handler handler = dq.f24441a;
            String str = AbstractC3548lu.f32613a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    runnableC3903sP.run();
                } else {
                    handler.post(runnableC3903sP);
                }
            }
        }
    }
}
