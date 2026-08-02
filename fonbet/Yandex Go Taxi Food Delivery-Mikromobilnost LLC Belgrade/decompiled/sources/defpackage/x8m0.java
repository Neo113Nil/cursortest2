package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x8m0 extends e9m0 {
    public final String c;
    public final Text.Constant d;
    public final String e;
    public final ArrayList f;

    public x8m0(String str, Text.Constant constant, String str2, ArrayList arrayList) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = str2;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8m0)) {
            return false;
        }
        x8m0 x8m0Var = (x8m0) obj;
        return jl40.l(this.c, x8m0Var.c) && this.d.equals(x8m0Var.d) && jl40.l(this.e, x8m0Var.e) && this.f.equals(x8m0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(xvz.d(this.d, this.c.hashCode() * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "FundIncome(id=" + this.c + ", title=" + this.d + ", infoAction=" + this.e + ", periods=" + this.f + Extension.C_BRAKE;
    }
}
