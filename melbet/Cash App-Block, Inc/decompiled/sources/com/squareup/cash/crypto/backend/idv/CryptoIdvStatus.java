package com.squareup.cash.crypto.backend.idv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CryptoIdvStatus {
    public static final /* synthetic */ CryptoIdvStatus[] $VALUES;
    public static final CryptoIdvStatus DISALLOWED;
    public static final CryptoIdvStatus NOT_VERIFIED;
    public static final CryptoIdvStatus PENDING;
    public static final CryptoIdvStatus VERIFIED;

    static {
        CryptoIdvStatus cryptoIdvStatus = new CryptoIdvStatus("NOT_VERIFIED", 0);
        NOT_VERIFIED = cryptoIdvStatus;
        CryptoIdvStatus cryptoIdvStatus2 = new CryptoIdvStatus("PENDING", 1);
        PENDING = cryptoIdvStatus2;
        CryptoIdvStatus cryptoIdvStatus3 = new CryptoIdvStatus("VERIFIED", 2);
        VERIFIED = cryptoIdvStatus3;
        CryptoIdvStatus cryptoIdvStatus4 = new CryptoIdvStatus("DISALLOWED", 3);
        DISALLOWED = cryptoIdvStatus4;
        $VALUES = new CryptoIdvStatus[]{cryptoIdvStatus, cryptoIdvStatus2, cryptoIdvStatus3, cryptoIdvStatus4};
    }

    public static CryptoIdvStatus valueOf(String str) {
        return (CryptoIdvStatus) Enum.valueOf(CryptoIdvStatus.class, str);
    }

    public static CryptoIdvStatus[] values() {
        return (CryptoIdvStatus[]) $VALUES.clone();
    }
}
