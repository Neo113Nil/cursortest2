package ru.yandex.taxi.scooters.presentation.route_navigation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/scooters/presentation/route_navigation/ScootersRouteNavigationAnalytics$Button", "", "Lru/yandex/taxi/scooters/presentation/route_navigation/ScootersRouteNavigationAnalytics$Button;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CLOSE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRouteNavigationAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersRouteNavigationAnalytics$Button[] $VALUES;
    public static final ScootersRouteNavigationAnalytics$Button CLOSE;
    private final String buttonName = "close";

    static {
        ScootersRouteNavigationAnalytics$Button scootersRouteNavigationAnalytics$Button = new ScootersRouteNavigationAnalytics$Button();
        CLOSE = scootersRouteNavigationAnalytics$Button;
        ScootersRouteNavigationAnalytics$Button[] scootersRouteNavigationAnalytics$ButtonArr = {scootersRouteNavigationAnalytics$Button};
        $VALUES = scootersRouteNavigationAnalytics$ButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersRouteNavigationAnalytics$ButtonArr);
    }

    public static ScootersRouteNavigationAnalytics$Button valueOf(String str) {
        return (ScootersRouteNavigationAnalytics$Button) Enum.valueOf(ScootersRouteNavigationAnalytics$Button.class, str);
    }

    public static ScootersRouteNavigationAnalytics$Button[] values() {
        return (ScootersRouteNavigationAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
