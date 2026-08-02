package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class x5r0 extends z5r0 {
    public final String a;

    public x5r0(String str) {
        this.a = str;
    }

    @Override // defpackage.z5r0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5r0) && jl40.l(this.a, ((x5r0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("SectionItemModel(title=", this.a, Extension.C_BRAKE);
    }

    public x5r0() {
        this(null);
    }
}
