package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ujt {
    public final hgu a;
    public final yjt b;

    public ujt(hgu hguVar, yjt yjtVar) {
        this.a = hguVar;
        this.b = yjtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ujt) {
            ujt ujtVar = (ujt) obj;
            if (this.a == ujtVar.a && jl40.l(this.b, ujtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GlobalSearchParam(searchFilter=" + this.a + ", trace=" + this.b + Extension.C_BRAKE;
    }
}
