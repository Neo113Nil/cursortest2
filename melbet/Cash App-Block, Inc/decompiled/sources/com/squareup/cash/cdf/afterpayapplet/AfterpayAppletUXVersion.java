package com.squareup.cash.cdf.afterpayapplet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AfterpayAppletUXVersion {
    public static final /* synthetic */ AfterpayAppletUXVersion[] $VALUES;
    public static final AfterpayAppletUXVersion V1;
    public static final AfterpayAppletUXVersion V2;
    public static final AfterpayAppletUXVersion V3;

    static {
        AfterpayAppletUXVersion afterpayAppletUXVersion = new AfterpayAppletUXVersion("V1", 0);
        V1 = afterpayAppletUXVersion;
        AfterpayAppletUXVersion afterpayAppletUXVersion2 = new AfterpayAppletUXVersion("v2", 1);
        AfterpayAppletUXVersion afterpayAppletUXVersion3 = new AfterpayAppletUXVersion("V2", 2);
        V2 = afterpayAppletUXVersion3;
        AfterpayAppletUXVersion afterpayAppletUXVersion4 = new AfterpayAppletUXVersion("V3", 3);
        V3 = afterpayAppletUXVersion4;
        $VALUES = new AfterpayAppletUXVersion[]{afterpayAppletUXVersion, afterpayAppletUXVersion2, afterpayAppletUXVersion3, afterpayAppletUXVersion4};
    }

    public static AfterpayAppletUXVersion valueOf(String str) {
        return (AfterpayAppletUXVersion) Enum.valueOf(AfterpayAppletUXVersion.class, str);
    }

    public static AfterpayAppletUXVersion[] values() {
        return (AfterpayAppletUXVersion[]) $VALUES.clone();
    }
}
