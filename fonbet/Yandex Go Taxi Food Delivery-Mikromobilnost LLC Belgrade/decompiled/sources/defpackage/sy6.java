package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sy6 {
    public final String a;
    public final long b;

    public sy6(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy6)) {
            return false;
        }
        sy6 sy6Var = (sy6) obj;
        return jl40.l(this.a, sy6Var.a) && this.b == sy6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("CommitProperties(deliveryId=", this.a, ", canCreateOrderUntilMs=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
