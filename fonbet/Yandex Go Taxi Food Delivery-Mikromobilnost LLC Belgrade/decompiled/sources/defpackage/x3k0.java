package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class x3k0 implements b70 {
    public static final List a = scc.g("text", "items");

    public static i3k0 c(xdx xdxVar, c cVar) {
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new i3k0(str, arrayList);
                }
                w3k0 w3k0Var = w3k0.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(w3k0Var, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, i3k0 i3k0Var) {
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(i3k0Var.a);
        bfxVar.A1("items");
        w3k0 w3k0Var = w3k0.a;
        ArrayList arrayList = i3k0Var.b;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                w3k0Var.a(bfxVar, cVar, obj);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                w3k0Var.a(ek00Var, cVar, obj);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }
}
