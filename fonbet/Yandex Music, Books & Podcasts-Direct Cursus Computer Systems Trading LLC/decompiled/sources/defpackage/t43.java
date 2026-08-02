package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class t43 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ o0k f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ syc l;

    public /* synthetic */ t43(pw5 pw5Var, wn5 wn5Var, Function0 function0, Function0 function02, yci yciVar, boolean z, pyc pycVar, boolean z2, o0k o0kVar, int i, int i2) {
        this.i = pw5Var;
        this.j = wn5Var;
        this.b = function0;
        this.k = function02;
        this.c = yciVar;
        this.d = z;
        this.l = pycVar;
        this.e = z2;
        this.f = o0kVar;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                irf.h((String) this.i, this.c, (String) this.j, this.f, this.b, this.d, (Function2) this.l, this.e, (String) this.k, (hq5) obj, rvf.R(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                u2x.e((pw5) this.i, (wn5) this.j, this.b, (Function0) this.k, this.c, this.d, (pyc) this.l, this.e, this.f, (hq5) obj, rvf.R(this.g | 1), this.h);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t43(String str, yci yciVar, String str2, o0k o0kVar, Function0 function0, boolean z, Function2 function2, boolean z2, String str3, int i, int i2) {
        this.i = str;
        this.c = yciVar;
        this.j = str2;
        this.f = o0kVar;
        this.b = function0;
        this.d = z;
        this.l = function2;
        this.e = z2;
        this.k = str3;
        this.g = i;
        this.h = i2;
    }
}
