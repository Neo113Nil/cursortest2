package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cyr {
    public final rr5 a;
    public final Date b;

    public cyr(rr5 rr5Var, Date date) {
        date.getClass();
        this.a = rr5Var;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyr)) {
            return false;
        }
        cyr cyrVar = (cyr) obj;
        return this.a.equals(cyrVar.a) && Intrinsics.d(this.b, cyrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncTrackInfo(trackId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
