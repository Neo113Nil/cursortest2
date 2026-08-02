package defpackage;

/* loaded from: classes.dex */
public final class ofg {
    public static final ofg d;
    public final qu2 a;
    public final qu2 b;
    public final qu2 c;

    static {
        nfg nfgVar = nfg.c;
        d = new ofg(nfgVar, nfgVar, nfgVar);
    }

    public ofg(qu2 qu2Var, qu2 qu2Var2, qu2 qu2Var3) {
        this.a = qu2Var;
        this.b = qu2Var2;
        this.c = qu2Var3;
    }

    public static ofg a(ofg ofgVar, int i) {
        int i2 = i & 1;
        qu2 qu2Var = nfg.c;
        qu2 qu2Var2 = i2 != 0 ? ofgVar.a : qu2Var;
        qu2 qu2Var3 = (i & 2) != 0 ? ofgVar.b : qu2Var;
        if ((i & 4) != 0) {
            qu2Var = ofgVar.c;
        }
        return new ofg(qu2Var2, qu2Var3, qu2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofg)) {
            return false;
        }
        ofg ofgVar = (ofg) obj;
        return this.a.equals(ofgVar.a) && this.b.equals(ofgVar.b) && this.c.equals(ofgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
