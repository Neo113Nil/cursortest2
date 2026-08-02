package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qcg0 implements tcg0 {
    public final idg0 a;

    public qcg0(idg0 idg0Var) {
        this.a = idg0Var;
    }

    public final idg0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcg0) && jl40.l(this.a, ((qcg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FetchQrRulesError(content=" + this.a + Extension.C_BRAKE;
    }
}
