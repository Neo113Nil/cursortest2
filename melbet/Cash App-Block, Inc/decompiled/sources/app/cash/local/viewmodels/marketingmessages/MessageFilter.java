package app.cash.local.viewmodels.marketingmessages;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MessageFilter {
    public static final /* synthetic */ MessageFilter[] $VALUES;
    public static final MessageFilter ALL;
    public static final MessageFilter COUPONS;

    static {
        MessageFilter messageFilter = new MessageFilter("ALL", 0);
        ALL = messageFilter;
        MessageFilter messageFilter2 = new MessageFilter("COUPONS", 1);
        COUPONS = messageFilter2;
        $VALUES = new MessageFilter[]{messageFilter, messageFilter2};
    }

    public static MessageFilter valueOf(String str) {
        return (MessageFilter) Enum.valueOf(MessageFilter.class, str);
    }

    public static MessageFilter[] values() {
        return (MessageFilter[]) $VALUES.clone();
    }
}
