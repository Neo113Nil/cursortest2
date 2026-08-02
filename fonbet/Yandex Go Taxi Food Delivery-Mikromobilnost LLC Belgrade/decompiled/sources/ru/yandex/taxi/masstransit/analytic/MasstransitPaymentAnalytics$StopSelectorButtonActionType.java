package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$StopSelectorButtonActionType", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$StopSelectorButtonActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Stop", "Back", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentAnalytics$StopSelectorButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$StopSelectorButtonActionType[] $VALUES;
    public static final MasstransitPaymentAnalytics$StopSelectorButtonActionType Back;
    public static final MasstransitPaymentAnalytics$StopSelectorButtonActionType Other;
    public static final MasstransitPaymentAnalytics$StopSelectorButtonActionType Stop;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$StopSelectorButtonActionType masstransitPaymentAnalytics$StopSelectorButtonActionType = new MasstransitPaymentAnalytics$StopSelectorButtonActionType("Stop", 0, "stop");
        Stop = masstransitPaymentAnalytics$StopSelectorButtonActionType;
        MasstransitPaymentAnalytics$StopSelectorButtonActionType masstransitPaymentAnalytics$StopSelectorButtonActionType2 = new MasstransitPaymentAnalytics$StopSelectorButtonActionType("Back", 1, "back");
        Back = masstransitPaymentAnalytics$StopSelectorButtonActionType2;
        MasstransitPaymentAnalytics$StopSelectorButtonActionType masstransitPaymentAnalytics$StopSelectorButtonActionType3 = new MasstransitPaymentAnalytics$StopSelectorButtonActionType("Other", 2, "other");
        Other = masstransitPaymentAnalytics$StopSelectorButtonActionType3;
        MasstransitPaymentAnalytics$StopSelectorButtonActionType[] masstransitPaymentAnalytics$StopSelectorButtonActionTypeArr = {masstransitPaymentAnalytics$StopSelectorButtonActionType, masstransitPaymentAnalytics$StopSelectorButtonActionType2, masstransitPaymentAnalytics$StopSelectorButtonActionType3};
        $VALUES = masstransitPaymentAnalytics$StopSelectorButtonActionTypeArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$StopSelectorButtonActionTypeArr);
    }

    public MasstransitPaymentAnalytics$StopSelectorButtonActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$StopSelectorButtonActionType valueOf(String str) {
        return (MasstransitPaymentAnalytics$StopSelectorButtonActionType) Enum.valueOf(MasstransitPaymentAnalytics$StopSelectorButtonActionType.class, str);
    }

    public static MasstransitPaymentAnalytics$StopSelectorButtonActionType[] values() {
        return (MasstransitPaymentAnalytics$StopSelectorButtonActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
