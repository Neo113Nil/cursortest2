package com.datadog.android.rum;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RumActionType {
    public static final /* synthetic */ RumActionType[] $VALUES;
    public static final RumActionType BACK;
    public static final RumActionType CLICK;
    public static final RumActionType CUSTOM;
    public static final RumActionType SCROLL;
    public static final RumActionType SWIPE;
    public static final RumActionType TAP;

    static {
        RumActionType rumActionType = new RumActionType("TAP", 0);
        TAP = rumActionType;
        RumActionType rumActionType2 = new RumActionType("SCROLL", 1);
        SCROLL = rumActionType2;
        RumActionType rumActionType3 = new RumActionType("SWIPE", 2);
        SWIPE = rumActionType3;
        RumActionType rumActionType4 = new RumActionType("CLICK", 3);
        CLICK = rumActionType4;
        RumActionType rumActionType5 = new RumActionType("BACK", 4);
        BACK = rumActionType5;
        RumActionType rumActionType6 = new RumActionType("CUSTOM", 5);
        CUSTOM = rumActionType6;
        $VALUES = new RumActionType[]{rumActionType, rumActionType2, rumActionType3, rumActionType4, rumActionType5, rumActionType6};
    }

    public static RumActionType valueOf(String str) {
        return (RumActionType) Enum.valueOf(RumActionType.class, str);
    }

    public static RumActionType[] values() {
        return (RumActionType[]) $VALUES.clone();
    }
}
