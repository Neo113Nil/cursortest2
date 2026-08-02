package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class xev implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xcv b;
    public final /* synthetic */ mfv c;
    public final /* synthetic */ xfv d;
    public final /* synthetic */ int e;

    public /* synthetic */ xev(xcv xcvVar, mfv mfvVar, xfv xfvVar, int i, int i2) {
        this.a = i2;
        this.b = xcvVar;
        this.c = mfvVar;
        this.d = xfvVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                hyf.t(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            default:
                hyf.s(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
