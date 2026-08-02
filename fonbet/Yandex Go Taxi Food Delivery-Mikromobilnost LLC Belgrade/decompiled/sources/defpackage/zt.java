package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zt {
    public static final zt c = new zt("", "");
    public final String a;
    public final String b;

    public zt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt)) {
            return false;
        }
        zt ztVar = (zt) obj;
        return this.a.equals(ztVar.a) && this.b.equals(ztVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ActionContentDescriptions(voiceDetails=", this.a, ", voiceOpenDetails=", this.b, Extension.C_BRAKE);
    }
}
