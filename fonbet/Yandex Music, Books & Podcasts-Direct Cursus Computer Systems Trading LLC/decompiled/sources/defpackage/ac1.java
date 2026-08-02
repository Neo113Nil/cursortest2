package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ac1 {
    public final String a;
    public final j1g b;
    public final Date c;

    public ac1(String str, j1g j1gVar, Date date) {
        str.getClass();
        this.a = str;
        this.b = j1gVar;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac1)) {
            return false;
        }
        ac1 ac1Var = (ac1) obj;
        return Intrinsics.d(this.a, ac1Var.a) && this.b == ac1Var.b && Intrinsics.d(this.c, ac1Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Date date = this.c;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "ArtistLikeStatus(artistId=" + this.a + ", likeStatus=" + this.b + ", timestamp=" + this.c + ")";
    }
}
