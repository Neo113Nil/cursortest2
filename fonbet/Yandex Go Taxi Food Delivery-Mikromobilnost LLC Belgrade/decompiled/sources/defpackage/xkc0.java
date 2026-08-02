package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class xkc0 implements b70 {
    public static final xkc0 a = new xkc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ukc0 ukc0Var = (ukc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(ukc0Var.a);
        List list = ykc0.a;
        vkc0 vkc0Var = ukc0Var.b;
        bfxVar.A1("position");
        bfxVar.r0(vkc0Var.a.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new ukc0(str, ykc0.c(xdxVar));
    }
}
