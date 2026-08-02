package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class ojt implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ojt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                cjt cjtVar = (cjt) this.b;
                njt njtVar = (njt) this.c;
                fvf fvfVar = (fvf) this.d;
                ynn ynnVar = (ynn) this.e;
                String str = (String) this.f;
                tsf tsfVar = (tsf) this.g;
                o0k o0kVar = (o0k) obj;
                fjt fjtVar = (fjt) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                o0kVar.getClass();
                fjtVar.getClass();
                vm C = ghh.C(ghh.C(o0kVar, zs4.g(hq5Var)), ogp.A(hq5Var));
                int ordinal = cjtVar.c.ordinal();
                vci vciVar = vci.a;
                if (ordinal == 0) {
                    oq5 oq5Var = (oq5) hq5Var;
                    oq5Var.Z(-270386264);
                    q0k c = a.c(0.0f, 8, 0.0f, 0.0f, 13);
                    d9g d9gVar = cjtVar.a;
                    if (d9gVar == null) {
                        d9gVar = d9g.a;
                        dfi.r("UiType.LIST and null listItemType. Fallback to ListItemType.CombinedEntity", "UniversalEntitiesScreen");
                    }
                    fxf.n(fjtVar, njtVar, fvfVar, d9gVar, ghh.C(c, C), ynnVar, str, androidx.compose.ui.platform.a.a(vciVar, "universal_entity_list"), oq5Var, ((intValue >> 3) & 14) | 12582912);
                    oq5Var.p(false);
                } else {
                    if (ordinal != 1) {
                        throw vz1.i((oq5) hq5Var, -424365124, false);
                    }
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-269414228);
                    float f = 16;
                    q0k c2 = a.c(f, f, f, 0.0f, 8);
                    zpd zpdVar = cjtVar.b;
                    if (zpdVar == null) {
                        zpdVar = zpd.k;
                        dfi.r("UiType.GRID and null gridItemType. Fallback to GridItemType.CombinedEntity", "UniversalEntitiesScreen");
                    }
                    zwf.l(tsfVar, zpdVar, fjtVar, njtVar, ghh.C(c2, C), ynnVar, str, androidx.compose.ui.platform.a.a(vciVar, "universal_entity_grid"), oq5Var2, ((intValue << 3) & 896) | 12582912);
                    oq5Var2.p(false);
                }
                return Unit.a;
            default:
                ltu ltuVar = (ltu) this.b;
                s2v s2vVar = (s2v) this.c;
                sdr sdrVar = (sdr) this.d;
                sdr sdrVar2 = (sdr) this.e;
                sdr sdrVar3 = (sdr) this.f;
                ab0 ab0Var = (ab0) this.g;
                onu onuVar = (onu) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((dh3) obj).getClass();
                onuVar.getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((oq5) hq5Var2).d(onuVar.ordinal()) ? 32 : 16;
                }
                if ((intValue2 & 145) == 144) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                if (((Boolean) oq5Var4.j(vpg.a)).booleanValue()) {
                    oq5Var4.Z(-1855414621);
                    our.a(ltuVar.s, a4v.a, mur.b, null, ild.C(-233251893, new lc(s2vVar, sdrVar2, sdrVar3, ab0Var, onuVar, 22), oq5Var4), oq5Var4, 24960, 8);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.Z(-1854410066);
                    g0g.A(s2vVar, sdrVar, sdrVar2, sdrVar3, ab0Var, onuVar, oq5Var4, ((intValue2 << 12) & 458752) | 384);
                    oq5Var4.p(false);
                }
                return Unit.a;
        }
    }
}
