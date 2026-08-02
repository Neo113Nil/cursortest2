package app.cash.zipline.loader.internal.cache;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SelectCacheSumBytes {
    public final Long SUM;

    public SelectCacheSumBytes(Long l) {
        this.SUM = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectCacheSumBytes) && Intrinsics.areEqual(this.SUM, ((SelectCacheSumBytes) obj).SUM);
    }

    public final int hashCode() {
        Long l = this.SUM;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "SelectCacheSumBytes(SUM=" + this.SUM + ")";
    }
}
