package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rpy0 implements uni {
    public final u460 a;

    public rpy0(u460 u460Var) {
        this.a = u460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpy0) && jl40.l(this.a, ((rpy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextInputScreenArgs(screen=" + this.a + Extension.C_BRAKE;
    }
}
