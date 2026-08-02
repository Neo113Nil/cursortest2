package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ngt extends aht {
    public final String a;
    public final String b;
    public final int c;

    public ngt(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngt)) {
            return false;
        }
        ngt ngtVar = (ngt) obj;
        return Intrinsics.d(this.a, ngtVar.a) && Intrinsics.d(this.b, ngtVar.b) && this.c == ngtVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f1d.i(f1d.m("Success(titlePlaylist=", this.a, ", coverUrl=", this.b, ", countTracks="), this.c, ")");
    }
}
