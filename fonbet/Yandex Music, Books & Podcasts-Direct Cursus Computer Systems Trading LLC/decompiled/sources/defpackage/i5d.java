package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i5d implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ i5d(wn5 wn5Var, wn5 wn5Var2, yci yciVar, boolean z, int i, int i2) {
        this.b = wn5Var;
        this.e = wn5Var2;
        this.c = yciVar;
        this.d = z;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                zsd.t(rvf.R(this.f | 1), this.g, this.b, this.e, (hq5) obj, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                q7g.r(rvf.R(this.f | 1), this.g, this.b, this.e, (hq5) obj, this.c, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i5d(wn5 wn5Var, yci yciVar, boolean z, wn5 wn5Var2, int i, int i2) {
        this.b = wn5Var;
        this.c = yciVar;
        this.d = z;
        this.e = wn5Var2;
        this.f = i;
        this.g = i2;
    }
}
