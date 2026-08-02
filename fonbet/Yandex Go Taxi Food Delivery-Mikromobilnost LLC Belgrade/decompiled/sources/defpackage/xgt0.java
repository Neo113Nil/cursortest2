package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.bubbles.models.BubbleModelShownFrom;

/* loaded from: classes12.dex */
public final class xgt0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ygt0 b;

    public /* synthetic */ xgt0(ygt0 ygt0Var, int i) {
        this.a = i;
        this.b = ygt0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ygt0 ygt0Var = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                mo21 mo21Var = (mo21) pair.getFirst();
                ygt0Var.G = ((Boolean) pair.getSecond()).booleanValue();
                if (mo21Var != null) {
                    ((wgt0) ygt0Var.Dg()).updateUserLocation(mo21Var);
                }
                ygt0Var.Kg();
                break;
            case 1:
                ((wgt0) ygt0Var.Dg()).updateAzimuth(((Number) obj).floatValue());
                break;
            case 2:
                dn6 dn6Var = (dn6) obj;
                ygt0Var.H = dn6Var;
                ygt0Var.Lg(dn6Var, BubbleModelShownFrom.DEFAULT);
                break;
            case 3:
                ygt0Var.Kg();
                break;
            default:
                if (ygt0Var.H.d()) {
                    ygt0Var.Lg(ygt0Var.H, BubbleModelShownFrom.GEO_TAP);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
