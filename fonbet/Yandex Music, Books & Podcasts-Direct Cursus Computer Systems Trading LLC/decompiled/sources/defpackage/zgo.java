package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zgo {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final Integer e;
    public final Float f;

    public zgo(float f, float f2, int i, float f3, Integer num, Float f4) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
        this.e = num;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgo)) {
            return false;
        }
        zgo zgoVar = (zgo) obj;
        return Float.compare(this.a, zgoVar.a) == 0 && Float.compare(this.b, zgoVar.b) == 0 && this.c == zgoVar.c && Float.compare(this.d, zgoVar.d) == 0 && Intrinsics.d(this.e, zgoVar.e) && Intrinsics.d(this.f, zgoVar.f);
    }

    public final int hashCode() {
        int a = eta.a(f1d.a(this.c, eta.a(Float.hashCode(this.a) * 31, this.b, 31), 31), this.d, 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Params(width=" + this.a + ", height=" + this.b + ", color=" + this.c + ", radius=" + this.d + ", strokeColor=" + this.e + ", strokeWidth=" + this.f + ')';
    }
}
