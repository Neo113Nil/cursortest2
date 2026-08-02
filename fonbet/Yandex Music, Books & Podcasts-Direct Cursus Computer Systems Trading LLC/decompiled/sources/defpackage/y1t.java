package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y1t {
    public final String a;
    public final String b;
    public final v1t c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public y1t(String str, String str2, v1t v1tVar, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = v1tVar;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1t)) {
            return false;
        }
        y1t y1tVar = (y1t) obj;
        return Intrinsics.d(this.a, y1tVar.a) && Intrinsics.d(this.b, y1tVar.b) && this.c == y1tVar.c && this.d == y1tVar.d && this.e == y1tVar.e && this.f == y1tVar.f && this.g == y1tVar.g && this.h == y1tVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + k5r.e(k5r.e(k5r.e(tlm.c(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TrackTypeInfo(trackId=", this.a, ", albumId=", this.b, ", type=");
        m.append(this.c);
        m.append(", durationMs=");
        m.append(this.d);
        m.append(", isPermanentStrong=");
        m.append(this.e);
        m.append(", isAlbumTrack=");
        m.append(this.f);
        m.append(", isPlaylistTrack=");
        m.append(this.g);
        m.append(", isKidsPlaylist=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }
}
