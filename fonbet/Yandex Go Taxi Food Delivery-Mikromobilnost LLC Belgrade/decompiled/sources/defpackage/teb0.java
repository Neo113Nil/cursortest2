package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class teb0 extends ti91 {
    public final String a;

    public teb0(String str) {
        this.a = str;
    }

    @Override // defpackage.ti91
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teb0) && this.a.equals(((teb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Description(value=", this.a, Extension.C_BRAKE);
    }
}
