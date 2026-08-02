package com.squareup.cash.out.sync_entity;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum DebitCardQualifier implements WireEnum {
    NO_DEBIT_QUALIFIER(0),
    CARD_BRAND_VISA(1),
    DEFAULT_CARD(2);

    public static final DebitCardQualifier$Companion$ADAPTER$1 ADAPTER;
    public static final Op.Companion Companion;
    public final int value;

    static {
        DebitCardQualifier debitCardQualifier = NO_DEBIT_QUALIFIER;
        Companion = new Op.Companion();
        ADAPTER = new DebitCardQualifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DebitCardQualifier.class), Syntax.PROTO_2, debitCardQualifier);
    }

    DebitCardQualifier(int i) {
        this.value = i;
    }

    public static final DebitCardQualifier fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return NO_DEBIT_QUALIFIER;
        }
        if (i == 1) {
            return CARD_BRAND_VISA;
        }
        if (i != 2) {
            return null;
        }
        return DEFAULT_CARD;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
