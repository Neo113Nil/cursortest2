package com.squareup.cash.favorites.data;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashfavorites.api.v1.AddFavoriteRequest;
import com.squareup.protos.cash.cashfavorites.api.v1.AddFavoriteResponse;
import com.squareup.protos.cash.cashfavorites.api.v1.CashFavoritesService;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.favorites.Favorite;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFavoritesRepository {
    public final AndroidClock clock;
    public final RewardSlotQueries customerQueries;
    public final SessionQueries favoriteRecipientQueries;
    public final CoroutineContext ioDispatcher;
    public final CashFavoritesService service;
    public final SyncValueReader syncValueReader;

    public RealFavoritesRepository(CashAccountDatabaseImpl cashAccountDatabaseImpl, RealSuggestedRecipientsVendor realSuggestedRecipientsVendor, AndroidClock androidClock, CashFavoritesService cashFavoritesService, SyncValueReader syncValueReader, CoroutineContext coroutineContext) {
        this.clock = androidClock;
        this.service = cashFavoritesService;
        this.syncValueReader = syncValueReader;
        this.ioDispatcher = coroutineContext;
        this.customerQueries = cashAccountDatabaseImpl.customerQueries;
        this.favoriteRecipientQueries = cashAccountDatabaseImpl.favoriteRecipientsQueries;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addFavorite(String str, FavoriteOrigin favoriteOrigin, String str2, ContinuationImpl continuationImpl) {
        RealFavoritesRepository$addFavorite$1 realFavoritesRepository$addFavorite$1;
        int i;
        if (continuationImpl instanceof RealFavoritesRepository$addFavorite$1) {
            realFavoritesRepository$addFavorite$1 = (RealFavoritesRepository$addFavorite$1) continuationImpl;
            int i2 = realFavoritesRepository$addFavorite$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFavoritesRepository$addFavorite$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFavoritesRepository$addFavorite$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFavoritesRepository$addFavorite$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AddFavoriteRequest addFavoriteRequest = new AddFavoriteRequest(str, null, DimensionKt.now(this.clock), favoriteOrigin, str2, ByteString.EMPTY);
                    realFavoritesRepository$addFavorite$1.label = 1;
                    obj = this.service.addFavorite(addFavoriteRequest, realFavoritesRepository$addFavorite$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                return Boolean.valueOf(!(apiResult instanceof ApiResult.Success) ? Intrinsics.areEqual(((AddFavoriteResponse) ((ApiResult.Success) apiResult).response).is_first_time_customer_favorite, Boolean.TRUE) : false);
            }
        }
        realFavoritesRepository$addFavorite$1 = new RealFavoritesRepository$addFavorite$1(this, continuationImpl);
        Object obj2 = realFavoritesRepository$addFavorite$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFavoritesRepository$addFavorite$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        return Boolean.valueOf(!(apiResult2 instanceof ApiResult.Success) ? Intrinsics.areEqual(((AddFavoriteResponse) ((ApiResult.Success) apiResult2).response).is_first_time_customer_favorite, Boolean.TRUE) : false);
    }

    public final ChannelFlowTransformLatest getFavorites() {
        return FlowKt.transformLatest(this.syncValueReader.getAllValues(AndroidSyncValueSpecs.Favorite, new FamilyActivityFixtures$$ExternalSyntheticLambda0(17)), new AnchoredDraggableNode$drag$2(null, this, 19));
    }

    public final boolean isFavorite(String str) {
        str.getClass();
        Iterable iterable = (Iterable) this.syncValueReader.getAllValues(AndroidSyncValueSpecs.Favorite).getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Favorite) it.next()).favorite_customer_token, str)) {
                return true;
            }
        }
        return false;
    }
}
