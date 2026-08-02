package ru.yandex.taxi.routeselector.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/routeselector/analytics/RouteSelectorOpenReason;", "", "", "alias", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PIN", "ADDRESS", "OTHER", "SUMMARY", "ADJUSTMENT", "go-client-android.features.routeselector:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteSelectorOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteSelectorOpenReason[] $VALUES;
    public static final RouteSelectorOpenReason ADDRESS;
    public static final RouteSelectorOpenReason ADJUSTMENT;
    public static final RouteSelectorOpenReason OTHER;
    public static final RouteSelectorOpenReason PIN;
    public static final RouteSelectorOpenReason SUMMARY;
    private final String alias;

    static {
        RouteSelectorOpenReason routeSelectorOpenReason = new RouteSelectorOpenReason("PIN", 0, "pin");
        PIN = routeSelectorOpenReason;
        RouteSelectorOpenReason routeSelectorOpenReason2 = new RouteSelectorOpenReason("ADDRESS", 1, "address");
        ADDRESS = routeSelectorOpenReason2;
        RouteSelectorOpenReason routeSelectorOpenReason3 = new RouteSelectorOpenReason("OTHER", 2, "other");
        OTHER = routeSelectorOpenReason3;
        RouteSelectorOpenReason routeSelectorOpenReason4 = new RouteSelectorOpenReason("SUMMARY", 3, "address");
        SUMMARY = routeSelectorOpenReason4;
        RouteSelectorOpenReason routeSelectorOpenReason5 = new RouteSelectorOpenReason("ADJUSTMENT", 4, "adjustment");
        ADJUSTMENT = routeSelectorOpenReason5;
        RouteSelectorOpenReason[] routeSelectorOpenReasonArr = {routeSelectorOpenReason, routeSelectorOpenReason2, routeSelectorOpenReason3, routeSelectorOpenReason4, routeSelectorOpenReason5};
        $VALUES = routeSelectorOpenReasonArr;
        $ENTRIES = a.a(routeSelectorOpenReasonArr);
    }

    public RouteSelectorOpenReason(String str, int i, String str2) {
        this.alias = str2;
    }

    public static RouteSelectorOpenReason valueOf(String str) {
        return (RouteSelectorOpenReason) Enum.valueOf(RouteSelectorOpenReason.class, str);
    }

    public static RouteSelectorOpenReason[] values() {
        return (RouteSelectorOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }
}
