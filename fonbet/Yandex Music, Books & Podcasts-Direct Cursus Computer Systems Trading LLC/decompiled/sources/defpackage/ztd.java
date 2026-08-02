package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ztd {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ztd(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztd)) {
            return false;
        }
        ztd ztdVar = (ztd) obj;
        return this.a.equals(ztdVar.a) && Intrinsics.d(this.b, ztdVar.b) && Intrinsics.d(this.c, ztdVar.c) && this.d == ztdVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("HeaderArtistUiData(artists=", this.a, ", artistCoverUrl=", this.b, ", releaseYear=");
        m.append(this.c);
        m.append(", clickable=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
