package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ry3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ny3 d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ yci f;
    public final /* synthetic */ int g;

    public /* synthetic */ ry3(vy3 vy3Var, int i, ny3 ny3Var, wn5 wn5Var, yci yciVar, int i2, int i3) {
        this.a = i3;
        this.b = vy3Var;
        this.c = i;
        this.d = ny3Var;
        this.e = wn5Var;
        this.f = yciVar;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                vq1.d(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vq1.c(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
        }
        return Unit.a;
    }
}
