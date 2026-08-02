package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class qpc0 implements b70 {
    public static final qpc0 a = new qpc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        opc0 opc0Var = (opc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(opc0Var.a);
        List list = mpc0.a;
        fpc0 fpc0Var = opc0Var.b;
        bfxVar.A1("type");
        bfxVar.r0(fpc0Var.a.getRawValue());
        bfxVar.A1("argCheckingPredicate");
        ep60 a2 = l80.a(gpc0.a);
        yoc0 yoc0Var = fpc0Var.b;
        if (yoc0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, yoc0Var);
        }
        bfxVar.A1("booleanLiteralPredicate");
        ep60 a3 = l80.a(hpc0.a);
        zoc0 zoc0Var = fpc0Var.c;
        if (zoc0Var == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, zoc0Var);
        }
        bfxVar.A1("notPredicate");
        ep60 a4 = l80.a(lpc0.a);
        dpc0 dpc0Var = fpc0Var.d;
        if (dpc0Var == null) {
            bfxVar.k2();
        } else {
            a4.a(bfxVar, cVar, dpc0Var);
        }
        bfxVar.A1("unifyingPredicate");
        ep60 a5 = l80.a(npc0.a);
        epc0 epc0Var = fpc0Var.e;
        if (epc0Var == null) {
            bfxVar.k2();
        } else {
            a5.a(bfxVar, cVar, epc0Var);
        }
        bfxVar.A1("comparisonPredicate");
        ep60 a6 = l80.a(ipc0.a);
        apc0 apc0Var = fpc0Var.f;
        if (apc0Var == null) {
            bfxVar.k2();
        } else {
            a6.a(bfxVar, cVar, apc0Var);
        }
        bfxVar.A1("containsPredicate");
        ep60 a7 = l80.a(jpc0.a);
        bpc0 bpc0Var = fpc0Var.g;
        if (bpc0Var == null) {
            bfxVar.k2();
        } else {
            a7.a(bfxVar, cVar, bpc0Var);
        }
        bfxVar.A1("inSetPredicate");
        ep60 a8 = l80.a(kpc0.a);
        cpc0 cpc0Var = fpc0Var.h;
        if (cpc0Var == null) {
            bfxVar.k2();
        } else {
            a8.a(bfxVar, cVar, cpc0Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new opc0(str, mpc0.c(xdxVar, cVar));
    }
}
