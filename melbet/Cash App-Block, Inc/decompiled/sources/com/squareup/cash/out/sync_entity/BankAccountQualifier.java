package com.squareup.cash.out.sync_entity;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BankAccountQualifier implements WireEnum {
    public static final /* synthetic */ BankAccountQualifier[] $VALUES;
    public static final BankAccountQualifier$Companion$ADAPTER$1 ADAPTER;
    public static final Edge.Companion Companion;
    public static final BankAccountQualifier NO_BANK_QUALIFIER;

    static {
        BankAccountQualifier bankAccountQualifier = new BankAccountQualifier("NO_BANK_QUALIFIER", 0);
        NO_BANK_QUALIFIER = bankAccountQualifier;
        $VALUES = new BankAccountQualifier[]{bankAccountQualifier};
        Companion = new Edge.Companion(6);
        ADAPTER = new BankAccountQualifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BankAccountQualifier.class), Syntax.PROTO_2, bankAccountQualifier);
    }

    public static final BankAccountQualifier fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return NO_BANK_QUALIFIER;
        }
        return null;
    }

    public static BankAccountQualifier valueOf(String str) {
        return (BankAccountQualifier) Enum.valueOf(BankAccountQualifier.class, str);
    }

    public static BankAccountQualifier[] values() {
        return (BankAccountQualifier[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 0;
    }
}
