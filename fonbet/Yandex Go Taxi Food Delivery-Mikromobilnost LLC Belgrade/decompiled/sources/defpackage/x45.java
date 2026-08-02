package defpackage;

import com.yandex.go.shortcuts.dto.response.OverlayType;
import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import com.yandex.go.shortcuts.dto.response.Shape;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class x45 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[SectionTypedHeader.Lead.AppearanceType.values().length];
        try {
            iArr[SectionTypedHeader.Lead.AppearanceType.ICON_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SectionTypedHeader.Lead.AppearanceType.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BaseShortcutModel$Source.values().length];
        try {
            iArr2[BaseShortcutModel$Source.HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BaseShortcutModel$Source.ITEMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BaseShortcutModel$Source.TURBO_BUTTONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BaseShortcutModel$Source.TOP_ITEMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BaseShortcutModel$Source.BOTTOM_ITEMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[BaseShortcutModel$Source.HORIZONTAL_STACK_ITEM.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[BaseShortcutModel$Source.LOCAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[BaseShortcutModel$Source.MAIN_SCREEN_PROMO.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[BaseShortcutModel$Source.VERTICAL_STACK_ITEM.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
        int[] iArr3 = new int[OfferType.values().length];
        try {
            iArr3[OfferType.TAXI_MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[OfferType.UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[OfferType.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[OfferType.TAXI_EXPECTED_DESTINATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[OfferType.MEDIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[OfferType.DRIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[OfferType.ACTION_DRIVEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[OfferType.ACTION_DRIVEN_THUMB.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[OfferType.TAXI_ROUTE_INPUT.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[OfferType.EATS_BASED_SUPER_APP.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[OfferType.HEADER_DEEP_LINK.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[OfferType.HEADER_SUMMARY_REDIRECT.ordinal()] = 12;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[OfferType.HEADER_ACTION_DRIVEN.ordinal()] = 13;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[OfferType.PERSONAL.ordinal()] = 14;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[OfferType.PERSONAL_SLIDER.ordinal()] = 15;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[OfferType.DELIVERY_DASHBOARD.ordinal()] = 16;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[OfferType.LIST_ITEM.ordinal()] = 17;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[OfferType.MARKETPLACE.ordinal()] = 18;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[OfferType.ROUND_BUTTON.ordinal()] = 19;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr3[OfferType.SQUARE_BUTTON.ordinal()] = 20;
        } catch (NoSuchFieldError unused31) {
        }
        c = iArr3;
        int[] iArr4 = new int[Shape.values().length];
        try {
            iArr4[Shape.POI.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[Shape.CAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr4[Shape.BOTTOM_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr4[Shape.STICKER.ordinal()] = 4;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr4[Shape.BUBBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr4[Shape.TRAIL_ICON.ordinal()] = 6;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr4[Shape.CORNER_IMAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr4[Shape.CORNER_TEXT.ordinal()] = 8;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr4[Shape.AFISHA.ordinal()] = 9;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr4[Shape.LABEL.ordinal()] = 10;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr4[Shape.TRAIL_LABEL.ordinal()] = 11;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr4[Shape.ADVERTISEMENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr4[Shape.TOP_RIGHT.ordinal()] = 13;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr4[Shape.BUTTON.ordinal()] = 14;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr4[Shape.BUTTON_BADGE.ordinal()] = 15;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr4[Shape.BATTERY.ordinal()] = 16;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr4[Shape.UNSUPPORTED.ordinal()] = 17;
        } catch (NoSuchFieldError unused48) {
        }
        d = iArr4;
        int[] iArr5 = new int[OverlayType.values().length];
        try {
            iArr5[OverlayType.STATIC_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused49) {
        }
        e = iArr5;
    }
}
