package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xz70 {
    public final String a;
    public final MapObject b;

    public xz70(String str, MapObject mapObject) {
        this.a = str;
        this.b = mapObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz70)) {
            return false;
        }
        xz70 xz70Var = (xz70) obj;
        return jl40.l(this.a, xz70Var.a) && this.b.equals(xz70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderMapObject(orderId=" + this.a + ", mapObject=" + this.b + Extension.C_BRAKE;
    }
}
