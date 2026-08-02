package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class sww implements b70 {
    public static final sww a = new sww();
    public static final List b = Collections.singletonList("familyInvite");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("familyInvite");
        l80.a(tww.a).a(bfxVar, cVar, ((oww) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        pww pwwVar = null;
        while (xdxVar.h2(b) == 0) {
            pwwVar = (pww) l80.a(tww.a).b(xdxVar, cVar);
        }
        return new oww(pwwVar);
    }
}
