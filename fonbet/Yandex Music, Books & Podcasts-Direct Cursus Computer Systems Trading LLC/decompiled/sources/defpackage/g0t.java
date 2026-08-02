package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0t {
    public final String a;
    public final boolean b;

    public g0t(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0t)) {
            return false;
        }
        g0t g0tVar = (g0t) obj;
        return Intrinsics.d(this.a, g0tVar.a) && this.b == g0tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("TrackReleaseDateUiData(date=", this.a, ", highlighted=", ")", this.b);
    }
}
