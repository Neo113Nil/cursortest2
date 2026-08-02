package defpackage;

import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class r49 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusSdkWidgetExperiment.PlaqueType.values().length];
        try {
            iArr[PlusSdkWidgetExperiment.PlaqueType.UNIVERSAL_PLAQUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusSdkWidgetExperiment.PlaqueType.PLUS_SDK_PLAQUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
