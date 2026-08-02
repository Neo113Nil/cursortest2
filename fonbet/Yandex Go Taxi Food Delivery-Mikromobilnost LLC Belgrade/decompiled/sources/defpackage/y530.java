package defpackage;

import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y530 {
    public final int a;
    public final int b;
    public final i3y c;

    public y530(int i) {
        this.a = 8;
        this.b = 2;
        this.c = a.a(new m020(13, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y530)) {
            return false;
        }
        y530 y530Var = (y530) obj;
        return this.a == y530Var.a && this.b == y530Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "DecimalInputFilterConfig(digits=", ", fractionDigits=", Extension.C_BRAKE);
    }

    public y530() {
        this(0);
    }
}
