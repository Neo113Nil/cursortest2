package defpackage;

import android.graphics.PointF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rgr0 {
    public final int a;
    public final float b;
    public final PointF c;

    public rgr0(int i, float f, PointF pointF) {
        this.a = i;
        this.b = f;
        this.c = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgr0)) {
            return false;
        }
        rgr0 rgr0Var = (rgr0) obj;
        return this.a == rgr0Var.a && Float.compare(this.b, rgr0Var.b) == 0 && this.c.equals(rgr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ShadowParams(color=" + this.a + ", radius=" + this.b + ", offset=" + this.c + Extension.C_BRAKE;
    }
}
