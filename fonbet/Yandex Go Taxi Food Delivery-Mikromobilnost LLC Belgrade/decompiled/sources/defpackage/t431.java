package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t431 {
    public float a;
    public float b;

    public t431(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t431)) {
            return false;
        }
        t431 t431Var = (t431) obj;
        return Float.compare(this.a, t431Var.a) == 0 && Float.compare(this.b, t431Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Vector(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
    }

    public t431() {
        this(0.0f, 0.0f);
    }
}
