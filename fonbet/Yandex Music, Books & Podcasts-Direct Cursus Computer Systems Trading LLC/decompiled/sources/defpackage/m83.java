package defpackage;

import androidx.compose.foundation.lazy.a;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m83 extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m83(ArrayList arrayList, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(4);
        this.r = i;
        this.s = arrayList;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
        this.x = obj5;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        oq5 oq5Var;
        int i2;
        switch (this.r) {
            case 0:
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                wp wpVar = (wp) this.x;
                u0s u0sVar = (u0s) this.v;
                jab jabVar = (jab) this.w;
                va3 va3Var = (va3) this.u;
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(i & 1, (i & 147) != 146)) {
                    int i3 = i & 126;
                    hcj hcjVar = (hcj) this.s.get(intValue);
                    oq5Var2.Z(2135397178);
                    boolean z = hcjVar instanceof fcj;
                    vci vciVar = vci.a;
                    if (z) {
                        oq5Var2.Z(2135450869);
                        fcj fcjVar = (fcj) hcjVar;
                        mqs mqsVar = fcjVar.b;
                        vqn vqnVar = (vqn) this.t;
                        int i4 = vqnVar.a + 1;
                        vqnVar.a = i4;
                        thj L = szf.L(mqsVar, i4);
                        dej dejVar = fcjVar.a;
                        wdj G = t7g.G((va3) this.u, mqsVar, intValue, (u0s) this.v, jabVar, szf.M(mqsVar, 0, intValue), oq5Var2, (i3 << 3) & 896, 32);
                        oq5Var = oq5Var2;
                        boolean h = oq5Var.h(va3Var) | oq5Var.h(jabVar) | oq5Var.h(L) | oq5Var.h(u0sVar);
                        Object K = oq5Var.K();
                        if (h || K == gq5.a) {
                            n83 n83Var = new n83(va3Var, jabVar, L, u0sVar, 0);
                            oq5Var.k0(n83Var);
                            K = n83Var;
                        }
                        asq.k(dejVar, G, b.b(androidx.compose.ui.platform.a.a(wyf.s(com.yandex.music.core.ui.compose.a.b(vciVar, null, 0L, 0.0f, null, (Function2) K, 15), wpVar), "non_music_track"), intValue), oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        oq5Var = oq5Var2;
                        if (!(hcjVar instanceof gcj)) {
                            throw vz1.i(oq5Var, 1315809769, false);
                        }
                        oq5Var.Z(2136438591);
                        rzf.a(((gcj) hcjVar).a, 0, oq5Var, wyf.s(vciVar, wpVar));
                        oq5Var.p(false);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
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
                        return Unit.a;
                    }
                }
                w3h w3hVar = (w3h) this.s.get(intValue3);
                oq5 oq5Var4 = (oq5) hq5Var2;
                oq5Var4.Z(-1392233283);
                u7g.c(intValue3, w3hVar, (u6k) this.u, (Function1) this.v, (Function0) this.w, (z2h) this.x, ((b2h) this.t).a, null, oq5Var4, ((i2 & 126) >> 3) & 14);
                oq5Var4.p(false);
                return Unit.a;
        }
    }
}
