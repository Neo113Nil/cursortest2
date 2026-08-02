package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k31 {
    public final String a;
    public final List b;

    public k31(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k31)) {
            return false;
        }
        k31 k31Var = (k31) obj;
        return Intrinsics.d(this.a, k31Var.a) && Intrinsics.d(this.b, k31Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dfi.h("ArtistConcerts(artistTitle=", this.a, ", concerts=", ")", this.b);
    }
}
