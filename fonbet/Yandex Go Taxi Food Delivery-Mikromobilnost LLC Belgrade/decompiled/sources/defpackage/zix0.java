package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zix0 {
    public final zjj0 a;

    public zix0(zjj0 zjj0Var) {
        this.a = zjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zix0) && jl40.l(this.a, ((zix0) obj).a);
    }

    public final int hashCode() {
        zjj0 zjj0Var = this.a;
        if (zjj0Var == null) {
            return 0;
        }
        return zjj0Var.hashCode();
    }

    public final String toString() {
        return "TariffOptionsPayload(scrollParams=" + this.a + Extension.C_BRAKE;
    }

    public zix0() {
        this(null);
    }
}
