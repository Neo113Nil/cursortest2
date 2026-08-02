package com.squareup.cash.offers.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetPreload;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOffersTabRepository$saveSheetPreload$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $preloads;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ RealOffersTabRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$saveSheetPreload$2(RealOffersTabRepository realOffersTabRepository, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realOffersTabRepository;
        this.$preloads = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        List list = this.$preloads;
        RealOffersTabRepository realOffersTabRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealOffersTabRepository$saveSheetPreload$2(list, realOffersTabRepository, continuation);
            default:
                return new RealOffersTabRepository$saveSheetPreload$2(realOffersTabRepository, list, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealOffersTabRepository$saveSheetPreload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        List<OfferSheetPreload> list = this.$preloads;
        RealOffersTabRepository realOffersTabRepository = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                for (OfferSheetPreload offerSheetPreload : list) {
                    OfferSheetKey offerSheetKey = offerSheetPreload.sheet_key;
                    if (offerSheetKey == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("preload sheet key == null");
                        break;
                    } else {
                        OffersSheetResponse offersSheetResponse = offerSheetPreload.sheet_response;
                        if (offersSheetResponse == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("preload sheet response == null");
                            break;
                        } else {
                            Long l = offersSheetResponse.expire_at_ms;
                            if (l != null) {
                                realOffersTabRepository.cashDatabase.offersSheetQueries.insertOrReplace(offerSheetKey, new Long(l.longValue()), offersSheetResponse, offerSheetKey.offer_type);
                            }
                        }
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realOffersTabRepository.cashDatabase.offersRecentlyViewedQueries.transactionWithWrapper(new MusicViewKt$$ExternalSyntheticLambda6(17, list, realOffersTabRepository));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$saveSheetPreload$2(List list, RealOffersTabRepository realOffersTabRepository, Continuation continuation) {
        super(2, continuation);
        this.$preloads = list;
        this.this$0 = realOffersTabRepository;
    }
}
