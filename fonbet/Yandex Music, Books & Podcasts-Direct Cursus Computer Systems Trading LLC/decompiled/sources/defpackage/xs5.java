package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xs5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ xs5(ct5 ct5Var, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = ct5Var;
        this.c = z;
        this.d = yciVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qwp.s(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            case 1:
                qwp.s(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            case 2:
                qwp.m(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            default:
                qwp.m(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
