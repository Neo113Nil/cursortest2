package l6;

import java.time.Instant;

/* loaded from: classes2.dex */
public interface e {
    e a(String str);

    void b();

    e c(k6.e eVar, Object obj);

    e d(Instant instant);

    e e(i iVar);

    default e f(f6.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new S6.a(4, this));
        }
        return this;
    }
}
