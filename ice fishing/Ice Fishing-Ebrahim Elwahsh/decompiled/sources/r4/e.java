package r4;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class e {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final /* synthetic */ <TService> e provides() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    public abstract Object resolve(b bVar);

    public final <TService> e provides(Class<TService> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        this.services.add(c4);
        return this;
    }
}
