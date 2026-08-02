package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p6v {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public p6v(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6v)) {
            return false;
        }
        p6v p6vVar = (p6v) obj;
        return Intrinsics.d(this.a, p6vVar.a) && this.b.equals(p6vVar.b) && this.c.equals(p6vVar.c) && this.d == p6vVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.d) + k5r.c(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveWordsCardSource(iconUri=", this.a, ", title=", this.b, ", weblink=");
        m.append(this.c);
        m.append(", browser=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
