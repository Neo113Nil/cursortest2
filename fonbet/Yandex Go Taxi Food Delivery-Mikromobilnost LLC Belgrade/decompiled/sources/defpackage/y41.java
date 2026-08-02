package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y41 implements a51 {
    public final hyq a;
    public final String b;

    public y41(hyq hyqVar, String str) {
        this.a = hyqVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y41)) {
            return false;
        }
        y41 y41Var = (y41) obj;
        return this.a.equals(y41Var.a) && jl40.l(this.b, y41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Field(fieldType=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
