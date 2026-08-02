package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class w3k0 implements b70 {
    public static final w3k0 a = new w3k0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        h3k0 h3k0Var = (h3k0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(h3k0Var.a);
        List list = v4k0.a;
        j4k0 j4k0Var = h3k0Var.b;
        bfxVar.A1("__typename");
        foe foeVar2 = l80.a;
        bfxVar.r0(j4k0Var.a);
        bfxVar.A1("altText");
        bfxVar.r0(j4k0Var.b);
        bfxVar.A1("key");
        bfxVar.r0(j4k0Var.c);
        e4k0 e4k0Var = j4k0Var.d;
        if (e4k0Var != null) {
            q4k0.d(bfxVar, cVar, e4k0Var);
        }
        f4k0 f4k0Var = j4k0Var.e;
        if (f4k0Var != null) {
            List list2 = r4k0.a;
            bfxVar.A1("text");
            bfxVar.r0(f4k0Var.a);
        }
        g4k0 g4k0Var = j4k0Var.f;
        if (g4k0Var != null) {
            List list3 = s4k0.a;
            bfxVar.A1("image");
            l80.a(n4k0.a).a(bfxVar, cVar, g4k0Var.a);
        }
        h4k0 h4k0Var = j4k0Var.g;
        if (h4k0Var != null) {
            List list4 = t4k0.a;
            bfxVar.A1("text");
            bfxVar.r0(h4k0Var.a);
            bfxVar.A1("url");
            bfxVar.r0(h4k0Var.b);
        }
        i4k0 i4k0Var = j4k0Var.h;
        if (i4k0Var != null) {
            List list5 = u4k0.a;
            bfxVar.A1("text");
            bfxVar.r0(i4k0Var.a);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new h3k0(str, v4k0.c(xdxVar, cVar));
    }
}
