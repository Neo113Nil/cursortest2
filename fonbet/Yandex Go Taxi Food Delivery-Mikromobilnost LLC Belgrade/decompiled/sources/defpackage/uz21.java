package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uz21 implements xz21 {
    public final ArrayList a;
    public final ArrayList b;

    public uz21(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz21)) {
            return false;
        }
        uz21 uz21Var = (uz21) obj;
        return this.a.equals(uz21Var.a) && this.b.equals(uz21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputInvalid(autofundErrors=" + this.a + ", autotopupErrors=" + this.b + Extension.C_BRAKE;
    }
}
