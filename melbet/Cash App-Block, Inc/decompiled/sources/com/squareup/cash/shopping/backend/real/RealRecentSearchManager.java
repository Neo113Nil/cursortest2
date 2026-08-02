package com.squareup.cash.shopping.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashstorefronts.api.CashStorefrontsClientService;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealRecentSearchManager {
    public final CoroutineContext ioDispatcher;
    public final StoryQueries recentSearchesQueries;
    public final GpsConfigQueries recentlyViewedQueries;
    public final CoroutineScope scope;
    public final CashStorefrontsClientService service;

    public RealRecentSearchManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, CashStorefrontsClientService cashStorefrontsClientService, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.service = cashStorefrontsClientService;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
        this.recentSearchesQueries = cashAccountDatabaseImpl.shoppingRecentSearchesQueries;
        this.recentlyViewedQueries = cashAccountDatabaseImpl.shoppingRecentlyViewedQueries;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$resultOrEmpty(RealRecentSearchManager realRecentSearchManager, Deferred deferred, ContinuationImpl continuationImpl) {
        RealRecentSearchManager$resultOrEmpty$1 realRecentSearchManager$resultOrEmpty$1;
        int i;
        realRecentSearchManager.getClass();
        try {
            if (continuationImpl instanceof RealRecentSearchManager$resultOrEmpty$1) {
                realRecentSearchManager$resultOrEmpty$1 = (RealRecentSearchManager$resultOrEmpty$1) continuationImpl;
                int i2 = realRecentSearchManager$resultOrEmpty$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realRecentSearchManager$resultOrEmpty$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realRecentSearchManager$resultOrEmpty$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realRecentSearchManager$resultOrEmpty$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realRecentSearchManager$resultOrEmpty$1.label = 1;
                        obj = deferred.await(realRecentSearchManager$resultOrEmpty$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (Exception e) {
            Timber.Forest.w("Unable to retrieve recent search history from database.", new Object[0], e);
            return EmptyList.INSTANCE;
        }
        realRecentSearchManager$resultOrEmpty$1 = new RealRecentSearchManager$resultOrEmpty$1(realRecentSearchManager, continuationImpl);
        Object obj3 = realRecentSearchManager$resultOrEmpty$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecentSearchManager$resultOrEmpty$1.label;
    }
}
