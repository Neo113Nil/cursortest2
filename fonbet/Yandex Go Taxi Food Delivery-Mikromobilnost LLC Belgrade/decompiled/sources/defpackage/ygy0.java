package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ygy0 {
    public final String a;
    public final xgy0 b;

    public ygy0(String str, xgy0 xgy0Var) {
        this.a = str;
        this.b = xgy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygy0)) {
            return false;
        }
        ygy0 ygy0Var = (ygy0) obj;
        return jl40.l(this.a, ygy0Var.a) && this.b.equals(ygy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TestPaymentButtonEntity(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
