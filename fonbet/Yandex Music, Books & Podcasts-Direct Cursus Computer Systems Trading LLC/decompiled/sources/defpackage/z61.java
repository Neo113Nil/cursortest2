package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ wn5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ z61(yci yciVar, Function0 function0, wn5 wn5Var, int i, int i2) {
        this.c = yciVar;
        this.b = function0;
        this.d = wn5Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                men.o(rvf.R(this.e | 1), this.f, this.d, (hq5) obj, this.c, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                hdg.n(rvf.R(this.e | 1), this.f, this.d, (hq5) obj, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z61(Function0 function0, yci yciVar, wn5 wn5Var, int i, int i2) {
        this.b = function0;
        this.c = yciVar;
        this.d = wn5Var;
        this.e = i;
        this.f = i2;
    }
}
