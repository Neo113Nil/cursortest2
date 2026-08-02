package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ven {
    public final String a;
    public final float b;
    public final float c;
    public final float d;

    public ven(String str, float f, float f2, float f3) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ven)) {
            return false;
        }
        ven venVar = (ven) obj;
        return jl40.l(this.a, venVar.a) && Float.compare(this.b, venVar.b) == 0 && Float.compare(this.c, venVar.c) == 0 && Float.compare(this.d, venVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EatsOrderCourierPlacemark(imageTag=");
        sb.append(this.a);
        sb.append(", xAnchor=");
        sb.append(this.b);
        sb.append(", yAnchor=");
        return ly3.q(sb, this.c, ", direction=", this.d, Extension.C_BRAKE);
    }
}
