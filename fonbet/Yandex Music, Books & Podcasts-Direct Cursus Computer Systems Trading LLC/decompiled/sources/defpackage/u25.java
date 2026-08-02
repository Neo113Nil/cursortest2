package defpackage;

import androidx.compose.foundation.lazy.a;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u25 extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ o3k t;
    public final /* synthetic */ mm6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u25(List list, o3k o3kVar, mm6 mm6Var, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = o3kVar;
        this.u = mm6Var;
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
                    q0s q0sVar = (q0s) this.s.get(intValue);
                    oq5Var.Z(2063837833);
                    mn0 m0 = bkp.m0(q0sVar.c.size(), rvf.M(q0sVar.a, oq5Var));
                    o3k o3kVar = this.t;
                    boolean z2 = o3kVar.j() == intValue;
                    mm6 mm6Var = this.u;
                    boolean h = oq5Var.h(mm6Var) | oq5Var.f(o3kVar);
                    if ((((i & 112) ^ 48) <= 32 || !oq5Var.d(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z3 = h | z;
                    Object K = oq5Var.K();
                    if (z3 || K == gq5.a) {
                        K = new t25(mm6Var, o3kVar, intValue, 0);
                        oq5Var.k0(K);
                    }
                    zwf.f(m0, z2, (Function0) K, null, oq5Var, 0, 8);
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
                boolean z4 = true;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
                    s0s s0sVar = (s0s) this.s.get(intValue3);
                    oq5Var2.Z(1741238653);
                    o3k o3kVar2 = this.t;
                    boolean z5 = o3kVar2.j() == intValue3;
                    String M = rvf.M(s0sVar.a, oq5Var2);
                    mm6 mm6Var2 = this.u;
                    boolean h2 = oq5Var2.h(mm6Var2) | oq5Var2.f(o3kVar2);
                    if ((((i2 & 112) ^ 48) <= 32 || !oq5Var2.d(intValue3)) && (i2 & 48) != 32) {
                        z4 = false;
                    }
                    boolean z6 = h2 | z4;
                    Object K2 = oq5Var2.K();
                    if (z6 || K2 == gq5.a) {
                        K2 = new t25(mm6Var2, o3kVar2, intValue3, 1);
                        oq5Var2.k0(K2);
                    }
                    zwf.e(0, oq5Var2, b.c(b.c(androidx.compose.ui.platform.a.a(vci.a, "playlist_list_tab"), "tab", s0sVar.b.name()), "isSelected", Boolean.valueOf(z5)), M, (Function0) K2, z5);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
