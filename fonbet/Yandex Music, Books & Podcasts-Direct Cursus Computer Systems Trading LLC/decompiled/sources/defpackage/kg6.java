package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class kg6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ hh6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ kg6(yci yciVar, hh6 hh6Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = yciVar;
        this.c = hh6Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                leu.u(this.b, this.c, hq5Var, rvf.R(this.d | 1), this.e);
                break;
            default:
                leu.r(this.b, this.c, hq5Var, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }
}
