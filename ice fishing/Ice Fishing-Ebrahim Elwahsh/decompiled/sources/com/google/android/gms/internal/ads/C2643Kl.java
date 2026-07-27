package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.Kl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2643Kl implements s2.l, InterfaceC4877a {

    /* renamed from: n, reason: collision with root package name */
    public final C2713On f26006n;

    /* renamed from: u, reason: collision with root package name */
    public final Wt f26007u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f26008v = new AtomicBoolean(false);

    public C2643Kl(C2713On c2713On, Wt wt) {
        this.f26006n = c2713On;
        this.f26007u = wt;
    }

    @Override // s2.l
    public final void D0() {
    }

    @Override // s2.l
    public final void G2() {
        a();
    }

    @Override // s2.l
    public final void K1() {
    }

    @Override // s2.l
    public final void K2() {
    }

    @Override // s2.l
    public final void R0(int i) {
        a();
    }

    @Override // s2.l
    public final void Y1() {
    }

    public final void a() {
        if (this.f26008v.getAndSet(true)) {
            return;
        }
        C2713On c2713On = this.f26006n;
        if (c2713On.f26762b.getAndSet(false)) {
            Qx qx = c2713On.f26761a;
            qx.getClass();
            PA.k(qx.f27277a, qx.f27278b, new Ix(qx, null));
        }
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final void g() {
        String gwsQueryId = this.f26007u.f28491b;
        boolean q6 = AbstractC3217fl.q(gwsQueryId);
        C2713On c2713On = this.f26006n;
        if (q6) {
            c2713On.getClass();
            return;
        }
        if (!c2713On.f26763c.get() || c2713On.f26762b.getAndSet(true)) {
            return;
        }
        Qx qx = c2713On.f26761a;
        qx.getClass();
        kotlin.jvm.internal.h.e(gwsQueryId, "gwsQueryId");
        PA.k(qx.f27277a, qx.f27278b, new Ex(qx, gwsQueryId, null));
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        C2713On c2713On = this.f26006n;
        if (c2713On.f26762b.get()) {
            Qx qx = c2713On.f26761a;
            qx.getClass();
            PA.k(qx.f27277a, qx.f27278b, new Gx(qx, null));
        }
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // s2.l
    public final void y1() {
    }
}
