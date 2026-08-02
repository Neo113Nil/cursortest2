package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class l41 extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ d41 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l41(List list, d41 d41Var, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = d41Var;
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
                boolean z = true;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 147) != 146)) {
                    r21 r21Var = (r21) this.s.get(intValue);
                    oq5Var.Z(1592751141);
                    d41 d41Var = this.t;
                    d41Var.getClass();
                    r21Var.getClass();
                    Object K = oq5Var.K();
                    Object obj5 = gq5.a;
                    if (K == obj5) {
                        K = d41Var.f(r21Var, intValue);
                        oq5Var.k0(K);
                    }
                    nw5 nw5Var = (nw5) K;
                    yci d = d.d(androidx.compose.ui.platform.a.a(vci.a, "artist_concert_item"), 1.0f);
                    boolean h = oq5Var.h(d41Var) | oq5Var.h(r21Var);
                    if ((((i & 112) ^ 48) <= 32 || !oq5Var.d(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = h | z;
                    Object K2 = oq5Var.K();
                    if (z2 || K2 == obj5) {
                        K2 = new k41(d41Var, r21Var, intValue, 0);
                        oq5Var.k0(K2);
                    }
                    u2x.c(nw5Var, com.yandex.music.core.ui.compose.a.b(d, null, 0L, 0.0f, null, (Function2) K2, 15), oq5Var, 0);
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
                boolean z3 = true;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
                    r21 r21Var2 = (r21) this.s.get(intValue3);
                    oq5Var2.Z(-1219614754);
                    d41 d41Var2 = this.t;
                    d41Var2.getClass();
                    r21Var2.getClass();
                    Object K3 = oq5Var2.K();
                    Object obj6 = gq5.a;
                    if (K3 == obj6) {
                        K3 = d41Var2.f(r21Var2, intValue3);
                        oq5Var2.k0(K3);
                    }
                    nw5 nw5Var2 = (nw5) K3;
                    yci d2 = d.d(androidx.compose.ui.platform.a.a(vci.a, "artist_concert_item"), 1.0f);
                    boolean h2 = oq5Var2.h(d41Var2) | oq5Var2.h(r21Var2);
                    if ((((i2 & 112) ^ 48) <= 32 || !oq5Var2.d(intValue3)) && (i2 & 48) != 32) {
                        z3 = false;
                    }
                    boolean z4 = h2 | z3;
                    Object K4 = oq5Var2.K();
                    if (z4 || K4 == obj6) {
                        K4 = new k41(d41Var2, r21Var2, intValue3, 1);
                        oq5Var2.k0(K4);
                    }
                    u2x.c(nw5Var2, com.yandex.music.core.ui.compose.a.b(d2, null, 0L, 0.0f, null, (Function2) K4, 15), oq5Var2, 0);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
