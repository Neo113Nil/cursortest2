package com.squareup.cash.out.api.v1_0;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum ExecuteCashOutStatus implements WireEnum {
    SUCCEEDED(0),
    WORKING(1),
    FAILED(2),
    REVERSED(3);

    public static final ExecuteCashOutStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        ExecuteCashOutStatus executeCashOutStatus = SUCCEEDED;
        Companion = new Error.Code.Companion(6);
        ADAPTER = new ExecuteCashOutStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ExecuteCashOutStatus.class), Syntax.PROTO_2, executeCashOutStatus);
    }

    ExecuteCashOutStatus(int i) {
        this.value = i;
    }

    public static final ExecuteCashOutStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SUCCEEDED;
        }
        if (i == 1) {
            return WORKING;
        }
        if (i == 2) {
            return FAILED;
        }
        if (i != 3) {
            return null;
        }
        return REVERSED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
