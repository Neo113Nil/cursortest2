package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class tlc0 implements b70 {
    public static final tlc0 a = new tlc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        elc0 elc0Var = (elc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(elc0Var.b());
        List list = hnc0.a;
        hnc0.d(bfxVar, cVar, elc0Var.a());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new elc0(str, hnc0.c(xdxVar, cVar));
    }
}
