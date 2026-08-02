package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class veg implements b70 {
    public static final veg a = new veg();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        neg negVar = (neg) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(negVar.a);
        List list = cfc.a;
        cfc.d(bfxVar, cVar, negVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new neg(str, cfc.c(xdxVar, cVar));
    }
}
