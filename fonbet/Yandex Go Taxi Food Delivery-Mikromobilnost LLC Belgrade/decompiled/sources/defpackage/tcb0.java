package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tcb0 implements vcb0 {
    public final String a;
    public final String b;

    public tcb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.vcb0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcb0)) {
            return false;
        }
        tcb0 tcb0Var = (tcb0) obj;
        if (!jl40.l(this.a, tcb0Var.a)) {
            return false;
        }
        String str = tcb0Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String a = tab0.a(this.a);
        String str = this.b;
        return unr0.p("Options(filterId=", a, ", selectedOption=", str == null ? "null" : tab0.a(str), Extension.C_BRAKE);
    }
}
