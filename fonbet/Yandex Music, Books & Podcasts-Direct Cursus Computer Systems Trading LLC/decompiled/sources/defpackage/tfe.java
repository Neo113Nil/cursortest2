package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tfe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0q b;

    public /* synthetic */ tfe(u0q u0qVar, int i, int i2) {
        this.a = i2;
        this.b = u0qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                quj.w(this.b, hq5Var, rvf.R(1));
                break;
            default:
                y5g.N(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
