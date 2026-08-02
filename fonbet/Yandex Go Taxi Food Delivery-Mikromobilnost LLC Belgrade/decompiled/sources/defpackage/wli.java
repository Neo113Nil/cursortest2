package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

/* loaded from: classes5.dex */
public final class wli {
    public final x5i a;
    public final nvi b;
    public final List c;
    public final DeliveryFormType d;

    public wli(x5i x5iVar, nvi nviVar, List list, DeliveryFormType deliveryFormType) {
        this.a = x5iVar;
        this.b = nviVar;
        this.c = list;
        this.d = deliveryFormType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wli)) {
            return false;
        }
        wli wliVar = (wli) obj;
        return jl40.l(this.a, wliVar.a) && jl40.l(this.b, wliVar.b) && jl40.l(this.c, wliVar.c) && this.d == wliVar.d;
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        DeliveryFormType deliveryFormType = this.d;
        return c + (deliveryFormType == null ? 0 : deliveryFormType.hashCode());
    }

    public final String toString() {
        return "DeliveryRedrawContentData(deliveryData=" + this.a + ", state=" + this.b + ", requirements=" + this.c + ", formType=" + this.d + Extension.C_BRAKE;
    }
}
