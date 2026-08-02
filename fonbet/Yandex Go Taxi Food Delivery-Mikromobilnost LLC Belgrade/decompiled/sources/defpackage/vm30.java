package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vm30 implements bn30 {
    public final pj40 a;

    public vm30(pj40 pj40Var) {
        this.a = pj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm30) && jl40.l(this.a, ((vm30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Discovery(utmParams=" + this.a + Extension.C_BRAKE;
    }

    public vm30() {
        this(0);
    }

    public /* synthetic */ vm30(int i) {
        this(pj40.c);
    }
}
