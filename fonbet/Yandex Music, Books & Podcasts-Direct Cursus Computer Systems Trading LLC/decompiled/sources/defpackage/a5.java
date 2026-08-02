package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    public /* synthetic */ a5(String str, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = yciVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                etn.u(rvf.R(this.d | 1), hq5Var, this.c, this.b);
                break;
            case 1:
                fgq.n(rvf.R(this.d | 1), hq5Var, this.c, this.b);
                break;
            case 2:
                hag.c(rvf.R(this.d | 1), hq5Var, this.c, this.b);
                break;
            default:
                rzf.o(rvf.R(this.d | 1), hq5Var, this.c, this.b);
                break;
        }
        return Unit.a;
    }
}
