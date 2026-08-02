package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sp9 implements up9 {
    public final cy9 a;

    public sp9(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp9) && jl40.l(this.a, ((sp9) obj).a);
    }

    public final int hashCode() {
        cy9 cy9Var = this.a;
        if (cy9Var == null) {
            return 0;
        }
        return cy9Var.hashCode();
    }

    public final String toString() {
        return ly3.m("NothingHappening(lastPayOffAttemptError=", this.a, Extension.C_BRAKE);
    }

    public sp9() {
        this(null);
    }
}
