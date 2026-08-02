package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2715Nl implements v2.l, InterfaceC4919a {

    /* renamed from: n, reason: collision with root package name */
    public final C2717Nn f27305n;

    /* renamed from: u, reason: collision with root package name */
    public final Ut f27306u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f27307v = new AtomicBoolean(false);

    public C2715Nl(C2717Nn c2717Nn, Ut ut) {
        this.f27305n = c2717Nn;
        this.f27306u = ut;
    }

    @Override // v2.l
    public final void C3(int i) {
        a();
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // v2.l
    public final void N2() {
    }

    @Override // v2.l
    public final void Q1() {
        a();
    }

    @Override // v2.l
    public final void S1() {
    }

    public final void a() {
        if (this.f27307v.getAndSet(true)) {
            return;
        }
        C2717Nn c2717Nn = this.f27305n;
        if (c2717Nn.f27315b.getAndSet(false)) {
            Px px = c2717Nn.f27314a;
            px.getClass();
            MA.g(px.f27668a, px.f27669b, new Gx(px, null));
        }
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // v2.l
    public final void g() {
        String gwsQueryId = this.f27306u.f28801b;
        boolean n9 = SK.n(gwsQueryId);
        C2717Nn c2717Nn = this.f27305n;
        if (n9) {
            c2717Nn.getClass();
            return;
        }
        if (!c2717Nn.f27316c.get() || c2717Nn.f27315b.getAndSet(true)) {
            return;
        }
        Px px = c2717Nn.f27314a;
        px.getClass();
        kotlin.jvm.internal.h.e(gwsQueryId, "gwsQueryId");
        MA.g(px.f27668a, px.f27669b, new Cx(px, gwsQueryId, null));
    }

    @Override // v2.l
    public final void h1() {
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        C2717Nn c2717Nn = this.f27305n;
        if (c2717Nn.f27315b.get()) {
            Px px = c2717Nn.f27314a;
            px.getClass();
            MA.g(px.f27668a, px.f27669b, new Ex(px, null));
        }
    }

    @Override // v2.l
    public final void r1() {
    }

    @Override // v2.l
    public final void t0() {
    }
}
