package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eia {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public eia(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eia)) {
            return false;
        }
        eia eiaVar = (eia) obj;
        return Intrinsics.d(this.a, eiaVar.a) && this.b == eiaVar.b && this.c == eiaVar.c && this.d == eiaVar.d && this.e == eiaVar.e && this.f == eiaVar.f && this.g == eiaVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.g) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder h = v3w.h("DownloadedScreenState(firstDownloadedTrackId=", this.a, ", isNeedPlaylistSection=", ", isNeedAlbumSection=", this.b);
        dfi.t(h, this.c, ", isNeedBooksSection=", this.d, ", isNeedPodcastsSection=");
        dfi.t(h, this.e, ", isNeedKidsSection=", this.f, ", isNeedArtistSection=");
        return ouj.r(h, this.g, ")");
    }
}
