package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k2t {
    public final int a;
    public final Integer b;

    public k2t(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2t)) {
            return false;
        }
        k2t k2tVar = (k2t) obj;
        return this.a == k2tVar.a && Intrinsics.d(this.b, k2tVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TrackWithArtist(track=" + this.a + ", artist=" + this.b + ")";
    }
}
