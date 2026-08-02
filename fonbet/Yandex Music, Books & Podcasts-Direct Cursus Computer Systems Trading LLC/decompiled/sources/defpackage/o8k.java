package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o8k implements p8k {
    public final j1g a;
    public final Date b;

    public o8k(j1g j1gVar, Date date) {
        this.a = j1gVar;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8k)) {
            return false;
        }
        o8k o8kVar = (o8k) obj;
        return this.a == o8kVar.a && Intrinsics.d(this.b, o8kVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "VideoClip(likeStatus=" + this.a + ", timestamp=" + this.b + ")";
    }
}
