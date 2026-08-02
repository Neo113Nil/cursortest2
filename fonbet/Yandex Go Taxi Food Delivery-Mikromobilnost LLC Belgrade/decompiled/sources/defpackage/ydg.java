package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ydg implements b70 {
    public static final ydg a = new ydg();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        udg udgVar = (udg) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(udgVar.a);
        List list = ieg.a;
        heg hegVar = udgVar.b;
        bfxVar.A1("metaShortcuts");
        jeg jegVar = jeg.a;
        foe foeVar2 = l80.a;
        lqy lqyVar = new lqy(new ep60(jegVar, true));
        List list2 = hegVar.a;
        if (list2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.c(bfxVar, cVar, list2);
        }
        bfxVar.A1("viewType");
        bfxVar.r0(hegVar.b.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new udg(str, ieg.c(xdxVar, cVar));
    }
}
