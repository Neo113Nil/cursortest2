package defpackage;

import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;
import ru.yandex.taxi.cashback.models.response.CashbackInactiveTariffBadgeStyleDto;
import ru.yandex.taxi.cashback.models.response.CashbackTariffBadgeStyleDto;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class xk21 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[CashbackInactiveTariffBadgeStyleDto.values().length];
        try {
            iArr[CashbackInactiveTariffBadgeStyleDto.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashbackInactiveTariffBadgeStyleDto.GRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CashbackInactiveTariffBadgeStyleDto.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CashbackTariffBadgeStyleDto.values().length];
        try {
            iArr2[CashbackTariffBadgeStyleDto.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CashbackTariffBadgeStyleDto.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[PlusSdkWidgetExperiment.PlaqueType.values().length];
        try {
            iArr3[PlusSdkWidgetExperiment.PlaqueType.UNIVERSAL_PLAQUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[PlusSdkWidgetExperiment.PlaqueType.PLUS_SDK_PLAQUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
