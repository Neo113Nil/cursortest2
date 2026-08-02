package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardActionDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerStyleDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$ButtonStyle;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$ButtonType;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$PreorderDueViewParams;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class yhw {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[IntercityDashboardSectionDto$PreorderDueViewParams.Type.values().length];
        try {
            iArr[IntercityDashboardSectionDto$PreorderDueViewParams.Type.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityDashboardSectionDto$PreorderDueViewParams.Type.TIMETABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityDashboardSectionDto$PreorderDueViewParams.Type.TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IntercityDashboardSectionDto$PreorderDueViewParams.Type.DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[IntercityDashboardButtonsDataDto$ButtonStyle.values().length];
        try {
            iArr2[IntercityDashboardButtonsDataDto$ButtonStyle.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[IntercityDashboardButtonsDataDto$ButtonStyle.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[IntercityDashboardButtonsDataDto$ButtonStyle.UNSUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[IntercityDashboardButtonsDataDto$ButtonType.values().length];
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.CONFIRM_PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.SELECT_DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.SELECT_DUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.SELECT_STARTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.SHOW_FLEX_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.DEEPLINK.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.TAXI_ORDER_FLOW.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        c = iArr3;
        int[] iArr4 = new int[IntercityDashboardActionDto.ActionType.values().length];
        try {
            iArr4[IntercityDashboardActionDto.ActionType.HAPPY_HOURS.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[IntercityDashboardActionDto.ActionType.DISCOVERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[IntercityDashboardActionDto.ActionType.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[IntercityDashboardActionDto.ActionType.SHOW_POPUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[IntercityDashboardActionDto.ActionType.URL.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[IntercityDashboardActionDto.ActionType.UNSUPPORTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        d = iArr4;
        int[] iArr5 = new int[IntercityDashboardBannerStyleDto.BannerType.values().length];
        try {
            iArr5[IntercityDashboardBannerStyleDto.BannerType.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[IntercityDashboardBannerStyleDto.BannerType.COUPON.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        e = iArr5;
    }
}
