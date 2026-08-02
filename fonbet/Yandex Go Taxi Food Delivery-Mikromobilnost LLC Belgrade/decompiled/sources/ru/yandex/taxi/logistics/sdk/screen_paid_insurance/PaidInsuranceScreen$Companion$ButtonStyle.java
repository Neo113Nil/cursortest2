package ru.yandex.taxi.logistics.sdk.screen_paid_insurance;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/logistics/sdk/screen_paid_insurance/PaidInsuranceScreen$Companion$ButtonStyle", "", "Lru/yandex/taxi/logistics/sdk/screen_paid_insurance/PaidInsuranceScreen$Companion$ButtonStyle;", "MAIN", "MINOR", "sdk-delivery-screen-paid-insurance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaidInsuranceScreen$Companion$ButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaidInsuranceScreen$Companion$ButtonStyle[] $VALUES;
    public static final PaidInsuranceScreen$Companion$ButtonStyle MAIN;
    public static final PaidInsuranceScreen$Companion$ButtonStyle MINOR;

    static {
        PaidInsuranceScreen$Companion$ButtonStyle paidInsuranceScreen$Companion$ButtonStyle = new PaidInsuranceScreen$Companion$ButtonStyle("MAIN", 0);
        MAIN = paidInsuranceScreen$Companion$ButtonStyle;
        PaidInsuranceScreen$Companion$ButtonStyle paidInsuranceScreen$Companion$ButtonStyle2 = new PaidInsuranceScreen$Companion$ButtonStyle("MINOR", 1);
        MINOR = paidInsuranceScreen$Companion$ButtonStyle2;
        PaidInsuranceScreen$Companion$ButtonStyle[] paidInsuranceScreen$Companion$ButtonStyleArr = {paidInsuranceScreen$Companion$ButtonStyle, paidInsuranceScreen$Companion$ButtonStyle2};
        $VALUES = paidInsuranceScreen$Companion$ButtonStyleArr;
        $ENTRIES = a.a(paidInsuranceScreen$Companion$ButtonStyleArr);
    }

    public static PaidInsuranceScreen$Companion$ButtonStyle valueOf(String str) {
        return (PaidInsuranceScreen$Companion$ButtonStyle) Enum.valueOf(PaidInsuranceScreen$Companion$ButtonStyle.class, str);
    }

    public static PaidInsuranceScreen$Companion$ButtonStyle[] values() {
        return (PaidInsuranceScreen$Companion$ButtonStyle[]) $VALUES.clone();
    }
}
