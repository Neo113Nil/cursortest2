package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ksv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ osv b;

    public /* synthetic */ ksv(osv osvVar, int i, int i2) {
        this.a = i2;
        this.b = osvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                y7g.j(this.b, hq5Var, rvf.R(1));
                break;
            default:
                f8g.j(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
