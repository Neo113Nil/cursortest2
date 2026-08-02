package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wab {
    public final String a;
    public final String b;
    public final String c;

    public wab(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wab)) {
            return false;
        }
        wab wabVar = (wab) obj;
        return this.a.equals(wabVar.a) && this.b.equals(wabVar.b) && this.c.equals(wabVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("TranslationData(translatedLang=", this.a, ", originalLang=", this.b, ", translatedText="), this.c, Extension.C_BRAKE);
    }
}
