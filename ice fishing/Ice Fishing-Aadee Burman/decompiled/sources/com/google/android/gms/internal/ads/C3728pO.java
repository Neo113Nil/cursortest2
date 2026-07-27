package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.pO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3728pO {

    /* renamed from: a, reason: collision with root package name */
    public final RP f33064a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3620nO f33065b;

    /* renamed from: c, reason: collision with root package name */
    public int f33066c;

    /* renamed from: d, reason: collision with root package name */
    public Object f33067d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f33068e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33069f;

    public C3728pO(InterfaceC3620nO interfaceC3620nO, RP rp, Looper looper) {
        this.f33065b = interfaceC3620nO;
        this.f33064a = rp;
        this.f33068e = looper;
    }

    public final void a() {
        AbstractC2772Sd.H(!this.f33069f);
        this.f33069f = true;
        VN vn = (VN) this.f33065b;
        if (!vn.f28173o0 && vn.f28140B.getThread().isAlive()) {
            vn.f28189z.b(14, this).a();
        } else {
            AbstractC2968bG.y("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z3) {
        notifyAll();
    }
}
