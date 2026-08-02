package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qv01 implements uv01 {
    public final ev01 a;

    public qv01(ev01 ev01Var) {
        this.a = ev01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv01) && this.a.equals(((qv01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fail(error=" + this.a + Extension.C_BRAKE;
    }
}
