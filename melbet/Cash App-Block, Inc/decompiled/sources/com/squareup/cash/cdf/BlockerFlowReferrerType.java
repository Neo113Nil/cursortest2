package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BlockerFlowReferrerType {
    public static final /* synthetic */ BlockerFlowReferrerType[] $VALUES;
    public static final BlockerFlowReferrerType AFTERPAY_APPLET;

    static {
        BlockerFlowReferrerType blockerFlowReferrerType = new BlockerFlowReferrerType("AFTERPAY_APPLET", 0);
        AFTERPAY_APPLET = blockerFlowReferrerType;
        $VALUES = new BlockerFlowReferrerType[]{blockerFlowReferrerType};
    }

    public static BlockerFlowReferrerType valueOf(String str) {
        return (BlockerFlowReferrerType) Enum.valueOf(BlockerFlowReferrerType.class, str);
    }

    public static BlockerFlowReferrerType[] values() {
        return (BlockerFlowReferrerType[]) $VALUES.clone();
    }
}
