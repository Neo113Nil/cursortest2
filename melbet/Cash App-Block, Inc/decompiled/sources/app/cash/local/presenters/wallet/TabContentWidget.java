package app.cash.local.presenters.wallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TabContentWidget {
    public static final /* synthetic */ TabContentWidget[] $VALUES;
    public static final TabContentWidget BRAND_COLLECTION;
    public static final TabContentWidget FOLLOWING;
    public static final TabContentWidget LOCAL_CASH;
    public static final TabContentWidget MARKETING_MESSAGE;
    public static final TabContentWidget REORDER;

    static {
        TabContentWidget tabContentWidget = new TabContentWidget("LOCAL_CASH", 0);
        LOCAL_CASH = tabContentWidget;
        TabContentWidget tabContentWidget2 = new TabContentWidget("REORDER", 1);
        REORDER = tabContentWidget2;
        TabContentWidget tabContentWidget3 = new TabContentWidget("BRAND_COLLECTION", 2);
        BRAND_COLLECTION = tabContentWidget3;
        TabContentWidget tabContentWidget4 = new TabContentWidget("FOLLOWING", 3);
        FOLLOWING = tabContentWidget4;
        TabContentWidget tabContentWidget5 = new TabContentWidget("MARKETING_MESSAGE", 4);
        MARKETING_MESSAGE = tabContentWidget5;
        $VALUES = new TabContentWidget[]{tabContentWidget, tabContentWidget2, tabContentWidget3, tabContentWidget4, tabContentWidget5};
    }

    public static TabContentWidget valueOf(String str) {
        return (TabContentWidget) Enum.valueOf(TabContentWidget.class, str);
    }

    public static TabContentWidget[] values() {
        return (TabContentWidget[]) $VALUES.clone();
    }
}
