package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gl4 {
    public final float a;
    public final int b;
    public final Integer c;
    public final Float d;

    public gl4(float f, int i, Integer num, Float f2) {
        this.a = f;
        this.b = i;
        this.c = num;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4Var = (gl4) obj;
        return Float.compare(this.a, gl4Var.a) == 0 && this.b == gl4Var.b && Intrinsics.d(this.c, gl4Var.c) && Intrinsics.d(this.d, gl4Var.d);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, Float.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Params(radius=" + this.a + ", color=" + this.b + ", strokeColor=" + this.c + ", strokeWidth=" + this.d + ')';
    }
}
