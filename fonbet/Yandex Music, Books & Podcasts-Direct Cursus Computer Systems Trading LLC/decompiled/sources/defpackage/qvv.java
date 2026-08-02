package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class qvv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0w b;
    public final /* synthetic */ int c;

    public /* synthetic */ qvv(g0w g0wVar, int i, int i2) {
        this.a = i2;
        this.b = g0wVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                hdg.G(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            default:
                hdg.F(this.b, hq5Var, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }
}
