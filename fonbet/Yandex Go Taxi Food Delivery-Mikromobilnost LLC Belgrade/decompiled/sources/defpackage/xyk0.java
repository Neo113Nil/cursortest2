package defpackage;

import com.ybsdk.core.common.data.network.dto.Money;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xyk0 {
    public final String a;
    public final String b;
    public final Money c;

    public xyk0(String str, String str2, Money money) {
        this.a = str;
        this.b = str2;
        this.c = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyk0)) {
            return false;
        }
        xyk0 xyk0Var = (xyk0) obj;
        return jl40.l(this.a, xyk0Var.a) && jl40.l(this.b, xyk0Var.b) && jl40.l(this.c, xyk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("RoundingOptionEntity(id=", this.a, ", text=", this.b, ", futureIncomeAmount=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
