package ru.yandex.taxi.routeselector.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/routeselector/analytics/RouteSelectorAnalytics$Button", "", "Lru/yandex/taxi/routeselector/analytics/RouteSelectorAnalytics$Button;", "", "alias", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DONE", "SUGGEST", "ENTRANCE", "BACK", "GEO", "go-client-android.features.routeselector:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteSelectorAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteSelectorAnalytics$Button[] $VALUES;
    public static final RouteSelectorAnalytics$Button BACK;
    public static final RouteSelectorAnalytics$Button DONE;
    public static final RouteSelectorAnalytics$Button ENTRANCE;
    public static final RouteSelectorAnalytics$Button GEO;
    public static final RouteSelectorAnalytics$Button SUGGEST;
    private final String alias;

    static {
        RouteSelectorAnalytics$Button routeSelectorAnalytics$Button = new RouteSelectorAnalytics$Button("DONE", 0, "done");
        DONE = routeSelectorAnalytics$Button;
        RouteSelectorAnalytics$Button routeSelectorAnalytics$Button2 = new RouteSelectorAnalytics$Button("SUGGEST", 1, "suggest");
        SUGGEST = routeSelectorAnalytics$Button2;
        RouteSelectorAnalytics$Button routeSelectorAnalytics$Button3 = new RouteSelectorAnalytics$Button("ENTRANCE", 2, "entrance");
        ENTRANCE = routeSelectorAnalytics$Button3;
        RouteSelectorAnalytics$Button routeSelectorAnalytics$Button4 = new RouteSelectorAnalytics$Button("BACK", 3, "back");
        BACK = routeSelectorAnalytics$Button4;
        RouteSelectorAnalytics$Button routeSelectorAnalytics$Button5 = new RouteSelectorAnalytics$Button("GEO", 4, "geo");
        GEO = routeSelectorAnalytics$Button5;
        RouteSelectorAnalytics$Button[] routeSelectorAnalytics$ButtonArr = {routeSelectorAnalytics$Button, routeSelectorAnalytics$Button2, routeSelectorAnalytics$Button3, routeSelectorAnalytics$Button4, routeSelectorAnalytics$Button5};
        $VALUES = routeSelectorAnalytics$ButtonArr;
        $ENTRIES = a.a(routeSelectorAnalytics$ButtonArr);
    }

    public RouteSelectorAnalytics$Button(String str, int i, String str2) {
        this.alias = str2;
    }

    public static RouteSelectorAnalytics$Button valueOf(String str) {
        return (RouteSelectorAnalytics$Button) Enum.valueOf(RouteSelectorAnalytics$Button.class, str);
    }

    public static RouteSelectorAnalytics$Button[] values() {
        return (RouteSelectorAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }
}
