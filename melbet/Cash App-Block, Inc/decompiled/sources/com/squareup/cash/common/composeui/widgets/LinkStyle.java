package com.squareup.cash.common.composeui.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LinkStyle {
    public static final /* synthetic */ LinkStyle[] $VALUES;
    public static final LinkStyle STANDARD;
    public static final LinkStyle SUBTLE;

    static {
        LinkStyle linkStyle = new LinkStyle("STANDARD", 0);
        STANDARD = linkStyle;
        LinkStyle linkStyle2 = new LinkStyle("SUBTLE", 1);
        SUBTLE = linkStyle2;
        $VALUES = new LinkStyle[]{linkStyle, linkStyle2};
    }

    public static LinkStyle valueOf(String str) {
        return (LinkStyle) Enum.valueOf(LinkStyle.class, str);
    }

    public static LinkStyle[] values() {
        return (LinkStyle[]) $VALUES.clone();
    }
}
