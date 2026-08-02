package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xt2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mxo b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ o0k d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ pyc f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ wn5 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ xt2(Object obj, mxo mxoVar, yci yciVar, o0k o0kVar, Function0 function0, pyc pycVar, boolean z, boolean z2, Function2 function2, Function0 function02, Function1 function1, wn5 wn5Var, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.p = obj;
        this.b = mxoVar;
        this.c = yciVar;
        this.d = o0kVar;
        this.e = function0;
        this.f = pycVar;
        this.g = z;
        this.h = z2;
        this.i = function2;
        this.j = function02;
        this.k = function1;
        this.l = wn5Var;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(this.m | 1);
                int R2 = rvf.R(this.n);
                xp3.d((String) this.p, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (hq5) obj, R, R2, this.o);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(this.m | 1);
                int R4 = rvf.R(this.n);
                xp3.c((ik) this.p, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (hq5) obj, R3, R4, this.o);
                break;
        }
        return Unit.a;
    }
}
