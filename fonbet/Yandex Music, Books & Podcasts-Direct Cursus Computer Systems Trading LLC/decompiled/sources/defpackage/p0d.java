package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p0d {
    public final String a;
    public final String b;

    public p0d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0d)) {
            return false;
        }
        p0d p0dVar = (p0d) obj;
        return Intrinsics.d(this.a, p0dVar.a) && Intrinsics.d(this.b, p0dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("GalleryPhotoBundle(lowQualityImage=", this.a, ", highQualityImage=", this.b, ")");
    }
}
