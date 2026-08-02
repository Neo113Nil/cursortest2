package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zvr {
    public final String a;
    public final Date b;

    public zvr(Date date, String str) {
        date.getClass();
        this.a = str;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvr)) {
            return false;
        }
        zvr zvrVar = (zvr) obj;
        return this.a.equals(zvrVar.a) && Intrinsics.d(this.b, zvrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncArtistInfo(artistId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
