package ru.yandex.taxi.maas.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/maas/api/analytics/MultiTransportErrorAnalytics$ErrorCode", "", "Lru/yandex/taxi/maas/api/analytics/MultiTransportErrorAnalytics$ErrorCode;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NoStations", "Network", "Unknown", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiTransportErrorAnalytics$ErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiTransportErrorAnalytics$ErrorCode[] $VALUES;
    public static final MultiTransportErrorAnalytics$ErrorCode Network;
    public static final MultiTransportErrorAnalytics$ErrorCode NoStations;
    public static final MultiTransportErrorAnalytics$ErrorCode Unknown;
    private final String eventValue;

    static {
        MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode = new MultiTransportErrorAnalytics$ErrorCode("NoStations", 0, "no_stations");
        NoStations = multiTransportErrorAnalytics$ErrorCode;
        MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode2 = new MultiTransportErrorAnalytics$ErrorCode("Network", 1, "network");
        Network = multiTransportErrorAnalytics$ErrorCode2;
        MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode3 = new MultiTransportErrorAnalytics$ErrorCode("Unknown", 2, "unknown");
        Unknown = multiTransportErrorAnalytics$ErrorCode3;
        MultiTransportErrorAnalytics$ErrorCode[] multiTransportErrorAnalytics$ErrorCodeArr = {multiTransportErrorAnalytics$ErrorCode, multiTransportErrorAnalytics$ErrorCode2, multiTransportErrorAnalytics$ErrorCode3};
        $VALUES = multiTransportErrorAnalytics$ErrorCodeArr;
        $ENTRIES = a.a(multiTransportErrorAnalytics$ErrorCodeArr);
    }

    public MultiTransportErrorAnalytics$ErrorCode(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MultiTransportErrorAnalytics$ErrorCode valueOf(String str) {
        return (MultiTransportErrorAnalytics$ErrorCode) Enum.valueOf(MultiTransportErrorAnalytics$ErrorCode.class, str);
    }

    public static MultiTransportErrorAnalytics$ErrorCode[] values() {
        return (MultiTransportErrorAnalytics$ErrorCode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
