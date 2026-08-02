package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zis0 implements Comparable {
    public final int a;
    public final int b;

    public zis0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zis0 zis0Var) {
        int i = zis0Var.a * zis0Var.b;
        int i2 = this.a * this.b;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zis0)) {
            return false;
        }
        zis0 zis0Var = (zis0) obj;
        return this.a == zis0Var.a && this.b == zis0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Size(width=", ", height=", Extension.C_BRAKE);
    }
}
