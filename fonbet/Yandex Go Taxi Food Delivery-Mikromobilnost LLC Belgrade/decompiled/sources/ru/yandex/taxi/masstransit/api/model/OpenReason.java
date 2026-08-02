package ru.yandex.taxi.masstransit.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/masstransit/api/model/OpenReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "REASON_MAP", "REASON_SUPER_APP_DISCOVERY_MAP", "ROUTE_CARD", "STOP_CARD", "STOP_BUBBLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpenReason[] $VALUES;
    public static final OpenReason REASON_MAP;
    public static final OpenReason REASON_SUPER_APP_DISCOVERY_MAP;
    public static final OpenReason ROUTE_CARD;
    public static final OpenReason STOP_BUBBLE;
    public static final OpenReason STOP_CARD;
    private final String analyticsName;

    static {
        OpenReason openReason = new OpenReason("REASON_MAP", 0, PolicyMappingsExtension.MAP);
        REASON_MAP = openReason;
        OpenReason openReason2 = new OpenReason("REASON_SUPER_APP_DISCOVERY_MAP", 1, "superapp_discovery_map");
        REASON_SUPER_APP_DISCOVERY_MAP = openReason2;
        OpenReason openReason3 = new OpenReason("ROUTE_CARD", 2, "route_card");
        ROUTE_CARD = openReason3;
        OpenReason openReason4 = new OpenReason("STOP_CARD", 3, "stop_card");
        STOP_CARD = openReason4;
        OpenReason openReason5 = new OpenReason("STOP_BUBBLE", 4, "stop_bubble");
        STOP_BUBBLE = openReason5;
        OpenReason[] openReasonArr = {openReason, openReason2, openReason3, openReason4, openReason5};
        $VALUES = openReasonArr;
        $ENTRIES = a.a(openReasonArr);
    }

    public OpenReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static OpenReason valueOf(String str) {
        return (OpenReason) Enum.valueOf(OpenReason.class, str);
    }

    public static OpenReason[] values() {
        return (OpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
