package com.squareup.cash.family.familyhub.backend.real.sync;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.protos.cash.clientsync.service.ClientSyncAppApiService;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealTargetEntityManager {
    public final StateFlowImpl cachedInvestmentHoldings;
    public final StateFlowImpl cachedRecurringPreferences;
    public final StateFlowImpl cachedSyncValues;
    public final ClientSyncAppApiService service;
    public final Flow signOut;

    public RealTargetEntityManager(ClientSyncAppApiService clientSyncAppApiService, Flow flow, CoroutineScope coroutineScope) {
        this.service = clientSyncAppApiService;
        this.signOut = flow;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.cachedSyncValues = FlowKt.MutableStateFlow(emptyMap);
        this.cachedRecurringPreferences = FlowKt.MutableStateFlow(emptyMap);
        this.cachedInvestmentHoldings = FlowKt.MutableStateFlow(emptyMap);
        JobKt.launch$default(coroutineScope, null, null, new GooglePayPresenter$models$1$1(this, null, 20), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final TargetEntityManager$TargetEntityValue syncValues(SharedFlowImpl sharedFlowImpl, String str, List list, GapComposer gapComposer, int i) {
        Object earningsHomePresenter$models$3$1;
        ?? r4;
        sharedFlowImpl.getClass();
        str.getClass();
        list.getClass();
        gapComposer.startReplaceGroup(-2136161241);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(sharedFlowImpl) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            Continuation continuation = null;
            earningsHomePresenter$models$3$1 = new EarningsHomePresenter$models$3$1(sharedFlowImpl, this, parcelableSnapshotMutableIntState, continuation, 17);
            gapComposer.updateRememberedValue(earningsHomePresenter$models$3$1);
            r4 = continuation;
        } else {
            earningsHomePresenter$models$3$1 = rememberedValue2;
            r4 = 0;
        }
        Updater.LaunchedEffect(gapComposer, sharedFlowImpl, (Function2) earningsHomePresenter$models$3$1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            List list2 = (List) ((Map) this.cachedSyncValues.getValue()).get(str);
            Object ready = list2 != null ? new TargetEntityManager$TargetEntityValue.Ready(list2, r4, r4, 6) : r4;
            if (ready == null) {
                ready = TargetEntityManager$TargetEntityValue.Loading.INSTANCE;
            }
            rememberedValue3 = Updater.mutableStateOf$default(ready);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance2 = ((((i & 112) ^ 48) > 32 && gapComposer.changed(str)) || (i & 48) == 32) | gapComposer.changedInstance(list) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
            RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(str, list, this, mutableState, null, 10);
            gapComposer.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
            rememberedValue4 = realFidesmoClient$observeDeviceState$1;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
        TargetEntityManager$TargetEntityValue targetEntityManager$TargetEntityValue = (TargetEntityManager$TargetEntityValue) mutableState.getValue();
        gapComposer.end(false);
        return targetEntityManager$TargetEntityValue;
    }
}
