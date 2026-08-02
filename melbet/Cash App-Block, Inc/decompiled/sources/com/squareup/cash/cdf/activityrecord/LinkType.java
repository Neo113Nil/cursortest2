package com.squareup.cash.cdf.activityrecord;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LinkType {
    public static final /* synthetic */ LinkType[] $VALUES;
    public static final LinkType BLOCK_EXPLORER;
    public static final LinkType RECEIPT_UPSELL;

    static {
        LinkType linkType = new LinkType("BLOCK_EXPLORER", 0);
        BLOCK_EXPLORER = linkType;
        LinkType linkType2 = new LinkType("RECEIPT_UPSELL", 1);
        RECEIPT_UPSELL = linkType2;
        $VALUES = new LinkType[]{linkType, linkType2};
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) $VALUES.clone();
    }
}
