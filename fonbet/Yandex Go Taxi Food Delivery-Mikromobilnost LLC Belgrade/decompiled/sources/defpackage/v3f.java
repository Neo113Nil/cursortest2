package defpackage;

import com.ybsdk.network.dto.common.Product;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class v3f {
    public final Product a;
    public final Map b;

    public v3f(Product product, Map map) {
        this.a = product;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3f)) {
            return false;
        }
        v3f v3fVar = (v3f) obj;
        return this.a == v3fVar.a && jl40.l(this.b, v3fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "CreateApplicationWithProductRequest(product=" + this.a + ", additionalParams=" + this.b + Extension.C_BRAKE;
    }
}
