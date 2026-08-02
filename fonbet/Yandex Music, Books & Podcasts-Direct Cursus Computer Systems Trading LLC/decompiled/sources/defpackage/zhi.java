package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zhi extends bii {
    public final String a;
    public final Throwable b;

    public zhi(String str, Throwable th) {
        str.getClass();
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhi)) {
            return false;
        }
        zhi zhiVar = (zhi) obj;
        return Intrinsics.d(this.a, zhiVar.a) && this.b.equals(zhiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkError(url=" + this.a + ", error=" + this.b + ")";
    }
}
