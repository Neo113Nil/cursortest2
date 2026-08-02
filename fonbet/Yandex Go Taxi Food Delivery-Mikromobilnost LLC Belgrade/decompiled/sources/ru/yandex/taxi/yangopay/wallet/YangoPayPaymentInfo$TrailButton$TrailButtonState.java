package ru.yandex.taxi.yangopay.wallet;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/yangopay/wallet/YangoPayPaymentInfo$TrailButton$TrailButtonState", "", "Lru/yandex/taxi/yangopay/wallet/YangoPayPaymentInfo$TrailButton$TrailButtonState;", "REGULAR", "HIGHLIGHTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YangoPayPaymentInfo$TrailButton$TrailButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YangoPayPaymentInfo$TrailButton$TrailButtonState[] $VALUES;
    public static final YangoPayPaymentInfo$TrailButton$TrailButtonState HIGHLIGHTED;
    public static final YangoPayPaymentInfo$TrailButton$TrailButtonState REGULAR;

    static {
        YangoPayPaymentInfo$TrailButton$TrailButtonState yangoPayPaymentInfo$TrailButton$TrailButtonState = new YangoPayPaymentInfo$TrailButton$TrailButtonState("REGULAR", 0);
        REGULAR = yangoPayPaymentInfo$TrailButton$TrailButtonState;
        YangoPayPaymentInfo$TrailButton$TrailButtonState yangoPayPaymentInfo$TrailButton$TrailButtonState2 = new YangoPayPaymentInfo$TrailButton$TrailButtonState("HIGHLIGHTED", 1);
        HIGHLIGHTED = yangoPayPaymentInfo$TrailButton$TrailButtonState2;
        YangoPayPaymentInfo$TrailButton$TrailButtonState[] yangoPayPaymentInfo$TrailButton$TrailButtonStateArr = {yangoPayPaymentInfo$TrailButton$TrailButtonState, yangoPayPaymentInfo$TrailButton$TrailButtonState2};
        $VALUES = yangoPayPaymentInfo$TrailButton$TrailButtonStateArr;
        $ENTRIES = a.a(yangoPayPaymentInfo$TrailButton$TrailButtonStateArr);
    }

    public static YangoPayPaymentInfo$TrailButton$TrailButtonState valueOf(String str) {
        return (YangoPayPaymentInfo$TrailButton$TrailButtonState) Enum.valueOf(YangoPayPaymentInfo$TrailButton$TrailButtonState.class, str);
    }

    public static YangoPayPaymentInfo$TrailButton$TrailButtonState[] values() {
        return (YangoPayPaymentInfo$TrailButton$TrailButtonState[]) $VALUES.clone();
    }
}
