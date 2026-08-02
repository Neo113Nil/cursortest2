package com.squareup.cash.cashapplite.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LiteCashOutPresenter$InputMode {
    public static final /* synthetic */ LiteCashOutPresenter$InputMode[] $VALUES;
    public static final LiteCashOutPresenter$InputMode CHANGE_AMOUNT;
    public static final LiteCashOutPresenter$InputMode VIEW_AMOUNT;

    static {
        LiteCashOutPresenter$InputMode liteCashOutPresenter$InputMode = new LiteCashOutPresenter$InputMode("VIEW_AMOUNT", 0);
        VIEW_AMOUNT = liteCashOutPresenter$InputMode;
        LiteCashOutPresenter$InputMode liteCashOutPresenter$InputMode2 = new LiteCashOutPresenter$InputMode("CHANGE_AMOUNT", 1);
        CHANGE_AMOUNT = liteCashOutPresenter$InputMode2;
        $VALUES = new LiteCashOutPresenter$InputMode[]{liteCashOutPresenter$InputMode, liteCashOutPresenter$InputMode2};
    }

    public static LiteCashOutPresenter$InputMode valueOf(String str) {
        return (LiteCashOutPresenter$InputMode) Enum.valueOf(LiteCashOutPresenter$InputMode.class, str);
    }

    public static LiteCashOutPresenter$InputMode[] values() {
        return (LiteCashOutPresenter$InputMode[]) $VALUES.clone();
    }
}
