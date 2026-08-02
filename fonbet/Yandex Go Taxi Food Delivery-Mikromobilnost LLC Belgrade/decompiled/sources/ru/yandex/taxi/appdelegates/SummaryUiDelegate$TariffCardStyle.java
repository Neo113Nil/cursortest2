package ru.yandex.taxi.appdelegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/appdelegates/SummaryUiDelegate$TariffCardStyle", "", "Lru/yandex/taxi/appdelegates/SummaryUiDelegate$TariffCardStyle;", "WIDE", "HIGH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SummaryUiDelegate$TariffCardStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryUiDelegate$TariffCardStyle[] $VALUES;
    public static final SummaryUiDelegate$TariffCardStyle HIGH;
    public static final SummaryUiDelegate$TariffCardStyle WIDE;

    static {
        SummaryUiDelegate$TariffCardStyle summaryUiDelegate$TariffCardStyle = new SummaryUiDelegate$TariffCardStyle("WIDE", 0);
        WIDE = summaryUiDelegate$TariffCardStyle;
        SummaryUiDelegate$TariffCardStyle summaryUiDelegate$TariffCardStyle2 = new SummaryUiDelegate$TariffCardStyle("HIGH", 1);
        HIGH = summaryUiDelegate$TariffCardStyle2;
        SummaryUiDelegate$TariffCardStyle[] summaryUiDelegate$TariffCardStyleArr = {summaryUiDelegate$TariffCardStyle, summaryUiDelegate$TariffCardStyle2};
        $VALUES = summaryUiDelegate$TariffCardStyleArr;
        $ENTRIES = a.a(summaryUiDelegate$TariffCardStyleArr);
    }

    public static SummaryUiDelegate$TariffCardStyle valueOf(String str) {
        return (SummaryUiDelegate$TariffCardStyle) Enum.valueOf(SummaryUiDelegate$TariffCardStyle.class, str);
    }

    public static SummaryUiDelegate$TariffCardStyle[] values() {
        return (SummaryUiDelegate$TariffCardStyle[]) $VALUES.clone();
    }
}
