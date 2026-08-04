package com.gamericefishpro.space.oh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {
    public static final f e = new f(null);
    public static final g i = new g();
    public final int d = 131349;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g other = (g) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.d - other.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.d == gVar.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "2.1.21";
    }
}
