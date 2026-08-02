package com.squareup.cash.investing.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InvestingHomePresenter$ViewModelFilter {
    public static final /* synthetic */ InvestingHomePresenter$ViewModelFilter[] $VALUES;
    public static final InvestingHomePresenter$ViewModelFilter DISCOVERY;
    public static final InvestingHomePresenter$ViewModelFilter PORTFOLIO;

    static {
        InvestingHomePresenter$ViewModelFilter investingHomePresenter$ViewModelFilter = new InvestingHomePresenter$ViewModelFilter("DISCOVERY", 0);
        DISCOVERY = investingHomePresenter$ViewModelFilter;
        InvestingHomePresenter$ViewModelFilter investingHomePresenter$ViewModelFilter2 = new InvestingHomePresenter$ViewModelFilter("PORTFOLIO", 1);
        PORTFOLIO = investingHomePresenter$ViewModelFilter2;
        $VALUES = new InvestingHomePresenter$ViewModelFilter[]{investingHomePresenter$ViewModelFilter, investingHomePresenter$ViewModelFilter2};
    }

    public static InvestingHomePresenter$ViewModelFilter valueOf(String str) {
        return (InvestingHomePresenter$ViewModelFilter) Enum.valueOf(InvestingHomePresenter$ViewModelFilter.class, str);
    }

    public static InvestingHomePresenter$ViewModelFilter[] values() {
        return (InvestingHomePresenter$ViewModelFilter[]) $VALUES.clone();
    }
}
