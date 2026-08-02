package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class s0m extends f1m {
    public final ywl a;

    public s0m(ywl ywlVar) {
        this.a = ywlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return s0m.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((s0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Applied(document=" + this.a + Extension.C_BRAKE;
    }
}
