package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class t1e implements b70 {
    public static final t1e a = new t1e();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        p1e p1eVar = (p1e) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(p1eVar.a);
        List list = l2e.a;
        l2e.d(bfxVar, cVar, p1eVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new p1e(l2e.c(xdxVar, cVar), str);
    }
}
