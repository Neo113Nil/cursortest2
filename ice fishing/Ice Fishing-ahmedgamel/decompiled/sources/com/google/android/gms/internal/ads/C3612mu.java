package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.mu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3612mu {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f33402a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final CallableC3982tn f33403b;

    /* renamed from: c, reason: collision with root package name */
    public final C3383ig f33404c;

    public C3612mu(CallableC3982tn callableC3982tn, C3383ig c3383ig) {
        this.f33403b = callableC3982tn;
        this.f33404c = c3383ig;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.f33402a;
        int size = i - linkedBlockingDeque.size();
        for (int i4 = 0; i4 < size; i4++) {
            linkedBlockingDeque.add(this.f33404c.b(this.f33403b));
        }
    }

    public final synchronized P3.a b() {
        a(1);
        return (P3.a) this.f33402a.poll();
    }
}
