package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mq3 {
    public final bds a;

    public mq3(bds bdsVar) {
        this.a = bdsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq3)) {
            return false;
        }
        bds bdsVar = this.a;
        mn0 mn0Var = bdsVar.a;
        bds bdsVar2 = ((mq3) obj).a;
        return Intrinsics.d(mn0Var, bdsVar2.a) && bdsVar.b.d(bdsVar2.b) && Intrinsics.d(bdsVar.c, bdsVar2.c) && bdsVar.d == bdsVar2.d && bdsVar.e == bdsVar2.e && bdsVar.f == bdsVar2.f && Intrinsics.d(bdsVar.g, bdsVar2.g) && bdsVar.h == bdsVar2.h && bdsVar.i == bdsVar2.i && ga6.c(bdsVar.j, bdsVar2.j);
    }

    public final int hashCode() {
        bds bdsVar = this.a;
        int hashCode = bdsVar.a.hashCode() * 31;
        ges gesVar = bdsVar.b;
        c4r c4rVar = gesVar.a;
        long j = c4rVar.b;
        les[] lesVarArr = kes.b;
        int hashCode2 = Long.hashCode(j) * 31;
        tqc tqcVar = c4rVar.c;
        int i = (hashCode2 + (tqcVar != null ? tqcVar.a : 0)) * 31;
        oqc oqcVar = c4rVar.d;
        int hashCode3 = (i + (oqcVar != null ? Integer.hashCode(oqcVar.a) : 0)) * 31;
        pqc pqcVar = c4rVar.e;
        int hashCode4 = (hashCode3 + (pqcVar != null ? Integer.hashCode(pqcVar.a) : 0)) * 31;
        qpc qpcVar = c4rVar.f;
        int hashCode5 = (hashCode4 + (qpcVar != null ? qpcVar.hashCode() : 0)) * 31;
        String str = c4rVar.g;
        int c = tlm.c(c4rVar.h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        wu2 wu2Var = c4rVar.i;
        int hashCode6 = (c + (wu2Var != null ? Float.hashCode(wu2Var.a) : 0)) * 31;
        ccs ccsVar = c4rVar.j;
        int hashCode7 = (hashCode6 + (ccsVar != null ? ccsVar.hashCode() : 0)) * 31;
        bqg bqgVar = c4rVar.k;
        int hashCode8 = (hashCode7 + (bqgVar != null ? bqgVar.a.hashCode() : 0)) * 31;
        long j2 = c4rVar.l;
        int i2 = d85.o;
        met metVar = net.b;
        int c2 = tlm.c(j2, hashCode8, 31);
        iuk iukVar = c4rVar.o;
        int hashCode9 = (gesVar.b.hashCode() + ((c2 + (iukVar != null ? iukVar.hashCode() : 0)) * 31)) * 31;
        nuk nukVar = gesVar.c;
        return Long.hashCode(bdsVar.j) + ((bdsVar.i.hashCode() + ((bdsVar.h.hashCode() + ((bdsVar.g.hashCode() + f1d.a(bdsVar.f, k5r.e((k5r.d((hashCode9 + (nukVar != null ? nukVar.hashCode() : 0) + hashCode) * 31, 31, bdsVar.c) + bdsVar.d) * 31, 31, bdsVar.e), 31)) * 31)) * 31)) * 31);
    }
}
