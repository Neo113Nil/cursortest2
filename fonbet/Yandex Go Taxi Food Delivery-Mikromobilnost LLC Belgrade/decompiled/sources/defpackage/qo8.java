package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qo8 implements po8 {
    public final rr51 a;

    public qo8(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo8) && jl40.l(this.a, ((qo8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(divKitData=" + this.a + Extension.C_BRAKE;
    }
}
