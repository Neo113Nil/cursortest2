package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/analytics/RoutesAnalytics$Screen", "", "Lru/yandex/taxi/analytics/RoutesAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Summary", "EditSourcePoint", "EditDestinationPoint", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoutesAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoutesAnalytics$Screen[] $VALUES;
    public static final RoutesAnalytics$Screen EditDestinationPoint;
    public static final RoutesAnalytics$Screen EditSourcePoint;
    public static final RoutesAnalytics$Screen Summary;
    private final String eventValue;

    static {
        RoutesAnalytics$Screen routesAnalytics$Screen = new RoutesAnalytics$Screen("Summary", 0, "summary");
        Summary = routesAnalytics$Screen;
        RoutesAnalytics$Screen routesAnalytics$Screen2 = new RoutesAnalytics$Screen("EditSourcePoint", 1, "edit_source_point");
        EditSourcePoint = routesAnalytics$Screen2;
        RoutesAnalytics$Screen routesAnalytics$Screen3 = new RoutesAnalytics$Screen("EditDestinationPoint", 2, "edit_destination_point");
        EditDestinationPoint = routesAnalytics$Screen3;
        RoutesAnalytics$Screen[] routesAnalytics$ScreenArr = {routesAnalytics$Screen, routesAnalytics$Screen2, routesAnalytics$Screen3};
        $VALUES = routesAnalytics$ScreenArr;
        $ENTRIES = a.a(routesAnalytics$ScreenArr);
    }

    public RoutesAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static RoutesAnalytics$Screen valueOf(String str) {
        return (RoutesAnalytics$Screen) Enum.valueOf(RoutesAnalytics$Screen.class, str);
    }

    public static RoutesAnalytics$Screen[] values() {
        return (RoutesAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
