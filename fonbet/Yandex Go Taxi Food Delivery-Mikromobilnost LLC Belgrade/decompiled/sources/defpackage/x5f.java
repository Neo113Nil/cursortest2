package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class x5f implements b70 {
    public static final x5f a = new x5f();
    public static final List b = Collections.singletonList("invoice");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("invoice");
        l80.a(z5f.a).a(bfxVar, cVar, ((t5f) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        v5f v5fVar = null;
        while (xdxVar.h2(b) == 0) {
            v5fVar = (v5f) l80.a(z5f.a).b(xdxVar, cVar);
        }
        return new t5f(v5fVar);
    }
}
