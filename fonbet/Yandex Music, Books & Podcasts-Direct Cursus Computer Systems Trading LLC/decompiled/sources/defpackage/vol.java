package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vol {
    public final String a;
    public final Integer b;

    public vol(String str, Integer num) {
        str.getClass();
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vol)) {
            return false;
        }
        vol volVar = (vol) obj;
        return Intrinsics.d(this.a, volVar.a) && Intrinsics.d(this.b, volVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PendingCacheData(playableId=" + this.a + ", cachedPercent=" + this.b + ")";
    }
}
