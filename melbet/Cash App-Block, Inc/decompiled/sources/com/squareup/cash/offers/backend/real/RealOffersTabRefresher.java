package com.squareup.cash.offers.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.api.RecentlyViewed;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOffersTabRefresher {
    public final CoroutineContext dispatcher;
    public final CoroutineContext mainDispatcher;
    public final RealOffersTabRepository offersTabRepository;
    public final CoroutineScope scope;
    public StandaloneCoroutine searchNullStateRefreshJob;

    public RealOffersTabRefresher(RealOffersTabRepository realOffersTabRepository, RealOffersSheetRepository realOffersSheetRepository, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineScope coroutineScope) {
        this.offersTabRepository = realOffersTabRepository;
        this.dispatcher = coroutineContext;
        this.mainDispatcher = coroutineContext2;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r9 == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        if (r12 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshSearchNullState(OffersItemToken offersItemToken, OffersTabRepository$SearchSource offersTabRepository$SearchSource, ContinuationImpl continuationImpl) {
        RealOffersTabRefresher$refreshSearchNullState$1 realOffersTabRefresher$refreshSearchNullState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        RecentlyViewed recentlyViewed;
        OffersItemToken offersItemToken2;
        RecentlyViewed recentlyViewed2;
        Object withContext;
        RealOffersTabRepository realOffersTabRepository = this.offersTabRepository;
        CoroutineContext coroutineContext = realOffersTabRepository.ioDispatcher;
        if (continuationImpl instanceof RealOffersTabRefresher$refreshSearchNullState$1) {
            realOffersTabRefresher$refreshSearchNullState$1 = (RealOffersTabRefresher$refreshSearchNullState$1) continuationImpl;
            int i2 = realOffersTabRefresher$refreshSearchNullState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRefresher$refreshSearchNullState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersTabRefresher$refreshSearchNullState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRefresher$refreshSearchNullState$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOffersTabRefresher$refreshSearchNullState$1.L$0 = offersItemToken;
                    realOffersTabRefresher$refreshSearchNullState$1.L$1 = offersTabRepository$SearchSource;
                    realOffersTabRefresher$refreshSearchNullState$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, new InviteErrorPresenter$models$1$1(realOffersTabRepository, continuation, 7), realOffersTabRefresher$refreshSearchNullState$1);
                } else if (i == 1) {
                    offersTabRepository$SearchSource = realOffersTabRefresher$refreshSearchNullState$1.L$1;
                    offersItemToken = realOffersTabRefresher$refreshSearchNullState$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    recentlyViewed2 = realOffersTabRefresher$refreshSearchNullState$1.L$2;
                    offersTabRepository$SearchSource = realOffersTabRefresher$refreshSearchNullState$1.L$1;
                    offersItemToken2 = realOffersTabRefresher$refreshSearchNullState$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    recentlyViewed = recentlyViewed2;
                    offersItemToken = offersItemToken2;
                    if (offersItemToken != null) {
                        if (offersItemToken.equals(recentlyViewed != null ? recentlyViewed.itemToken : null)) {
                            return Unit.INSTANCE;
                        }
                    }
                    realOffersTabRefresher$refreshSearchNullState$1.L$0 = null;
                    realOffersTabRefresher$refreshSearchNullState$1.L$1 = null;
                    realOffersTabRefresher$refreshSearchNullState$1.L$2 = null;
                    realOffersTabRefresher$refreshSearchNullState$1.label = 3;
                    withContext = JobKt.withContext(this.mainDispatcher, new GenieViewKt$GenieView$1$1(this, offersTabRepository$SearchSource, continuation, 27), realOffersTabRefresher$refreshSearchNullState$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                }
                recentlyViewed = (RecentlyViewed) CollectionsKt.firstOrNull((List) obj);
                if (offersItemToken != null) {
                    realOffersTabRefresher$refreshSearchNullState$1.L$0 = offersItemToken;
                    realOffersTabRefresher$refreshSearchNullState$1.L$1 = offersTabRepository$SearchSource;
                    realOffersTabRefresher$refreshSearchNullState$1.L$2 = recentlyViewed;
                    realOffersTabRefresher$refreshSearchNullState$1.label = 2;
                    Object withContext2 = JobKt.withContext(coroutineContext, new GenieViewKt$GenieView$1$1(realOffersTabRepository, offersItemToken, continuation, 28), realOffersTabRefresher$refreshSearchNullState$1);
                    if (withContext2 != coroutineSingletons) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 != coroutineSingletons) {
                        offersItemToken2 = offersItemToken;
                        recentlyViewed2 = recentlyViewed;
                        recentlyViewed = recentlyViewed2;
                        offersItemToken = offersItemToken2;
                    }
                    return coroutineSingletons;
                }
                if (offersItemToken != null) {
                }
                realOffersTabRefresher$refreshSearchNullState$1.L$0 = null;
                realOffersTabRefresher$refreshSearchNullState$1.L$1 = null;
                realOffersTabRefresher$refreshSearchNullState$1.L$2 = null;
                realOffersTabRefresher$refreshSearchNullState$1.label = 3;
                withContext = JobKt.withContext(this.mainDispatcher, new GenieViewKt$GenieView$1$1(this, offersTabRepository$SearchSource, continuation, 27), realOffersTabRefresher$refreshSearchNullState$1);
                if (withContext != coroutineSingletons) {
                }
            }
        }
        realOffersTabRefresher$refreshSearchNullState$1 = new RealOffersTabRefresher$refreshSearchNullState$1(this, continuationImpl);
        Object obj2 = realOffersTabRefresher$refreshSearchNullState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRefresher$refreshSearchNullState$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        recentlyViewed = (RecentlyViewed) CollectionsKt.firstOrNull((List) obj2);
        if (offersItemToken != null) {
        }
        if (offersItemToken != null) {
        }
        realOffersTabRefresher$refreshSearchNullState$1.L$0 = null;
        realOffersTabRefresher$refreshSearchNullState$1.L$1 = null;
        realOffersTabRefresher$refreshSearchNullState$1.L$2 = null;
        realOffersTabRefresher$refreshSearchNullState$1.label = 3;
        withContext = JobKt.withContext(this.mainDispatcher, new GenieViewKt$GenieView$1$1(this, offersTabRepository$SearchSource, continuation2, 27), realOffersTabRefresher$refreshSearchNullState$1);
        if (withContext != coroutineSingletons) {
        }
    }
}
