package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.mu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3589mu {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f32624a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final CallableC3905sn f32625b;

    /* renamed from: c, reason: collision with root package name */
    public final C3360ig f32626c;

    public C3589mu(CallableC3905sn callableC3905sn, C3360ig c3360ig) {
        this.f32625b = callableC3905sn;
        this.f32626c = c3360ig;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.f32624a;
        int size = i - linkedBlockingDeque.size();
        for (int i6 = 0; i6 < size; i6++) {
            linkedBlockingDeque.add(this.f32626c.b(this.f32625b));
        }
    }

    public final synchronized N3.a b() {
        a(1);
        return (N3.a) this.f32624a.poll();
    }
}
