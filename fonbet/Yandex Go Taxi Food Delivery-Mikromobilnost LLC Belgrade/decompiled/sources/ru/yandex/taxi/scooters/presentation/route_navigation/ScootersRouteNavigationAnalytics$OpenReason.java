package ru.yandex.taxi.scooters.presentation.route_navigation;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/scooters/presentation/route_navigation/ScootersRouteNavigationAnalytics$OpenReason", "", "Lru/yandex/taxi/scooters/presentation/route_navigation/ScootersRouteNavigationAnalytics$OpenReason;", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ARBITRARY", "TARIFF_FIX", "MULTI_MODAL", "NEAREST_PARKING", "SELECT_ON_MAP", "PARKING_PANORAMA", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRouteNavigationAnalytics$OpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersRouteNavigationAnalytics$OpenReason[] $VALUES;
    public static final ScootersRouteNavigationAnalytics$OpenReason ARBITRARY;
    public static final ScootersRouteNavigationAnalytics$OpenReason MULTI_MODAL;
    public static final ScootersRouteNavigationAnalytics$OpenReason NEAREST_PARKING;
    public static final ScootersRouteNavigationAnalytics$OpenReason PARKING_PANORAMA;
    public static final ScootersRouteNavigationAnalytics$OpenReason SELECT_ON_MAP;
    public static final ScootersRouteNavigationAnalytics$OpenReason TARIFF_FIX;
    private final String reason;

    static {
        ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason = new ScootersRouteNavigationAnalytics$OpenReason("ARBITRARY", 0, "arbitrary");
        ARBITRARY = scootersRouteNavigationAnalytics$OpenReason;
        ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason2 = new ScootersRouteNavigationAnalytics$OpenReason("TARIFF_FIX", 1, "tariff_fix");
        TARIFF_FIX = scootersRouteNavigationAnalytics$OpenReason2;
        ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason3 = new ScootersRouteNavigationAnalytics$OpenReason("MULTI_MODAL", 2, "multi_modal");
        MULTI_MODAL = scootersRouteNavigationAnalytics$OpenReason3;
        ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason4 = new ScootersRouteNavigationAnalytics$OpenReason("NEAREST_PARKING", 3, "nearest_parking");
        NEAREST_PARKING = scootersRouteNavigationAnalytics$OpenReason4;
        ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason5 = new ScootersRouteNavigationAnalytics$OpenReason("SELECT_ON_MAP", 4, "select_on_map");
        SELECT_ON_MAP = scootersRouteNavigationAnalytics$OpenReason5;
        ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason6 = new ScootersRouteNavigationAnalytics$OpenReason("PARKING_PANORAMA", 5, "parking_panorama");
        PARKING_PANORAMA = scootersRouteNavigationAnalytics$OpenReason6;
        ScootersRouteNavigationAnalytics$OpenReason[] scootersRouteNavigationAnalytics$OpenReasonArr = {scootersRouteNavigationAnalytics$OpenReason, scootersRouteNavigationAnalytics$OpenReason2, scootersRouteNavigationAnalytics$OpenReason3, scootersRouteNavigationAnalytics$OpenReason4, scootersRouteNavigationAnalytics$OpenReason5, scootersRouteNavigationAnalytics$OpenReason6};
        $VALUES = scootersRouteNavigationAnalytics$OpenReasonArr;
        $ENTRIES = kotlin.enums.a.a(scootersRouteNavigationAnalytics$OpenReasonArr);
    }

    public ScootersRouteNavigationAnalytics$OpenReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static ScootersRouteNavigationAnalytics$OpenReason valueOf(String str) {
        return (ScootersRouteNavigationAnalytics$OpenReason) Enum.valueOf(ScootersRouteNavigationAnalytics$OpenReason.class, str);
    }

    public static ScootersRouteNavigationAnalytics$OpenReason[] values() {
        return (ScootersRouteNavigationAnalytics$OpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
