package defpackage;

import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dii implements ryc {
    public static final dii b = new dii(0);
    public final /* synthetic */ int a;

    public /* synthetic */ dii(int i) {
        this.a = i;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                long j = ((d85) obj2).a;
                int intValue = ((Number) obj4).intValue();
                charSequence.getClass();
                oq5 oq5Var = (oq5) ((hq5) obj3);
                oq5Var.Z(-492313982);
                mn0 m = o8g.m(charSequence, j, oq5Var, intValue & 126, 0);
                oq5Var.p(false);
                return m;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i = (((oq5) hq5Var).d(intValue2) ? 4 : 2) | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i |= (intValue3 & 64) == 0 ? ((oq5) hq5Var).f(obj2) : ((oq5) hq5Var).h(obj2) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(i & 1, (i & 147) != 146)) {
                    tuv tuvVar = (tuv) obj2;
                    oq5Var2.Z(-1235188981);
                    boolean z = tuvVar instanceof ruv;
                    vci vciVar = vci.a;
                    if (z) {
                        oq5Var2.Z(2038367386);
                        irf.y(((ruv) tuvVar).a, qo6.d, b.b(a.a(vciVar, "wizard_cover"), intValue2), false, false, null, null, null, oq5Var2, 48, 248);
                        oq5Var2.p(false);
                    } else {
                        if (!Intrinsics.d(tuvVar, suv.a)) {
                            throw vz1.i(oq5Var2, 2038365176, false);
                        }
                        oq5Var2.Z(2038377581);
                        swf.d(qo6.d, gce.d, b.b(a.a(vciVar, "wizard_cover"), intValue2), null, 0L, 0L, false, oq5Var2, 54, 120);
                        oq5Var2.p(false);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                int intValue4 = ((Number) obj).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue5 = ((Number) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).d(intValue4) ? 4 : 2) | intValue5;
                } else {
                    i2 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i2 |= (intValue5 & 64) == 0 ? ((oq5) hq5Var2).f(obj2) : ((oq5) hq5Var2).h(obj2) ? 32 : 16;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(i2 & 1, (i2 & 147) != 146)) {
                    oq5Var3.Z(1875377130);
                    ivf.k(6, 2, oq5Var3, null, false);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            default:
                int intValue6 = ((Number) obj).intValue();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue7 = ((Number) obj4).intValue();
                if ((intValue7 & 6) == 0) {
                    i3 = (((oq5) hq5Var3).d(intValue6) ? 4 : 2) | intValue7;
                } else {
                    i3 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i3 |= (intValue7 & 64) == 0 ? ((oq5) hq5Var3).f(obj2) : ((oq5) hq5Var3).h(obj2) ? 32 : 16;
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(i3 & 1, (i3 & 147) != 146)) {
                    oq5Var4.Z(436310418);
                    ivf.k(6, 2, oq5Var4, null, true);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }
}
