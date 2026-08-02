package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u051 implements z051 {
    public final akz0 a;

    public u051(akz0 akz0Var) {
        this.a = akz0Var;
    }

    public final akz0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u051) && jl40.l(this.a, ((u051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Switch(toggle=" + this.a + Extension.C_BRAKE;
    }
}
