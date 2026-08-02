package com.squareup.cash.offers.presenters;

import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.tax.TaxEnvironment;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class OffersSearchMapperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[FilterGroupSection.FilterGroupItem.ItemLayout.values().length];
        try {
            TaxEnvironment.Companion companion = FilterGroupSection.FilterGroupItem.ItemLayout.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TaxEnvironment.Companion companion2 = FilterGroupSection.FilterGroupItem.ItemLayout.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            TaxEnvironment.Companion companion3 = FilterGroupSection.FilterGroupItem.ItemLayout.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
