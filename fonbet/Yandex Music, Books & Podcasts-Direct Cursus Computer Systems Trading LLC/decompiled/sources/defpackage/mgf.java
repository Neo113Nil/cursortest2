package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class mgf implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ syc j;
    public final /* synthetic */ pyc k;

    public /* synthetic */ mgf(int i, mxo mxoVar, boolean z, Function0 function0, Function0 function02, yci yciVar, Function0 function03, Function0 function04, wn5 wn5Var, int i2, int i3) {
        this.f = i;
        this.h = mxoVar;
        this.d = z;
        this.b = function0;
        this.e = function02;
        this.c = yciVar;
        this.i = function03;
        this.j = function04;
        this.k = wn5Var;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(100859905);
                xp3.g(this.f, (mxo) this.h, this.d, this.b, this.e, this.c, (Function0) this.i, (Function0) this.j, (wn5) this.k, (hq5) obj, R, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                u1g.c(this.b, (v1g) this.h, (w3g) this.i, this.c, this.d, (pyc) this.j, this.k, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mgf(Function0 function0, v1g v1gVar, w3g w3gVar, yci yciVar, boolean z, pyc pycVar, pyc pycVar2, Function0 function02, int i, int i2) {
        this.b = function0;
        this.h = v1gVar;
        this.i = w3gVar;
        this.c = yciVar;
        this.d = z;
        this.j = pycVar;
        this.k = pycVar2;
        this.e = function02;
        this.f = i;
        this.g = i2;
    }
}
