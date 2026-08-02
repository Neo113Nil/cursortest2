package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class urn0 {
    public final CharSequence a;
    public final wp2 b;

    public urn0(CharSequence charSequence, wp2 wp2Var) {
        this.a = charSequence;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urn0)) {
            return false;
        }
        urn0 urn0Var = (urn0) obj;
        return jl40.l(this.a, urn0Var.a) && jl40.l(this.b, urn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Badge(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
