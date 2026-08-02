package com.squareup.cash.lynx.api.v1_0.model;

import com.google.mlkit.vision.text.zza;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum CardLinkRiskEvaluationResult implements WireEnum {
    ALLOW(1),
    ALLOW_WITH_RELAXED_VERIFICATION(2),
    BLOCK(3),
    BLOCK_PENDING_INSTRUMENT_VERIFICATION(4),
    RISK_CALL_FAILURE(5),
    BLOCK_PENDING_MICROAUTH(6),
    BLOCK_PENDING_RISK_MICROAUTH(7),
    BLOCK_PENDING_DIDV(8);

    public final int value;
    public static final zza Companion = new zza(27);
    public static final CardLinkRiskEvaluationResult$Companion$ADAPTER$1 ADAPTER = new CardLinkRiskEvaluationResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CardLinkRiskEvaluationResult.class), Syntax.PROTO_2, null);

    CardLinkRiskEvaluationResult(int i) {
        this.value = i;
    }

    public static final CardLinkRiskEvaluationResult fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return ALLOW;
            case 2:
                return ALLOW_WITH_RELAXED_VERIFICATION;
            case 3:
                return BLOCK;
            case 4:
                return BLOCK_PENDING_INSTRUMENT_VERIFICATION;
            case 5:
                return RISK_CALL_FAILURE;
            case 6:
                return BLOCK_PENDING_MICROAUTH;
            case 7:
                return BLOCK_PENDING_RISK_MICROAUTH;
            case 8:
                return BLOCK_PENDING_DIDV;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
