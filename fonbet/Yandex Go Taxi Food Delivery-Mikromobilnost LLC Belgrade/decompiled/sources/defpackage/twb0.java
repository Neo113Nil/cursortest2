package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class twb0 extends uwb0 {
    public final String a;

    public twb0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twb0) && this.a.equals(((twb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("NeedAuth(authorizationTrackId=", this.a, Extension.C_BRAKE);
    }
}
