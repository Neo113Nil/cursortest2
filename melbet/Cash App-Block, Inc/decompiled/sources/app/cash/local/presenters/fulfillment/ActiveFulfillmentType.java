package app.cash.local.presenters.fulfillment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ActiveFulfillmentType {
    public static final /* synthetic */ ActiveFulfillmentType[] $VALUES;
    public static final ActiveFulfillmentType DELIVERY;
    public static final ActiveFulfillmentType PICKUP;

    static {
        ActiveFulfillmentType activeFulfillmentType = new ActiveFulfillmentType("PICKUP", 0);
        PICKUP = activeFulfillmentType;
        ActiveFulfillmentType activeFulfillmentType2 = new ActiveFulfillmentType("DELIVERY", 1);
        DELIVERY = activeFulfillmentType2;
        $VALUES = new ActiveFulfillmentType[]{activeFulfillmentType, activeFulfillmentType2};
    }

    public static ActiveFulfillmentType valueOf(String str) {
        return (ActiveFulfillmentType) Enum.valueOf(ActiveFulfillmentType.class, str);
    }

    public static ActiveFulfillmentType[] values() {
        return (ActiveFulfillmentType[]) $VALUES.clone();
    }
}
