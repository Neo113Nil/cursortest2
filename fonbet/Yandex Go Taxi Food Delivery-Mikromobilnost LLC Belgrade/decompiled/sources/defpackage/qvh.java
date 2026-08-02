package defpackage;

import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class qvh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryFormStepType.values().length];
        try {
            iArr[DeliveryFormStepType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryFormStepType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
