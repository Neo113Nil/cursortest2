package defpackage;

import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class r6r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PositionInitAction.values().length];
        try {
            iArr[PositionInitAction.CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PositionInitAction.AUTO_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PositionInitAction.GEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PositionInitAction.MAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PositionInitAction.SUGGEST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PositionInitAction.PANORAMA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PositionInitAction.SUMMARY_TARIFF_CHANGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
