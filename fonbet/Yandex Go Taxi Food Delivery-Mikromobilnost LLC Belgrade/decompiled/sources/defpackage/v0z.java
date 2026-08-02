package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v0z extends n351 {
    public final ldc c;
    public final String d;

    public v0z(ldc ldcVar, String str) {
        super("loading-spinner", false, 14);
        this.c = ldcVar;
        this.d = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0z)) {
            return false;
        }
        v0z v0zVar = (v0z) obj;
        return jl40.l(this.c, v0zVar.c) && jl40.l(this.d, v0zVar.d);
    }

    public final int hashCode() {
        ldc ldcVar = this.c;
        int hashCode = (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LoadingSpinnerModel(color=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
