package com.squareup.cash.offers.views.collection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final class OffersCollectionListingKt$OffersCollectionListing$1$1$2$1$2$1$1 implements Function3 {
    public static final OffersCollectionListingKt$OffersCollectionListing$1$1$2$1$2$1$1 INSTANCE = new OffersCollectionListingKt$OffersCollectionListing$1$1$2$1$2$1$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PainterRequest painterRequest = (PainterRequest) obj;
        int intValue = ((Number) obj3).intValue();
        painterRequest.getClass();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        gapComposer.startReplaceGroup(1730519870);
        AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer, intValue & 14, 1);
        gapComposer.end(false);
        return rememberAsyncImagePainter;
    }
}
