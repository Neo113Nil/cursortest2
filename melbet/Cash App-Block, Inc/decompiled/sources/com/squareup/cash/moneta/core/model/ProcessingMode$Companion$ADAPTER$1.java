package com.squareup.cash.moneta.core.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class ProcessingMode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProcessingMode.Companion.getClass();
        if (i == 0) {
            return ProcessingMode.SYNCHRONOUS;
        }
        if (i != 1) {
            return null;
        }
        return ProcessingMode.ASYNCHRONOUS;
    }
}
