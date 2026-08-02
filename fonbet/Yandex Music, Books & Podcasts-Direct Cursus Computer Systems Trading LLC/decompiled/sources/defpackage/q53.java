package defpackage;

/* loaded from: classes3.dex */
public final class q53 implements r53 {
    public final boolean a;
    public final i7q b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public q53(boolean z, i7q i7qVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        i7qVar.getClass();
        this.a = z;
        this.b = i7qVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q53)) {
            return false;
        }
        q53 q53Var = (q53) obj;
        return this.a == q53Var.a && this.b == q53Var.b && this.c == q53Var.c && this.d == q53Var.d && this.e == q53Var.e && this.f == q53Var.f && this.g == q53Var.g && this.h == q53Var.h && this.i == q53Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(isCrossfade=");
        sb.append(this.a);
        sb.append(", qualitySettings=");
        sb.append(this.b);
        sb.append(", isEqualizerAvailable=");
        dfi.t(sb, this.c, ", isVideoShot=", this.d, ", isVideoShotAvailable=");
        dfi.t(sb, this.e, ", isAutoplay=", this.f, ", isAutoplayAvailable=");
        dfi.t(sb, this.g, ", isShake=", this.h, ", isShakeAvailable=");
        return ouj.r(sb, this.i, ")");
    }
}
