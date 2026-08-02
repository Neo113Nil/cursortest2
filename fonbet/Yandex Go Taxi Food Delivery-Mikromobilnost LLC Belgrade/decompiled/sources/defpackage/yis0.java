package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yis0 {
    public final int a;
    public final int b;

    public yis0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yis0)) {
            return false;
        }
        yis0 yis0Var = (yis0) obj;
        return this.a == yis0Var.a && this.b == yis0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Size(widthRes=", ", heightRes=", Extension.C_BRAKE);
    }
}
