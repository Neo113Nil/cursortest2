package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ueb0 extends ti91 {
    public final String a;

    public ueb0(String str) {
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
        return (obj instanceof ueb0) && jl40.l(this.a, ((ueb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Name(value=", this.a, Extension.C_BRAKE);
    }
}
