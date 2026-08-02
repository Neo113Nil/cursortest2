package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fja implements rnq, wmm {
    public final fia a;
    public final rmb b;
    public final wia c;
    public final qxp d;
    public boolean e;
    public rar f;
    public kzp g;
    public final xdr h;
    public final fkn i;
    public final by7 j;

    public fja(fia fiaVar, rmb rmbVar, wia wiaVar, skr skrVar) {
        fiaVar.getClass();
        wiaVar.getClass();
        skrVar.getClass();
        this.a = fiaVar;
        this.b = rmbVar;
        this.c = wiaVar;
        skrVar.getClass();
        qxp qxpVar = new qxp();
        qxpVar.a = skrVar;
        this.d = qxpVar;
        int i = fiaVar.c;
        xdr a = ydr.a(i > 0 ? new aja(i) : zia.a);
        this.h = a;
        this.i = new fkn(a);
        this.j = asq.K(a, new xga(2));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Collection:Skeleton:CarouselSectionsOfflineBlock", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.f = null;
        this.e = false;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Collection:Skeleton:CarouselSectionsOfflineBlock", vz1.p("Block reload[", this.a.a.a, "]: ready=", this.h.getValue() instanceof bja), null);
        cancel();
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.g = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        if (this.e) {
            return;
        }
        int i = 3;
        Continuation continuation = null;
        ssg.a(3, "Collection:Skeleton:CarouselSectionsOfflineBlock", vz1.p("Block load[", this.a.a.a, "]: ready=", this.h.getValue() instanceof bja), null);
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        wia wiaVar = this.c;
        tia tiaVar = new tia(wiaVar.e().A(null, 20, null, Boolean.FALSE), wiaVar, 1);
        yx4 e = wiaVar.e();
        int i2 = 0;
        pjc b0 = zsd.b0(zsd.R(tiaVar, new tia(yx4.y(new pjc[]{e.b.e}, new vw4(e, 20, continuation, i2)), wiaVar, 0), new u21(10, wiaVar.e().e(20), wiaVar.e().c(20), new uia(wiaVar, continuation, i2)), new u21(10, wiaVar.e().D(20), wiaVar.e().B(20), new uia(wiaVar, continuation, 1)), zsd.Q(wiaVar.e().x(20), wiaVar.e().A(null, 20, null, Boolean.TRUE), wiaVar.e().w(20), new a35(wiaVar, continuation, 4)), new oia(i2, continuation)));
        yx4 e2 = wiaVar.e();
        this.f = ox6.B(zsd.b0(new u21(10, b0, zsd.b0(new bca(yx4.y(new pjc[]{((e6q) e2.a).e, e2.c.e, e2.b.e}, new hv0(e2, null, 3)), 9)), new t81(i, 5, continuation))), mm6Var, new u58(10, this));
    }
}
