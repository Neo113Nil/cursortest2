package ru.yandex.logistics.care.web_view.impl.js;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/care/web_view/impl/js/TaxiAppJsCallback$ErrorType", "", "Lru/yandex/logistics/care/web_view/impl/js/TaxiAppJsCallback$ErrorType;", "Config", "General", "sdk-care"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaxiAppJsCallback$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiAppJsCallback$ErrorType[] $VALUES;
    public static final TaxiAppJsCallback$ErrorType Config;
    public static final TaxiAppJsCallback$ErrorType General;

    static {
        TaxiAppJsCallback$ErrorType taxiAppJsCallback$ErrorType = new TaxiAppJsCallback$ErrorType("Config", 0);
        Config = taxiAppJsCallback$ErrorType;
        TaxiAppJsCallback$ErrorType taxiAppJsCallback$ErrorType2 = new TaxiAppJsCallback$ErrorType("General", 1);
        General = taxiAppJsCallback$ErrorType2;
        TaxiAppJsCallback$ErrorType[] taxiAppJsCallback$ErrorTypeArr = {taxiAppJsCallback$ErrorType, taxiAppJsCallback$ErrorType2};
        $VALUES = taxiAppJsCallback$ErrorTypeArr;
        $ENTRIES = a.a(taxiAppJsCallback$ErrorTypeArr);
    }

    public static TaxiAppJsCallback$ErrorType valueOf(String str) {
        return (TaxiAppJsCallback$ErrorType) Enum.valueOf(TaxiAppJsCallback$ErrorType.class, str);
    }

    public static TaxiAppJsCallback$ErrorType[] values() {
        return (TaxiAppJsCallback$ErrorType[]) $VALUES.clone();
    }
}
