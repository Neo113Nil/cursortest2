package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.linked_order.models.data.LinkedOrderType;

/* loaded from: classes9.dex */
public final class sny {
    public static final sny c = new sny("", LinkedOrderType.DEFAULT);
    public final String a;
    public final LinkedOrderType b;

    public sny(String str, LinkedOrderType linkedOrderType) {
        this.a = str;
        this.b = linkedOrderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sny)) {
            return false;
        }
        sny snyVar = (sny) obj;
        return jl40.l(this.a, snyVar.a) && this.b == snyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkedOrderKey(orderId=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
