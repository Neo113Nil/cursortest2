package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class th0 {
    public final String a;
    public final String b;

    public th0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th0)) {
            return false;
        }
        th0 th0Var = (th0) obj;
        return this.a.equals(th0Var.a) && this.b.equals(th0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PhoneFormatUiState(matchPattern=", this.a, ", mask=", this.b, Extension.C_BRAKE);
    }
}
