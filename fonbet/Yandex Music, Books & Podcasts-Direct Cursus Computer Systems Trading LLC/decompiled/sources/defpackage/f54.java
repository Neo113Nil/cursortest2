package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class f54 implements ryc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ o3k d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f54(o54 o54Var, o3k o3kVar, float f, zsq zsqVar, hvq hvqVar, boolean z) {
        this.e = o54Var;
        this.d = o3kVar;
        this.c = f;
        this.f = zsqVar;
        this.g = hvqVar;
        this.b = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        boolean z;
        switch (this.a) {
            case 0:
                o54 o54Var = (o54) this.e;
                zsq zsqVar = (zsq) this.f;
                hvq hvqVar = (hvq) this.g;
                int intValue = ((Integer) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                g24 g24Var = (g24) CollectionsKt.S(o54Var.d.b, intValue);
                if (g24Var == null) {
                    oq5 oq5Var = (oq5) hq5Var;
                    oq5Var.Z(-1961496211);
                    oq5Var.p(false);
                } else {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-1961496210);
                    oq5Var2.Z(2064311806);
                    o3k o3kVar = this.d;
                    float m = o3kVar.m(intValue);
                    float abs = Math.abs(m);
                    if (abs > 1.0f) {
                        abs = 1.0f;
                    }
                    float f2 = 0.95f - (abs * 0.2f);
                    boolean z2 = this.b;
                    if (z2 && m == 0.0f) {
                        f2 = 1.1f;
                    }
                    sdr b = pk0.b(f2, null, null, null, oq5Var2, 0, 30);
                    float m2 = o3kVar.m(intValue);
                    if (z2) {
                        f = m2 == 0.0f ? 1.0f : 0.0f;
                    } else {
                        float abs2 = Math.abs(m2);
                        if (abs2 > 1.0f) {
                            abs2 = 1.0f;
                        }
                        f = 1.0f - (abs2 * 0.5f);
                    }
                    sdr b2 = pk0.b(f, null, null, null, oq5Var2, 0, 30);
                    yci d = a.d(d.d(vci.a, 1.0f), 1.0f);
                    boolean f3 = ((((intValue2 & 112) ^ 48) > 32 && oq5Var2.d(intValue)) || (intValue2 & 48) == 32) | oq5Var2.f(o3kVar) | oq5Var2.f(b) | oq5Var2.f(b2);
                    float f4 = this.c;
                    boolean c = f3 | oq5Var2.c(f4);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (c || K == kjnVar) {
                        g54 g54Var = new g54(o3kVar, intValue, b, b2, f4);
                        oq5Var2.k0(g54Var);
                        K = g54Var;
                    }
                    yci a = androidx.compose.ui.graphics.a.a(d, (Function1) K);
                    boolean h = oq5Var2.h(zsqVar) | oq5Var2.h(hvqVar);
                    Object K2 = oq5Var2.K();
                    if (h || K2 == kjnVar) {
                        K2 = new ko1(zsqVar, hvqVar, 1);
                        oq5Var2.k0(K2);
                    }
                    yci b3 = com.yandex.music.core.ui.compose.a.b(a, null, 0L, 0.0f, null, (Function2) K2, 15);
                    saf safVar = g24Var.d;
                    if (safVar instanceof nn6) {
                        oq5Var2.Z(759405707);
                        nn6 nn6Var = (nn6) safVar;
                        bfg.b(nn6Var.n, nn6Var.o, nn6Var.p, b3, oq5Var2, 0);
                        z = false;
                        oq5Var2.p(false);
                    } else {
                        if (!(safVar instanceof mn6)) {
                            throw vz1.i(oq5Var2, 759402455, false);
                        }
                        oq5Var2.Z(759417712);
                        ocg.e(((mn6) safVar).n, new htq(etq.a), b3, null, oq5Var2, 0, 8);
                        z = false;
                        oq5Var2.p(false);
                    }
                    oq5Var2.p(z);
                    oq5Var2.p(z);
                }
                return Unit.a;
            default:
                m16 m16Var = (m16) this.e;
                c26 c26Var = (c26) this.f;
                List list = (List) this.g;
                int intValue3 = ((Integer) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                float abs3 = Math.abs(this.d.m(intValue3));
                if (abs3 > 1.0f) {
                    abs3 = 1.0f;
                }
                sdr b4 = pk0.b(1.0f - abs3, null, null, null, hq5Var2, 0, 30);
                pud pudVar = (pud) CollectionsKt.S(m16Var.b, intValue3);
                if (pudVar == null) {
                    return Unit.a;
                }
                vci vciVar = vci.a;
                yci d2 = a.d(b.b(androidx.compose.ui.platform.a.a(vciVar, "concert_tab_header_card"), intValue3).f(this.b ? d.r(vciVar, this.c) : d.d(vciVar, 1.0f)), 0.83f);
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean f5 = oq5Var3.f(b4);
                Object K3 = oq5Var3.K();
                if (f5 || K3 == gq5.a) {
                    K3 = new la1(b4, 18);
                    oq5Var3.k0(K3);
                }
                lg3.s(pudVar, m16Var, c26Var, intValue3, list, wyf.s(d2, (Function0) K3), oq5Var3, 72 | ((intValue4 << 6) & 7168));
                return Unit.a;
        }
    }

    public /* synthetic */ f54(m16 m16Var, c26 c26Var, List list, boolean z, float f, o3k o3kVar) {
        this.e = m16Var;
        this.f = c26Var;
        this.g = list;
        this.b = z;
        this.c = f;
        this.d = o3kVar;
    }
}
