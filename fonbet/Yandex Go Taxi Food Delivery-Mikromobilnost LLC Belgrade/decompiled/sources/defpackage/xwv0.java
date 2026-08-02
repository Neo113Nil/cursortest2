package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xwv0 extends ywv0 {
    public final String a;

    public xwv0(String str) {
        this.a = str;
    }

    @Override // defpackage.ywv0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwv0) && jl40.l(this.a, ((xwv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("UserEmit(value=", this.a, Extension.C_BRAKE);
    }
}
