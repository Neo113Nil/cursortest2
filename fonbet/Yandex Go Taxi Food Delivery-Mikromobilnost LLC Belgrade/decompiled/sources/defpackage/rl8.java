package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rl8 extends sl8 {
    public final String b;
    public final String c;

    public rl8(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl8)) {
            return false;
        }
        rl8 rl8Var = (rl8) obj;
        return this.b.equals(rl8Var.b) && this.c.equals(rl8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SecondInput(firstInput=", this.b, ", secondInput=", this.c, Extension.C_BRAKE);
    }
}
