package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b9g implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function2 j;

    public /* synthetic */ b9g(boolean z, qo6 qo6Var, boolean z2, e9g e9gVar, yci yciVar, boolean z3, Function2 function2, int i, int i2) {
        this.b = z;
        this.h = qo6Var;
        this.c = z2;
        this.i = e9gVar;
        this.d = yciVar;
        this.e = z3;
        this.j = function2;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                c9g.g(this.b, (qo6) this.h, this.c, (e9g) this.i, this.d, this.e, this.j, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                tyf.j(this.b, this.c, (Function0) this.h, this.d, (Function0) this.i, this.e, (wn5) this.j, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b9g(boolean z, boolean z2, Function0 function0, yci yciVar, Function0 function02, boolean z3, wn5 wn5Var, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.h = function0;
        this.d = yciVar;
        this.i = function02;
        this.e = z3;
        this.j = wn5Var;
        this.f = i;
        this.g = i2;
    }
}
