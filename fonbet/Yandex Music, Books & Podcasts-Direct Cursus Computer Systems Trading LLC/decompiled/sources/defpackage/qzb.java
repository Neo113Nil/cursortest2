package defpackage;

/* loaded from: classes3.dex */
public final class qzb extends ozb {
    public final y7k b;
    public String c;

    public qzb(y7k y7kVar, String str) {
        super(str);
        this.b = y7kVar;
    }

    @Override // defpackage.ozb, defpackage.szb
    public final Object a(xzb xzbVar) {
        String str = this.c;
        if (str != null) {
            return str;
        }
        try {
            String Q = mvn.Q((String) this.a);
            this.c = Q;
            return Q;
        } catch (khb e) {
            this.b.a(e);
            this.c = "";
            return "";
        }
    }
}
