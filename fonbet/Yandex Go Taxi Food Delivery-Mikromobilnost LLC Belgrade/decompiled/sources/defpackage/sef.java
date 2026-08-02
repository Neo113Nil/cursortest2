package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sef {
    public final String a;
    public final String b;

    public sef(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sef)) {
            return false;
        }
        sef sefVar = (sef) obj;
        return this.a.equals(sefVar.a) && this.b.equals(sefVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AdditionalSharingInfo(text=", this.a, ", url=", oyr.p("SharingUrl(value=", this.b, Extension.C_BRAKE), Extension.C_BRAKE);
    }
}
