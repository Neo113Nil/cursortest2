package ru.yandex.taxi.logistics.sdk.promotions.api;

import defpackage.aii0;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.fid;
import defpackage.ike;
import defpackage.mr4;
import defpackage.or4;
import defpackage.q0v;
import defpackage.rr4;
import defpackage.st2;
import defpackage.tje;
import defpackage.v5c0;
import defpackage.x5g;
import defpackage.xr4;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class a {
    public final v5c0 a;
    public final AtomicReference b = new AtomicReference(null);
    public final r0 c = bvf0.c(Boolean.FALSE);
    public final ike d;

    public a(v5c0 v5c0Var, st2 st2Var) {
        this.a = v5c0Var;
        this.d = bvf0.a(st2Var.b);
    }

    public final void a(or4 or4Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1936041367);
        int i2 = (btsVar.e(or4Var) ? 4 : 2) | i | (btsVar.e(this) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            AtomicReference atomicReference = this.b;
            if (atomicReference.get() == null) {
                b(or4Var);
            }
            x5g x5gVar = (x5g) atomicReference.get();
            xr4 xr4Var = x5gVar != null ? (xr4) x5gVar.k.get() : null;
            if (xr4Var == null) {
                btsVar.e0(507633643);
                btsVar.t(false);
            } else {
                btsVar.e0(-814908714);
                mr4 mr4Var = or4Var.a;
                xr4Var.a(new rr4(mr4Var.d, mr4Var.e), btsVar, 0);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(this, or4Var, i, 17);
        }
    }

    public final void b(or4 or4Var) {
        AtomicReference atomicReference;
        x5g A = this.a.A(new or4(or4Var.a, or4Var.b, or4Var.c));
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(null, A)) {
                return;
            }
        } while (atomicReference.get() == null);
    }

    public final void c(or4 or4Var) {
        if (this.b.get() == null) {
            b(or4Var);
        }
        tje.N(this.d, null, null, new BannerCarouselWidgetDelegate$loadContent$1(this, null), 3);
    }
}
