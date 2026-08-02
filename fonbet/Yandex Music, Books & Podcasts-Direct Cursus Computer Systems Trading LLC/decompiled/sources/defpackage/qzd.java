package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class qzd {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public qzd(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        vq1.A(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzd)) {
            return false;
        }
        qzd qzdVar = (qzd) obj;
        return this.b == qzdVar.b && Double.compare(this.c, qzdVar.c) == 0 && Objects.equals(this.a, qzdVar.a) && Objects.equals(this.d, qzdVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public qzd(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
