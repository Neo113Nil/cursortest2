package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xli {
    public final String a;

    public /* synthetic */ xli(String str) {
        this.a = str;
    }

    public static final /* synthetic */ xli a(String str) {
        return new xli(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xli) {
            return jl40.l(this.a, ((xli) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DeliveryRef(asString=", this.a, Extension.C_BRAKE);
    }
}
