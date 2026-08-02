package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y4b {
    public final boolean a;

    public y4b(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4b) && this.a == ((y4b) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ChatMenuConfig(enableReorderPins=", Extension.C_BRAKE, this.a);
    }

    public y4b() {
        this(true);
    }
}
