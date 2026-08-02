package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class nm2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ nm2(float f, ugt ugtVar, Function0 function0, Function0 function02, pyc pycVar, yci yciVar, int i) {
        this.b = f;
        this.f = ugtVar;
        this.c = function0;
        this.g = function02;
        this.h = pycVar;
        this.d = yciVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                nt0.d(this.b, (ugt) this.f, (Function0) this.c, (Function0) this.g, (pyc) this.h, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                yd5.l((String) this.f, (ges) this.g, this.b, (Function0) this.c, this.d, (String) this.h, (hq5) obj, R, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                fxf.c((o3k) this.f, this.d, (q0k) this.c, (s1r) this.g, this.b, (wn5) this.h, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nm2(o3k o3kVar, yci yciVar, q0k q0kVar, s1r s1rVar, float f, wn5 wn5Var, int i) {
        this.f = o3kVar;
        this.d = yciVar;
        this.c = q0kVar;
        this.g = s1rVar;
        this.b = f;
        this.h = wn5Var;
        this.e = i;
    }

    public /* synthetic */ nm2(String str, ges gesVar, float f, Function0 function0, yci yciVar, String str2, int i, int i2) {
        this.f = str;
        this.g = gesVar;
        this.b = f;
        this.c = function0;
        this.d = yciVar;
        this.h = str2;
        this.e = i2;
    }
}
