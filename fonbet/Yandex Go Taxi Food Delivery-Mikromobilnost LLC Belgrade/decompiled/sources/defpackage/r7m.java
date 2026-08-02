package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class r7m {
    public final int a;
    public final int b;

    public r7m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7m)) {
            return false;
        }
        r7m r7mVar = (r7m) obj;
        return this.a == r7mVar.a && this.b == r7mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "DownloadStatusSnapshot(status=", ", reason=", Extension.C_BRAKE);
    }
}
