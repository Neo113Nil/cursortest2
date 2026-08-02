package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class u7c {
    public final Object a;

    public u7c(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7c) && jl40.l(this.a, ((u7c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.p("ClusterIdRef(anchor=", Extension.C_BRAKE, this.a);
    }
}
