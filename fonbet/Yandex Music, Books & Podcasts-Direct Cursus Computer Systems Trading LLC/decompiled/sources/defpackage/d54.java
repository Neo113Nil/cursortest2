package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d54 implements rnq, wmm {
    public final r44 a;
    public final rmb b;
    public final q34 c;
    public final jyr d;
    public final jyr e;
    public rar f;
    public rar g;
    public rar h;
    public final y8p i;
    public boolean j;
    public kzp k;
    public final xdr l;
    public final fkn m;

    public d54(r44 r44Var, rmb rmbVar, q34 q34Var) {
        r44Var.getClass();
        this.a = r44Var;
        this.b = rmbVar;
        this.c = q34Var;
        this.d = btf.b(wg.h);
        this.e = btf.b(new r93(15, this));
        this.i = new y8p((o34) q34Var.a.getValue());
        this.j = true;
        xdr a = ydr.a(new v44(r44Var.c));
        this.l = a;
        this.m = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    public final void b(mm6 mm6Var) {
        rar rarVar = this.h;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        i44 i44Var = (i44) this.d.getValue();
        String str = i44.h;
        i44Var.getClass();
        this.h = ox6.B(new cz(zsd.M0(zsd.H0(new clc(new bca(i44Var.f, 18), new qi(i44Var, "", continuation, 19)), 1), new l1(continuation, i44Var, 12)), this, 18), mm6Var, new ri(29, this));
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Collection:Skeleton:CarouselSectionsBlock", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        rar rarVar = this.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h = null;
        rar rarVar2 = this.g;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        this.g = null;
        rar rarVar3 = this.f;
        if (rarVar3 != null) {
            rarVar3.g(null);
        }
        this.f = null;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Collection:Skeleton:CarouselSectionsBlock", vz1.p("Block reload[", this.a.a.a, "]: ready=", this.l.getValue() instanceof w44), null);
        cancel();
        this.j = false;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.k = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        mm6Var.getClass();
        if (this.j) {
            return;
        }
        this.j = true;
        ssg.a(3, "Collection:Skeleton:CarouselSectionsBlock", vz1.p("Block load[", this.a.a.a, "]: ready=", this.l.getValue() instanceof w44), null);
        rar rarVar = this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        j34 j34Var = (j34) this.e.getValue();
        j34Var.getClass();
        this.f = ox6.B(zsd.u0(new ez(j34Var.h, 26), new ez(j34Var.g, 27), new ez(j34Var.i, 28)), mm6Var, new b54(this, mm6Var, 0));
        rar rarVar2 = this.g;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        this.g = ox6.B(((p44) ((i44) this.d.getValue()).g.getValue()).c, mm6Var, new b54(this, mm6Var, 1));
        b(mm6Var);
    }
}
