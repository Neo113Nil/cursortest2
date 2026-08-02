package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q9m0 {
    public final String a;
    public final MoneyEntity b;
    public final ColorModel c;
    public final ColorModel d;
    public final ColorModel e;

    public q9m0(MoneyEntity moneyEntity, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, String str) {
        this.a = str;
        this.b = moneyEntity;
        this.c = colorModel;
        this.d = colorModel2;
        this.e = colorModel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9m0)) {
            return false;
        }
        q9m0 q9m0Var = (q9m0) obj;
        return jl40.l(this.a, q9m0Var.a) && this.b.equals(q9m0Var.b) && jl40.l(this.c, q9m0Var.c) && jl40.l(this.d, q9m0Var.d) && jl40.l(this.e, q9m0Var.e);
    }

    public final int hashCode() {
        int d = ly3.d(this.b, this.a.hashCode() * 31, 31);
        ColorModel colorModel = this.c;
        int hashCode = (d + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.d;
        int hashCode2 = (hashCode + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.e;
        return hashCode2 + (colorModel3 != null ? colorModel3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Month(label=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", textColor=");
        smw0.z(sb, this.c, ", amountColor=", this.d, ", backgroundColor=");
        return n.o(sb, this.e, Extension.C_BRAKE);
    }
}
