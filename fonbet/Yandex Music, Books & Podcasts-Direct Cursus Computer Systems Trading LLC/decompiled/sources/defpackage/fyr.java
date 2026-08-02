package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fyr {
    public final String a;
    public final Date b;

    public fyr(Date date, String str) {
        date.getClass();
        this.a = str;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyr)) {
            return false;
        }
        fyr fyrVar = (fyr) obj;
        return this.a.equals(fyrVar.a) && Intrinsics.d(this.b, fyrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncVideoClipInfo(videoClipId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
