package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y62 {
    public final String a;
    public final x62 b;

    public y62(String str, x62 x62Var) {
        str.getClass();
        this.a = str;
        this.b = x62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y62)) {
            return false;
        }
        y62 y62Var = (y62) obj;
        return Intrinsics.d(this.a, y62Var.a) && this.b.equals(y62Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoDownloadTracksCacheInfoRow(trackId=" + this.a + ", cacheInfo=" + this.b + ")";
    }
}
