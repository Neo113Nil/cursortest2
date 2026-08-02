package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k1p implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ syc i;
    public final /* synthetic */ Object j;

    public /* synthetic */ k1p(String str, CharSequence charSequence, jzb jzbVar, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, yci yciVar, int i) {
        this.b = str;
        this.g = charSequence;
        this.h = jzbVar;
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.i = function04;
        this.j = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(14156161);
                u1g.k(this.b, (Function1) this.g, (wn5) this.i, this.c, this.d, this.e, (yoc) this.j, (Function1) this.h, this.f, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                szf.s(this.b, (CharSequence) this.g, (jzb) this.h, this.c, this.d, this.e, this.f, (Function0) this.i, (yci) this.j, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k1p(String str, Function1 function1, wn5 wn5Var, boolean z, Function0 function0, Function0 function02, yoc yocVar, Function1 function12, Function0 function03, int i) {
        this.b = str;
        this.g = function1;
        this.i = wn5Var;
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.j = yocVar;
        this.h = function12;
        this.f = function03;
    }
}
