package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$TransportMainScreenType", "", "Lru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$TransportMainScreenType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Native", "Flex", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportMainAnalytics$TransportMainScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportMainAnalytics$TransportMainScreenType[] $VALUES;
    public static final TransportMainAnalytics$TransportMainScreenType Flex;
    public static final TransportMainAnalytics$TransportMainScreenType Native;
    private final String eventValue;

    static {
        TransportMainAnalytics$TransportMainScreenType transportMainAnalytics$TransportMainScreenType = new TransportMainAnalytics$TransportMainScreenType("Native", 0, "native");
        Native = transportMainAnalytics$TransportMainScreenType;
        TransportMainAnalytics$TransportMainScreenType transportMainAnalytics$TransportMainScreenType2 = new TransportMainAnalytics$TransportMainScreenType("Flex", 1, "flex");
        Flex = transportMainAnalytics$TransportMainScreenType2;
        TransportMainAnalytics$TransportMainScreenType[] transportMainAnalytics$TransportMainScreenTypeArr = {transportMainAnalytics$TransportMainScreenType, transportMainAnalytics$TransportMainScreenType2};
        $VALUES = transportMainAnalytics$TransportMainScreenTypeArr;
        $ENTRIES = a.a(transportMainAnalytics$TransportMainScreenTypeArr);
    }

    public TransportMainAnalytics$TransportMainScreenType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportMainAnalytics$TransportMainScreenType valueOf(String str) {
        return (TransportMainAnalytics$TransportMainScreenType) Enum.valueOf(TransportMainAnalytics$TransportMainScreenType.class, str);
    }

    public static TransportMainAnalytics$TransportMainScreenType[] values() {
        return (TransportMainAnalytics$TransportMainScreenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
