package defpackage;

import com.yandex.mapkit.road_events.RoadEventFailedError;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class wov {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoadEventFailedError.Code.values().length];
        try {
            iArr[RoadEventFailedError.Code.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoadEventFailedError.Code.BANNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoadEventFailedError.Code.TOO_FAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RoadEventFailedError.Code.TOO_OFTEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RoadEventFailedError.Code.LEGAL_REASONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
