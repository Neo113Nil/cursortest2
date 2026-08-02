package com.squareup.cash.genericelements.presenters.mappers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GenericActionType {
    public static final /* synthetic */ GenericActionType[] $VALUES;
    public static final GenericActionType DISMISS;
    public static final GenericActionType OPEN_URL;
    public static final GenericActionType OVERLAY;

    static {
        GenericActionType genericActionType = new GenericActionType("OPEN_URL", 0);
        OPEN_URL = genericActionType;
        GenericActionType genericActionType2 = new GenericActionType("DISMISS", 1);
        DISMISS = genericActionType2;
        GenericActionType genericActionType3 = new GenericActionType("OVERLAY", 2);
        OVERLAY = genericActionType3;
        $VALUES = new GenericActionType[]{genericActionType, genericActionType2, genericActionType3};
    }

    public static GenericActionType valueOf(String str) {
        return (GenericActionType) Enum.valueOf(GenericActionType.class, str);
    }

    public static GenericActionType[] values() {
        return (GenericActionType[]) $VALUES.clone();
    }
}
