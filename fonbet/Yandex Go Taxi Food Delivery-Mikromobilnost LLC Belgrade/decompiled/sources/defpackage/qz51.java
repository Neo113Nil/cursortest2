package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qz51 {
    public final String a;
    public final List b;

    public qz51(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz51)) {
            return false;
        }
        qz51 qz51Var = (qz51) obj;
        return jl40.l(this.a, qz51Var.a) && jl40.l(this.b, qz51Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return nnm.h("YbsByBicEntity(errorHint=", this.a, ", ybs=", Extension.C_BRAKE, this.b);
    }
}
