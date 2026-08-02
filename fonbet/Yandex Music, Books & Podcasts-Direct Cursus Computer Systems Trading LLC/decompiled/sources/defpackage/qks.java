package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class qks implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ qks(wn5 wn5Var, wn5 wn5Var2, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = wn5Var;
        this.c = wn5Var2;
        this.d = yciVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                szf.t(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            default:
                lsq.j(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
