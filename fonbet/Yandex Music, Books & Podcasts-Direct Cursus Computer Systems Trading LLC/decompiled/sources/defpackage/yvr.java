package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yvr {
    public final String a;
    public final Date b;

    public yvr(Date date, String str) {
        date.getClass();
        this.a = str;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvr)) {
            return false;
        }
        yvr yvrVar = (yvr) obj;
        return this.a.equals(yvrVar.a) && Intrinsics.d(this.b, yvrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncAlbumInfo(albumId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
