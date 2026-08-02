package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y6i extends a7i {
    public final String a;
    public final String b;

    public y6i(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.a7i
    public final String a() {
        return this.b;
    }

    @Override // defpackage.a7i
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6i)) {
            return false;
        }
        y6i y6iVar = (y6i) obj;
        return jl40.l(this.a, y6iVar.a) && jl40.l(this.b, y6iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("EditSuccess(requestId=", this.a, ", deliveryId=", this.b, Extension.C_BRAKE);
    }
}
