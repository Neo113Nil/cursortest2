package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class uct0 extends yct0 {
    public final ps50 a;

    public uct0(ps50 ps50Var) {
        this.a = ps50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uct0) && this.a.equals(((uct0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BackendSourceErrorReceived(networkError=" + this.a + Extension.C_BRAKE;
    }
}
