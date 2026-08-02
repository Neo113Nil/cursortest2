package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f2e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2e b;
    public final /* synthetic */ qnq c;
    public final /* synthetic */ ub7 d;

    public /* synthetic */ f2e(h2e h2eVar, qnq qnqVar, ub7 ub7Var, int i) {
        this.a = i;
        this.b = h2eVar;
        this.c = qnqVar;
        this.d = ub7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(301734216, new f2e(this.b, this.c, this.d, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    h2e h2eVar = this.b;
                    j2e j2eVar = h2eVar.p;
                    if (j2eVar == null) {
                        Intrinsics.j("presenter");
                        throw null;
                    }
                    ox6.p(j2eVar, this.c, ((uoq) h2eVar.l.getValue()).e, h2eVar.x(), oq5Var2, 33286);
                    rzf.j(this.d, a.l(vci.a, ogp.A(oq5Var2)), oq5Var2, 0, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
