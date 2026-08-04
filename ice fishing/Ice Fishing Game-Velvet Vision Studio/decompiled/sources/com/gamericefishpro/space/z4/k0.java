package com.gamericefishpro.space.z4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements s, AutoCloseable {
    public final String d;
    public final j0 e;
    public boolean i;

    public k0(String key, j0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.d = key;
        this.e = handle;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u source, o event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == o.ON_DESTROY) {
            this.i = false;
            source.g().f(this);
        }
    }

    public final void n(com.gamericefishpro.space.u6.s registry, w lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.i = true;
        lifecycle.a(this);
        registry.l(this.d, (com.gamericefishpro.space.b5.a) this.e.b.w);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
