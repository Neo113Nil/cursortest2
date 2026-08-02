package com.squareup.cash.offers.presenters;

import com.squareup.cash.boost.backend.BoostCategory;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class OffersMappersKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.values().length];
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus itemStatus = OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.SELECTABLE;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus itemStatus2 = OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.SELECTABLE;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus itemStatus3 = OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.SELECTABLE;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[BoostCategory.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
