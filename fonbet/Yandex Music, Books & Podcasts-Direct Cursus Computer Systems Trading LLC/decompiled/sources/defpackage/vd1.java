package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vd1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vd1(tvd tvdVar, wn5 wn5Var, yci yciVar, Function0 function0, Function0 function02, Function0 function03, float f, int i) {
        this.i = tvdVar;
        this.b = wn5Var;
        this.c = yciVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = f;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ot0.q(this.c, this.b, (fud) this.i, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                edo.b((tvd) this.i, this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vd1(yci yciVar, wn5 wn5Var, fud fudVar, Function0 function0, Function0 function02, Function0 function03, float f, int i) {
        this.c = yciVar;
        this.b = wn5Var;
        this.i = fudVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = f;
        this.h = i;
    }
}
