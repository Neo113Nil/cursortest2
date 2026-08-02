package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class exv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hxv b;

    public /* synthetic */ exv(hxv hxvVar, int i, int i2) {
        this.a = i2;
        this.b = hxvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                zdg.o(this.b, hq5Var, rvf.R(1));
                break;
            default:
                zdg.n(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
