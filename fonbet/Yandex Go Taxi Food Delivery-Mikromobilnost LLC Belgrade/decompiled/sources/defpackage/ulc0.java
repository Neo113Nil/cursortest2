package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class ulc0 implements b70 {
    public static final ulc0 a = new ulc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        flc0 flc0Var = (flc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(flc0Var.b());
        List list = hnc0.a;
        hnc0.d(bfxVar, cVar, flc0Var.a());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new flc0(str, hnc0.c(xdxVar, cVar));
    }
}
