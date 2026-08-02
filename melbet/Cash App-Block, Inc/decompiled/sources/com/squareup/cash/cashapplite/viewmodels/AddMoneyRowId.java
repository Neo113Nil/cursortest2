package com.squareup.cash.cashapplite.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AddMoneyRowId {
    public static final /* synthetic */ AddMoneyRowId[] $VALUES;
    public static final AddMoneyRowId DEPOSIT_USDC;
    public static final AddMoneyRowId USE_CLABE;

    static {
        AddMoneyRowId addMoneyRowId = new AddMoneyRowId("USE_CLABE", 0);
        USE_CLABE = addMoneyRowId;
        AddMoneyRowId addMoneyRowId2 = new AddMoneyRowId("DEPOSIT_USDC", 1);
        DEPOSIT_USDC = addMoneyRowId2;
        $VALUES = new AddMoneyRowId[]{addMoneyRowId, addMoneyRowId2};
    }

    public static AddMoneyRowId valueOf(String str) {
        return (AddMoneyRowId) Enum.valueOf(AddMoneyRowId.class, str);
    }

    public static AddMoneyRowId[] values() {
        return (AddMoneyRowId[]) $VALUES.clone();
    }
}
