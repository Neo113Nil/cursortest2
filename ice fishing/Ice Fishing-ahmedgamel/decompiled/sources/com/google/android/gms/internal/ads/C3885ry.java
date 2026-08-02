package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ry, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3885ry implements InterfaceC3832qy {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f34546a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f34547b = new PriorityQueue();

    public C3885ry(Executor executor) {
        this.f34546a = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3832qy
    public final void a(Runnable runnable, long j6) {
        if (j6 <= 0) {
            this.f34546a.execute(runnable);
            return;
        }
        C3993ty c3993ty = new C3993ty(runnable, System.currentTimeMillis() + j6);
        PriorityQueue priorityQueue = this.f34547b;
        synchronized (priorityQueue) {
            priorityQueue.add(c3993ty);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3832qy
    public final void f() {
        PriorityQueue priorityQueue = this.f34547b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long currentTimeMillis = System.currentTimeMillis();
                for (C3993ty c3993ty = (C3993ty) priorityQueue.peek(); c3993ty != null && c3993ty.f35206u <= currentTimeMillis; c3993ty = (C3993ty) priorityQueue.peek()) {
                    priorityQueue2.add(c3993ty);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f34546a.execute(((C3993ty) it.next()).f35205n);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
