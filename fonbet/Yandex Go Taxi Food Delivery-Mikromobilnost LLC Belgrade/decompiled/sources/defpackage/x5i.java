package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.api.DeliveryDataProvider$UpdateState;

/* loaded from: classes9.dex */
public final class x5i {
    public final cni a;
    public final DeliveryDataProvider$UpdateState b;

    public x5i(cni cniVar, DeliveryDataProvider$UpdateState deliveryDataProvider$UpdateState) {
        this.a = cniVar;
        this.b = deliveryDataProvider$UpdateState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5i)) {
            return false;
        }
        x5i x5iVar = (x5i) obj;
        return jl40.l(this.a, x5iVar.a) && this.b == x5iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryData(routeInfo=" + this.a + ", updateState=" + this.b + Extension.C_BRAKE;
    }

    public x5i() {
        this(0);
    }

    public /* synthetic */ x5i(int i) {
        this(cni.c, DeliveryDataProvider$UpdateState.NEED_UPDATE);
    }
}
