package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;

/* loaded from: classes5.dex */
public final class up extends lr {
    public final hki a;
    public final DeliveryPointFocusHolder$FocusTarget b;
    public final String c;

    public up(hki hkiVar, DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget, String str) {
        this.a = hkiVar;
        this.b = deliveryPointFocusHolder$FocusTarget;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return jl40.l(this.a, upVar.a) && this.b == upVar.b && jl40.l(this.c, upVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputViewUpdated(pointType=");
        sb.append(this.a);
        sb.append(", focusTarget=");
        sb.append(this.b);
        sb.append(", value=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
