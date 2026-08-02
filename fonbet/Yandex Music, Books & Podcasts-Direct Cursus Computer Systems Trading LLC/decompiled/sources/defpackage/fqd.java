package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fqd extends uif implements ryc {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ List s;
    public final /* synthetic */ float t;
    public final /* synthetic */ syc u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqd(List list, Function0 function0, List list2, float f) {
        super(4);
        this.s = list;
        this.u = function0;
        this.v = list2;
        this.t = f;
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
                if ((i & 147) == 146) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                Object obj5 = this.s.get(intValue);
                int i3 = i & 126;
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(646431763);
                Function2 function2 = (Function2) this.u;
                yci yciVar = vci.a;
                if (function2 != null) {
                    yciVar = a.a(aVar, yciVar);
                }
                yci r = d.r(yciVar, this.t);
                kfh d = ug3.d(b2c.b, true);
                int i4 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, r);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, d, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var2, i4, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                ((wn5) this.v).invoke(Integer.valueOf(intValue), obj5, oq5Var2, Integer.valueOf((i3 >> 3) & 14));
                oq5Var2.p(true);
                oq5Var2.p(false);
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
                if ((i2 & 147) == 146) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                rrf rrfVar = (rrf) this.s.get(intValue3);
                oq5 oq5Var4 = (oq5) hq5Var2;
                oq5Var4.Z(-155519960);
                Function0 a = rrfVar.a();
                if (a == null) {
                    a = (Function0) this.u;
                }
                vci vciVar = vci.a;
                yci b = b.b(b.c(androidx.compose.ui.platform.a.a(wyf.s(vciVar, a), "lazy_block_ui"), "lazy_block_id", rrfVar.getId()), intValue3);
                kfh d2 = ug3.d(b2c.b, false);
                int i5 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H2 = vnj.H(oq5Var4, b);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, d2, wp5.f);
                g0g.U(oq5Var4, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var4, i5, kb5Var2);
                }
                g0g.U(oq5Var4, H2, wp5.d);
                rrfVar.getUi().invoke(oq5Var4, 0);
                oq5Var4.p(true);
                if (intValue3 == u75.g((List) this.v)) {
                    oq5Var4.Z(-155178403);
                    eta.p(vciVar, 16, oq5Var4, false);
                } else {
                    oq5Var4.Z(-155099043);
                    cma b2 = rrfVar.b();
                    eta.p(vciVar, b2 != null ? b2.a : this.t, oq5Var4, false);
                }
                oq5Var4.p(false);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqd(List list, Function2 function2, float f, wn5 wn5Var) {
        super(4);
        this.s = list;
        this.u = function2;
        this.t = f;
        this.v = wn5Var;
    }
}
