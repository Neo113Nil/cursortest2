package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p5r {
    public final String a;
    public final String b;
    public final hfs c;
    public final hfs d;

    public p5r(hfs hfsVar, hfs hfsVar2, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = hfsVar;
        this.d = hfsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5r)) {
            return false;
        }
        p5r p5rVar = (p5r) obj;
        return Intrinsics.d(this.a, p5rVar.a) && this.b.equals(p5rVar.b) && this.c.equals(p5rVar.c) && Intrinsics.d(this.d, p5rVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        hfs hfsVar = this.d;
        return hashCode + (hfsVar == null ? 0 : hfsVar.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("Button(text=", this.a, ", deeplink=", this.b, ", buttonColor=");
        m.append(this.c);
        m.append(", textColor=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
