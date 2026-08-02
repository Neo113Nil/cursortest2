package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qbq0 extends rbq0 {
    public final bu11 a;

    public qbq0(bu11 bu11Var) {
        this.a = bu11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbq0) && this.a.equals(((qbq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowToast(message=" + this.a + Extension.C_BRAKE;
    }
}
