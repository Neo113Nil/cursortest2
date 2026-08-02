package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class scc0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public scc0(int i, int i2, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scc0)) {
            return false;
        }
        scc0 scc0Var = (scc0) obj;
        return this.a == scc0Var.a && this.b == scc0Var.b && Float.compare(this.c, scc0Var.c) == 0 && Float.compare(this.d, scc0Var.d) == 0 && Float.compare(this.e, scc0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "IconWithBottomLabelLayout(width=", ", height=", ", iconLeft=");
        vfc.x(s, this.c, ", labelLeft=", this.d, ", labelTop=");
        return uw51.i(s, this.e, Extension.C_BRAKE);
    }
}
