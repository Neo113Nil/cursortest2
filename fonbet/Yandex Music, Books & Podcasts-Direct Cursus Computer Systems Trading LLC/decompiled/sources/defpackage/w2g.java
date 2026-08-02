package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class w2g implements rnq, wmm {
    public final h2g a;
    public final i2g b;
    public final l2g c;
    public final xdr d;
    public final xdr e;
    public final j6e f;
    public boolean g;
    public rar h;
    public kzp i;
    public cvl j;
    public volatile boolean k;
    public final jyr l;

    public w2g(h2g h2gVar, q43 q43Var, i2g i2gVar, l2g l2gVar) {
        h2gVar.getClass();
        this.a = h2gVar;
        this.b = i2gVar;
        this.c = l2gVar;
        y2g y2gVar = y2g.a;
        this.d = ydr.a(y2gVar);
        this.e = ydr.a(y2gVar);
        j6e j6eVar = new j6e();
        j6eVar.a = q43Var;
        j6eVar.b = l18.b.b(hag.I(skr.class), true);
        this.f = j6eVar;
        this.l = l18.b.b(hag.I(frt.class), true);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Skeleton:LikesAndHistory", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        rar rarVar = this.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h = null;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Skeleton:LikesAndHistory", vz1.p("Block reload[", this.a.a.a, "]: ready=", this.g), null);
        cancel();
        this.k = true;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.i = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        if (this.k || !this.g) {
            String str = this.a.a.a;
            boolean z = this.k;
            boolean z2 = this.g;
            StringBuilder h = v3w.h("Block load[", str, "]: force=", " ready=", z);
            h.append(z2);
            Continuation continuation = null;
            ssg.a(3, "Skeleton:LikesAndHistory", h.toString(), null);
            rar rarVar = this.h;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.h = x97.y(mm6Var, null, null, new u2g(this, continuation, 2), 3);
        }
    }
}
