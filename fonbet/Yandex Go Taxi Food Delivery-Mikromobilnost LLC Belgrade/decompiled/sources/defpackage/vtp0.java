package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vtp0 extends wtp0 {
    public final String a;

    public vtp0(String str) {
        this.a = str;
    }

    @Override // defpackage.wtp0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtp0) && jl40.l(this.a, ((vtp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("UserEmit(value=", this.a, Extension.C_BRAKE);
    }
}
