package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tp70 implements fq70 {
    public final o2y0 a;

    public tp70(o2y0 o2y0Var) {
        this.a = o2y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp70) && jl40.l(this.a, ((tp70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenOrderPaymentMethods(orderHolder=" + this.a + Extension.C_BRAKE;
    }
}
