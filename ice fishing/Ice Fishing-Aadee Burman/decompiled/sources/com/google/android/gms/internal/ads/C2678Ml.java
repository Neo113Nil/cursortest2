package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Ml, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2678Ml implements t2.l, InterfaceC4870a {

    /* renamed from: n, reason: collision with root package name */
    public final C2680Mn f26323n;

    /* renamed from: u, reason: collision with root package name */
    public final Ut f26324u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f26325v = new AtomicBoolean(false);

    public C2678Ml(C2680Mn c2680Mn, Ut ut) {
        this.f26323n = c2680Mn;
        this.f26324u = ut;
    }

    @Override // t2.l
    public final void H3(int i) {
        a();
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // t2.l
    public final void Q2() {
    }

    @Override // t2.l
    public final void R1() {
        a();
    }

    @Override // t2.l
    public final void S1() {
    }

    public final void a() {
        if (this.f26325v.getAndSet(true)) {
            return;
        }
        C2680Mn c2680Mn = this.f26323n;
        if (c2680Mn.f26333b.getAndSet(false)) {
            Px px = c2680Mn.f26332a;
            px.getClass();
            MA.g(px.f26881a, px.f26882b, new Gx(px, null));
        }
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final void g() {
        String gwsQueryId = this.f26324u.f28004b;
        boolean n9 = SK.n(gwsQueryId);
        C2680Mn c2680Mn = this.f26323n;
        if (n9) {
            c2680Mn.getClass();
            return;
        }
        if (!c2680Mn.f26334c.get() || c2680Mn.f26333b.getAndSet(true)) {
            return;
        }
        Px px = c2680Mn.f26332a;
        px.getClass();
        kotlin.jvm.internal.h.e(gwsQueryId, "gwsQueryId");
        MA.g(px.f26881a, px.f26882b, new Cx(px, gwsQueryId, null));
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        C2680Mn c2680Mn = this.f26323n;
        if (c2680Mn.f26333b.get()) {
            Px px = c2680Mn.f26332a;
            px.getClass();
            MA.g(px.f26881a, px.f26882b, new Ex(px, null));
        }
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // t2.l
    public final void w0() {
    }
}
