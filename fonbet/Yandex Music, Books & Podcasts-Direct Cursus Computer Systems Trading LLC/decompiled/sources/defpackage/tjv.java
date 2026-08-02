package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class tjv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kjv b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    public /* synthetic */ tjv(kjv kjvVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = kjvVar;
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
                wjv.e(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                wjv.d(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
