package app.cash.local.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class BuyerIntentType {
    public static final /* synthetic */ BuyerIntentType[] $VALUES;
    public static final BuyerIntentType IN_STORE_ORDERING;
    public static final BuyerIntentType REMOTE_ORDERING;

    static {
        BuyerIntentType buyerIntentType = new BuyerIntentType("REMOTE_ORDERING", 0);
        REMOTE_ORDERING = buyerIntentType;
        BuyerIntentType buyerIntentType2 = new BuyerIntentType("IN_STORE_ORDERING", 1);
        IN_STORE_ORDERING = buyerIntentType2;
        $VALUES = new BuyerIntentType[]{buyerIntentType, buyerIntentType2};
    }

    public static BuyerIntentType valueOf(String str) {
        return (BuyerIntentType) Enum.valueOf(BuyerIntentType.class, str);
    }

    public static BuyerIntentType[] values() {
        return (BuyerIntentType[]) $VALUES.clone();
    }
}
