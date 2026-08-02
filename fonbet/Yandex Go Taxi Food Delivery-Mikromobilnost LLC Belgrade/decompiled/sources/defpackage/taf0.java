package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class taf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProductMode$Taxi.SectionType.values().length];
        try {
            iArr[ProductMode$Taxi.SectionType.HEADER_LINEAR_GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.ITEMS_HORIZONTAL_SCROLLABLE_GRID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.ITEMS_LINEAR_GRID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.TAXI_SUGGESTS_SECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.WHERE_TO_SECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.LINEAR_VERTICAL_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.BUTTONS_CONTAINER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.HORIZONTAL_STACK_SECTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.VERTICAL_STACK_SECTION.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.UNSUPPORTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
