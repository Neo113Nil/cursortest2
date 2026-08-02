package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yxv implements wu0 {
    public final String a;
    public final String b;

    public yxv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxv)) {
            return false;
        }
        yxv yxvVar = (yxv) obj;
        return this.a.equals(yxvVar.a) && this.b.equals(yxvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Input(placeholder=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
