package com.squareup.cash.cdf.featurerestrictionbanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ActionLocation {
    public static final /* synthetic */ ActionLocation[] $VALUES;
    public static final ActionLocation BUTTON;
    public static final ActionLocation MARKDOWN_LINK;

    static {
        ActionLocation actionLocation = new ActionLocation("BUTTON", 0);
        BUTTON = actionLocation;
        ActionLocation actionLocation2 = new ActionLocation("MARKDOWN_LINK", 1);
        MARKDOWN_LINK = actionLocation2;
        $VALUES = new ActionLocation[]{actionLocation, actionLocation2};
    }

    public static ActionLocation valueOf(String str) {
        return (ActionLocation) Enum.valueOf(ActionLocation.class, str);
    }

    public static ActionLocation[] values() {
        return (ActionLocation[]) $VALUES.clone();
    }
}
