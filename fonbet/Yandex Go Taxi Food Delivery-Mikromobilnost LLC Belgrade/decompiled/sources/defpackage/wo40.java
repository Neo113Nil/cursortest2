package defpackage;

import com.yandex.go.tariffcard.ui.MultiTariffOption$Subtitle$SubtitleType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wo40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MultiTariffOption$Subtitle$SubtitleType.values().length];
        try {
            iArr[MultiTariffOption$Subtitle$SubtitleType.PROMOTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MultiTariffOption$Subtitle$SubtitleType.UNAVAILABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
