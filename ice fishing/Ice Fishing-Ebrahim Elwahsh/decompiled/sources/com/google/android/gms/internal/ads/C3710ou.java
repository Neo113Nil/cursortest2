package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.ou, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3710ou {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f33231a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final CallableC3972tn f33232b;

    /* renamed from: c, reason: collision with root package name */
    public final C3157eg f33233c;

    public C3710ou(CallableC3972tn callableC3972tn, C3157eg c3157eg) {
        this.f33232b = callableC3972tn;
        this.f33233c = c3157eg;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.f33231a;
        int size = i - linkedBlockingDeque.size();
        for (int i4 = 0; i4 < size; i4++) {
            linkedBlockingDeque.add(this.f33233c.b(this.f33232b));
        }
    }

    public final synchronized J3.a b() {
        a(1);
        return (J3.a) this.f33231a.poll();
    }
}
