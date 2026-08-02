package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cc4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja0 b;

    public /* synthetic */ cc4(ja0 ja0Var, int i, int i2) {
        this.a = i2;
        this.b = ja0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                quj.a(this.b, hq5Var, rvf.R(1));
                break;
            case 1:
                quj.a(this.b, hq5Var, rvf.R(1));
                break;
            default:
                f8g.b(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
