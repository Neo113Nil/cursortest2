package defpackage;

import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vpm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersCardV2.ChargeConfig.ValueOption.values().length];
        try {
            iArr[ScootersCardV2.ChargeConfig.ValueOption.PERCENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersCardV2.ChargeConfig.ValueOption.DISTANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersCardV2.ChargeConfig.ValueOption.TIME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersCardV2.ChargeConfig.ValueOption.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
