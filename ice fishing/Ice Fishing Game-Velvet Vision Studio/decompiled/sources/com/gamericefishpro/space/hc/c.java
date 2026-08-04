package com.gamericefishpro.space.hc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    private final List<e> registrations = new ArrayList();

    @Override // com.gamericefishpro.space.hc.a
    public d build() {
        return new d(this.registrations);
    }

    public final /* synthetic */ <T> e register() {
        Intrinsics.f();
        throw null;
    }

    @Override // com.gamericefishpro.space.hc.a
    public <T> e register(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        g gVar = new g(c);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // com.gamericefishpro.space.hc.a
    public <T> e register(Function1<? super b, ? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        f fVar = new f(create);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // com.gamericefishpro.space.hc.a
    public <T> e register(T t) {
        h hVar = new h(t);
        this.registrations.add(hVar);
        return hVar;
    }
}
