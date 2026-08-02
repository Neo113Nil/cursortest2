package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0d {
    public final List a;
    public final String b;

    public f0d(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0d)) {
            return false;
        }
        f0d f0dVar = (f0d) obj;
        return Intrinsics.d(this.a, f0dVar.a) && Intrinsics.d(this.b, f0dVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "GalleryData(photoList=" + this.a + ", videoUrl=" + this.b + ")";
    }
}
