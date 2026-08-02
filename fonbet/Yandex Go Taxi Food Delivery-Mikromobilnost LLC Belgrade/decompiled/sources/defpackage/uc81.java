package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.tm0;

/* loaded from: classes7.dex */
public final class uc81 {
    public final tm0 a;
    public final String b;

    public uc81(tm0 tm0Var, String str) {
        this.a = tm0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc81)) {
            return false;
        }
        uc81 uc81Var = (uc81) obj;
        return this.a == uc81Var.a && jl40.l(this.b, uc81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
