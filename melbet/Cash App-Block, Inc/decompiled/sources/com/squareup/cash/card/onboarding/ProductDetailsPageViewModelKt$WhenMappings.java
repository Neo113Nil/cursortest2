package com.squareup.cash.card.onboarding;

import com.squareup.protos.franklin.api.ProductDetailsPage;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ProductDetailsPageViewModelKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ProductDetailsPage.Action.values().length];
        try {
            iArr[ProductDetailsPage.Action.SUBMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductDetailsPage.Action.HYPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductDetailsPage.Action.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductDetailsPage.Action.ACTION_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
