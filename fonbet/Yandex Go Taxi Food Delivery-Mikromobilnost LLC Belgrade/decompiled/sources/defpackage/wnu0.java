package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wnu0 implements ynu0 {
    public final kao a;

    public wnu0(kao kaoVar) {
        this.a = kaoVar;
    }

    @Override // defpackage.ynu0
    public final boolean a() {
        return false;
    }

    public final kao b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnu0) && jl40.l(this.a, ((wnu0) obj).a);
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

    public wnu0() {
        this(null);
    }
}
