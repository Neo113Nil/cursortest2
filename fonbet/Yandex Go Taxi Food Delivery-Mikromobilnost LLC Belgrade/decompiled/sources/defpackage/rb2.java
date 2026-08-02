package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationUpdatesRequest$Quality;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class rb2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AndroidLocationUpdatesRequest$Quality.values().length];
        try {
            iArr[AndroidLocationUpdatesRequest$Quality.HIGH_ACCURACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidLocationUpdatesRequest$Quality.BALANCED_POWER_ACCURACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidLocationUpdatesRequest$Quality.LOW_POWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidLocationUpdatesRequest$Quality.PASSIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
