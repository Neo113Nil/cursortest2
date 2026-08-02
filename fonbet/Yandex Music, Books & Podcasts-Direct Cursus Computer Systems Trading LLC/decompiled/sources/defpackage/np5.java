package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class np5 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ g40 e;
    public final /* synthetic */ jd6 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ np5(Object obj, String str, yci yciVar, w4k w4kVar, w4k w4kVar2, w4k w4kVar3, g40 g40Var, jd6 jd6Var, float f, int i, int i2, int i3) {
        this.b = obj;
        this.c = str;
        this.d = yciVar;
        this.k = w4kVar;
        this.l = w4kVar2;
        this.m = w4kVar3;
        this.e = g40Var;
        this.f = jd6Var;
        this.g = f;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                saf.v(this.b, this.c, this.d, (w4k) this.k, (w4k) this.l, (w4k) this.m, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1), rvf.R(this.j));
                break;
            default:
                ((Integer) obj2).getClass();
                p1g.a(this.b, this.c, this.d, (Function1) this.k, (Function1) this.l, this.e, this.f, this.g, (m85) this.m, this.h, (hq5) obj, rvf.R(this.i | 1), this.j);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ np5(Object obj, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, int i2, int i3) {
        this.b = obj;
        this.c = str;
        this.d = yciVar;
        this.k = function1;
        this.l = function12;
        this.e = g40Var;
        this.f = jd6Var;
        this.g = f;
        this.m = m85Var;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }
}
