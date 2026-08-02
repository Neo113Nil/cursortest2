package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.compass.api.RadioType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class AfterpayAppletRetroOrderSelectionPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.values().length];
        try {
            RadioType.Companion companion = RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
