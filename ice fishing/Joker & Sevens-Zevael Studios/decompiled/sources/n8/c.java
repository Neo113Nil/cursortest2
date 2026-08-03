package n8;

import java.util.ArrayList;
import java.util.List;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements a {
    private final List<e> registrations = new ArrayList();

    @Override // n8.a
    public d build() {
        return new d(this.registrations);
    }

    public final /* synthetic */ <T> e register() {
        j.i();
        throw null;
    }

    @Override // n8.a
    public <T> e register(Class<T> cls) {
        j.e(cls, "c");
        g gVar = new g(cls);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // n8.a
    public <T> e register(oc.c cVar) {
        j.e(cVar, "create");
        f fVar = new f(cVar);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // n8.a
    public <T> e register(T t3) {
        h hVar = new h(t3);
        this.registrations.add(hVar);
        return hVar;
    }
}
