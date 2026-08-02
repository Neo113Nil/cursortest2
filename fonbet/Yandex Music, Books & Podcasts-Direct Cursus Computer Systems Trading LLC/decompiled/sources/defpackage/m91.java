package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m91 {
    public final List a;
    public final String b;

    public m91(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m91)) {
            return false;
        }
        m91 m91Var = (m91) obj;
        return Intrinsics.d(this.a, m91Var.a) && Intrinsics.d(this.b, m91Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ArtistGalleryData(photoList=" + this.a + ", videoUrl=" + this.b + ")";
    }
}
