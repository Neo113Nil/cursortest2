package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class sw90 implements b70 {
    public static final sw90 a = new sw90();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        pw90 pw90Var = (pw90) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(pw90Var.a);
        List list = x3k0.a;
        x3k0.d(bfxVar, cVar, pw90Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new pw90(str, x3k0.c(xdxVar, cVar));
    }
}
