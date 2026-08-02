package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r4u {
    public final String a;
    public final j1g b;
    public final Date c;

    public r4u(String str, j1g j1gVar, Date date) {
        str.getClass();
        this.a = str;
        this.b = j1gVar;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4u)) {
            return false;
        }
        r4u r4uVar = (r4u) obj;
        return Intrinsics.d(this.a, r4uVar.a) && this.b == r4uVar.b && Intrinsics.d(this.c, r4uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j1g j1gVar = this.b;
        int hashCode2 = (hashCode + (j1gVar == null ? 0 : j1gVar.hashCode())) * 31;
        Date date = this.c;
        return hashCode2 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "VideoClipLikeStatus(videoClipId=" + this.a + ", likeStatus=" + this.b + ", timestamp=" + this.c + ")";
    }
}
