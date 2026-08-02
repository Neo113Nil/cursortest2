package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.data.model.ButtonActionType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xy80 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ButtonActionType.values().length];
        try {
            iArr[ButtonActionType.PAY_DEBT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonActionType.TOP_UP_YANDEX_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonActionType.TOP_UP_YANGO_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ButtonActionType.OPEN_SBP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ButtonActionType.CONTINUE_CREATE_ORDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ButtonActionType.OPEN_DEBT_INFO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ButtonActionType.OPEN_HISTORY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ButtonActionType.OPEN_PAYMENT_METHODS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ButtonActionType.OPEN_PAYMENT_METHODS_TO_PAY_DEBT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ButtonActionType.SWITCH_PAYMENT_METHOD_AND_OPEN_SUMMARY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ButtonActionType.CLOSE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ButtonActionType.PLUS_TOGGLE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ButtonActionType.OPEN_URL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ButtonActionType.UNKNOWN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        a = iArr;
        int[] iArr2 = new int[Screen.values().length];
        try {
            iArr2[Screen.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[Screen.MAIN_V4.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[Screen.TAXI_MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[Screen.MULTI_AREA.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[Screen.ORDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[Screen.ORDERS_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[Screen.ORDER_DETAILS.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[Screen.ORDER_TRACKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[Screen.SUMMARY.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[Screen.SUMMARY_TRANSPORT.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[Screen.SUMMARY_DRIVE.ordinal()] = 11;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[Screen.ROUTE_SELECTOR.ordinal()] = 12;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[Screen.CHOOSE_B.ordinal()] = 13;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[Screen.AFTER_SUMMARY_CLARIFY_POINT.ordinal()] = 14;
        } catch (NoSuchFieldError unused28) {
        }
        b = iArr2;
        int[] iArr3 = new int[OverdraftContext.values().length];
        try {
            iArr3[OverdraftContext.MAIN_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[OverdraftContext.ACTIVE_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr3[OverdraftContext.ORDER_PAY_CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr3[OverdraftContext.ORDER_WITH_DEBT.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr3[OverdraftContext.SUMMARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused33) {
        }
        c = iArr3;
    }
}
