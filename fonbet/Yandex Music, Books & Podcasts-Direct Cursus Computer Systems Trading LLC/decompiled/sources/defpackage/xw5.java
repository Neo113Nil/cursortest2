package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xw5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww5 b;

    public /* synthetic */ xw5(ww5 ww5Var) {
        this.a = 1;
        this.b = ww5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                bcx.e(this.b, (hq5) obj, R);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ww5 ww5Var = this.b;
                ww5Var.getClass();
                weo.H(ww5Var.d.a(new jab(qkb.Search, 1, 1, 1), null), new thj(pkb.SearchField, "search_field", 1, 1, ""), booleanValue, str, null);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                kg5.c(this.b, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xw5(ww5 ww5Var, int i, int i2) {
        this.a = i2;
        this.b = ww5Var;
    }
}
