package defpackage;

import androidx.compose.foundation.lazy.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class n50 extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n50(List list, Object obj, Object obj2, Object obj3, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.v = obj;
        this.t = obj2;
        this.u = obj3;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
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
                    sr3 sr3Var = (sr3) this.s.get(intValue);
                    oq5Var.Z(-126179478);
                    int i5 = (i & 112) ^ 48;
                    boolean h = oq5Var.h((a60) this.v) | oq5Var.f(sr3Var) | oq5Var.h((mm6) this.t) | oq5Var.f((fvf) this.u) | ((i5 > 32 && oq5Var.d(intValue)) || (i & 48) == 32);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        k50 k50Var = new k50((a60) this.v, sr3Var, (mm6) this.t, (fvf) this.u, intValue, 0);
                        oq5Var.k0(k50Var);
                        K = k50Var;
                    }
                    Function0 function0 = (Function0) K;
                    boolean z2 = sr3Var.c;
                    if ((i5 <= 32 || !oq5Var.d(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean f = oq5Var.f(sr3Var) | z;
                    Object K2 = oq5Var.K();
                    if (f || K2 == kjnVar) {
                        K2 = new l50(intValue, sr3Var, 0);
                        oq5Var.k0(K2);
                    }
                    dcc.a(function0, z2, false, nfp.b(vci.a, false, (Function1) K2), false, 0L, ild.C(1340904308, new m50(sr3Var, 0), oq5Var), oq5Var, 1573248, 48);
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
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
                    sr3 sr3Var2 = (sr3) this.s.get(intValue3);
                    oq5Var2.Z(-875034153);
                    int i6 = (i2 & 112) ^ 48;
                    boolean h2 = oq5Var2.h((rja) this.v) | oq5Var2.f(sr3Var2) | oq5Var2.h((mm6) this.t) | oq5Var2.f((fvf) this.u) | ((i6 > 32 && oq5Var2.d(intValue3)) || (i2 & 48) == 32);
                    Object K3 = oq5Var2.K();
                    kjn kjnVar2 = gq5.a;
                    if (h2 || K3 == kjnVar2) {
                        k50 k50Var2 = new k50((rja) this.v, sr3Var2, (mm6) this.t, (fvf) this.u, intValue3, 1);
                        oq5Var2.k0(k50Var2);
                        K3 = k50Var2;
                    }
                    Function0 function02 = (Function0) K3;
                    boolean z4 = sr3Var2.c;
                    if ((i6 <= 32 || !oq5Var2.d(intValue3)) && (i2 & 48) != 32) {
                        z3 = false;
                    }
                    boolean f2 = oq5Var2.f(sr3Var2) | z3;
                    Object K4 = oq5Var2.K();
                    if (f2 || K4 == kjnVar2) {
                        K4 = new l50(intValue3, sr3Var2, 1);
                        oq5Var2.k0(K4);
                    }
                    dcc.a(function02, z4, false, nfp.b(vci.a, false, (Function1) K4), false, 0L, ild.C(1328050827, new m50(sr3Var2, 1), oq5Var2), oq5Var2, 1573248, 48);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                a aVar3 = (a) obj;
                int intValue5 = ((Number) obj2).intValue();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = (((oq5) hq5Var3).f(aVar3) ? 4 : 2) | intValue6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((oq5) hq5Var3).d(intValue5) ? 32 : 16;
                }
                if ((i3 & 147) == 146) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                j1b j1bVar = (j1b) this.s.get(intValue5);
                oq5 oq5Var4 = (oq5) hq5Var3;
                oq5Var4.Z(-204974113);
                s7g.h(aVar3, (ayn) this.v, Integer.valueOf(j1bVar.a), null, false, null, ild.C(-939830420, new y2m((a3m) this.t, intValue5, j1bVar, (lf5) this.u), oq5Var4), oq5Var4, (i3 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB);
                oq5Var4.p(false);
            default:
                a aVar4 = (a) obj;
                int intValue7 = ((Number) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue8 = ((Number) obj4).intValue();
                u0s u0sVar = (u0s) this.t;
                jab jabVar = (jab) this.u;
                rbm rbmVar = (rbm) this.v;
                if ((intValue8 & 6) == 0) {
                    i4 = (((oq5) hq5Var4).f(aVar4) ? 4 : 2) | intValue8;
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((oq5) hq5Var4).d(intValue7) ? 32 : 16;
                }
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(i4 & 1, (i4 & 147) != 146)) {
                    fcj fcjVar = (fcj) this.s.get(intValue7);
                    oq5Var5.Z(765425036);
                    thj L = szf.L(fcjVar.b, intValue7);
                    dej dejVar = fcjVar.a;
                    wdj G = t7g.G((rbm) this.v, fcjVar.b, intValue7, (u0s) this.t, jabVar, L, oq5Var5, ((i4 & 126) << 3) & 896, 32);
                    boolean h3 = oq5Var5.h(rbmVar) | oq5Var5.h(jabVar) | oq5Var5.h(L) | oq5Var5.h(u0sVar);
                    Object K5 = oq5Var5.K();
                    if (h3 || K5 == gq5.a) {
                        n83 n83Var = new n83(rbmVar, jabVar, L, u0sVar, 1);
                        oq5Var5.k0(n83Var);
                        K5 = n83Var;
                    }
                    asq.k(dejVar, G, androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K5, 15), "podcast_popular_track"), oq5Var5, 0);
                    oq5Var5.p(false);
                } else {
                    oq5Var5.S();
                }
                break;
        }
        return Unit.a;
    }
}
