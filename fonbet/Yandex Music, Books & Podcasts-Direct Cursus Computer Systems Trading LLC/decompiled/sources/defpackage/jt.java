package defpackage;

/* loaded from: classes3.dex */
public final class jt extends bfu {
    public final oq k;
    public final kxi l;
    public final gt m;
    public final xdr n;

    public jt(oq oqVar, kxi kxiVar, gt gtVar) {
        String D;
        oqVar.getClass();
        kxiVar.getClass();
        this.k = oqVar;
        this.l = kxiVar;
        this.m = gtVar;
        ((opr) gtVar.c.getValue()).getClass();
        switch (nbb.a[oqVar.d().ordinal()]) {
            case 1:
                D = q7g.D(oqVar);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                D = ywf.B(etn.x(oqVar), oqVar.i, " • ");
                D.getClass();
                break;
            default:
                b6e.s();
                throw null;
        }
        this.n = ydr.a(new gy7(oqVar.b, D, oqVar.f));
    }
}
