package defpackage;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class vaf0 implements waf0 {
    public final String e;
    public final String f;
    public final ProductsScreenType$Type g;

    public vaf0(String str, String str2, ProductsScreenType$Type productsScreenType$Type) {
        this.e = str;
        this.f = str2;
        this.g = productsScreenType$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaf0)) {
            return false;
        }
        vaf0 vaf0Var = (vaf0) obj;
        return jl40.l(this.e, vaf0Var.e) && jl40.l(this.f, vaf0Var.f) && this.g == vaf0Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.e.hashCode() * 31, 31, this.f);
        ProductsScreenType$Type productsScreenType$Type = this.g;
        return b + (productsScreenType$Type == null ? 0 : productsScreenType$Type.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ScreensWithName(screenName=", this.e, ", metricName=", this.f, ", type=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
