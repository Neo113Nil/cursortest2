package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v740 {
    public static final v740 d = new v740(0);
    public final String a;
    public final List b;
    public final String c;

    public v740(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v740)) {
            return false;
        }
        v740 v740Var = (v740) obj;
        return jl40.l(this.a, v740Var.a) && jl40.l(this.b, v740Var.b) && jl40.l(this.c, v740Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(xvz.r("MtTicketsAnalyticsModel(orderId=", this.a, ", activationTypeList=", this.b, ", requestId="), this.c, Extension.C_BRAKE);
    }

    public v740() {
        this(0);
    }

    public /* synthetic */ v740(int i) {
        this("", EmptyList.a, null);
    }
}
