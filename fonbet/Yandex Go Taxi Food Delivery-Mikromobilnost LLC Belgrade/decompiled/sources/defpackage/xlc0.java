package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class xlc0 implements b70 {
    public static final xlc0 a = new xlc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        hlc0 hlc0Var = (hlc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(hlc0Var.a);
        List list = itc0.a;
        rsc0 rsc0Var = hlc0Var.b;
        bfxVar.A1("widgetId");
        foe foeVar2 = l80.a;
        bfxVar.r0(rsc0Var.a);
        bfxVar.A1("contentDescription");
        ep60 ep60Var = new ep60(ftc0.a, true);
        lsc0 lsc0Var = rsc0Var.b;
        if (lsc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, lsc0Var);
        }
        bfxVar.A1("templates");
        lqy lqyVar = new lqy(foeVar2);
        List list2 = rsc0Var.c;
        if (list2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list2);
        }
        bfxVar.A1("strictAction");
        ep60 ep60Var2 = new ep60(jtc0.a, true);
        osc0 osc0Var = rsc0Var.d;
        if (osc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, osc0Var);
        }
        bfxVar.A1("displayWidgetRules");
        gtc0 gtc0Var = gtc0.a;
        msc0 msc0Var = rsc0Var.e;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            gtc0Var.a(bfxVar, cVar, msc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            gtc0Var.a(ek00Var2, cVar, msc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("type");
        bfxVar.r0(rsc0Var.f.getRawValue());
        bfxVar.A1("textWidget");
        ep60 ep60Var3 = new ep60(ltc0.a, true);
        qsc0 qsc0Var = rsc0Var.g;
        if (qsc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var3.a(bfxVar, cVar, qsc0Var);
        }
        bfxVar.A1("balanceWidget");
        ep60 ep60Var4 = new ep60(dtc0.a, true);
        jsc0 jsc0Var = rsc0Var.h;
        if (jsc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var4.a(bfxVar, cVar, jsc0Var);
        }
        bfxVar.A1("buttonWidget");
        ep60 ep60Var5 = new ep60(etc0.a, true);
        ksc0 ksc0Var = rsc0Var.i;
        if (ksc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var5.a(bfxVar, cVar, ksc0Var);
        }
        bfxVar.A1("switchWidget");
        ep60 ep60Var6 = new ep60(ktc0.a, true);
        psc0 psc0Var = rsc0Var.j;
        if (psc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var6.a(bfxVar, cVar, psc0Var);
        }
        bfxVar.A1("iconWidget");
        ep60 ep60Var7 = new ep60(htc0.a, true);
        nsc0 nsc0Var = rsc0Var.k;
        if (nsc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var7.a(bfxVar, cVar, nsc0Var);
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
        return new hlc0(str, itc0.c(xdxVar, cVar));
    }
}
