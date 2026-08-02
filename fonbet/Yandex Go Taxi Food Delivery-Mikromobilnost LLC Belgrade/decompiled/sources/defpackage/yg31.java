package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yg31 implements ah31 {
    public final kao a;

    public yg31(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg31) && jl40.l(this.a, ((yg31) obj).a);
    }

    public final int hashCode() {
        kao kaoVar = this.a;
        if (kaoVar == null) {
            return 0;
        }
        return kaoVar.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(errorState=", this.a, Extension.C_BRAKE);
    }

    public yg31() {
        this(null);
    }
}
