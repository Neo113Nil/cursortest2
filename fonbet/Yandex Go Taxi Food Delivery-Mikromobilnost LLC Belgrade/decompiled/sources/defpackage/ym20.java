package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ym20 {
    public final String a;

    public /* synthetic */ ym20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ym20) {
            return jl40.l(this.a, ((ym20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("MobContour(value=", this.a, Extension.C_BRAKE);
    }
}
