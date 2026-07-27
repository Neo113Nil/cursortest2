package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ry, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3862ry implements InterfaceC3809qy {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f33778a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f33779b = new PriorityQueue();

    public C3862ry(Executor executor) {
        this.f33778a = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3809qy
    public final void a(Runnable runnable, long j6) {
        if (j6 <= 0) {
            this.f33778a.execute(runnable);
            return;
        }
        C3970ty c3970ty = new C3970ty(runnable, System.currentTimeMillis() + j6);
        PriorityQueue priorityQueue = this.f33779b;
        synchronized (priorityQueue) {
            priorityQueue.add(c3970ty);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3809qy
    public final void f() {
        PriorityQueue priorityQueue = this.f33779b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long currentTimeMillis = System.currentTimeMillis();
                for (C3970ty c3970ty = (C3970ty) priorityQueue.peek(); c3970ty != null && c3970ty.f34432u <= currentTimeMillis; c3970ty = (C3970ty) priorityQueue.peek()) {
                    priorityQueue2.add(c3970ty);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f33778a.execute(((C3970ty) it.next()).f34431n);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
