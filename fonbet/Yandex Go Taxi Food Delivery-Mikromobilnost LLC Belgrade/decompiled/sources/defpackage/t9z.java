package defpackage;

import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapter$Request$Quality;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class t9z {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AndroidLocationProviderType.values().length];
        try {
            iArr[AndroidLocationProviderType.GPS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidLocationProviderType.NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidLocationProviderType.PASSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidLocationProviderType.FUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[LocationManagerAdapter$Request$Quality.values().length];
        try {
            iArr2[LocationManagerAdapter$Request$Quality.HIGH_ACCURACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LocationManagerAdapter$Request$Quality.BALANCED_POWER_ACCURACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LocationManagerAdapter$Request$Quality.LOW_POWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
