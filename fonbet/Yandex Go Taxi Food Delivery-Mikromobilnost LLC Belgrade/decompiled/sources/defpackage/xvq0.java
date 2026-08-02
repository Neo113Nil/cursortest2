package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xvq0 implements yvq0 {
    public final String a;
    public final ArrayList b;

    public xvq0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvq0)) {
            return false;
        }
        xvq0 xvq0Var = (xvq0) obj;
        return jl40.l(this.a, xvq0Var.a) && this.b.equals(xvq0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return n.k("Result(regionText=", this.a, ", services=", Extension.C_BRAKE, this.b);
    }
}
