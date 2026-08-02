package com.squareup.cash.p2pblocking.presenters;

import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.blockly.common.BlockingContext;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class BlockListController$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BlockingContext.values().length];
        try {
            Error.Code.Companion companion = BlockingContext.Companion;
            iArr[7] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
