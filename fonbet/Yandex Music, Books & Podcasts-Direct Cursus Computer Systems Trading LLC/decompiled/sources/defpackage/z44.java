package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class z44 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ugs b;
    public final /* synthetic */ int c;

    public /* synthetic */ z44(ugs ugsVar, int i, int i2) {
        this.a = i2;
        this.b = ugsVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                x97.g(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 1:
                num.intValue();
                avf.b(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            default:
                num.intValue();
                avf.c(this.b, hq5Var, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }
}
