package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class CardLinkRiskEvaluationResult$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardLinkRiskEvaluationResult.Companion.getClass();
        switch (i) {
            case 1:
                return CardLinkRiskEvaluationResult.ALLOW;
            case 2:
                return CardLinkRiskEvaluationResult.ALLOW_WITH_RELAXED_VERIFICATION;
            case 3:
                return CardLinkRiskEvaluationResult.BLOCK;
            case 4:
                return CardLinkRiskEvaluationResult.BLOCK_PENDING_INSTRUMENT_VERIFICATION;
            case 5:
                return CardLinkRiskEvaluationResult.RISK_CALL_FAILURE;
            case 6:
                return CardLinkRiskEvaluationResult.BLOCK_PENDING_MICROAUTH;
            case 7:
                return CardLinkRiskEvaluationResult.BLOCK_PENDING_RISK_MICROAUTH;
            case 8:
                return CardLinkRiskEvaluationResult.BLOCK_PENDING_DIDV;
            default:
                return null;
        }
    }
}
