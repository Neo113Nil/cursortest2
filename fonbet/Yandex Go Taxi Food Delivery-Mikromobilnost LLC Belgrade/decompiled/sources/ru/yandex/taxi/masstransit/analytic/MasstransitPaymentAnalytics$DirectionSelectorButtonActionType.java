package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$DirectionSelectorButtonActionType", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$DirectionSelectorButtonActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Direction", "Back", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentAnalytics$DirectionSelectorButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$DirectionSelectorButtonActionType[] $VALUES;
    public static final MasstransitPaymentAnalytics$DirectionSelectorButtonActionType Back;
    public static final MasstransitPaymentAnalytics$DirectionSelectorButtonActionType Direction;
    public static final MasstransitPaymentAnalytics$DirectionSelectorButtonActionType Other;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$DirectionSelectorButtonActionType masstransitPaymentAnalytics$DirectionSelectorButtonActionType = new MasstransitPaymentAnalytics$DirectionSelectorButtonActionType("Direction", 0, "direction");
        Direction = masstransitPaymentAnalytics$DirectionSelectorButtonActionType;
        MasstransitPaymentAnalytics$DirectionSelectorButtonActionType masstransitPaymentAnalytics$DirectionSelectorButtonActionType2 = new MasstransitPaymentAnalytics$DirectionSelectorButtonActionType("Back", 1, "back");
        Back = masstransitPaymentAnalytics$DirectionSelectorButtonActionType2;
        MasstransitPaymentAnalytics$DirectionSelectorButtonActionType masstransitPaymentAnalytics$DirectionSelectorButtonActionType3 = new MasstransitPaymentAnalytics$DirectionSelectorButtonActionType("Other", 2, "other");
        Other = masstransitPaymentAnalytics$DirectionSelectorButtonActionType3;
        MasstransitPaymentAnalytics$DirectionSelectorButtonActionType[] masstransitPaymentAnalytics$DirectionSelectorButtonActionTypeArr = {masstransitPaymentAnalytics$DirectionSelectorButtonActionType, masstransitPaymentAnalytics$DirectionSelectorButtonActionType2, masstransitPaymentAnalytics$DirectionSelectorButtonActionType3};
        $VALUES = masstransitPaymentAnalytics$DirectionSelectorButtonActionTypeArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$DirectionSelectorButtonActionTypeArr);
    }

    public MasstransitPaymentAnalytics$DirectionSelectorButtonActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$DirectionSelectorButtonActionType valueOf(String str) {
        return (MasstransitPaymentAnalytics$DirectionSelectorButtonActionType) Enum.valueOf(MasstransitPaymentAnalytics$DirectionSelectorButtonActionType.class, str);
    }

    public static MasstransitPaymentAnalytics$DirectionSelectorButtonActionType[] values() {
        return (MasstransitPaymentAnalytics$DirectionSelectorButtonActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
