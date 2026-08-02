package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
public final class xl4 implements TypeEvaluator {
    public static final xl4 b = new xl4();
    public final am4 a = new am4();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        am4 am4Var = (am4) obj;
        am4 am4Var2 = (am4) obj2;
        float C = wxf.C(am4Var.a, am4Var2.a, f);
        float C2 = wxf.C(am4Var.b, am4Var2.b, f);
        float C3 = wxf.C(am4Var.c, am4Var2.c, f);
        am4 am4Var3 = this.a;
        am4Var3.a = C;
        am4Var3.b = C2;
        am4Var3.c = C3;
        return am4Var3;
    }
}
