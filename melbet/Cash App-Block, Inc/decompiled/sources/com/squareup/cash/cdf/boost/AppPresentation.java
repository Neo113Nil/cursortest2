package com.squareup.cash.cdf.boost;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppPresentation {
    public static final /* synthetic */ AppPresentation[] $VALUES;
    public static final AppPresentation AffiliateSite;
    public static final AppPresentation BottomSheet;

    /* JADX INFO: Fake field, exist only in values array */
    AppPresentation EF0;

    static {
        AppPresentation appPresentation = new AppPresentation("Carousel", 0);
        AppPresentation appPresentation2 = new AppPresentation("Grid", 1);
        AppPresentation appPresentation3 = new AppPresentation("List", 2);
        AppPresentation appPresentation4 = new AppPresentation("BottomSheet", 3);
        BottomSheet = appPresentation4;
        AppPresentation appPresentation5 = new AppPresentation("AffiliateSite", 4);
        AffiliateSite = appPresentation5;
        $VALUES = new AppPresentation[]{appPresentation, appPresentation2, appPresentation3, appPresentation4, appPresentation5};
    }

    public static AppPresentation valueOf(String str) {
        return (AppPresentation) Enum.valueOf(AppPresentation.class, str);
    }

    public static AppPresentation[] values() {
        return (AppPresentation[]) $VALUES.clone();
    }
}
