package com.gamericefishpro.space.c4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public final Object c;

    public c() {
        super(12);
        this.c = new Object();
    }

    @Override // com.gamericefishpro.space.c4.b
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // com.gamericefishpro.space.c4.b
    public final boolean c(Object instance) {
        boolean zC;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.c) {
            zC = super.c(instance);
        }
        return zC;
    }
}
