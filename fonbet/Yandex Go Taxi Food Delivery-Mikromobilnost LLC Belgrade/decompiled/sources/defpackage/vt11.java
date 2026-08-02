package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vt11 implements xt11 {
    public final String a;

    public vt11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt11) && jl40.l(this.a, ((vt11) obj).a);
    }

    @Override // defpackage.xt11
    public final String getTag() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Tag(tag=", this.a, Extension.C_BRAKE);
    }
}
