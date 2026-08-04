package com.gamericefishpro.space.ui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements kotlin.coroutines.f {
    public final ThreadLocal d;

    public v(ThreadLocal threadLocal) {
        this.d = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.a(this.d, ((v) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.d + ')';
    }
}
