package io.grpc.util;

import defpackage.aeg;
import defpackage.ceg;
import defpackage.deg;
import defpackage.ezf;
import defpackage.o2g;
import defpackage.r76;
import defpackage.sgr;
import defpackage.usc;
import defpackage.ydg;
import defpackage.ynd;
import defpackage.z0j;
import defpackage.z42;
import defpackage.znd;

/* loaded from: classes5.dex */
public final class a extends ceg {
    public static final z42 p = new z42(1);
    public final ynd g;
    public final usc h;
    public deg i;
    public ceg j;
    public deg k;
    public ceg l;
    public r76 m;
    public aeg n;
    public boolean o;

    public a(usc uscVar) {
        super(0);
        ynd yndVar = new ynd(this);
        this.g = yndVar;
        this.j = yndVar;
        this.l = yndVar;
        this.h = uscVar;
    }

    public final void A() {
        this.h.Z(this.m, this.n);
        this.j.y();
        this.j = this.l;
        this.i = this.k;
        this.l = this.g;
        this.k = null;
    }

    public final void B(deg degVar) {
        o2g.O(degVar, "newBalancerFactory");
        if (degVar == this.k) {
            return;
        }
        this.l.y();
        this.l = this.g;
        this.k = null;
        this.m = r76.a;
        this.n = p;
        if (degVar == this.i) {
            return;
        }
        znd zndVar = new znd(this);
        ceg b = degVar.b(zndVar);
        zndVar.b = b;
        this.l = b;
        this.k = degVar;
        if (this.o) {
            return;
        }
        A();
    }

    @Override // defpackage.ceg
    public final boolean c() {
        return z().c();
    }

    @Override // defpackage.ceg
    public final void p(sgr sgrVar) {
        z().p(sgrVar);
    }

    @Override // defpackage.ceg
    public final void r(ydg ydgVar) {
        z().r(ydgVar);
    }

    @Override // defpackage.ceg
    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(z(), "delegate");
        return Y.toString();
    }

    @Override // defpackage.ceg
    public final void x() {
        z().x();
    }

    @Override // defpackage.ceg
    public final void y() {
        this.l.y();
        this.j.y();
    }

    public final ceg z() {
        ceg cegVar = this.l;
        return cegVar == this.g ? this.j : cegVar;
    }
}
