package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wo8 implements vo8 {
    public final rr51 a;

    public wo8(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final rr51 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo8) && jl40.l(this.a, ((wo8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(ybDivData=" + this.a + Extension.C_BRAKE;
    }
}
