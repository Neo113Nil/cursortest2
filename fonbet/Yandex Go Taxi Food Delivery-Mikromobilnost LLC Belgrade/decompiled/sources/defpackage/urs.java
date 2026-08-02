package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class urs {
    public final int a;
    public final int b;
    public final boolean c;

    public urs(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urs)) {
            return false;
        }
        urs ursVar = (urs) obj;
        return this.a == ursVar.a && this.b == ursVar.b && this.c == ursVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return x4e.i(b64.s(this.a, this.b, "GalleryImageData(width=", ", height=", ", canBeSmall="), this.c, Extension.C_BRAKE);
    }
}
