package com.gamericefishpro.space.pi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.coroutines.a {
    public static final u i = new u();
    public final String e;

    public w() {
        super(i);
        this.e = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.a(this.e, ((w) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return com.gamericefishpro.space.t0.y0.i(new StringBuilder("CoroutineName("), this.e, ')');
    }
}
