package defpackage;

import android.graphics.drawable.Drawable;
import com.ybsdk.api.entities.YBPaymentMethodProductType;
import com.ybsdk.api.entities.YBPaymentMethodType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class xf51 {
    public final YBPaymentMethodType a;
    public final String b;
    public final String c;
    public final String d;
    public final dvc e;
    public final tf51 f;
    public final wf51 g;
    public final YBPaymentMethodProductType h;
    public final af51 i;
    public final af51 j;
    public final Drawable k;

    public xf51(YBPaymentMethodType yBPaymentMethodType, String str, String str2, String str3, dvc dvcVar, tf51 tf51Var, wf51 wf51Var, YBPaymentMethodProductType yBPaymentMethodProductType, af51 af51Var, af51 af51Var2) {
        this.a = yBPaymentMethodType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = dvcVar;
        this.f = tf51Var;
        this.g = wf51Var;
        this.h = yBPaymentMethodProductType;
        this.i = af51Var;
        this.j = af51Var2;
        this.k = dvcVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf51)) {
            return false;
        }
        xf51 xf51Var = (xf51) obj;
        return this.a == xf51Var.a && this.b.equals(xf51Var.b) && jl40.l(this.c, xf51Var.c) && jl40.l(this.d, xf51Var.d) && jl40.l(this.e, xf51Var.e) && jl40.l(this.f, xf51Var.f) && jl40.l(this.g, xf51Var.g) && this.h == xf51Var.h && jl40.l(this.i, xf51Var.i) && jl40.l(this.j, xf51Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        tf51 tf51Var = this.f;
        int hashCode2 = (hashCode + (tf51Var == null ? 0 : tf51Var.hashCode())) * 31;
        wf51 wf51Var = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (wf51Var == null ? 0 : wf51Var.hashCode())) * 31)) * 31;
        af51 af51Var = this.i;
        int hashCode4 = (hashCode3 + (af51Var == null ? 0 : af51Var.hashCode())) * 31;
        af51 af51Var2 = this.j;
        return hashCode4 + (af51Var2 != null ? af51Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YBPaymentMethodInfo(type=");
        sb.append(this.a);
        sb.append(", paymentMethodId=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", wrapper=");
        sb.append(this.e);
        sb.append(", balance=");
        sb.append(this.f);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(", productType=");
        sb.append(this.h);
        sb.append(", autoTopupInfo=");
        sb.append(this.i);
        sb.append(", autoFundInfo=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
