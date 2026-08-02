package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qkb0 {
    public final int a;
    public final int b;
    public final int c;

    public qkb0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkb0)) {
            return false;
        }
        qkb0 qkb0Var = (qkb0) obj;
        return this.a == qkb0Var.a && this.b == qkb0Var.b && this.c == qkb0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "PhotocommentsConfig(maxPhotoWidth=", ", maxPhotoHeight=", ", maxPointPhotocomments="));
    }
}
