package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ru b;
    public final /* synthetic */ e9g c;

    public /* synthetic */ nu(ru ruVar, e9g e9gVar, int i) {
        this.a = i;
        this.b = ruVar;
        this.c = e9gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                String str = this.b.a;
                qo6 qo6Var = qo6.b;
                vci vciVar = vci.a;
                e9g e9gVar = this.c;
                irf.y(str, qo6Var, d.m(vciVar, lsq.s(e9gVar)), false, false, null, null, lsq.r(e9gVar, qo6Var, hq5Var, 48), hq5Var, 48, 120);
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    String str2 = this.b.a;
                    qo6 qo6Var2 = qo6.b;
                    vci vciVar2 = vci.a;
                    e9g e9gVar2 = this.c;
                    irf.y(str2, qo6Var2, d.m(vciVar2, lsq.s(e9gVar2)), false, false, null, null, lsq.r(e9gVar2, qo6Var2, oq5Var2, 48), oq5Var2, 48, 120);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
