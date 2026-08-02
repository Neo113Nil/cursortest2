package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zd8 implements ae8 {
    public final String a;
    public final ArrayList b;

    public zd8(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd8)) {
            return false;
        }
        zd8 zd8Var = (zd8) obj;
        return this.a.equals(zd8Var.a) && this.b.equals(zd8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("PromoGroup(groupId=", this.a, ", promos=", Extension.C_BRAKE, this.b);
    }
}
