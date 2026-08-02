package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bxl {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public bxl(String str, String str2, String str3, boolean z) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxl)) {
            return false;
        }
        bxl bxlVar = (bxl) obj;
        return this.a.equals(bxlVar.a) && Intrinsics.d(this.b, bxlVar.b) && Intrinsics.d(this.c, bxlVar.c) && this.d == bxlVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlaylistRowUiData(playlistId=", this.a, ", title=", this.b, ", coverUrl=");
        m.append(this.c);
        m.append(", containsTrack=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
