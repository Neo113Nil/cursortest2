package com.squareup.cash.banking.viewmodels;

import com.fillr.e;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TransfersViewModel$Companion$TransfersTab {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ TransfersViewModel$Companion$TransfersTab[] $VALUES;
    public static final TransfersViewModel$Companion$TransfersTab BankTab;
    public static final e Companion;
    public static final TransfersViewModel$Companion$TransfersTab WireTab;
    public final int id;

    static {
        TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab = new TransfersViewModel$Companion$TransfersTab("BankTab", 0, 0);
        BankTab = transfersViewModel$Companion$TransfersTab;
        TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab2 = new TransfersViewModel$Companion$TransfersTab("WireTab", 1, 1);
        WireTab = transfersViewModel$Companion$TransfersTab2;
        TransfersViewModel$Companion$TransfersTab[] transfersViewModel$Companion$TransfersTabArr = {transfersViewModel$Companion$TransfersTab, transfersViewModel$Companion$TransfersTab2};
        $VALUES = transfersViewModel$Companion$TransfersTabArr;
        $ENTRIES = new EnumEntriesList(transfersViewModel$Companion$TransfersTabArr);
        Companion = new e();
    }

    public TransfersViewModel$Companion$TransfersTab(String str, int i, int i2) {
        this.id = i2;
    }

    public static TransfersViewModel$Companion$TransfersTab valueOf(String str) {
        return (TransfersViewModel$Companion$TransfersTab) Enum.valueOf(TransfersViewModel$Companion$TransfersTab.class, str);
    }

    public static TransfersViewModel$Companion$TransfersTab[] values() {
        return (TransfersViewModel$Companion$TransfersTab[]) $VALUES.clone();
    }
}
