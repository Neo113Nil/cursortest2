package defpackage;

import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class qre {
    public static final /* synthetic */ int[] a;

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
    }
}
