package com.squareup.cash.cashapplite.cashin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CashInRowAction {
    public static final /* synthetic */ CashInRowAction[] $VALUES;
    public static final CashInRowAction COPY;
    public static final CashInRowAction NONE;

    static {
        CashInRowAction cashInRowAction = new CashInRowAction("NONE", 0);
        NONE = cashInRowAction;
        CashInRowAction cashInRowAction2 = new CashInRowAction("COPY", 1);
        COPY = cashInRowAction2;
        $VALUES = new CashInRowAction[]{cashInRowAction, cashInRowAction2};
    }

    public static CashInRowAction valueOf(String str) {
        return (CashInRowAction) Enum.valueOf(CashInRowAction.class, str);
    }

    public static CashInRowAction[] values() {
        return (CashInRowAction[]) $VALUES.clone();
    }
}
