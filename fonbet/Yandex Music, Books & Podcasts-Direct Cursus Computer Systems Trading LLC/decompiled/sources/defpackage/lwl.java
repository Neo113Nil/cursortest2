package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lwl {
    public final String a;
    public final String b;
    public final boolean c;
    public final w3g d;
    public final String e;

    public lwl(String str, String str2, boolean z, w3g w3gVar, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = w3gVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwl)) {
            return false;
        }
        lwl lwlVar = (lwl) obj;
        return Intrinsics.d(this.a, lwlVar.a) && Intrinsics.d(this.b, lwlVar.b) && this.c == lwlVar.c && Intrinsics.d(this.d, lwlVar.d) && Intrinsics.d(this.e, lwlVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        w3g w3gVar = this.d;
        return this.e.hashCode() + ((e + (w3gVar == null ? 0 : w3gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlaylistListItemUiData(coverUrl=", this.a, ", title=", this.b, ", isLiked=");
        m.append(this.c);
        m.append(", likes=");
        m.append(this.d);
        m.append(", numberOfTracks=");
        return su4.o(m, this.e, ")");
    }
}
