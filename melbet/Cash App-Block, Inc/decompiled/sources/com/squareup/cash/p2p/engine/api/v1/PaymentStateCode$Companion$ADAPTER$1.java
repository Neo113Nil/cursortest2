package com.squareup.cash.p2p.engine.api.v1;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class PaymentStateCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentStateCode.Companion.getClass();
        return WorkCookieJar.m3795fromValue(i);
    }
}
