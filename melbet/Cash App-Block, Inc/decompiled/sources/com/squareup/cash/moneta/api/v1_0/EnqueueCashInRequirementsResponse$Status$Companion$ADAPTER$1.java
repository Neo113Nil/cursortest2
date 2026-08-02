package com.squareup.cash.moneta.api.v1_0;

import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class EnqueueCashInRequirementsResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EnqueueCashInRequirementsResponse.Status.Companion.getClass();
        if (i == 0) {
            return EnqueueCashInRequirementsResponse.Status.SUCCESS;
        }
        if (i != 1) {
            return null;
        }
        return EnqueueCashInRequirementsResponse.Status.FAILURE;
    }
}
