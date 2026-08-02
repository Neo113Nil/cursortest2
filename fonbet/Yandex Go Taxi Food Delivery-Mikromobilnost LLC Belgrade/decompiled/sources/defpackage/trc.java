package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class trc {
    public final int a;
    public final int b;

    public trc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trc)) {
            return false;
        }
        trc trcVar = (trc) obj;
        return this.a == trcVar.a && this.b == trcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "CustomInsets(bottomPx=", ", topPx=", Extension.C_BRAKE);
    }
}
