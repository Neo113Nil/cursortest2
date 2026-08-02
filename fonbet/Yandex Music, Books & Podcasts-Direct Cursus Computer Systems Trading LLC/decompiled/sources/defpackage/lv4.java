package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class lv4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0k b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    public /* synthetic */ lv4(o0k o0kVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = o0kVar;
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
                lxe.d(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                dag.c(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
