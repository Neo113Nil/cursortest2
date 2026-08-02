package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class glv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ukd c;
    public final /* synthetic */ plv d;
    public final /* synthetic */ int e;

    public /* synthetic */ glv(float f, ukd ukdVar, plv plvVar, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = ukdVar;
        this.d = plvVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                szf.F(this.b, rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
            case 1:
                szf.D(this.b, rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
            case 2:
                szf.G(this.b, rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
            case 3:
                szf.I(this.b, rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
            case 4:
                szf.E(this.b, rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
            default:
                szf.H(this.b, rvf.R(this.e | 1), hq5Var, this.c, this.d);
                break;
        }
        return Unit.a;
    }
}
