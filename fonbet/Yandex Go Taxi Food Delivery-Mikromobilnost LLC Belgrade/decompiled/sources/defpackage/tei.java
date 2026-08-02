package defpackage;

import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class tei {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPointFocusHolder$FocusTarget.values().length];
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.Apartment.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPointFocusHolder$FocusTarget.DoorPhone.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
