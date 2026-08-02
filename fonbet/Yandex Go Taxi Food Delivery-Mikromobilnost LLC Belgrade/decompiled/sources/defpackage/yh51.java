package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class yh51 implements ai51 {
    public final tf51 a;
    public final List b;

    public yh51(tf51 tf51Var, List list) {
        this.a = tf51Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh51)) {
            return false;
        }
        yh51 yh51Var = (yh51) obj;
        if (!jl40.l(this.a, yh51Var.a)) {
            return false;
        }
        EmptyList emptyList = EmptyList.a;
        return emptyList.equals(emptyList) && jl40.l(this.b, yh51Var.b);
    }

    public final int hashCode() {
        tf51 tf51Var = this.a;
        int hashCode = (((tf51Var == null ? 0 : tf51Var.hashCode()) * 31) + 1) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Normal(balance=");
        sb.append(this.a);
        sb.append(", transactions=");
        sb.append(EmptyList.a);
        sb.append(", paymentMethods=");
        return ly3.s(sb, this.b, Extension.C_BRAKE);
    }
}
