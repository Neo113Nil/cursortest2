package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ru {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final jzb e;
    public final boolean f;

    public ru(jzb jzbVar, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jzbVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return Intrinsics.d(this.a, ruVar.a) && Intrinsics.d(this.b, ruVar.b) && Intrinsics.d(this.c, ruVar.c) && Intrinsics.d(this.d, ruVar.d) && this.e == ruVar.e && this.f == ruVar.f;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jzb jzbVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("AlbumListItemUiData(coverUrl=", this.a, ", title=", this.b, ", artist=");
        su4.v(m, this.c, ", subtitle=", this.d, ", explicitType=");
        m.append(this.e);
        m.append(", isExplicit=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
