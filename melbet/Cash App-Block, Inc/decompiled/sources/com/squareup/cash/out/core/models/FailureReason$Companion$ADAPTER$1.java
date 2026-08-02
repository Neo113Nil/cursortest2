package com.squareup.cash.out.core.models;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FailureReason.Companion.getClass();
        return WorkCookieJar.fromValue(i);
    }
}
