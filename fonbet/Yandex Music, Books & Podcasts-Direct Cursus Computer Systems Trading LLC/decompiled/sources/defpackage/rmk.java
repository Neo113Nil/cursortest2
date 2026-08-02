package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rmk {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public rmk(String str, String str2, String str3, boolean z) {
        str.getClass();
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
        if (!(obj instanceof rmk)) {
            return false;
        }
        rmk rmkVar = (rmk) obj;
        return Intrinsics.d(this.a, rmkVar.a) && this.b.equals(rmkVar.b) && Intrinsics.d(this.c, rmkVar.c) && this.d == rmkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PersonalPlaylistGridItemUiData(title=", this.a, ", description=", this.b, ", imageUrl=");
        m.append(this.c);
        m.append(", hasTrailer=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
