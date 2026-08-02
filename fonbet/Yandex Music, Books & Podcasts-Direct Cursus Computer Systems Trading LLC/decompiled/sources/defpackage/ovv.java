package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class ovv extends dvv {
    public final rmb k;
    public final arf l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final xdr o;
    public final xdr p;
    public final yuv q;

    public ovv(rmb rmbVar, pzl pzlVar) {
        jyr b = pzlVar.b(hag.I(nuv.class), true);
        jyr b2 = pzlVar.b(hag.I(lvv.class), true);
        pzlVar.getClass();
        this.k = rmbVar;
        this.l = b2;
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = ydr.a(((lvv) b2.getValue()).b());
        xdr a = ydr.a(Boolean.FALSE);
        this.p = a;
        nuv nuvVar = (nuv) b.getValue();
        cq4 F = ot0.F(this);
        nuvVar.getClass();
        this.q = new yuv(puv.a, F, a, nuvVar.a);
    }

    @Override // defpackage.dvv
    public final rmb G() {
        return this.k;
    }

    @Override // defpackage.dvv
    public final void H() {
        if (this.m.get()) {
            J(true);
        }
    }

    public final void J(boolean z) {
        r2f r2fVar;
        if (z || !this.n.get()) {
            yuv yuvVar = this.q;
            if (z || (r2fVar = (r2f) yuvVar.f.getValue(yuvVar, yuv.g[0])) == null || !r2fVar.b()) {
                yuvVar.a(z, new q0v(10, this));
            }
        }
    }

    @Override // defpackage.nvv
    public final void b() {
        Boolean bool = Boolean.TRUE;
        xdr xdrVar = this.p;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        yuv yuvVar = this.q;
        yuvVar.f.setValue(yuvVar, yuv.g[0], null);
        this.m.set(false);
        super.onCleared();
    }

    @Override // defpackage.nvv
    public final void onStop() {
        Boolean bool = Boolean.FALSE;
        xdr xdrVar = this.p;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.nvv
    public final xdr u() {
        this.m.set(true);
        J(false);
        return this.o;
    }
}
