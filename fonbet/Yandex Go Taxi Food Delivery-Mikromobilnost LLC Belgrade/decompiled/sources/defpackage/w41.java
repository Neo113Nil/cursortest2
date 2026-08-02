package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w41 implements a51 {
    public final qv0 a;

    public w41(qv0 qv0Var) {
        this.a = qv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w41) && jl40.l(this.a, ((w41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Address(address=" + this.a + Extension.C_BRAKE;
    }
}
