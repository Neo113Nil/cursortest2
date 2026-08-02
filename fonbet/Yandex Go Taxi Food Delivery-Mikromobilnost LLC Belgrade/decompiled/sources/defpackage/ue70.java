package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ue70 implements b70 {
    public static final ue70 a = new ue70();
    public static final List b = Collections.singletonList("name");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("name");
        cVar.d(le70.a).a(bfxVar, cVar, ((re70) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            str = (String) cVar.d(le70.a).b(xdxVar, cVar);
        }
        return new re70(str);
    }
}
