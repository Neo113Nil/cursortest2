package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class uv51 {
    public final String a;
    public final String b;
    public final String c;
    public final YbSdkPaymentMethodInfo$ProductType d;
    public final mv51 e;
    public final tv51 f;
    public final tv51 g;

    public uv51(String str, String str2, String str3, YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType, mv51 mv51Var, tv51 tv51Var, tv51 tv51Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ybSdkPaymentMethodInfo$ProductType;
        this.e = mv51Var;
        this.f = tv51Var;
        this.g = tv51Var2;
    }

    public final mv51 a() {
        return this.e;
    }

    public final tv51 b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final YbSdkPaymentMethodInfo$ProductType d() {
        return this.d;
    }

    public final tv51 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv51)) {
            return false;
        }
        uv51 uv51Var = (uv51) obj;
        return jl40.l(this.a, uv51Var.a) && jl40.l(this.b, uv51Var.b) && jl40.l(this.c, uv51Var.c) && this.d == uv51Var.d && jl40.l(this.e, uv51Var.e) && jl40.l(this.f, uv51Var.f) && jl40.l(this.g, uv51Var.g);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        mv51 mv51Var = this.e;
        int hashCode2 = (hashCode + (mv51Var == null ? 0 : mv51Var.hashCode())) * 31;
        tv51 tv51Var = this.f;
        int hashCode3 = (hashCode2 + (tv51Var == null ? 0 : tv51Var.hashCode())) * 31;
        tv51 tv51Var2 = this.g;
        return hashCode3 + (tv51Var2 != null ? tv51Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("YbSdkPaymentMethodInfo(paymentMethodId=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", productType=");
        v.append(this.d);
        v.append(", balance=");
        v.append(this.e);
        v.append(", mainAction=");
        v.append(this.f);
        v.append(", secondaryAction=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ uv51(String str, String str2, YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType) {
        this(str, str2, "", ybSdkPaymentMethodInfo$ProductType, null, null, null);
    }
}
