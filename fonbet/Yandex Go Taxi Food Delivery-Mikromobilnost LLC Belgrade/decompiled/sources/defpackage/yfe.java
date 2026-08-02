package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yfe {
    public final zfe a;

    public yfe(zfe zfeVar) {
        this.a = zfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfe) && this.a.equals(((yfe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FooterBody(button=" + this.a + Extension.C_BRAKE;
    }
}
