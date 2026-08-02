package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wgg {
    public final mce0 a;

    public wgg(mce0 mce0Var) {
        this.a = mce0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgg) && this.a.equals(((wgg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Destination(position=" + this.a + Extension.C_BRAKE;
    }
}
