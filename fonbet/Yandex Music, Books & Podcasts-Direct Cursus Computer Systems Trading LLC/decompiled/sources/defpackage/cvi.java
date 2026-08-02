package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class cvi extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ dvi t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvi(List list, dvi dviVar, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = dviVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.r) {
            case 0:
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 147) != 146)) {
                    eti etiVar = (eti) this.s.get(intValue);
                    oq5Var.Z(1796966608);
                    asq.e(etiVar, intValue, this.t.f, o70.RecentlyPlayed, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_recently_played_item"), oq5Var, 27648 | (i & 112));
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                a aVar2 = (a) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
                    eti etiVar2 = (eti) this.s.get(intValue3);
                    oq5Var2.Z(1820483706);
                    asq.e(etiVar2, intValue3, this.t.f, o70.Liked, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_liked_item"), oq5Var2, 27648 | (i2 & 112));
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
