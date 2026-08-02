package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class wqu0 implements xqu0 {
    public final peq0 a;

    public wqu0(peq0 peq0Var) {
        this.a = peq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqu0) && this.a.equals(((wqu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectSource(config=" + this.a + Extension.C_BRAKE;
    }
}
