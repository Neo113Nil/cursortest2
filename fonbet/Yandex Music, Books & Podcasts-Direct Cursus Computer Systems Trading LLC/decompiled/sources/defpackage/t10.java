package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t10 {
    public final String a;
    public final r10 b;

    public t10(String str, r10 r10Var) {
        str.getClass();
        r10Var.getClass();
        this.a = str;
        this.b = r10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return Intrinsics.d(this.a, t10Var.a) && this.b == t10Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumTrackOrderDbRow(albumId=" + this.a + ", order=" + this.b + ")";
    }
}
