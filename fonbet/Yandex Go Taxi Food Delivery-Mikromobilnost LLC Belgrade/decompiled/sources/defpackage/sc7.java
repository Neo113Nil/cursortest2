package defpackage;

/* loaded from: classes10.dex */
public final class sc7 {
    public final cry0 a;

    public sc7(cry0 cry0Var) {
        this.a = cry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc7)) {
            return false;
        }
        cry0 cry0Var = this.a;
        kk2 kk2Var = cry0Var.a;
        cry0 cry0Var2 = ((sc7) obj).a;
        return jl40.l(kk2Var, cry0Var2.a) && cry0Var.b.c(cry0Var2.b) && jl40.l(cry0Var.c, cry0Var2.c) && cry0Var.d == cry0Var2.d && cry0Var.e == cry0Var2.e && cry0Var.f == cry0Var2.f && jl40.l(cry0Var.g, cry0Var2.g) && cry0Var.h == cry0Var2.h && cry0Var.i == cry0Var2.i && n8e.c(cry0Var.j, cry0Var2.j);
    }

    public final int hashCode() {
        cry0 cry0Var = this.a;
        int hashCode = cry0Var.a.hashCode() * 31;
        ety0 ety0Var = cry0Var.b;
        bmt0 bmt0Var = ety0Var.a;
        long j = bmt0Var.b;
        tty0[] tty0VarArr = sty0.b;
        int hashCode2 = Long.hashCode(j) * 31;
        lzr lzrVar = bmt0Var.c;
        int i = (hashCode2 + (lzrVar != null ? lzrVar.a : 0)) * 31;
        hzr hzrVar = bmt0Var.d;
        int hashCode3 = (i + (hzrVar != null ? Integer.hashCode(hzrVar.a) : 0)) * 31;
        izr izrVar = bmt0Var.e;
        int hashCode4 = (hashCode3 + (izrVar != null ? Integer.hashCode(izrVar.a) : 0)) * 31;
        eyr eyrVar = bmt0Var.f;
        int hashCode5 = (hashCode4 + (eyrVar != null ? eyrVar.hashCode() : 0)) * 31;
        String str = bmt0Var.g;
        int c = qv10.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, bmt0Var.h);
        td5 td5Var = bmt0Var.i;
        int hashCode6 = (c + (td5Var != null ? Float.hashCode(td5Var.a) : 0)) * 31;
        soy0 soy0Var = bmt0Var.j;
        int hashCode7 = (hashCode6 + (soy0Var != null ? soy0Var.hashCode() : 0)) * 31;
        k5z k5zVar = bmt0Var.k;
        int hashCode8 = (hashCode7 + (k5zVar != null ? k5zVar.a.hashCode() : 0)) * 31;
        long j2 = bmt0Var.l;
        int i2 = ldc.n;
        int c2 = qv10.c(hashCode8, 31, j2);
        dwc0 dwc0Var = bmt0Var.o;
        int hashCode9 = (ety0Var.b.hashCode() + ((c2 + (dwc0Var != null ? dwc0Var.hashCode() : 0)) * 31)) * 31;
        iwc0 iwc0Var = ety0Var.c;
        return Long.hashCode(cry0Var.j) + ((cry0Var.i.hashCode() + ((cry0Var.h.hashCode() + ((cry0Var.g.hashCode() + oyr.b(cry0Var.f, unr0.e((unr0.c((hashCode9 + (iwc0Var != null ? iwc0Var.hashCode() : 0) + hashCode) * 31, 31, cry0Var.c) + cry0Var.d) * 31, 31, cry0Var.e), 31)) * 31)) * 31)) * 31);
    }
}
