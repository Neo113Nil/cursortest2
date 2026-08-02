package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class y5f implements b70 {
    public static final y5f a = new y5f();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        u5f u5fVar = (u5f) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(u5fVar.a);
        List list = qxw.a;
        qxw.d(bfxVar, cVar, u5fVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new u5f(str, qxw.c(xdxVar, cVar));
    }
}
