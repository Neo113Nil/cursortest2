package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class oua implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iwa b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    public /* synthetic */ oua(iwa iwaVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = iwaVar;
        this.c = yciVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                up6.h(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                xv7.l(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
