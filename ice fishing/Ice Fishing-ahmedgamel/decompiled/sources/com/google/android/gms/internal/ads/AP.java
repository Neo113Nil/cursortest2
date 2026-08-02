package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class AP {

    /* renamed from: a, reason: collision with root package name */
    public final C3860rQ f24455a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f24456b;

    public /* synthetic */ AP(CopyOnWriteArrayList copyOnWriteArrayList, C3860rQ c3860rQ) {
        this.f24456b = copyOnWriteArrayList;
        this.f24455a = c3860rQ;
    }

    public void a(InterfaceC3068cn interfaceC3068cn) {
        Iterator it = this.f24456b.iterator();
        while (it.hasNext()) {
            C3968tQ c3968tQ = (C3968tQ) it.next();
            RunnableC3214fP runnableC3214fP = new RunnableC3214fP(3, interfaceC3068cn, c3968tQ.f35079b);
            Handler handler = c3968tQ.f35078a;
            String str = AbstractC3182eu.f30782a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    runnableC3214fP.run();
                } else {
                    handler.post(runnableC3214fP);
                }
            }
        }
    }
}
