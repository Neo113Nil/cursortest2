package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wsh extends lth {
    public final String a;
    public final String b;

    public wsh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsh)) {
            return false;
        }
        wsh wshVar = (wsh) obj;
        return jl40.l(this.a, wshVar.a) && jl40.l(this.b, wshVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OrderCancelRequested(type=", this.a, ", deliveryId=", this.b, Extension.C_BRAKE);
    }
}
