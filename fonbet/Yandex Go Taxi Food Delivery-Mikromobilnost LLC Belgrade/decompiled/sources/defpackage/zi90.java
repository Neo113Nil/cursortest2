package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zi90 {
    public final ArrayList a;
    public final String b;

    public zi90(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi90)) {
            return false;
        }
        zi90 zi90Var = (zi90) obj;
        return this.a.equals(zi90Var.a) && jl40.l(this.b, zi90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PartnersListWithSession(partners=" + this.a + ", transferId=" + this.b + Extension.C_BRAKE;
    }
}
