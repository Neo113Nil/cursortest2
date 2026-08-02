package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v5i0 {
    public final float a;
    public final float b;
    public final float c;
    public final ArrayList d;

    public v5i0(float f, float f2, float f3, ArrayList arrayList) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5i0)) {
            return false;
        }
        v5i0 v5i0Var = (v5i0) obj;
        return Float.compare(this.a, v5i0Var.a) == 0 && Float.compare(this.b, v5i0Var.b) == 0 && Float.compare(this.c, v5i0Var.c) == 0 && this.d.equals(v5i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("RadialGradientEntity(centerX=", this.a, ", centerY=", this.b, ", radius=");
        k.append(this.c);
        k.append(", colors=");
        k.append(this.d);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
