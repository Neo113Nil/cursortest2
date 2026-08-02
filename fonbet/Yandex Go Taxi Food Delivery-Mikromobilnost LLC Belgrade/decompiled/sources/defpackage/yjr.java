package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yjr {
    public final String a;

    public /* synthetic */ yjr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yjr) {
            return jl40.l(this.a, ((yjr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Id(rawValue=", this.a, Extension.C_BRAKE);
    }
}
