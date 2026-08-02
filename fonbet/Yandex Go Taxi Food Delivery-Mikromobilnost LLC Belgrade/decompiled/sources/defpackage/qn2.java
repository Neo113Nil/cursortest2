package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qn2 {
    public final int a;
    public final boolean b;

    public qn2(int i) {
        this.a = i;
        boolean z = false;
        if (400 <= i && i < 500) {
            z = true;
        }
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn2) && this.a == ((qn2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "ApiError(httpCode=", Extension.C_BRAKE);
    }
}
