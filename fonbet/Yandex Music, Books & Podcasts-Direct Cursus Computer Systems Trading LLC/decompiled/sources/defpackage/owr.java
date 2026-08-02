package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class owr {
    public final nvl a;
    public final Date b;
    public final int c;
    public final Integer d;

    public owr(nvl nvlVar, Date date, int i, Integer num) {
        this.a = nvlVar;
        this.b = date;
        this.c = i;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owr)) {
            return false;
        }
        owr owrVar = (owr) obj;
        return this.a.equals(owrVar.a) && Intrinsics.d(this.b, owrVar.b) && this.c == owrVar.c && Intrinsics.d(this.d, owrVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        int a = f1d.a(this.c, (hashCode + (date == null ? 0 : date.hashCode())) * 31, 31);
        Integer num = this.d;
        return a + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SyncLikedPlaylistInfo(playlistId=" + this.a + ", timestamp=" + this.b + ", revision=" + this.c + ", snapshot=" + this.d + ")";
    }
}
