package com.squareup.cash.offers.db;

import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersSheetQueries$forSheetKey$2 extends FunctionReferenceImpl implements Function4 {
    public static final OffersSheetQueries$forSheetKey$2 INSTANCE = new OffersSheetQueries$forSheetKey$2(4, OffersSheet.class, "<init>", "<init>(Lcom/squareup/protos/cash/cashsuggest/api/OfferSheetKey;Ljava/lang/Long;Lcom/squareup/protos/cash/cashsuggest/api/OffersSheetResponse;Lcom/squareup/protos/cash/shop/rendering/api/OfferType;)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OfferSheetKey offerSheetKey = (OfferSheetKey) obj;
        OffersSheetResponse offersSheetResponse = (OffersSheetResponse) obj3;
        offerSheetKey.getClass();
        offersSheetResponse.getClass();
        return new OffersSheet(offerSheetKey, (Long) obj2, offersSheetResponse, (OfferType) obj4);
    }
}
