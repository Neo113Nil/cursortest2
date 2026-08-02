package defpackage;

import java.util.LinkedHashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class s0i {
    public final lx4 a;

    public s0i(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public final void a() {
        String str;
        DeliveryFormStepType deliveryFormStepType = DeliveryFormStepType.DESTINATION;
        i d = ((j) this.a).d("DeliveryContactAutofillBubble.Closed");
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("close_reason", "auto");
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "destination";
        }
        linkedHashMap.put(ClidProvider.STATE, str);
        d.m();
    }

    public final void b() {
        String str;
        DeliveryFormStepType deliveryFormStepType = DeliveryFormStepType.DESTINATION;
        i d = ((j) this.a).d("DeliveryContactAutofillBubble.Closed");
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("close_reason", "tapped");
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "destination";
        }
        linkedHashMap.put(ClidProvider.STATE, str);
        d.m();
    }

    public final void c() {
        String str;
        DeliveryFormStepType deliveryFormStepType = DeliveryFormStepType.DESTINATION;
        i d = ((j) this.a).d("DeliveryContactAutofillBubble.Shown");
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "destination";
        }
        d.a.put(ClidProvider.STATE, str);
        d.m();
    }
}
