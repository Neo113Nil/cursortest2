package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k95 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ wn5 d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ yci f;
    public final /* synthetic */ int g;

    public /* synthetic */ k95(boolean z, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = wn5Var;
        this.d = wn5Var2;
        this.e = wn5Var3;
        this.f = yciVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ox6.g(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                w1g.g(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
        }
        return Unit.a;
    }
}
