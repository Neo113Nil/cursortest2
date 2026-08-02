package com.squareup.cash.boost.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BoostActionPerformed {
    public static final /* synthetic */ BoostActionPerformed[] $VALUES;
    public static final BoostActionPerformed ADDED;
    public static final BoostActionPerformed REMOVED;
    public static final BoostActionPerformed REPLACED;

    static {
        BoostActionPerformed boostActionPerformed = new BoostActionPerformed("ADDED", 0);
        ADDED = boostActionPerformed;
        BoostActionPerformed boostActionPerformed2 = new BoostActionPerformed("REPLACED", 1);
        REPLACED = boostActionPerformed2;
        BoostActionPerformed boostActionPerformed3 = new BoostActionPerformed("REMOVED", 2);
        REMOVED = boostActionPerformed3;
        $VALUES = new BoostActionPerformed[]{boostActionPerformed, boostActionPerformed2, boostActionPerformed3};
    }

    public static BoostActionPerformed valueOf(String str) {
        return (BoostActionPerformed) Enum.valueOf(BoostActionPerformed.class, str);
    }

    public static BoostActionPerformed[] values() {
        return (BoostActionPerformed[]) $VALUES.clone();
    }
}
