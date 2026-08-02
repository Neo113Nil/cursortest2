package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleAnalytics$CloseReason", "", "Lru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleAnalytics$CloseReason;", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BUTTON", "MAP_MOVE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersShowNavigationBubbleAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersShowNavigationBubbleAnalytics$CloseReason[] $VALUES;
    public static final ScootersShowNavigationBubbleAnalytics$CloseReason BUTTON;
    public static final ScootersShowNavigationBubbleAnalytics$CloseReason MAP_MOVE;
    private final String reason;

    static {
        ScootersShowNavigationBubbleAnalytics$CloseReason scootersShowNavigationBubbleAnalytics$CloseReason = new ScootersShowNavigationBubbleAnalytics$CloseReason("BUTTON", 0, "button");
        BUTTON = scootersShowNavigationBubbleAnalytics$CloseReason;
        ScootersShowNavigationBubbleAnalytics$CloseReason scootersShowNavigationBubbleAnalytics$CloseReason2 = new ScootersShowNavigationBubbleAnalytics$CloseReason("MAP_MOVE", 1, "map_move");
        MAP_MOVE = scootersShowNavigationBubbleAnalytics$CloseReason2;
        ScootersShowNavigationBubbleAnalytics$CloseReason[] scootersShowNavigationBubbleAnalytics$CloseReasonArr = {scootersShowNavigationBubbleAnalytics$CloseReason, scootersShowNavigationBubbleAnalytics$CloseReason2};
        $VALUES = scootersShowNavigationBubbleAnalytics$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(scootersShowNavigationBubbleAnalytics$CloseReasonArr);
    }

    public ScootersShowNavigationBubbleAnalytics$CloseReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static ScootersShowNavigationBubbleAnalytics$CloseReason valueOf(String str) {
        return (ScootersShowNavigationBubbleAnalytics$CloseReason) Enum.valueOf(ScootersShowNavigationBubbleAnalytics$CloseReason.class, str);
    }

    public static ScootersShowNavigationBubbleAnalytics$CloseReason[] values() {
        return (ScootersShowNavigationBubbleAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
