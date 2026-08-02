package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0d {
    public final String a;
    public final String b;

    public o0d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0d)) {
            return false;
        }
        o0d o0dVar = (o0d) obj;
        return Intrinsics.d(this.a, o0dVar.a) && Intrinsics.d(this.b, o0dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("GalleryPhotoBundle(lowQualityImage=", this.a, ", highQualityImage=", this.b, ")");
    }
}
