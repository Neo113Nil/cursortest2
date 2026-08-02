package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yss {
    public final zvs a;
    public final String b;

    public yss(zvs zvsVar, String str) {
        zvsVar.getClass();
        this.a = zvsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yss)) {
            return false;
        }
        yss yssVar = (yss) obj;
        return Intrinsics.d(this.a, yssVar.a) && Intrinsics.d(this.b, yssVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "InternalTrackId(trackId=" + this.a + ", playableId=" + this.b + ")";
    }
}
