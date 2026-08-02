package defpackage;

import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class uxf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SearchOverlayType.values().length];
        try {
            iArr[SearchOverlayType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SearchOverlayType.UBER_LONG_SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SearchOverlayType.SEARCH_CARS_OVERLAY_STRATEGY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SearchOverlayType.FAST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SearchOverlayType.ORDINARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SearchOverlayType.DISPLAY_BANNERS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SearchOverlayType.LONG.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SearchOverlayType.SEARCH_COMPANIONS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SearchOverlayType.QUEUE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
