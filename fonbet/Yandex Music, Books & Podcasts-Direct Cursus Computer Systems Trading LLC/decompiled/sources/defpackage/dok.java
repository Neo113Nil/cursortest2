package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dok {
    public final String a;
    public final Date b;

    public dok(Date date, String str) {
        str.getClass();
        date.getClass();
        this.a = str;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dok)) {
            return false;
        }
        dok dokVar = (dok) obj;
        return Intrinsics.d(this.a, dokVar.a) && Intrinsics.d(this.b, dokVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdWithTimestamp(id=" + this.a + ", timestamp=" + this.b + ")";
    }
}
