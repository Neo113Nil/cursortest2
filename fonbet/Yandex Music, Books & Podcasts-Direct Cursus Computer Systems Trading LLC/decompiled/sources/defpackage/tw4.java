package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tw4 {
    public final String a;
    public final String b;

    public tw4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw4)) {
            return false;
        }
        tw4 tw4Var = (tw4) obj;
        return Intrinsics.d(this.a, tw4Var.a) && Intrinsics.d(this.b, tw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("TrackAlbum(albumId=", this.a, ", trackId=", this.b, ")");
    }
}
