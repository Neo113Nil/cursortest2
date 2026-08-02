package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class ComposePlatform$ProgressStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ComposePlatform.ProgressStyle.Companion.getClass();
        if (i == 0) {
            return ComposePlatform.ProgressStyle.PROGRESS_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return ComposePlatform.ProgressStyle.PROGRESS_STYLE_LINEAR;
        }
        if (i != 2) {
            return null;
        }
        return ComposePlatform.ProgressStyle.PROGRESS_STYLE_CIRCULAR;
    }
}
