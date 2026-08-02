package com.squareup.cash.checks.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CheckFace {
    public static final /* synthetic */ CheckFace[] $VALUES;
    public static final CheckFace BACK;
    public static final CheckFace FRONT;

    static {
        CheckFace checkFace = new CheckFace("FRONT", 0);
        FRONT = checkFace;
        CheckFace checkFace2 = new CheckFace("BACK", 1);
        BACK = checkFace2;
        $VALUES = new CheckFace[]{checkFace, checkFace2};
    }

    public static CheckFace valueOf(String str) {
        return (CheckFace) Enum.valueOf(CheckFace.class, str);
    }

    public static CheckFace[] values() {
        return (CheckFace[]) $VALUES.clone();
    }
}
