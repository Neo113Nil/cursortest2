package com.squareup.cash.composeUi.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SizeMode {
    public static final /* synthetic */ SizeMode[] $VALUES;
    public static final SizeMode Expand;

    /* JADX INFO: Fake field, exist only in values array */
    SizeMode EF0;

    static {
        SizeMode sizeMode = new SizeMode("Wrap", 0);
        SizeMode sizeMode2 = new SizeMode("Expand", 1);
        Expand = sizeMode2;
        $VALUES = new SizeMode[]{sizeMode, sizeMode2};
    }

    public static SizeMode valueOf(String str) {
        return (SizeMode) Enum.valueOf(SizeMode.class, str);
    }

    public static SizeMode[] values() {
        return (SizeMode[]) $VALUES.clone();
    }
}
