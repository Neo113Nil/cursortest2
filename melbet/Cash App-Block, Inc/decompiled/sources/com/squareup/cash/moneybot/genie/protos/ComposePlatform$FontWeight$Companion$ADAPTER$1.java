package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ComposePlatform$FontWeight$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ComposePlatform.FontWeight.Companion.getClass();
        return Error.Code.Companion.fromValue(i);
    }
}
