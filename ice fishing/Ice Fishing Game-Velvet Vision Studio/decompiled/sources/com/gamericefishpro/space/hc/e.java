package com.gamericefishpro.space.hc;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final /* synthetic */ <TService> e provides() {
        Intrinsics.f();
        throw null;
    }

    public abstract Object resolve(b bVar);

    public final <TService> e provides(Class<TService> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        this.services.add(c);
        return this;
    }
}
