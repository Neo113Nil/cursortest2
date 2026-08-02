package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

/* loaded from: classes5.dex */
public final class z6s {
    public final mxd a;
    public final DeliveryFormType b;

    public z6s(mxd mxdVar, DeliveryFormType deliveryFormType) {
        this.a = mxdVar;
        this.b = deliveryFormType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6s)) {
            return false;
        }
        z6s z6sVar = (z6s) obj;
        return this.a.equals(z6sVar.a) && this.b == z6sVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormTypeRule(condition=" + this.a + ", formType=" + this.b + Extension.C_BRAKE;
    }
}
