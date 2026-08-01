package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class AP {

    /* renamed from: a, reason: collision with root package name */
    public final C3676oQ f23675a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f23676b;

    public /* synthetic */ AP(CopyOnWriteArrayList copyOnWriteArrayList, C3676oQ c3676oQ) {
        this.f23676b = copyOnWriteArrayList;
        this.f23675a = c3676oQ;
    }

    public void a(InterfaceC2992bn interfaceC2992bn) {
        Iterator it = this.f23676b.iterator();
        while (it.hasNext()) {
            C3784qQ c3784qQ = (C3784qQ) it.next();
            RunnableC3191fP runnableC3191fP = new RunnableC3191fP(3, interfaceC2992bn, c3784qQ.f33242b);
            Handler handler = c3784qQ.f33241a;
            String str = AbstractC3159eu.f29993a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    runnableC3191fP.run();
                } else {
                    handler.post(runnableC3191fP);
                }
            }
        }
    }
}
