package com.squareup.cash.favorites.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectAddFavorite;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectRemoveFavorite;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.cashfavorites.api.v1.RemoveFavoriteRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFavoritesManager {
    public final Analytics analytics;
    public final RealFavoritesRepository favoritesRepository;
    public final RealNetworkInfo networkInfo;
    public final RealRecipientRepository recipientRepository;

    public RealFavoritesManager(RealFavoritesRepository realFavoritesRepository, RealRecipientRepository realRecipientRepository, RealNetworkInfo realNetworkInfo, Analytics analytics) {
        this.favoritesRepository = realFavoritesRepository;
        this.recipientRepository = realRecipientRepository;
        this.networkInfo = realNetworkInfo;
        this.analytics = analytics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r2 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum addFavorite(String str, FavoriteOrigin favoriteOrigin, String str2, AddFavoriteAnalytics addFavoriteAnalytics, ContinuationImpl continuationImpl) {
        RealFavoritesManager$addFavorite$1 realFavoritesManager$addFavorite$1;
        Object obj;
        int i;
        String str3;
        FavoriteOrigin favoriteOrigin2;
        String str4;
        if (continuationImpl instanceof RealFavoritesManager$addFavorite$1) {
            realFavoritesManager$addFavorite$1 = (RealFavoritesManager$addFavorite$1) continuationImpl;
            int i2 = realFavoritesManager$addFavorite$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFavoritesManager$addFavorite$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realFavoritesManager$addFavorite$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFavoritesManager$addFavorite$1.label;
                RealFavoritesRepository realFavoritesRepository = this.favoritesRepository;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.analytics.track(new CustomerProfileConnectAddFavorite(str, str2, addFavoriteAnalytics != null ? addFavoriteAnalytics.origin : null, addFavoriteAnalytics != null ? addFavoriteAnalytics.contactsEnabled : null, addFavoriteAnalytics != null ? addFavoriteAnalytics.suggestionStrategy : null), null);
                    if (!this.networkInfo.isNetworkAvailable()) {
                        return FavoritesManager$Operation$Add$Result.NO_CONNECTION;
                    }
                    str3 = str;
                    realFavoritesManager$addFavorite$1.L$0 = str3;
                    favoriteOrigin2 = favoriteOrigin;
                    realFavoritesManager$addFavorite$1.L$1 = favoriteOrigin2;
                    str4 = str2;
                    realFavoritesManager$addFavorite$1.L$2 = str4;
                    realFavoritesManager$addFavorite$1.label = 1;
                    Long l = new Long(((List) realFavoritesRepository.syncValueReader.getAllValues(AndroidSyncValueSpecs.Favorite).getValue()).size());
                    if (l != coroutineSingletons) {
                        obj = l;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Boolean) obj).booleanValue() ? FavoritesManager$Operation$Add$Result.SUCCESS_AND_FIRST_TIME : FavoritesManager$Operation$Add$Result.SUCCESS;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = realFavoritesManager$addFavorite$1.L$2;
                FavoriteOrigin favoriteOrigin3 = realFavoritesManager$addFavorite$1.L$1;
                String str6 = realFavoritesManager$addFavorite$1.L$0;
                SafeTrace.throwOnFailure(obj);
                str4 = str5;
                favoriteOrigin2 = favoriteOrigin3;
                str3 = str6;
                if (((Number) obj).longValue() < 50) {
                    return FavoritesManager$Operation$Add$Result.REACHED_LIMIT;
                }
                realFavoritesManager$addFavorite$1.L$0 = null;
                realFavoritesManager$addFavorite$1.L$1 = null;
                realFavoritesManager$addFavorite$1.L$2 = null;
                realFavoritesManager$addFavorite$1.label = 2;
                obj = realFavoritesRepository.addFavorite(str3, favoriteOrigin2, str4, realFavoritesManager$addFavorite$1);
            }
        }
        realFavoritesManager$addFavorite$1 = new RealFavoritesManager$addFavorite$1(this, continuationImpl);
        obj = realFavoritesManager$addFavorite$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFavoritesManager$addFavorite$1.label;
        RealFavoritesRepository realFavoritesRepository2 = this.favoritesRepository;
        if (i != 0) {
        }
        if (((Number) obj).longValue() < 50) {
        }
    }

    public final Transform$special$$inlined$map$1 getFavorites() {
        return new Transform$special$$inlined$map$1(this.favoritesRepository.getFavorites(), this, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum removeFavorite(String str, FavoriteOrigin favoriteOrigin, RemoveFavoriteAnalytics removeFavoriteAnalytics, ContinuationImpl continuationImpl) {
        RealFavoritesManager$removeFavorite$1 realFavoritesManager$removeFavorite$1;
        int i;
        Object obj;
        if (continuationImpl instanceof RealFavoritesManager$removeFavorite$1) {
            realFavoritesManager$removeFavorite$1 = (RealFavoritesManager$removeFavorite$1) continuationImpl;
            int i2 = realFavoritesManager$removeFavorite$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFavoritesManager$removeFavorite$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realFavoritesManager$removeFavorite$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFavoritesManager$removeFavorite$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    RealFavoritesRepository realFavoritesRepository = this.favoritesRepository;
                    if (realFavoritesRepository.isFavorite(str)) {
                        this.analytics.track(new CustomerProfileConnectRemoveFavorite(str, removeFavoriteAnalytics != null ? removeFavoriteAnalytics.origin : null), null);
                    }
                    if (!this.networkInfo.isNetworkAvailable()) {
                        return FavoritesManager$Operation$Remove$Result.NO_CONNECTION;
                    }
                    realFavoritesManager$removeFavorite$1.label = 1;
                    if (realFavoritesRepository.isFavorite(str)) {
                        obj = realFavoritesRepository.service.removeFavorite(new RemoveFavoriteRequest(str, null, DimensionKt.now(realFavoritesRepository.clock), favoriteOrigin, ByteString.EMPTY), realFavoritesManager$removeFavorite$1);
                        if (obj != coroutineSingletons) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return FavoritesManager$Operation$Remove$Result.SUCCESS;
            }
        }
        realFavoritesManager$removeFavorite$1 = new RealFavoritesManager$removeFavorite$1(this, continuationImpl);
        Object obj22 = realFavoritesManager$removeFavorite$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFavoritesManager$removeFavorite$1.label;
        if (i != 0) {
        }
        return FavoritesManager$Operation$Remove$Result.SUCCESS;
    }
}
