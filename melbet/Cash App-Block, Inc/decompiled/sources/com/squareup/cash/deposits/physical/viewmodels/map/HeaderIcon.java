package com.squareup.cash.deposits.physical.viewmodels.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class HeaderIcon {
    public static final /* synthetic */ HeaderIcon[] $VALUES;
    public static final HeaderIcon DEFAULT;
    public static final HeaderIcon PBA;

    static {
        HeaderIcon headerIcon = new HeaderIcon("DEFAULT", 0);
        DEFAULT = headerIcon;
        HeaderIcon headerIcon2 = new HeaderIcon("PBA", 1);
        PBA = headerIcon2;
        $VALUES = new HeaderIcon[]{headerIcon, headerIcon2};
    }

    public static HeaderIcon valueOf(String str) {
        return (HeaderIcon) Enum.valueOf(HeaderIcon.class, str);
    }

    public static HeaderIcon[] values() {
        return (HeaderIcon[]) $VALUES.clone();
    }
}
