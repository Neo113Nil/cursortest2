package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class atu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ pyc c;
    public final /* synthetic */ wn5 d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ onu g;
    public final /* synthetic */ gtu h;
    public final /* synthetic */ ya0 i;

    public /* synthetic */ atu(wn5 wn5Var, pyc pycVar, wn5 wn5Var2, wn5 wn5Var3, boolean z, onu onuVar, gtu gtuVar, ya0 ya0Var, int i, int i2) {
        this.a = i2;
        this.b = wn5Var;
        this.c = pycVar;
        this.d = wn5Var2;
        this.e = wn5Var3;
        this.f = z;
        this.g = onuVar;
        this.h = gtuVar;
        this.i = ya0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                ivf.n(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                ivf.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }
}
