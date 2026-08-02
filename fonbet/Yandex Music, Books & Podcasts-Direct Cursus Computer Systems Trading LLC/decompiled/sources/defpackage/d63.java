package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d63 implements k63 {
    public final Integer a;
    public final Boolean b;
    public final List c;

    public d63(Integer num, Boolean bool, List list) {
        list.getClass();
        this.a = num;
        this.b = bool;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d63)) {
            return false;
        }
        d63 d63Var = (d63) obj;
        return Intrinsics.d(this.a, d63Var.a) && Intrinsics.d(this.b, d63Var.b) && Intrinsics.d(this.c, d63Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return this.c.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedAlbumsBlockLocalData(revision=");
        sb.append(this.a);
        sb.append(", allValuesRequired=");
        sb.append(this.b);
        sb.append(", likedAlbumIds=");
        return vz1.u(sb, this.c, ")");
    }
}
