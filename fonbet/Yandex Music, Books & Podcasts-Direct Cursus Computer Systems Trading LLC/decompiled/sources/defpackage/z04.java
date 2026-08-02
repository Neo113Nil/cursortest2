package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class z04 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z04(wn5 wn5Var, wn5 wn5Var2, float f, boolean z, yci yciVar, int i) {
        this.e = wn5Var;
        this.f = wn5Var2;
        this.b = f;
        this.c = z;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                bg3.h(this.c, (zpd) this.e, this.d, (o0k) this.f, this.b, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(55);
                p5p.a((wn5) this.e, (wn5) this.f, this.b, this.c, this.d, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z04(boolean z, zpd zpdVar, yci yciVar, o0k o0kVar, float f, int i) {
        this.c = z;
        this.e = zpdVar;
        this.d = yciVar;
        this.f = o0kVar;
        this.b = f;
    }
}
