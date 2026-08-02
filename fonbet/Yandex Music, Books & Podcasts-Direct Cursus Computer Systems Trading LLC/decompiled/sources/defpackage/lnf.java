package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class lnf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml4 b;
    public final /* synthetic */ hvq c;
    public final /* synthetic */ int d;

    public /* synthetic */ lnf(ml4 ml4Var, hvq hvqVar, int i, int i2) {
        this.a = i2;
        this.b = ml4Var;
        this.c = hvqVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                gld.v(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                hld.m(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
