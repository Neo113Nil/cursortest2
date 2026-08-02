package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class rnd implements b70 {
    public static final rnd a = new rnd();
    public static final List b = scc.g("initStartMessageTimeoutMillis", "loadMessageTimeoutMillis");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        wmd wmdVar = (wmd) obj;
        bfxVar.A1("initStartMessageTimeoutMillis");
        wkf wkfVar = mlz.a;
        cVar.d(wkfVar).a(bfxVar, cVar, Long.valueOf(wmdVar.a));
        bfxVar.A1("loadMessageTimeoutMillis");
        cVar.d(wkfVar).a(bfxVar, cVar, Long.valueOf(wmdVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Long l = null;
        Long l2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            wkf wkfVar = mlz.a;
            if (h2 == 0) {
                l = (Long) cVar.d(wkfVar).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new wmd(l.longValue(), l2.longValue());
                }
                l2 = (Long) cVar.d(wkfVar).b(xdxVar, cVar);
            }
        }
    }
}
