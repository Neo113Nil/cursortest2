package com.squareup.cash.cdf.mintpdp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PdpSectionType {
    public static final /* synthetic */ PdpSectionType[] $VALUES;
    public static final PdpSectionType COLLAPSIBLE_DETAILS;
    public static final PdpSectionType DISCLOSURE;
    public static final PdpSectionType HEADER;
    public static final PdpSectionType HERO;
    public static final PdpSectionType ICON_GRID;
    public static final PdpSectionType IMAGE_CAROUSEL;
    public static final PdpSectionType LABELS;
    public static final PdpSectionType TILE_CAROUSEL;

    static {
        PdpSectionType pdpSectionType = new PdpSectionType("HERO", 0);
        HERO = pdpSectionType;
        PdpSectionType pdpSectionType2 = new PdpSectionType("IMAGE_CAROUSEL", 1);
        IMAGE_CAROUSEL = pdpSectionType2;
        PdpSectionType pdpSectionType3 = new PdpSectionType("ICON_GRID", 2);
        ICON_GRID = pdpSectionType3;
        PdpSectionType pdpSectionType4 = new PdpSectionType("TILE_CAROUSEL", 3);
        TILE_CAROUSEL = pdpSectionType4;
        PdpSectionType pdpSectionType5 = new PdpSectionType("COLLAPSIBLE_DETAILS", 4);
        COLLAPSIBLE_DETAILS = pdpSectionType5;
        PdpSectionType pdpSectionType6 = new PdpSectionType("DISCLOSURE", 5);
        DISCLOSURE = pdpSectionType6;
        PdpSectionType pdpSectionType7 = new PdpSectionType("HEADER", 6);
        HEADER = pdpSectionType7;
        PdpSectionType pdpSectionType8 = new PdpSectionType("LABELS", 7);
        LABELS = pdpSectionType8;
        $VALUES = new PdpSectionType[]{pdpSectionType, pdpSectionType2, pdpSectionType3, pdpSectionType4, pdpSectionType5, pdpSectionType6, pdpSectionType7, pdpSectionType8, new PdpSectionType("MARKDOWN_TEXT", 8)};
    }

    public static PdpSectionType valueOf(String str) {
        return (PdpSectionType) Enum.valueOf(PdpSectionType.class, str);
    }

    public static PdpSectionType[] values() {
        return (PdpSectionType[]) $VALUES.clone();
    }
}
