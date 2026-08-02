package defpackage;

import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c5j {
    public final lt a;
    public final ArrayList b;
    public final u9b c;
    public final Date d;
    public final boolean e;
    public final String f;

    public c5j(lt ltVar, ArrayList arrayList, u9b u9bVar, Date date, boolean z, String str) {
        this.a = ltVar;
        this.b = arrayList;
        this.c = u9bVar;
        this.d = date;
        this.e = z;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5j)) {
            return false;
        }
        c5j c5jVar = (c5j) obj;
        return this.a.equals(c5jVar.a) && this.b.equals(c5jVar.b) && Intrinsics.d(this.c, c5jVar.c) && Intrinsics.d(this.d, c5jVar.d) && this.e == c5jVar.e && Intrinsics.d(this.f, c5jVar.f);
    }

    public final int hashCode() {
        int b = dfi.b(this.b, this.a.hashCode() * 31, 31);
        u9b u9bVar = this.c;
        int hashCode = (b + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31;
        Date date = this.d;
        int e = k5r.e((hashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NewReleasesEntity(album=" + this.a + ", artists=" + this.b + ", cover=" + this.c + ", releaseDate=" + this.d + ", hasTrailer=" + this.e + ", description=" + this.f + ")";
    }
}
