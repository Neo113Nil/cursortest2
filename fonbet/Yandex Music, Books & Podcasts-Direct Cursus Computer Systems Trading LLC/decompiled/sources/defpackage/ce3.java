package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ce3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ce3(int i, yci yciVar, wn5 wn5Var, int i2) {
        this.a = 3;
        this.d = i;
        this.b = yciVar;
        this.c = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                pd.f(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 1:
                men.j(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 2:
                vut.o(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 3:
                trp.j(this.d, this.b, this.c, hq5Var, rvf.R(385));
                break;
            default:
                ezf.a(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ce3(yci yciVar, wn5 wn5Var, int i, int i2) {
        this.a = i2;
        this.b = yciVar;
        this.c = wn5Var;
        this.d = i;
    }
}
