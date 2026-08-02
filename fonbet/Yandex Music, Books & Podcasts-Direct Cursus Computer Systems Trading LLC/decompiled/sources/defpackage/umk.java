package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class umk implements yit {
    public final eul a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public umk(eul eulVar, String str, String str2, boolean z, String str3, boolean z2) {
        this.a = eulVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umk)) {
            return false;
        }
        umk umkVar = (umk) obj;
        return this.a.equals(umkVar.a) && this.b.equals(umkVar.b) && Intrinsics.d(this.c, umkVar.c) && this.d == umkVar.d && Intrinsics.d(this.e, umkVar.e) && this.f == umkVar.f;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e = k5r.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((e + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PersonalPlaylistUniversalEntity(playlist=" + this.a + ", playlistType=" + this.b + ", description=" + this.c + ", notify=" + this.d + ", idForFrom=" + this.e + ", hasTrailer=" + this.f + ")";
    }
}
