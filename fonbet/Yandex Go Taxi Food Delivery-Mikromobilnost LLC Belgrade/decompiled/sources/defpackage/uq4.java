package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uq4 {
    public final String a;
    public final qfc b;
    public final qfc c;
    public final ArrayList d;

    public uq4(String str, qfc qfcVar, qfc qfcVar2, ArrayList arrayList) {
        this.a = str;
        this.b = qfcVar;
        this.c = qfcVar2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq4)) {
            return false;
        }
        uq4 uq4Var = (uq4) obj;
        return jl40.l(this.a, uq4Var.a) && jl40.l(this.b, uq4Var.b) && this.c.equals(uq4Var.c) && this.d.equals(uq4Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qfc qfcVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "AdvertisementTag(text=" + this.a + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", info=" + this.d + Extension.C_BRAKE;
    }
}
