package n8;

import java.util.LinkedHashSet;
import java.util.Set;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final /* synthetic */ <TService> e provides() {
        j.i();
        throw null;
    }

    public abstract Object resolve(b bVar);

    public final <TService> e provides(Class<TService> cls) {
        j.e(cls, "c");
        this.services.add(cls);
        return this;
    }
}
