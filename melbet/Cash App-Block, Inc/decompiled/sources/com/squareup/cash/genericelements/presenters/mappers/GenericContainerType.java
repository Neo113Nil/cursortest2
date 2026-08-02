package com.squareup.cash.genericelements.presenters.mappers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class GenericContainerType {
    public static final /* synthetic */ GenericContainerType[] $VALUES;
    public static final GenericContainerType CARD_CONTAINER;
    public static final GenericContainerType COMPONENT_CONTAINER;
    public static final GenericContainerType PLACEHOLDER_CONTAINER;
    public static final GenericContainerType SERIES_CONTAINER;

    static {
        GenericContainerType genericContainerType = new GenericContainerType("COMPONENT_CONTAINER", 0);
        COMPONENT_CONTAINER = genericContainerType;
        GenericContainerType genericContainerType2 = new GenericContainerType("SERIES_CONTAINER", 1);
        SERIES_CONTAINER = genericContainerType2;
        GenericContainerType genericContainerType3 = new GenericContainerType("PLACEHOLDER_CONTAINER", 2);
        PLACEHOLDER_CONTAINER = genericContainerType3;
        GenericContainerType genericContainerType4 = new GenericContainerType("CARD_CONTAINER", 3);
        CARD_CONTAINER = genericContainerType4;
        $VALUES = new GenericContainerType[]{genericContainerType, genericContainerType2, genericContainerType3, genericContainerType4};
    }

    public static GenericContainerType valueOf(String str) {
        return (GenericContainerType) Enum.valueOf(GenericContainerType.class, str);
    }

    public static GenericContainerType[] values() {
        return (GenericContainerType[]) $VALUES.clone();
    }
}
