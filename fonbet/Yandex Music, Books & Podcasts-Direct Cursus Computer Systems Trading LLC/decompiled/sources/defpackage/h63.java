package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h63 implements k63 {
    public final Integer a;
    public final Boolean b;
    public final List c;
    public final List d;

    public h63(Integer num, Boolean bool, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = num;
        this.b = bool;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return Intrinsics.d(this.a, h63Var.a) && Intrinsics.d(this.b, h63Var.b) && Intrinsics.d(this.c, h63Var.c) && Intrinsics.d(this.d, h63Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return this.d.hashCode() + k5r.d((hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return "LikedVideoClipsBlockLocalData(revision=" + this.a + ", allValuesRequired=" + this.b + ", likedVideoClipIds=" + this.c + ", dislikedVideoClipIds=" + this.d + ")";
    }
}
