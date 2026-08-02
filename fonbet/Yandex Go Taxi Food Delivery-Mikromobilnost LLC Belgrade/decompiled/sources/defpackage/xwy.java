package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xwy implements ywy {
    public final n8v a;

    public xwy(n8v n8vVar) {
        this.a = n8vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwy) && this.a.equals(((xwy) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.a + Extension.C_BRAKE;
    }
}
