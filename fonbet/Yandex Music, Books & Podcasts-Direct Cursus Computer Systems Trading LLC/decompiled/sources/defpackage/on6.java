package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class on6 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;

    public on6(String str, float f, float f2, float f3) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on6)) {
            return false;
        }
        on6 on6Var = (on6) obj;
        return Intrinsics.d(this.a, on6Var.a) && cma.a(this.b, on6Var.b) && cma.a(this.c, on6Var.c) && Float.compare(this.d, on6Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String b = cma.b(this.b);
        String b2 = cma.b(this.c);
        StringBuilder m = f1d.m("CoverData(url=", this.a, ", xOffset=", b, ", yOffset=");
        m.append(b2);
        m.append(", rotate=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
