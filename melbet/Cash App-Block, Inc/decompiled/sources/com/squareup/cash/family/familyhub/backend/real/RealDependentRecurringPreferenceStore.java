package com.squareup.cash.family.familyhub.backend.real;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreference;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager$investingPortfolio$1$1;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager$investingPortfolio$2$1;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes6.dex */
public final class RealDependentRecurringPreferenceStore implements DependentRecurringPreferenceStore {
    public final RealTargetEntityManager targetEntityManager;

    public RealDependentRecurringPreferenceStore(RealTargetEntityManager realTargetEntityManager) {
        this.targetEntityManager = realTargetEntityManager;
    }

    public final DependentRecurringPreference bitcoinRecurringPreference(String str, GapComposer gapComposer, int i) {
        gapComposer.startReplaceGroup(-805046941);
        DependentRecurringPreference recurringPreference = recurringPreference(str, ScheduledTransactionPreference.Type.BTC_BUY, gapComposer, (i & 14) | 48);
        gapComposer.end(false);
        return recurringPreference;
    }

    public final DependentRecurringPreference investingRecurringPreference(String str, Composer composer) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1244621972);
        DependentRecurringPreference recurringPreference = recurringPreference(str, ScheduledTransactionPreference.Type.EQUITY_BUY, gapComposer, 48);
        gapComposer.end(false);
        return recurringPreference;
    }

    public final DependentRecurringPreference recurringPreference(String str, ScheduledTransactionPreference.Type type2, Composer composer, int i) {
        MutableState mutableState;
        Object obj;
        Object obj2 = null;
        boolean z = false;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        int i2 = i << 3;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1539198126);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            obj3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
        boolean changedInstance = gapComposer.changedInstance(MutableSharedFlow$default);
        RealTargetEntityManager realTargetEntityManager = this.targetEntityManager;
        boolean changedInstance2 = gapComposer.changedInstance(realTargetEntityManager) | changedInstance;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            RealTargetEntityManager$investingPortfolio$1$1 realTargetEntityManager$investingPortfolio$1$1 = new RealTargetEntityManager$investingPortfolio$1$1(MutableSharedFlow$default, realTargetEntityManager, parcelableSnapshotMutableIntState, null, 1);
            gapComposer.updateRememberedValue(realTargetEntityManager$investingPortfolio$1$1);
            rememberedValue2 = realTargetEntityManager$investingPortfolio$1$1;
        }
        Updater.LaunchedEffect(gapComposer, MutableSharedFlow$default, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        TargetEntityManager$TargetEntityValue.Loading loading = TargetEntityManager$TargetEntityValue.Loading.INSTANCE;
        Object obj4 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            List list = (List) ((Map) realTargetEntityManager.cachedRecurringPreferences.getValue()).get(str);
            Object ready = list != null ? new TargetEntityManager$TargetEntityValue.Ready(null, list, null, 5) : null;
            if (ready == null) {
                ready = loading;
            }
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(ready);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj4 = mutableStateOf$default;
        }
        MutableState mutableState2 = (MutableState) obj4;
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance3 = ((((i2 & 112) ^ 48) > 32 && gapComposer.changed(str)) || (i2 & 48) == 32) | gapComposer.changedInstance(realTargetEntityManager);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
            mutableState = mutableState2;
            RealTargetEntityManager$investingPortfolio$2$1 realTargetEntityManager$investingPortfolio$2$1 = new RealTargetEntityManager$investingPortfolio$2$1(str, realTargetEntityManager, mutableState, z ? 1 : 0, 1);
            gapComposer.updateRememberedValue(realTargetEntityManager$investingPortfolio$2$1);
            obj = realTargetEntityManager$investingPortfolio$2$1;
        } else {
            mutableState = mutableState2;
            obj = rememberedValue4;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) obj);
        TargetEntityManager$TargetEntityValue targetEntityManager$TargetEntityValue = (TargetEntityManager$TargetEntityValue) mutableState.getValue();
        gapComposer.end(false);
        if (Intrinsics.areEqual(targetEntityManager$TargetEntityValue, TargetEntityManager$TargetEntityValue.Failed.INSTANCE)) {
            return DependentRecurringPreference.RecurringPreferenceFailedToLoad.INSTANCE;
        }
        if (Intrinsics.areEqual(targetEntityManager$TargetEntityValue, loading)) {
            return DependentRecurringPreference.RecurringPreferenceLoading.INSTANCE;
        }
        if (!(targetEntityManager$TargetEntityValue instanceof TargetEntityManager$TargetEntityValue.Ready)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Iterator it = ((TargetEntityManager$TargetEntityValue.Ready) targetEntityManager$TargetEntityValue).recurringPreferences.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ScheduledTransactionPreference scheduledTransactionPreference = ((SyncRecurringPreference) next).preference;
            if ((scheduledTransactionPreference != null ? scheduledTransactionPreference.type : null) == type2) {
                obj2 = next;
                break;
            }
        }
        return new DependentRecurringPreference.RecurringPreferenceLoaded((SyncRecurringPreference) obj2);
    }
}
