package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class qd71 {
    public final int a;
    public final int b;
    public final int c;

    public qd71(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd71)) {
            return false;
        }
        qd71 qd71Var = (qd71) obj;
        return this.a == qd71Var.a && this.b == qd71Var.b && this.c == qd71Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fia1.b(this.b, Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "MediaFileInfo(width=", ", height=", ", bitrate="));
    }
}
