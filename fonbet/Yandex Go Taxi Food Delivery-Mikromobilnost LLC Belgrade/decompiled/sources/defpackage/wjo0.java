package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wjo0 implements xjo0 {
    public final ajo0 a;

    public wjo0(ajo0 ajo0Var) {
        this.a = ajo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjo0) && jl40.l(this.a, ((wjo0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Result(state=" + this.a + Extension.C_BRAKE;
    }
}
