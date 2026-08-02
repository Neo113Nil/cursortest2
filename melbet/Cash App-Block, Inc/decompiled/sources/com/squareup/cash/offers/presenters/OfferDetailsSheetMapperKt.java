package com.squareup.cash.offers.presenters;

import androidx.compose.ui.draw.ShadowKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.OfferDetailListSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes6.dex */
public abstract class OfferDetailsSheetMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getRequiredActionUrl(Button button) {
        String str;
        zzle zzleVar;
        TapAction tapAction = button.tap_action;
        if (tapAction != null && (zzleVar = tapAction.action) != null) {
            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
            UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
            if (urlTapAction != null) {
                str = urlTapAction.action_url;
                if (str == null) {
                    return str;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public static final ArrayList getRequiredAnalyticsEventSpecs(Button button) {
        button.getClass();
        TapAction tapAction = button.tap_action;
        if (tapAction == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: Button.tap_action == null");
            return null;
        }
        List list = tapAction.analytics_tap_events;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it.next()));
        }
        return arrayList;
    }

    public static final boolean needsCashCard(OfferDetailListSheet offerDetailListSheet, CashAppCard.PhysicalCardOrderState physicalCardOrderState) {
        physicalCardOrderState.getClass();
        OfferType offerType = offerDetailListSheet.offer_type;
        offerType.getClass();
        if (offerType == OfferType.PAY_LESS_CLO || offerType == OfferType.PAY_LESS_AFFILIATE) {
            return physicalCardOrderState == CashAppCard.PhysicalCardOrderState.NO_CARD || physicalCardOrderState == CashAppCard.PhysicalCardOrderState.PENDING_ACTIVATION;
        }
        return false;
    }
}
