package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class rl9 {
    public final List a;
    public final i5a b;
    public final String c;

    public rl9(List list, i5a i5aVar, String str) {
        this.a = list;
        this.b = i5aVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl9)) {
            return false;
        }
        rl9 rl9Var = (rl9) obj;
        return jl40.l(this.a, rl9Var.a) && jl40.l(this.b, rl9Var.b) && jl40.l(this.c, rl9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i5a i5aVar = this.b;
        int hashCode2 = (hashCode + (i5aVar == null ? 0 : i5aVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersActiveOrdersState(orders=");
        sb.append(this.a);
        sb.append(", multiOrderUi=");
        sb.append(this.b);
        sb.append(", traceId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public rl9() {
        this(0);
    }

    public /* synthetic */ rl9(int i) {
        this(EmptyList.a, null, null);
    }
}
