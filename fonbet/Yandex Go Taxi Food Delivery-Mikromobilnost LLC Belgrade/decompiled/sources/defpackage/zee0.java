package defpackage;

import com.yandex.delivery.mapper.model.OrderDetailsFormFieldType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zee0 implements bfe0 {
    public final OrderDetailsFormFieldType a;
    public final String b;
    public final boolean c;
    public final yee0 d;
    public final String e;
    public final String f;
    public final String g;

    public zee0(OrderDetailsFormFieldType orderDetailsFormFieldType, String str, boolean z, yee0 yee0Var, String str2, String str3, String str4) {
        this.a = orderDetailsFormFieldType;
        this.b = str;
        this.c = z;
        this.d = yee0Var;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zee0)) {
            return false;
        }
        zee0 zee0Var = (zee0) obj;
        return this.a == zee0Var.a && jl40.l(this.b, zee0Var.b) && this.c == zee0Var.c && jl40.l(this.d, zee0Var.d) && jl40.l(this.e, zee0Var.e) && jl40.l(this.f, zee0Var.f) && jl40.l(this.g, zee0Var.g);
    }

    @Override // defpackage.bfe0
    public final OrderDetailsFormFieldType getType() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        yee0 yee0Var = this.d;
        int hashCode2 = (e + (yee0Var == null ? 0 : yee0Var.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInputLayout(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isLocked=");
        sb.append(this.c);
        sb.append(", phoneSelectionScreenConfig=");
        sb.append(this.d);
        sb.append(", currentValue=");
        g8e.D(sb, this.e, ", editFieldName=", this.f, ", selectContactButtonTitle=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
