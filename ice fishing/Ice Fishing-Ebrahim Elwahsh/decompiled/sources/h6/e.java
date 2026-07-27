package h6;

import java.time.Instant;

/* loaded from: classes2.dex */
public interface e {
    e a(String str);

    void b();

    e c(i iVar);

    default e d(b6.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new O6.a(4, this));
        }
        return this;
    }

    e e(g6.e eVar, Object obj);

    e f(Instant instant);
}
