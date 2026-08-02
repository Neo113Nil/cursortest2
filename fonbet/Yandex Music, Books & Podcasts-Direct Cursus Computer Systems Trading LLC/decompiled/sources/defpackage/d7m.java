package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d7m implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ges d;

    public /* synthetic */ d7m(o0k o0kVar, String str, ges gesVar, int i) {
        this.a = i;
        this.b = o0kVar;
        this.c = str;
        this.d = gesVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    xcs.b(this.c, a.l(vci.a, this.b), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, this.d, oq5Var, 0, 3120, 55288);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(484153354, new d7m(this.b, this.c, this.d, 0), oq5Var2), oq5Var2, 432, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
