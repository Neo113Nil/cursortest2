package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k8k implements p8k {
    public final boolean a;
    public final Date b;

    public k8k(boolean z, Date date) {
        this.a = z;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8k)) {
            return false;
        }
        k8k k8kVar = (k8k) obj;
        return this.a == k8kVar.a && Intrinsics.d(this.b, k8kVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Date date = this.b;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "Album(liked=" + this.a + ", timestamp=" + this.b + ")";
    }
}
