package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class lp5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yci b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ syc h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ lp5(yci yciVar, wn5 wn5Var, wn5 wn5Var2, Function2 function2, fud fudVar, Function0 function0, Function0 function02, Function0 function03, float f, int i, int i2) {
        this.b = yciVar;
        this.f = wn5Var;
        this.g = wn5Var2;
        this.h = function2;
        this.i = fudVar;
        this.j = function0;
        this.k = function02;
        this.l = function03;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                saf.u(this.f, (String) this.g, this.b, (Function1) this.h, (Function1) this.i, (g40) this.j, (jd6) this.k, this.c, (m85) this.l, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tt0.s(this.b, (wn5) this.f, (wn5) this.g, (Function2) this.h, (fud) this.i, (Function0) this.j, (Function0) this.k, (Function0) this.l, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lp5(Object obj, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, int i2) {
        this.f = obj;
        this.g = str;
        this.b = yciVar;
        this.h = function1;
        this.i = function12;
        this.j = g40Var;
        this.k = jd6Var;
        this.c = f;
        this.l = m85Var;
        this.d = i;
        this.e = i2;
    }
}
