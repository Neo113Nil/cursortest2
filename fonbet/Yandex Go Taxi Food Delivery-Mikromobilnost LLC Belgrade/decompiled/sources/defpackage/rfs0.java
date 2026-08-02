package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class rfs0 {
    public final String a;
    public final String b;
    public final ja21 c;
    public final List d;

    public rfs0(String str, String str2, ja21 ja21Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = ja21Var;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfs0)) {
            return false;
        }
        rfs0 rfs0Var = (rfs0) obj;
        return jl40.l(this.a, rfs0Var.a) && jl40.l(this.b, rfs0Var.b) && jl40.l(this.c, rfs0Var.c) && jl40.l(this.d, rfs0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.d;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SimplifiedIdApplicationEntity(applicationId=", this.a, ", agreement=", this.b, ", form=");
        v.append(this.c);
        v.append(", widgets=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
