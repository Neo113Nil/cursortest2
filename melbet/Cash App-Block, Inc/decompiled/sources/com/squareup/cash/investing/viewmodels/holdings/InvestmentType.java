package com.squareup.cash.investing.viewmodels.holdings;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InvestmentType {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ InvestmentType[] $VALUES;
    public static final InvestmentType SECTOR;
    public static final InvestmentType STOCK;

    static {
        InvestmentType investmentType = new InvestmentType("STOCK", 0);
        STOCK = investmentType;
        InvestmentType investmentType2 = new InvestmentType("SECTOR", 1);
        SECTOR = investmentType2;
        InvestmentType[] investmentTypeArr = {investmentType, investmentType2};
        $VALUES = investmentTypeArr;
        $ENTRIES = new EnumEntriesList(investmentTypeArr);
    }

    public static InvestmentType valueOf(String str) {
        return (InvestmentType) Enum.valueOf(InvestmentType.class, str);
    }

    public static InvestmentType[] values() {
        return (InvestmentType[]) $VALUES.clone();
    }
}
