package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class tp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ tp(int i, int i2, w41 w41Var, ld1 ld1Var, yci yciVar, Function0 function0, Function0 function02, boolean z) {
        this.a = 1;
        this.b = i;
        this.f = ld1Var;
        this.g = w41Var;
        this.c = yciVar;
        this.h = function0;
        this.i = function02;
        this.d = z;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                rb.i((String) this.f, this.d, (dzg) this.g, this.c, (dup) this.h, (Function2) this.i, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
            case 1:
                ld1 ld1Var = (ld1) this.f;
                w41 w41Var = (w41) this.g;
                Function0 function0 = (Function0) this.h;
                Function0 function02 = (Function0) this.i;
                ((Integer) obj2).getClass();
                int R = rvf.R(this.e | 1);
                ma1.e(this.b, R, w41Var, ld1Var, (hq5) obj, this.c, function0, function02, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                zsd.f((Function0) this.f, (wn5) this.g, (wn5) this.h, this.c, this.d, (Function2) this.i, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                gh6.e((String) this.f, (uo6) this.g, this.d, (cdj) this.h, (zg6) this.i, this.c, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                men.m((String) this.f, (dib) this.g, (qo6) this.h, this.d, (Function0) this.i, this.c, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
            case 5:
                ((Integer) obj2).getClass();
                w1g.a((Function0) this.f, (x1g) this.g, (w3g) this.h, this.c, this.d, (Function0) this.i, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
            case 6:
                ((Integer) obj2).getClass();
                fxf.p((euu) this.f, (owu) this.g, this.c, (o0k) this.h, this.d, (e9g) this.i, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                u1g.p((Function0) this.f, this.d, (onu) this.g, this.c, (Function1) this.h, (Function0) this.i, (hq5) obj, rvf.R(this.b | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tp(euu euuVar, owu owuVar, yci yciVar, o0k o0kVar, boolean z, e9g e9gVar, int i, int i2) {
        this.a = 6;
        this.f = euuVar;
        this.g = owuVar;
        this.c = yciVar;
        this.h = o0kVar;
        this.d = z;
        this.i = e9gVar;
        this.b = i;
        this.e = i2;
    }

    public /* synthetic */ tp(Object obj, boolean z, Object obj2, yci yciVar, Object obj3, syc sycVar, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.d = z;
        this.g = obj2;
        this.c = yciVar;
        this.h = obj3;
        this.i = sycVar;
        this.b = i;
        this.e = i2;
    }

    public /* synthetic */ tp(String str, uo6 uo6Var, boolean z, cdj cdjVar, zg6 zg6Var, yci yciVar, int i, int i2) {
        this.a = 3;
        this.f = str;
        this.g = uo6Var;
        this.d = z;
        this.h = cdjVar;
        this.i = zg6Var;
        this.c = yciVar;
        this.b = i;
        this.e = i2;
    }

    public /* synthetic */ tp(String str, dib dibVar, qo6 qo6Var, boolean z, Function0 function0, yci yciVar, int i, int i2) {
        this.a = 4;
        this.f = str;
        this.g = dibVar;
        this.h = qo6Var;
        this.d = z;
        this.i = function0;
        this.c = yciVar;
        this.b = i;
        this.e = i2;
    }

    public /* synthetic */ tp(Function0 function0, Object obj, Object obj2, yci yciVar, boolean z, syc sycVar, int i, int i2, int i3) {
        this.a = i3;
        this.f = function0;
        this.g = obj;
        this.h = obj2;
        this.c = yciVar;
        this.d = z;
        this.i = sycVar;
        this.b = i;
        this.e = i2;
    }
}
