package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class qh1 extends ye1 {
    public final int a;
    public final int b;
    public final int c;
    public final ph1 d;

    public qh1(int i, int i2, int i3, ph1 ph1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ph1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qh1)) {
            return false;
        }
        qh1 qh1Var = (qh1) obj;
        return qh1Var.a == this.a && qh1Var.b == this.b && qh1Var.c == this.c && qh1Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(qh1.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.d);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append("-byte IV, ");
        sb.append(this.c);
        sb.append("-byte tag, and ");
        return oyr.m(this.a, "-byte key)", sb);
    }
}
