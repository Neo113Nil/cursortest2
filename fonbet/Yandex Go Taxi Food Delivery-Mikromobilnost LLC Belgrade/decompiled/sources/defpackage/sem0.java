package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sem0 {
    public final ArrayList a;
    public final eu5 b;

    public sem0(ArrayList arrayList, eu5 eu5Var) {
        this.a = arrayList;
        this.b = eu5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sem0)) {
            return false;
        }
        sem0 sem0Var = (sem0) obj;
        return this.a.equals(sem0Var.a) && this.b.equals(sem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SbpAccountsPartnersSuccessDataEntity(ybs=" + this.a + ", bindAccountSheet=" + this.b + Extension.C_BRAKE;
    }
}
