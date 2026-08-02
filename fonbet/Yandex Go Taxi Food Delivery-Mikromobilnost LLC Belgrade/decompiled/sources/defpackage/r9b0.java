package defpackage;

import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r9b0 {
    public final mls a;
    public final ppl b;
    public final Set c;
    public final Set d;
    public final Map e;

    public r9b0(mls mlsVar, ppl pplVar, Set set, Set set2, Map map) {
        this.a = mlsVar;
        this.b = pplVar;
        this.c = set;
        this.d = set2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9b0)) {
            return false;
        }
        r9b0 r9b0Var = (r9b0) obj;
        return jl40.l(this.a, r9b0Var.a) && jl40.l(this.b, r9b0Var.b) && this.c.equals(r9b0Var.c) && this.d.equals(r9b0Var.d) && this.e.equals(r9b0Var.e);
    }

    public final int hashCode() {
        mls mlsVar = this.a;
        return this.e.hashCode() + g8e.e(this.d, g8e.e(this.c, (this.b.hashCode() + ((mlsVar == null ? 0 : mlsVar.hashCode()) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PfmEntity(funFact=");
        sb.append(this.a);
        sb.append(", transactionsList=");
        sb.append(this.b);
        sb.append(", filters=");
        sb.append(this.c);
        sb.append(", preselectedFilters=");
        sb.append(this.d);
        sb.append(", categories=");
        return b64.r(sb, this.e, Extension.C_BRAKE);
    }
}
