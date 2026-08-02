package defpackage;

import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class qwh {
    public final lx4 a;

    public qwh(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public final void a(String str, DeliveryFormStepType deliveryFormStepType, DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget, tls tlsVar) {
        String str2;
        String str3;
        w3j0 w3j0Var = (w3j0) tlsVar.invoke(((j) this.a).d(str));
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str2 = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str2 = "destination";
        }
        w3j0Var.a.put(ClidProvider.STATE, str2);
        int i2 = iwh.b[deliveryPointFocusHolder$FocusTarget.ordinal()];
        if (i2 == 1) {
            str3 = "floor";
        } else if (i2 == 2) {
            str3 = "flat_number";
        } else if (i2 == 3) {
            str3 = "doorphone";
        } else if (i2 == 4) {
            str3 = "entrance";
        } else {
            if (i2 != 5) {
                vg10.e(deliveryPointFocusHolder$FocusTarget, " is a wrong parameter for analytics ");
                return;
            }
            str3 = "comment";
        }
        w3j0Var.a.put("open_reason", str3);
        w3j0Var.m();
    }
}
