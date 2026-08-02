package com.squareup.cash.dialog;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SharedElementKey {
    public static final /* synthetic */ SharedElementKey[] $VALUES;
    public static final SharedElementKey Container;
    public static final SharedElementKey Dimmer;
    public static final SharedElementKey Modal;

    static {
        SharedElementKey sharedElementKey = new SharedElementKey("Container", 0);
        Container = sharedElementKey;
        SharedElementKey sharedElementKey2 = new SharedElementKey("Dimmer", 1);
        Dimmer = sharedElementKey2;
        SharedElementKey sharedElementKey3 = new SharedElementKey("Modal", 2);
        Modal = sharedElementKey3;
        $VALUES = new SharedElementKey[]{sharedElementKey, sharedElementKey2, sharedElementKey3};
    }

    public static SharedElementKey valueOf(String str) {
        return (SharedElementKey) Enum.valueOf(SharedElementKey.class, str);
    }

    public static SharedElementKey[] values() {
        return (SharedElementKey[]) $VALUES.clone();
    }
}
