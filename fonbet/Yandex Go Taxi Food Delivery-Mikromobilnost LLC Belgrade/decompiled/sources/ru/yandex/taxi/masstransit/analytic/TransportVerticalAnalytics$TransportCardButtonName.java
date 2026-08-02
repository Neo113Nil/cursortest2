package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportVerticalAnalytics$TransportCardButtonName", "", "Lru/yandex/taxi/masstransit/analytic/TransportVerticalAnalytics$TransportCardButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TopUp", "Manage", "AddCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportVerticalAnalytics$TransportCardButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportVerticalAnalytics$TransportCardButtonName[] $VALUES;
    public static final TransportVerticalAnalytics$TransportCardButtonName AddCard;
    public static final TransportVerticalAnalytics$TransportCardButtonName Manage;
    public static final TransportVerticalAnalytics$TransportCardButtonName TopUp;
    private final String eventValue;

    static {
        TransportVerticalAnalytics$TransportCardButtonName transportVerticalAnalytics$TransportCardButtonName = new TransportVerticalAnalytics$TransportCardButtonName("TopUp", 0, "top_up");
        TopUp = transportVerticalAnalytics$TransportCardButtonName;
        TransportVerticalAnalytics$TransportCardButtonName transportVerticalAnalytics$TransportCardButtonName2 = new TransportVerticalAnalytics$TransportCardButtonName("Manage", 1, "manage");
        Manage = transportVerticalAnalytics$TransportCardButtonName2;
        TransportVerticalAnalytics$TransportCardButtonName transportVerticalAnalytics$TransportCardButtonName3 = new TransportVerticalAnalytics$TransportCardButtonName("AddCard", 2, "add_card");
        AddCard = transportVerticalAnalytics$TransportCardButtonName3;
        TransportVerticalAnalytics$TransportCardButtonName[] transportVerticalAnalytics$TransportCardButtonNameArr = {transportVerticalAnalytics$TransportCardButtonName, transportVerticalAnalytics$TransportCardButtonName2, transportVerticalAnalytics$TransportCardButtonName3};
        $VALUES = transportVerticalAnalytics$TransportCardButtonNameArr;
        $ENTRIES = a.a(transportVerticalAnalytics$TransportCardButtonNameArr);
    }

    public TransportVerticalAnalytics$TransportCardButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportVerticalAnalytics$TransportCardButtonName valueOf(String str) {
        return (TransportVerticalAnalytics$TransportCardButtonName) Enum.valueOf(TransportVerticalAnalytics$TransportCardButtonName.class, str);
    }

    public static TransportVerticalAnalytics$TransportCardButtonName[] values() {
        return (TransportVerticalAnalytics$TransportCardButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
