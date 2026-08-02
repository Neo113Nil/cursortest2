package defpackage;

/* loaded from: classes9.dex */
public final class ujd extends zij {
    public final z0x a;
    public final pdh b;

    public ujd(z0x z0xVar, pdh pdhVar) {
        this.a = z0xVar;
        this.b = pdhVar;
    }

    public static boolean d(u0x u0xVar, u0x u0xVar2) {
        aul aulVar = u0xVar instanceof aul ? (aul) u0xVar : null;
        aul aulVar2 = u0xVar2 instanceof aul ? (aul) u0xVar2 : null;
        return jl40.l(aulVar != null ? aulVar.k : null, aulVar2 != null ? aulVar2.k : null);
    }

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        u0x u0xVar = (u0x) obj;
        u0x u0xVar2 = (u0x) obj2;
        if (d(u0xVar, u0xVar2)) {
            pdh e = this.a.c(u0xVar2).e();
            if (e == null) {
                e = this.b;
            }
            if (e != null ? e.a(u0xVar, u0xVar2) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        u0x u0xVar = (u0x) obj;
        u0x u0xVar2 = (u0x) obj2;
        pdh e = this.a.c(u0xVar2).e();
        if (e == null) {
            e = this.b;
        }
        if (e != null) {
            return e.b(u0xVar, u0xVar2);
        }
        return false;
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        u0x u0xVar = (u0x) obj;
        u0x u0xVar2 = (u0x) obj2;
        z0x z0xVar = this.a;
        pdh e = z0xVar.c(u0xVar2).e();
        pdh pdhVar = this.b;
        if (e == null) {
            e = pdhVar;
        }
        Object c = e != null ? e.c(u0xVar, u0xVar2) : null;
        if (c == null && !d(u0xVar, u0xVar2)) {
            pdh e2 = z0xVar.c(u0xVar2).e();
            if (e2 != null) {
                pdhVar = e2;
            }
            if (pdhVar != null ? pdhVar.a(u0xVar, u0xVar2) : false) {
                return tjd.a;
            }
        }
        return c;
    }
}
