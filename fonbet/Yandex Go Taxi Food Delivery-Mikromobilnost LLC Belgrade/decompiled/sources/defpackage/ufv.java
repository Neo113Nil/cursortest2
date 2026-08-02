package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ufv implements vfv {
    public final float a;
    public final float b;
    public final float c;
    public final float w;
    public final boolean x;

    public /* synthetic */ ufv(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufv)) {
            return false;
        }
        ufv ufvVar = (ufv) obj;
        return Float.compare(this.a, ufvVar.a) == 0 && Float.compare(this.b, ufvVar.b) == 0 && Float.compare(this.c, ufvVar.c) == 0 && Float.compare(this.w, ufvVar.w) == 0 && this.x == ufvVar.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + g8e.c(this.w, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("RoundedCorners(topLeft=", this.a, ", topRight=", this.b, ", bottomLeft=");
        vfc.x(k, this.c, ", bottomRight=", this.w, ", keepAspect=");
        return x4e.i(k, this.x, Extension.C_BRAKE);
    }

    public ufv() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 31);
    }

    public ufv(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.w = f4;
        this.x = z;
    }

    public ufv(float f) {
        this(f, f, f, f, 16);
    }
}
