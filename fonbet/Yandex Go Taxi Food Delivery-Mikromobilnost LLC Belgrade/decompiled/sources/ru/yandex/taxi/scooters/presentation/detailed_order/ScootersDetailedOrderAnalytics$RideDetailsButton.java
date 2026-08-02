package ru.yandex.taxi.scooters.presentation.detailed_order;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/scooters/presentation/detailed_order/ScootersDetailedOrderAnalytics$RideDetailsButton", "", "Lru/yandex/taxi/scooters/presentation/detailed_order/ScootersDetailedOrderAnalytics$RideDetailsButton;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACK", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDetailedOrderAnalytics$RideDetailsButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDetailedOrderAnalytics$RideDetailsButton[] $VALUES;
    public static final ScootersDetailedOrderAnalytics$RideDetailsButton BACK;
    private final String buttonName = "back";

    static {
        ScootersDetailedOrderAnalytics$RideDetailsButton scootersDetailedOrderAnalytics$RideDetailsButton = new ScootersDetailedOrderAnalytics$RideDetailsButton();
        BACK = scootersDetailedOrderAnalytics$RideDetailsButton;
        ScootersDetailedOrderAnalytics$RideDetailsButton[] scootersDetailedOrderAnalytics$RideDetailsButtonArr = {scootersDetailedOrderAnalytics$RideDetailsButton};
        $VALUES = scootersDetailedOrderAnalytics$RideDetailsButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersDetailedOrderAnalytics$RideDetailsButtonArr);
    }

    public static ScootersDetailedOrderAnalytics$RideDetailsButton valueOf(String str) {
        return (ScootersDetailedOrderAnalytics$RideDetailsButton) Enum.valueOf(ScootersDetailedOrderAnalytics$RideDetailsButton.class, str);
    }

    public static ScootersDetailedOrderAnalytics$RideDetailsButton[] values() {
        return (ScootersDetailedOrderAnalytics$RideDetailsButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
