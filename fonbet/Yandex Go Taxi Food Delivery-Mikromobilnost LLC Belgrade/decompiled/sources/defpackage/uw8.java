package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uw8 {
    public final double a;
    public final rr51 b;

    public uw8(double d, rr51 rr51Var) {
        this.a = d;
        this.b = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw8)) {
            return false;
        }
        uw8 uw8Var = (uw8) obj;
        return Double.compare(this.a, uw8Var.a) == 0 && this.b.equals(uw8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CarouselCardDivkitBackdropEntity(paddingBottom=" + this.a + ", divkitData=" + this.b + Extension.C_BRAKE;
    }
}
