package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class vbk0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[RideCardPresentationType.values().length];
        try {
            iArr[RideCardPresentationType.COMPACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardPresentationType.DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardPresentationType.SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardPresentationType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[OrderScreen.values().length];
        try {
            iArr2[OrderScreen.ORDER_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[OrderScreen.ORDER_TRACKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[OrderScreen.ORDER_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[DriveState.values().length];
        try {
            iArr3[DriveState.PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DriveState.SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DriveState.SCHEDULING.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[DriveState.SCHEDULED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[DriveState.CHECK_IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[DriveState.DRIVING.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DriveState.WAITING.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[DriveState.TRANSPORTING.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[DriveState.COMPLETE.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[DriveState.CANCELLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[DriveState.FAILED.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[DriveState.EXPIRED.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        c = iArr3;
    }
}
