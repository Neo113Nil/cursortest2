package defpackage;

/* loaded from: classes.dex */
public final class pw7 implements a95 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a95
    public final long a() {
        switch (this.a) {
            case 0:
                sw7 sw7Var = (sw7) this.b;
                long a = sw7Var.u.a();
                if (a != 16) {
                    return a;
                }
                wdo wdoVar = (wdo) men.t(sw7Var, deo.b);
                if (wdoVar != null) {
                    long j = wdoVar.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((d85) men.t(sw7Var, rb6.a)).a;
            case 1:
                sw7 sw7Var2 = (sw7) this.b;
                long a2 = sw7Var2.u.a();
                if (a2 != 16) {
                    return a2;
                }
                xdo xdoVar = (xdo) men.t(sw7Var2, eeo.a);
                if (xdoVar != null) {
                    long j2 = xdoVar.a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                long j3 = ((d85) men.t(sw7Var2, sb6.a)).a;
                return (((ma5) men.t(sw7Var2, pa5.a)).g() || ((double) c3x.N(j3)) >= 0.5d) ? j3 : d85.f;
            case 2:
                return ((feo) this.b).c;
            case 3:
                return ((geo) this.b).c;
            default:
                return ((d85) ((sdr) this.b).getValue()).a;
        }
    }
}
