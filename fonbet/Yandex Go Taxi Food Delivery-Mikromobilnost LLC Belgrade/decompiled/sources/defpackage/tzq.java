package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class tzq {
    public final String a;
    public final String b;

    public tzq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzq)) {
            return false;
        }
        tzq tzqVar = (tzq) obj;
        return this.a.equals(tzqVar.a) && this.b.equals(tzqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PendingDownload(host=", this.a, ", fileName=", this.b, Extension.C_BRAKE);
    }
}
