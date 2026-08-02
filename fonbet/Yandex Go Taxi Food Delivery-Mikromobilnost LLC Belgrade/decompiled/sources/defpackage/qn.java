package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qn extends nr {
    public final String a;

    public qn(String str) {
        this.a = str;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn) && jl40.l(this.a, ((qn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ActionDynamicCancel(title=", this.a, Extension.C_BRAKE);
    }
}
