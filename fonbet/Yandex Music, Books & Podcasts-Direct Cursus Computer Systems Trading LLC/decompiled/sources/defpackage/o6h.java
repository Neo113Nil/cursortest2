package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class o6h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hvb b;
    public final /* synthetic */ int c;

    public /* synthetic */ o6h(hvb hvbVar, int i, int i2) {
        this.a = i2;
        this.b = hvbVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                p6h.a(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            default:
                u7g.e(this.b, hq5Var, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }
}
