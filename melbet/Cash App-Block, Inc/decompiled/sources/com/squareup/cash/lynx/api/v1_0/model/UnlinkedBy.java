package com.squareup.cash.lynx.api.v1_0.model;

import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum UnlinkedBy implements WireEnum {
    UNKNOWN_BY(0),
    CUSTOMER(1),
    SYSTEM(2),
    CUSTOMER_SUPPORT(3);

    public static final UnlinkedBy$Companion$ADAPTER$1 ADAPTER;
    public static final zzd Companion;
    public final int value;

    static {
        UnlinkedBy unlinkedBy = UNKNOWN_BY;
        Companion = new zzd(28);
        ADAPTER = new UnlinkedBy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UnlinkedBy.class), Syntax.PROTO_2, unlinkedBy);
    }

    UnlinkedBy(int i) {
        this.value = i;
    }

    public static final UnlinkedBy fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN_BY;
        }
        if (i == 1) {
            return CUSTOMER;
        }
        if (i == 2) {
            return SYSTEM;
        }
        if (i != 3) {
            return null;
        }
        return CUSTOMER_SUPPORT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
