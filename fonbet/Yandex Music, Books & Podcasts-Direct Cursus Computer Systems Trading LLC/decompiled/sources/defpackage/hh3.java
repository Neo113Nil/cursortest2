package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hh3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yci b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ hh3(te teVar, Function0 function0, yci yciVar, Function0 function02, float f, q0k q0kVar, d85 d85Var, int i, int i2) {
        this.h = teVar;
        this.c = function0;
        this.b = yciVar;
        this.d = function02;
        this.e = f;
        this.i = q0kVar;
        this.j = d85Var;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xp3.e((te) this.h, this.c, this.b, this.d, this.e, (q0k) this.i, (d85) this.j, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                edo.c((tvd) this.h, (String) this.i, this.b, this.c, this.d, (Function0) this.j, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hh3(tvd tvdVar, String str, yci yciVar, Function0 function0, Function0 function02, Function0 function03, float f, int i, int i2) {
        this.h = tvdVar;
        this.i = str;
        this.b = yciVar;
        this.c = function0;
        this.d = function02;
        this.j = function03;
        this.e = f;
        this.f = i;
        this.g = i2;
    }
}
