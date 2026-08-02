package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qq80 {
    public static final qq80 b = new qq80(0);
    public final String a;

    public qq80(String str) {
        this.a = str;
    }

    public final String a() {
        String str = this.a;
        return str.length() == 0 ? "" : oyr.p("{\"origin_type\" : \"", str, "\"}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq80) && jl40.l(this.a, ((qq80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OriginTypeForRouteDeeplink(type=", this.a, Extension.C_BRAKE);
    }

    public qq80() {
        this(0);
    }

    public /* synthetic */ qq80(int i) {
        this("");
    }
}
