package com.squareup.cash.bitcoin.graph.real;

import androidx.paging.PageFetcher$flow$1;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes.dex */
public final class RealBitcoinGraphModelProvider {
    public final RealBitcoinGraphModelCache bitcoinGraphModelCache;
    public final Reward$Adapter bitcoinHistoricalDataRepo;

    public RealBitcoinGraphModelProvider(Reward$Adapter reward$Adapter, RealBitcoinGraphModelCache realBitcoinGraphModelCache) {
        this.bitcoinHistoricalDataRepo = reward$Adapter;
        this.bitcoinGraphModelCache = realBitcoinGraphModelCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1] */
    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 bitcoinGraphModel(HistoricalRange historicalRange) {
        Continuation continuation;
        SharedFlow sharedFlow;
        historicalRange.getClass();
        Reward$Adapter reward$Adapter = this.bitcoinHistoricalDataRepo;
        synchronized (((LinkedHashMap) reward$Adapter.boost_attributesAdapter)) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) reward$Adapter.boost_attributesAdapter;
                Object obj = linkedHashMap.get(historicalRange);
                continuation = null;
                if (obj == null) {
                    obj = FlowKt.shareIn(FlowKt.flatMapConcat(new GLSceneScopeProvider$SceneScope$2$1$1(reward$Adapter, historicalRange, continuation, 26), new RealDrawerOpener$getDrawerScreen$$inlined$map$1(((RealJurisdictionConfigManager) reward$Adapter.reward_selection_stateAdapter).select(), 5)), (CoroutineScope) reward$Adapter.program_detail_rowsAdapter, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                    linkedHashMap.put(historicalRange, obj);
                }
                sharedFlow = (SharedFlow) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sharedFlow.getReplayCache().isEmpty()) {
            sharedFlow = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(19), sharedFlow);
        }
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new ToastKt$Toast$9$1(this, historicalRange, continuation, 25), new RealActivityInvitePresenter(4, sharedFlow, this, historicalRange));
    }
}
