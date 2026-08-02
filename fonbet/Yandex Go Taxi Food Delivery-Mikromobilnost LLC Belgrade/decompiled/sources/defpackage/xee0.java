package defpackage;

import com.yandex.delivery.mapper.model.OrderDetailsFormFieldType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xee0 implements bfe0 {
    public final OrderDetailsFormFieldType a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public xee0(OrderDetailsFormFieldType orderDetailsFormFieldType, boolean z, String str, String str2, String str3) {
        this.a = orderDetailsFormFieldType;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xee0)) {
            return false;
        }
        xee0 xee0Var = (xee0) obj;
        return this.a == xee0Var.a && this.b == xee0Var.b && jl40.l(this.c, xee0Var.c) && jl40.l(this.d, xee0Var.d) && jl40.l(this.e, xee0Var.e);
    }

    @Override // defpackage.bfe0
    public final OrderDetailsFormFieldType getType() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonInputLayout(type=");
        sb.append(this.a);
        sb.append(", isLocked=");
        sb.append(this.b);
        sb.append(", placeholder=");
        g8e.D(sb, this.c, ", currentValue=", this.d, ", editFieldName=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
