package defpackage;

/* loaded from: classes.dex */
public final class jl5 implements jeo {
    public static final jl5 b = new jl5(0);
    public static final jl5 c = new jl5(1);
    public final /* synthetic */ int a;

    public /* synthetic */ jl5(int i) {
        this.a = i;
    }

    @Override // defpackage.jeo
    /* renamed from: defaultColor-WaAFU9c */
    public final long mo26defaultColorWaAFU9c(hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        switch (this.a) {
            case 0:
                oq5Var.Z(-1844533201);
                long j = ((d85) oq5Var.j(rb6.a)).a;
                oq5Var.p(false);
                return j;
            default:
                oq5Var.Z(2042140174);
                long j2 = d85.b;
                c3x.N(j2);
                oq5Var.p(false);
                return j2;
        }
    }

    @Override // defpackage.jeo
    public final udo rippleAlpha(hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        switch (this.a) {
            case 0:
                oq5Var.Z(-290975286);
                udo udoVar = quj.g;
                oq5Var.p(false);
                return udoVar;
            default:
                oq5Var.Z(-1629816343);
                udo udoVar2 = ((double) c3x.N(d85.b)) > 0.5d ? keo.b : keo.c;
                oq5Var.p(false);
                return udoVar2;
        }
    }
}
