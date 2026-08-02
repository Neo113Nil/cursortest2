package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xfv {
    public final pvi0 a;
    public final float b;
    public final int c;
    public final int d;

    public xfv(pvi0 pvi0Var, float f, int i, int i2) {
        this.a = pvi0Var;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfv)) {
            return false;
        }
        xfv xfvVar = (xfv) obj;
        return this.a.equals(xfvVar.a) && Float.compare(this.b, xfvVar.b) == 0 && this.c == xfvVar.c && this.d == xfvVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, g8e.c(this.b, this.a.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageUiState(image=");
        sb.append(this.a);
        sb.append(", fallbackImageRes=null, alpha=");
        sb.append(this.b);
        sb.append(", width=");
        return ly3.k(this.c, this.d, ", offsetY=", Extension.C_BRAKE, sb);
    }
}
