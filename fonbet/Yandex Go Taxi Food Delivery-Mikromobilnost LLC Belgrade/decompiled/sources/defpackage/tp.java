package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;

/* loaded from: classes5.dex */
public final class tp extends lr {
    public final hki a;
    public final DeliveryPointFocusHolder$FocusTarget b;

    public tp(hki hkiVar, DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget) {
        this.a = hkiVar;
        this.b = deliveryPointFocusHolder$FocusTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return jl40.l(this.a, tpVar.a) && this.b == tpVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputViewClicked(pointType=" + this.a + ", focusTarget=" + this.b + Extension.C_BRAKE;
    }
}
