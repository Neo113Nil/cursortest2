package com.squareup.cash.offers.backend.real;

import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.backend.RealBoostRepository$getAllOrderedBoosts$$inlined$map$1;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealOffersAnalyticsHelper {
    public final RealBoostRepository boostRepository;
    public final ReadonlyStateFlow currentMerchantNameFlow;
    public final ReadonlyStateFlow currentMerchantTokenFlow;
    public final ReadonlyStateFlow currentOfferTokenFlow;
    public Origin origin;
    public final SharedPreferences preferences;
    public String referrerFlowToken;
    public final ReadonlyStateFlow rewardsMetadataFlow;
    public final StateFlowImpl shopSessionId = FlowKt.MutableStateFlow(null);
    public String searchSourceScreen = "";
    public String searchSourceSection = "";
    public String searchSourceFilter = "";

    public RealOffersAnalyticsHelper(SharedPreferences sharedPreferences, RealUuidGenerator realUuidGenerator, RealFlowTokenGenerator realFlowTokenGenerator, RealBoostRepository realBoostRepository, CoroutineScope coroutineScope) {
        this.preferences = sharedPreferences;
        this.boostRepository = realBoostRepository;
        Continuation continuation = null;
        RealBoostProvider realBoostProvider = realBoostRepository.boostProvider;
        int i = 0;
        Flow boostSlots = realBoostProvider.getBoostSlots(false);
        StartedLazily startedLazily = SharingStarted.Companion.Eagerly;
        ReadonlySharedFlow shareIn = FlowKt.shareIn(boostSlots, coroutineScope, startedLazily, 1);
        ReadonlyStateFlow stateIn = FlowKt.stateIn(FlowKt.distinctUntilChanged(new RealBoostRepository$getAllOrderedBoosts$$inlined$map$1(realBoostProvider.getCategorizedBoosts(), i)), coroutineScope, startedLazily, EmptyList.INSTANCE);
        this.currentOfferTokenFlow = FlowKt.stateIn(new RealOffersAnalyticsHelper$special$$inlined$map$1(shareIn, i), coroutineScope, startedLazily, null);
        this.currentMerchantTokenFlow = FlowKt.stateIn(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(shareIn, new RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(continuation, this, i)), 12), coroutineScope, startedLazily, null);
        this.currentMerchantNameFlow = FlowKt.stateIn(FlowKt.transformLatest(shareIn, new RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(continuation, this, 1)), coroutineScope, startedLazily, null);
        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(stateIn, new RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(continuation, this, 2));
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.rewardsMetadataFlow = FlowKt.stateIn(transformLatest, coroutineScope, startedLazily, emptyMap);
    }

    public final String activeShopSessionId() {
        return (String) this.shopSessionId.getValue();
    }

    public final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowTokenUpdates(OffersAnalyticsHelper$Flow offersAnalyticsHelper$Flow) {
        return FlowKt.drop(Room.StringKeyValue(this.preferences, offersAnalyticsHelper$Flow.key, "", false).observe(), 1);
    }

    public final String getFlowToken(OffersAnalyticsHelper$Flow offersAnalyticsHelper$Flow) {
        String m;
        String str = offersAnalyticsHelper$Flow.key;
        SharedPreferences sharedPreferences = this.preferences;
        String string2 = sharedPreferences.getString(str, null);
        if (string2 != null) {
            return string2;
        }
        if (offersAnalyticsHelper$Flow.isPlasmaFlow) {
            BlockersData.Flow.INSTANCE.getClass();
            m = BlockersData.Flow.Companion.generateToken();
        } else {
            m = re$$ExternalSyntheticOutline0.m();
        }
        sharedPreferences.edit().putString(str, m).apply();
        return m;
    }

    public final String getReferrerFlowToken() {
        String str = this.referrerFlowToken;
        if (str != null) {
            return str;
        }
        String flowToken = getFlowToken(OffersAnalyticsHelper$Flow.REFERRER);
        this.referrerFlowToken = flowToken;
        return flowToken;
    }

    public final Map getRewardMetadataDict() {
        return (Map) this.rewardsMetadataFlow.$$delegate_0.getValue();
    }

    public final void refreshFlowToken(OffersAnalyticsHelper$Flow offersAnalyticsHelper$Flow) {
        String m;
        if (offersAnalyticsHelper$Flow.isPlasmaFlow) {
            BlockersData.Flow.INSTANCE.getClass();
            m = BlockersData.Flow.Companion.generateToken();
        } else {
            m = re$$ExternalSyntheticOutline0.m();
        }
        this.preferences.edit().putString(offersAnalyticsHelper$Flow.key, m).apply();
    }
}
