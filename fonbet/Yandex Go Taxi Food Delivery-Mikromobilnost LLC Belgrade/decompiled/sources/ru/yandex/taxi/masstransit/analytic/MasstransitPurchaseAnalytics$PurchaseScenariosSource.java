package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPurchaseAnalytics$PurchaseScenariosSource", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPurchaseAnalytics$PurchaseScenariosSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DetailCard", "Variants", "RouteCard", "StopCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPurchaseAnalytics$PurchaseScenariosSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPurchaseAnalytics$PurchaseScenariosSource[] $VALUES;
    public static final MasstransitPurchaseAnalytics$PurchaseScenariosSource DetailCard;
    public static final MasstransitPurchaseAnalytics$PurchaseScenariosSource RouteCard;
    public static final MasstransitPurchaseAnalytics$PurchaseScenariosSource StopCard;
    public static final MasstransitPurchaseAnalytics$PurchaseScenariosSource Variants;
    private final String eventValue;

    static {
        MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource = new MasstransitPurchaseAnalytics$PurchaseScenariosSource("DetailCard", 0, "detail_card");
        DetailCard = masstransitPurchaseAnalytics$PurchaseScenariosSource;
        MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource2 = new MasstransitPurchaseAnalytics$PurchaseScenariosSource("Variants", 1, "variants");
        Variants = masstransitPurchaseAnalytics$PurchaseScenariosSource2;
        MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource3 = new MasstransitPurchaseAnalytics$PurchaseScenariosSource("RouteCard", 2, "route_card");
        RouteCard = masstransitPurchaseAnalytics$PurchaseScenariosSource3;
        MasstransitPurchaseAnalytics$PurchaseScenariosSource masstransitPurchaseAnalytics$PurchaseScenariosSource4 = new MasstransitPurchaseAnalytics$PurchaseScenariosSource("StopCard", 3, "stop_card");
        StopCard = masstransitPurchaseAnalytics$PurchaseScenariosSource4;
        MasstransitPurchaseAnalytics$PurchaseScenariosSource[] masstransitPurchaseAnalytics$PurchaseScenariosSourceArr = {masstransitPurchaseAnalytics$PurchaseScenariosSource, masstransitPurchaseAnalytics$PurchaseScenariosSource2, masstransitPurchaseAnalytics$PurchaseScenariosSource3, masstransitPurchaseAnalytics$PurchaseScenariosSource4};
        $VALUES = masstransitPurchaseAnalytics$PurchaseScenariosSourceArr;
        $ENTRIES = a.a(masstransitPurchaseAnalytics$PurchaseScenariosSourceArr);
    }

    public MasstransitPurchaseAnalytics$PurchaseScenariosSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPurchaseAnalytics$PurchaseScenariosSource valueOf(String str) {
        return (MasstransitPurchaseAnalytics$PurchaseScenariosSource) Enum.valueOf(MasstransitPurchaseAnalytics$PurchaseScenariosSource.class, str);
    }

    public static MasstransitPurchaseAnalytics$PurchaseScenariosSource[] values() {
        return (MasstransitPurchaseAnalytics$PurchaseScenariosSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
