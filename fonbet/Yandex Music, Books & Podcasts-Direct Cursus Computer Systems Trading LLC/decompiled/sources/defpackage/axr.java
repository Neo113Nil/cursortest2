package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class axr {
    public final nvl a;
    public final Date b;
    public final int c;
    public final Integer d;
    public final List e;
    public final String f;

    public axr(nvl nvlVar, Date date, int i, Integer num, ArrayList arrayList, String str) {
        this.a = nvlVar;
        this.b = date;
        this.c = i;
        this.d = num;
        this.e = arrayList;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axr)) {
            return false;
        }
        axr axrVar = (axr) obj;
        return this.a.equals(axrVar.a) && Intrinsics.d(this.b, axrVar.b) && this.c == axrVar.c && Intrinsics.d(this.d, axrVar.d) && Intrinsics.d(this.e, axrVar.e) && Intrinsics.d(this.f, axrVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        int a = f1d.a(this.c, (hashCode + (date == null ? 0 : date.hashCode())) * 31, 31);
        Integer num = this.d;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SyncOwnPlaylistInfo(playlistId=" + this.a + ", timestamp=" + this.b + ", revision=" + this.c + ", snapshot=" + this.d + ", tracks=" + this.e + ", checksum=" + this.f + ")";
    }
}
