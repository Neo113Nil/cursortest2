package app.cash.local.presenters.brand.checkout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OpenTabCheckoutRouting {
    public static final /* synthetic */ OpenTabCheckoutRouting[] $VALUES;
    public static final OpenTabCheckoutRouting CLOSE_OPEN_TAB;
    public static final OpenTabCheckoutRouting OPEN_TAB_WHEN_AVAILABLE;

    static {
        OpenTabCheckoutRouting openTabCheckoutRouting = new OpenTabCheckoutRouting("OPEN_TAB_WHEN_AVAILABLE", 0);
        OPEN_TAB_WHEN_AVAILABLE = openTabCheckoutRouting;
        OpenTabCheckoutRouting openTabCheckoutRouting2 = new OpenTabCheckoutRouting("CLOSE_OPEN_TAB", 1);
        CLOSE_OPEN_TAB = openTabCheckoutRouting2;
        $VALUES = new OpenTabCheckoutRouting[]{openTabCheckoutRouting, openTabCheckoutRouting2};
    }

    public static OpenTabCheckoutRouting valueOf(String str) {
        return (OpenTabCheckoutRouting) Enum.valueOf(OpenTabCheckoutRouting.class, str);
    }

    public static OpenTabCheckoutRouting[] values() {
        return (OpenTabCheckoutRouting[]) $VALUES.clone();
    }
}
