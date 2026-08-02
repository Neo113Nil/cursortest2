package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yn01 {
    public final String a;
    public final boolean b;

    public yn01(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static yn01 a(yn01 yn01Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = yn01Var.a;
        }
        if ((i & 2) != 0) {
            z = yn01Var.b;
        }
        yn01Var.getClass();
        return new yn01(str, z);
    }

    public final boolean b() {
        String str = this.a;
        if (!evu0.J(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (atb1.b(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn01)) {
            return false;
        }
        yn01 yn01Var = (yn01) obj;
        return jl40.l(this.a, yn01Var.a) && this.b == yn01Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("TransferReceiverNameState(inputText=", this.a, ", isCheckInProgress=", this.b, Extension.C_BRAKE);
    }

    public yn01() {
        this(0);
    }

    public /* synthetic */ yn01(int i) {
        this("", false);
    }
}
