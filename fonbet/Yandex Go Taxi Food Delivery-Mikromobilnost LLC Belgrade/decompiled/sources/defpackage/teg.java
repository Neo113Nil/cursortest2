package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class teg implements b70 {
    public static final teg a = new teg();
    public static final List b = scc.g("color", "colors");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        leg legVar = (leg) obj;
        bfxVar.A1("color");
        foe foeVar = l80.a;
        bfxVar.r0(legVar.a);
        bfxVar.A1("colors");
        veg vegVar = veg.a;
        neg negVar = legVar.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            vegVar.a(bfxVar, cVar, negVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        vegVar.a(ek00Var2, cVar, negVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        neg negVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new leg(str, negVar);
                }
                veg vegVar = veg.a;
                foe foeVar2 = l80.a;
                negVar = (neg) new ep60(vegVar, true).b(xdxVar, cVar);
            }
        }
    }
}
