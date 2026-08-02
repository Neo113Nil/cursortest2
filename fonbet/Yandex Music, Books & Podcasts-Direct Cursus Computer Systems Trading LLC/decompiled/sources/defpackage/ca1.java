package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ca1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xbb b;
    public final /* synthetic */ twu c;
    public final /* synthetic */ yci d;

    public /* synthetic */ ca1(xbb xbbVar, twu twuVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = xbbVar;
        this.c = twuVar;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                i4w.b(this.b, this.c, this.d, hq5Var, rvf.R(9));
                break;
            default:
                nt0.n(this.b, this.c, this.d, hq5Var, rvf.R(9));
                break;
        }
        return Unit.a;
    }
}
