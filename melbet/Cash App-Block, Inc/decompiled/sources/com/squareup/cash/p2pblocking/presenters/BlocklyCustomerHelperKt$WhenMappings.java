package com.squareup.cash.p2pblocking.presenters;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.blockly.common.BlockType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class BlocklyCustomerHelperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BlockType.values().length];
        try {
            CardProduct.Companion companion = BlockType.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CardProduct.Companion companion2 = BlockType.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
