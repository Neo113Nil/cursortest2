package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tv01 implements uv01 {
    public final rr51 a;

    public tv01(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv01) && jl40.l(this.a, ((tv01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(divData=" + this.a + Extension.C_BRAKE;
    }
}
