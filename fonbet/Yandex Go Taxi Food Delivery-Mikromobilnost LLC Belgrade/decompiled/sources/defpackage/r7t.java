package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r7t {
    public final s7t a;
    public final ArrayList b;

    public r7t(s7t s7tVar, ArrayList arrayList) {
        this.a = s7tVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7t)) {
            return false;
        }
        r7t r7tVar = (r7t) obj;
        return jl40.l(this.a, r7tVar.a) && this.b.equals(r7tVar.b);
    }

    public final int hashCode() {
        s7t s7tVar = this.a;
        return this.b.hashCode() + ((s7tVar == null ? 0 : Long.hashCode(s7tVar.a)) * 31);
    }

    public final String toString() {
        return "FoldersResult(mainFolder=" + this.a + ", customFolders=" + this.b + Extension.C_BRAKE;
    }
}
