package defpackage;

import java.util.HashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qi1 {
    public final HashSet a;
    public final HashSet b;

    public qi1(int i) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        this.a = hashSet;
        this.b = hashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi1)) {
            return false;
        }
        qi1 qi1Var = (qi1) obj;
        return jl40.l(this.a, qi1Var.a) && jl40.l(this.b, qi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AffectedFolders(mainFolderOrgIds=" + this.a + ", customFoldersIds=" + this.b + Extension.C_BRAKE;
    }

    public qi1() {
        this(0);
    }
}
