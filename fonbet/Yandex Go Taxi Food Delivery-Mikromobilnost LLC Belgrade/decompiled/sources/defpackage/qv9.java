package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qv9 implements uv9 {
    public final gs9 a;

    public qv9(gs9 gs9Var) {
        this.a = gs9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv9) && jl40.l(this.a, ((qv9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HandleDetailsAction(action=" + this.a + Extension.C_BRAKE;
    }
}
