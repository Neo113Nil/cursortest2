package com.gamericefishpro.space.ri;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {
    public final Throwable a;

    public j(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return Intrinsics.a(this.a, ((j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.ri.k
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
