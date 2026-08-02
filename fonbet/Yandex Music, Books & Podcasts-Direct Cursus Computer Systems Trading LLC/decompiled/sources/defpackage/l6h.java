package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class l6h implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ cml b;
    public final /* synthetic */ sdr c;
    public final /* synthetic */ c6h d;

    public /* synthetic */ l6h(cml cmlVar, sdr sdrVar, c6h c6hVar, int i) {
        this.a = i;
        this.b = cmlVar;
        this.c = sdrVar;
        this.d = c6hVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Object obj4 = this.b.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).g(booleanValue) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                wxk wxkVar = (wxk) obj4;
                if (!(wxkVar instanceof pxk)) {
                    if (!(wxkVar instanceof oxk) && !(wxkVar instanceof sxk) && !(wxkVar instanceof txk) && !(wxkVar instanceof uxk)) {
                        b6e.s();
                        break;
                    } else {
                        oq5 oq5Var2 = (oq5) hq5Var;
                        oq5Var2.Z(1889534742);
                        ows.a((wxk) obj4, booleanValue, this.c, this.d, null, oq5Var2, (intValue << 3) & 112);
                        oq5Var2.p(false);
                    }
                } else {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(1889799358);
                    u1g.l(oq5Var3, d.e(vci.a, Math.max(l86.a, szf.Z(oq5Var3))));
                    oq5Var3.p(false);
                }
                break;
            default:
                Object obj5 = this.b.a;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).g(booleanValue2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                wxk wxkVar2 = (wxk) obj5;
                if (!(wxkVar2 instanceof pxk)) {
                    if (!(wxkVar2 instanceof oxk) && !(wxkVar2 instanceof sxk) && !(wxkVar2 instanceof txk) && !(wxkVar2 instanceof uxk)) {
                        b6e.s();
                        break;
                    } else {
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        oq5Var5.Z(1245100307);
                        ows.a((wxk) obj5, booleanValue2, this.c, this.d, null, oq5Var5, (intValue2 << 3) & 112);
                        oq5Var5.p(false);
                    }
                } else {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(1245364923);
                    u1g.l(oq5Var6, d.e(vci.a, Math.max(l86.a, szf.Z(oq5Var6))));
                    oq5Var6.p(false);
                }
                break;
        }
        return Unit.a;
    }
}
