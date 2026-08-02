package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class zlc0 implements b70 {
    public static final zlc0 a = new zlc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        jlc0 jlc0Var = (jlc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(jlc0Var.a);
        List list = nuc0.a;
        juc0 juc0Var = jlc0Var.b;
        bfxVar.A1("widgetsLevelId");
        foe foeVar2 = l80.a;
        bfxVar.r0(juc0Var.a);
        bfxVar.A1("contentDescription");
        ep60 ep60Var = new ep60(kuc0.a, true);
        fuc0 fuc0Var = juc0Var.b;
        if (fuc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, fuc0Var);
        }
        bfxVar.A1("elements");
        muc0 muc0Var = muc0.a;
        ArrayList arrayList = juc0Var.c;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                muc0Var.a(bfxVar, cVar, obj2);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                muc0Var.a(ek00Var2, cVar, obj2);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("displayRules");
        luc0 luc0Var = luc0.a;
        guc0 guc0Var = juc0Var.d;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            luc0Var.a(bfxVar, cVar, guc0Var);
            ek00Var3.y();
        } else {
            ek00 ek00Var4 = new ek00();
            ek00Var4.u();
            luc0Var.a(ek00Var4, cVar, guc0Var);
            ek00Var4.y();
            uga1.f(bfxVar, ek00Var4.c());
        }
        bfxVar.A1("strictAction");
        ep60 ep60Var2 = new ep60(ouc0.a, true);
        iuc0 iuc0Var = juc0Var.e;
        if (iuc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, iuc0Var);
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
        return new jlc0(str, nuc0.c(xdxVar, cVar));
    }
}
