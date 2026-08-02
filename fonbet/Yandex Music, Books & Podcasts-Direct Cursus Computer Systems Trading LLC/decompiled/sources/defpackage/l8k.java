package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l8k implements p8k {
    public final j1g a;
    public final Date b;

    public l8k(j1g j1gVar, Date date) {
        this.a = j1gVar;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8k)) {
            return false;
        }
        l8k l8kVar = (l8k) obj;
        return this.a == l8kVar.a && Intrinsics.d(this.b, l8kVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "Artist(likeStatus=" + this.a + ", timestamp=" + this.b + ")";
    }
}
