package ru.yandex.taxi.delivery.ui.setuprequierements;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/delivery/ui/setuprequierements/DeliverySetupRequirementsAnalytics$CloseReason", "", "Lru/yandex/taxi/delivery/ui/setuprequierements/DeliverySetupRequirementsAnalytics$CloseReason;", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CONFIRM", "TOUCH_OUTSIDE", "BACK", "SLIDE_OUT", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliverySetupRequirementsAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliverySetupRequirementsAnalytics$CloseReason[] $VALUES;
    public static final DeliverySetupRequirementsAnalytics$CloseReason BACK;
    public static final DeliverySetupRequirementsAnalytics$CloseReason CONFIRM;
    public static final DeliverySetupRequirementsAnalytics$CloseReason SLIDE_OUT;
    public static final DeliverySetupRequirementsAnalytics$CloseReason TOUCH_OUTSIDE;
    private final String reason;

    static {
        DeliverySetupRequirementsAnalytics$CloseReason deliverySetupRequirementsAnalytics$CloseReason = new DeliverySetupRequirementsAnalytics$CloseReason("CONFIRM", 0, "confirm");
        CONFIRM = deliverySetupRequirementsAnalytics$CloseReason;
        DeliverySetupRequirementsAnalytics$CloseReason deliverySetupRequirementsAnalytics$CloseReason2 = new DeliverySetupRequirementsAnalytics$CloseReason("TOUCH_OUTSIDE", 1, "touch_outside");
        TOUCH_OUTSIDE = deliverySetupRequirementsAnalytics$CloseReason2;
        DeliverySetupRequirementsAnalytics$CloseReason deliverySetupRequirementsAnalytics$CloseReason3 = new DeliverySetupRequirementsAnalytics$CloseReason("BACK", 2, "android_back_button");
        BACK = deliverySetupRequirementsAnalytics$CloseReason3;
        DeliverySetupRequirementsAnalytics$CloseReason deliverySetupRequirementsAnalytics$CloseReason4 = new DeliverySetupRequirementsAnalytics$CloseReason("SLIDE_OUT", 3, "roll_off");
        SLIDE_OUT = deliverySetupRequirementsAnalytics$CloseReason4;
        DeliverySetupRequirementsAnalytics$CloseReason[] deliverySetupRequirementsAnalytics$CloseReasonArr = {deliverySetupRequirementsAnalytics$CloseReason, deliverySetupRequirementsAnalytics$CloseReason2, deliverySetupRequirementsAnalytics$CloseReason3, deliverySetupRequirementsAnalytics$CloseReason4};
        $VALUES = deliverySetupRequirementsAnalytics$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(deliverySetupRequirementsAnalytics$CloseReasonArr);
    }

    public DeliverySetupRequirementsAnalytics$CloseReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static DeliverySetupRequirementsAnalytics$CloseReason valueOf(String str) {
        return (DeliverySetupRequirementsAnalytics$CloseReason) Enum.valueOf(DeliverySetupRequirementsAnalytics$CloseReason.class, str);
    }

    public static DeliverySetupRequirementsAnalytics$CloseReason[] values() {
        return (DeliverySetupRequirementsAnalytics$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
