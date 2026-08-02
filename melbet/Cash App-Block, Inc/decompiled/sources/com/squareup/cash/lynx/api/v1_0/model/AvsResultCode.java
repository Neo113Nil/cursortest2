package com.squareup.cash.lynx.api.v1_0.model;

import com.fillr.e;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum AvsResultCode implements WireEnum {
    UNKNOWN_AVS_RESULT(0),
    AVS_MATCH(1),
    AVS_NO_MATCH(2),
    AVS_SKIPPED(3),
    AVS_UNAVAILABLE(4);

    public static final AvsResultCode$Companion$ADAPTER$1 ADAPTER;
    public static final e Companion;
    public final int value;

    static {
        AvsResultCode avsResultCode = UNKNOWN_AVS_RESULT;
        Companion = new e();
        ADAPTER = new AvsResultCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AvsResultCode.class), Syntax.PROTO_2, avsResultCode);
    }

    AvsResultCode(int i) {
        this.value = i;
    }

    public static final AvsResultCode fromValue(int i) {
        Companion.getClass();
        return e.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
