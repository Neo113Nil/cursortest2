package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ i93(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, boolean z, yci yciVar, pyc pycVar, ya0 ya0Var, int i, int i2) {
        this.a = 4;
        this.c = wn5Var;
        this.g = wn5Var2;
        this.h = wn5Var3;
        this.d = z;
        this.b = yciVar;
        this.i = pycVar;
        this.j = ya0Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                leu.d((String) this.c, this.d, (fud) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, this.b, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ot0.l(this.g, (Function1) this.h, this.b, (wdc) this.i, (String) this.c, this.d, (wn5) this.j, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                o2g.g((usj) this.c, (psj) this.g, (o3e) this.h, (wn5) this.i, this.b, this.d, (pyc) this.j, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                s7g.k((Function2) this.c, (wn5) this.g, (wn5) this.h, (wn5) this.i, this.b, this.d, (Function2) this.j, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                ivf.r((wn5) this.c, (wn5) this.g, (wn5) this.h, this.d, this.b, (pyc) this.i, (ya0) this.j, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i93(Object obj, Object obj2, Object obj3, wn5 wn5Var, yci yciVar, boolean z, syc sycVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = wn5Var;
        this.b = yciVar;
        this.d = z;
        this.j = sycVar;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ i93(Object obj, Function1 function1, yci yciVar, wdc wdcVar, String str, boolean z, wn5 wn5Var, int i, int i2) {
        this.a = 1;
        this.g = obj;
        this.h = function1;
        this.b = yciVar;
        this.i = wdcVar;
        this.c = str;
        this.d = z;
        this.j = wn5Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ i93(String str, boolean z, fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, int i, int i2) {
        this.a = 0;
        this.c = str;
        this.d = z;
        this.g = fudVar;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.b = yciVar;
        this.e = i;
        this.f = i2;
    }
}
