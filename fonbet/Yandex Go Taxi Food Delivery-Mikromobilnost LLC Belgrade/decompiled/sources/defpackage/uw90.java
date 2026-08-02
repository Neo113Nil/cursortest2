package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class uw90 implements b70 {
    public static final uw90 a = new uw90();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        qw90 qw90Var = (qw90) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(qw90Var.a);
        List list = x3k0.a;
        x3k0.d(bfxVar, cVar, qw90Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new qw90(str, x3k0.c(xdxVar, cVar));
    }
}
