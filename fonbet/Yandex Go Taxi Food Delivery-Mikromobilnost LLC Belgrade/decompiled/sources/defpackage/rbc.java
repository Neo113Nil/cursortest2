package defpackage;

import ru.yandex.taxi.statebar.data.LocationErrorReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rbc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LocationErrorReason.values().length];
        try {
            iArr[LocationErrorReason.LOCATION_SERVICE_ERROR_REASON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LocationErrorReason.LOCATION_PERMISSION_ERROR_REASON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LocationErrorReason.LOCATION_RESOLVING_ERROR_REASON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LocationErrorReason.LOCATION_MESSAGE_REASON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LocationErrorReason.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
