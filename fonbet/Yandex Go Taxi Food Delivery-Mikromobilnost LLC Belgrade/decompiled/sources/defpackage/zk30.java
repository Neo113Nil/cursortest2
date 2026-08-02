package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zk30 {
    public final n26 a;

    public zk30(n26 n26Var) {
        this.a = n26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk30) && jl40.l(this.a, ((zk30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Payload(config=" + this.a + Extension.C_BRAKE;
    }
}
