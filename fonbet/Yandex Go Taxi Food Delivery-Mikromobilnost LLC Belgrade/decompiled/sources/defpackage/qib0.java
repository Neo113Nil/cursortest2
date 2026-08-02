package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qib0 {
    public final ArrayList a;
    public final c03 b;
    public final String c;

    public qib0(ArrayList arrayList, c03 c03Var, String str) {
        this.a = arrayList;
        this.b = c03Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qib0)) {
            return false;
        }
        qib0 qib0Var = (qib0) obj;
        return this.a.equals(qib0Var.a) && this.b.equals(qib0Var.b) && jl40.l(this.c, qib0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoScreenContent(content=");
        sb.append(this.a);
        sb.append(", applicationInfo=");
        sb.append(this.b);
        sb.append(", finishScenarioDeeplink=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
