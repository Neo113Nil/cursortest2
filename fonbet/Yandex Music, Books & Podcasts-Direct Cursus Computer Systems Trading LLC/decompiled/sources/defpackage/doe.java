package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class doe implements cpf, zci, cdi {
    public final opv a;
    public final x6k b;
    public final x6k c;

    public doe(opv opvVar) {
        this.a = opvVar;
        this.b = szf.g0(opvVar);
        this.c = szf.g0(opvVar);
    }

    @Override // defpackage.cpf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        x6k x6kVar = this.b;
        int d = ((opv) x6kVar.getValue()).d(mfhVar, mfhVar.getLayoutDirection());
        int a = ((opv) x6kVar.getValue()).a(mfhVar);
        int b = ((opv) x6kVar.getValue()).b(mfhVar, mfhVar.getLayoutDirection()) + d;
        int c = ((opv) x6kVar.getValue()).c(mfhVar) + a;
        ksk M = ffhVar.M(ia6.i(j, -b, -c));
        return mfh.m0(mfhVar, ia6.g(M.a + b, j), ia6.f(M.b + c, j), new coe(M, d, a, 0));
    }

    @Override // defpackage.zci
    public final void d(ddi ddiVar) {
        opv opvVar = (opv) ddiVar.d(sqv.a);
        opv opvVar2 = this.a;
        this.b.setValue(new lob(opvVar2, opvVar));
        this.c.setValue(new tit(opvVar, opvVar2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof doe) {
            return Intrinsics.d(((doe) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.cdi
    public final opv g() {
        return (opv) this.c.getValue();
    }

    @Override // defpackage.cdi
    public final pzm getKey() {
        return sqv.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
