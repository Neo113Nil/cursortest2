package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AfterpayFeature {
    public static final /* synthetic */ AfterpayFeature[] $VALUES;
    public static final AfterpayFeature IN_NETWORK;

    static {
        AfterpayFeature afterpayFeature = new AfterpayFeature("IN_NETWORK", 0);
        IN_NETWORK = afterpayFeature;
        $VALUES = new AfterpayFeature[]{afterpayFeature};
    }

    public static AfterpayFeature valueOf(String str) {
        return (AfterpayFeature) Enum.valueOf(AfterpayFeature.class, str);
    }

    public static AfterpayFeature[] values() {
        return (AfterpayFeature[]) $VALUES.clone();
    }
}
