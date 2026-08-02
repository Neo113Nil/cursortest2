package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class fn6 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ fn6(qan qanVar, xo6 xo6Var, boolean z, pbu pbuVar, Function1 function1, float f, yci yciVar, int i) {
        this.e = qanVar;
        this.f = xo6Var;
        this.b = z;
        this.g = pbuVar;
        this.h = function1;
        this.c = f;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                qld.f(this.b, (mcu) this.e, (iil) this.f, (ab0) this.g, this.c, (c6h) this.h, this.d, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(49);
                xee.f((qan) this.e, (xo6) this.f, this.b, (pbu) this.g, (Function1) this.h, this.c, this.d, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(221617);
                fgq.j((String) this.e, (String) this.f, this.d, this.c, (String) this.g, this.b, (d85) this.h, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fn6(String str, String str2, yci yciVar, float f, String str3, boolean z, d85 d85Var, int i) {
        this.e = str;
        this.f = str2;
        this.d = yciVar;
        this.c = f;
        this.g = str3;
        this.b = z;
        this.h = d85Var;
    }

    public /* synthetic */ fn6(boolean z, mcu mcuVar, iil iilVar, ab0 ab0Var, float f, c6h c6hVar, yci yciVar, int i) {
        this.b = z;
        this.e = mcuVar;
        this.f = iilVar;
        this.g = ab0Var;
        this.c = f;
        this.h = c6hVar;
        this.d = yciVar;
    }
}
