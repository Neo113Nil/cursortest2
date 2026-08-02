package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class iwv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lwv b;
    public final /* synthetic */ fvf c;
    public final /* synthetic */ int d;

    public /* synthetic */ iwv(lwv lwvVar, fvf fvfVar, int i, int i2) {
        this.a = i2;
        this.b = lwvVar;
        this.c = fvfVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                wdg.w(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                wdg.v(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
