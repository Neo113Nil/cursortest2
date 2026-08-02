package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zh40 implements bi40 {
    public final sh40 a;

    public zh40(sh40 sh40Var) {
        this.a = sh40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh40) && jl40.l(this.a, ((zh40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadInitData(payload=" + this.a + Extension.C_BRAKE;
    }
}
