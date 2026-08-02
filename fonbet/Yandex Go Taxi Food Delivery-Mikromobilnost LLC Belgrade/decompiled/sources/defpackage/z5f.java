package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class z5f implements b70 {
    public static final z5f a = new z5f();
    public static final List b = Collections.singletonList("externalCreate");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("externalCreate");
        y5f y5fVar = y5f.a;
        foe foeVar = l80.a;
        u5f u5fVar = ((v5f) obj).a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            y5fVar.a(bfxVar, cVar, u5fVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        y5fVar.a(ek00Var2, cVar, u5fVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        u5f u5fVar = null;
        while (xdxVar.h2(b) == 0) {
            y5f y5fVar = y5f.a;
            foe foeVar = l80.a;
            u5fVar = (u5f) new ep60(y5fVar, true).b(xdxVar, cVar);
        }
        return new v5f(u5fVar);
    }
}
