package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class vl3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ vl3(Function0 function0, yci yciVar, wn5 wn5Var, int i) {
        this.a = 0;
        this.b = function0;
        this.d = yciVar;
        this.c = wn5Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                saf.g(rvf.R(this.e | 1), this.c, hq5Var, this.d, this.b);
                break;
            case 1:
                hdg.e(rvf.R(this.e | 1), this.c, hq5Var, this.d, this.b);
                break;
            case 2:
                hdg.g(rvf.R(this.e | 1), this.c, hq5Var, this.d, this.b);
                break;
            case 3:
                hdg.s(rvf.R(this.e | 1), this.c, hq5Var, this.d, this.b);
                break;
            default:
                hdg.f(rvf.R(this.e | 1), this.c, hq5Var, this.d, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vl3(yci yciVar, Function0 function0, wn5 wn5Var, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = wn5Var;
        this.d = yciVar;
        this.e = i;
    }
}
