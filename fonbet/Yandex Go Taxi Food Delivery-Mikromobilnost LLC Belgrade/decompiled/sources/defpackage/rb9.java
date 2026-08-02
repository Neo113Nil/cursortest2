package defpackage;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class rb9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeOrderState$Source.values().length];
        try {
            iArr[ChangeOrderState$Source.SOURCE_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeOrderState$Source.DESTINATION_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangeOrderState$Source.ROUTE_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChangeOrderState$Source.PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChangeOrderState$Source.DRIVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChangeOrderState$Source.USER_READY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChangeOrderState$Source.SAVE_RIDE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChangeOrderState$Source.CANCEL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ChangeOrderState$Source.TARIFF.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ChangeOrderState$Source.DUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ChangeOrderState$Source.ADDITIONAL_PAYMENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ChangeOrderState$Source.REQUIREMENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
