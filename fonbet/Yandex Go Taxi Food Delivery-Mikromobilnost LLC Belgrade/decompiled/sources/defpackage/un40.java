package defpackage;

import com.yandex.go.tariffcard.ui.MultiTariffOption$Subtitle$SubtitleType;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class un40 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SummaryUiDelegate$TariffCardStyle.values().length];
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.WIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryUiDelegate$TariffCardStyle.HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MultiTariffOption$Subtitle$SubtitleType.values().length];
        try {
            iArr2[MultiTariffOption$Subtitle$SubtitleType.UNAVAILABILITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MultiTariffOption$Subtitle$SubtitleType.PROMOTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
