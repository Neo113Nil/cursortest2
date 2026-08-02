package defpackage;

import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySkipAlertCondition;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class zms0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliverySkipAlertCondition.values().length];
        try {
            iArr[DeliverySkipAlertCondition.REQUIREMENT_NOT_SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliverySkipAlertCondition.NEVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliverySkipAlertCondition.ALWAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
