package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kk4 {
    public final String a;
    public final String b;
    public final ek4 c;

    static {
        new kk4("cast-predefined-item-chromecast", "Chromecast", ek4.d);
    }

    public kk4(String str, String str2, ek4 ek4Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ek4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk4)) {
            return false;
        }
        kk4 kk4Var = (kk4) obj;
        return Intrinsics.d(this.a, kk4Var.a) && Intrinsics.d(this.b, kk4Var.b) && this.c == kk4Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ChromeCastItem(id=", this.a, ", name=", this.b, ", type=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
