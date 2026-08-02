package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r570 {
    public final kao a;

    public r570(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r570) && jl40.l(this.a, ((r570) obj).a);
    }

    public final int hashCode() {
        kao kaoVar = this.a;
        if (kaoVar == null) {
            return 0;
        }
        return kaoVar.hashCode();
    }

    public final String toString() {
        return ly3.n("OpenEsiaViewState(error=", this.a, Extension.C_BRAKE);
    }
}
