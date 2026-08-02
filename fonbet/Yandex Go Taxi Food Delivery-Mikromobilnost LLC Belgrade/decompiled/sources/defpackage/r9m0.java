package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r9m0 implements s9m0 {
    public final String a;
    public final String b;
    public final String c;
    public final MoneyEntity d;
    public final ColorModel e;
    public final String f;
    public final ArrayList g;

    public r9m0(String str, String str2, String str3, MoneyEntity moneyEntity, ColorModel colorModel, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = moneyEntity;
        this.e = colorModel;
        this.f = str4;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9m0)) {
            return false;
        }
        r9m0 r9m0Var = (r9m0) obj;
        return jl40.l(this.a, r9m0Var.a) && jl40.l(this.b, r9m0Var.b) && jl40.l(this.c, r9m0Var.c) && this.d.equals(r9m0Var.d) && jl40.l(this.e, r9m0Var.e) && jl40.l(this.f, r9m0Var.f) && this.g.equals(r9m0Var.g);
    }

    public final int hashCode() {
        int d = ly3.d(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        ColorModel colorModel = this.e;
        int hashCode = (d + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        String str = this.f;
        return this.g.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Interest(id=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", total=");
        v.append(this.d);
        v.append(", totalTextColor=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", detailsByMonth=");
        return b64.n(Extension.C_BRAKE, v, this.g);
    }
}
