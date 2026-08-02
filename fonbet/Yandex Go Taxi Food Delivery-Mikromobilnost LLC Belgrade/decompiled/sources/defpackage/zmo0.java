package defpackage;

import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zmo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.values().length];
        try {
            iArr[ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
