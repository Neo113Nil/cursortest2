package defpackage;

import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class t0i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SelectedFrom.values().length];
        try {
            iArr[SelectedFrom.CONTACTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedFrom.LAST_CONTACTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectedFrom.MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SelectedFrom.STANDALONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SelectedFrom.SUGGEST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DeliverySelectedFrom.values().length];
        try {
            iArr2[DeliverySelectedFrom.CONTACTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeliverySelectedFrom.LAST_CONTACTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeliverySelectedFrom.MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DeliverySelectedFrom.STANDALONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DeliverySelectedFrom.ORDER_FOR_ANOTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DeliverySelectedFrom.SUGGEST.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
