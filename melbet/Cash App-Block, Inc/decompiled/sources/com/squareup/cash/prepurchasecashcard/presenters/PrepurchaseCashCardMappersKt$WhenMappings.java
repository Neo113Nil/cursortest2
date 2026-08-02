package com.squareup.cash.prepurchasecashcard.presenters;

import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.binfo.api.CardProduct;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class PrepurchaseCashCardMappersKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.values().length];
        try {
            CardProduct.Companion companion = PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CardProduct.Companion companion2 = PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
