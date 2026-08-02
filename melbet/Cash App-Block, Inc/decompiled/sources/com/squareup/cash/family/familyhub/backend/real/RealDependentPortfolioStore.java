package com.squareup.cash.family.familyhub.backend.real;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.family.familyhub.backend.api.DependentPortfolio;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager$investingPortfolio$1$1;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager$investingPortfolio$2$1;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes6.dex */
public final class RealDependentPortfolioStore {
    public final RealTargetEntityManager targetEntityManager;

    public RealDependentPortfolioStore(RealTargetEntityManager realTargetEntityManager) {
        this.targetEntityManager = realTargetEntityManager;
    }

    public final DependentPortfolio stockPortfolio(String str, Composer composer) {
        MutableState mutableState;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-145846709);
        Continuation continuation = null;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        gapComposer.startReplaceGroup(-1904846513);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(MutableSharedFlow$default);
        RealTargetEntityManager realTargetEntityManager = this.targetEntityManager;
        boolean changedInstance2 = gapComposer.changedInstance(realTargetEntityManager) | changedInstance;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == obj) {
            RealTargetEntityManager$investingPortfolio$1$1 realTargetEntityManager$investingPortfolio$1$1 = new RealTargetEntityManager$investingPortfolio$1$1(MutableSharedFlow$default, realTargetEntityManager, parcelableSnapshotMutableIntState, null, 0);
            gapComposer.updateRememberedValue(realTargetEntityManager$investingPortfolio$1$1);
            rememberedValue2 = realTargetEntityManager$investingPortfolio$1$1;
        }
        Updater.LaunchedEffect(gapComposer, MutableSharedFlow$default, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        TargetEntityManager$TargetEntityValue.Loading loading = TargetEntityManager$TargetEntityValue.Loading.INSTANCE;
        if (rememberedValue3 == obj) {
            List list = (List) ((Map) realTargetEntityManager.cachedInvestmentHoldings.getValue()).get(str);
            Object ready = list != null ? new TargetEntityManager$TargetEntityValue.Ready(null, null, list, 3) : null;
            if (ready == null) {
                ready = loading;
            }
            rememberedValue3 = Updater.mutableStateOf$default(ready);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changed = gapComposer.changed(str) | gapComposer.changedInstance(realTargetEntityManager);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj) {
            mutableState = mutableState2;
            RealTargetEntityManager$investingPortfolio$2$1 realTargetEntityManager$investingPortfolio$2$1 = new RealTargetEntityManager$investingPortfolio$2$1(str, realTargetEntityManager, mutableState, continuation, 0);
            gapComposer.updateRememberedValue(realTargetEntityManager$investingPortfolio$2$1);
            rememberedValue4 = realTargetEntityManager$investingPortfolio$2$1;
        } else {
            mutableState = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
        TargetEntityManager$TargetEntityValue targetEntityManager$TargetEntityValue = (TargetEntityManager$TargetEntityValue) mutableState.getValue();
        gapComposer.end(false);
        boolean areEqual = Intrinsics.areEqual(targetEntityManager$TargetEntityValue, TargetEntityManager$TargetEntityValue.Failed.INSTANCE);
        DependentPortfolio dependentPortfolio = DependentPortfolio.FailedToLoad.INSTANCE;
        if (!areEqual) {
            if (Intrinsics.areEqual(targetEntityManager$TargetEntityValue, loading)) {
                dependentPortfolio = DependentPortfolio.Loading.INSTANCE;
            } else if (targetEntityManager$TargetEntityValue instanceof TargetEntityManager$TargetEntityValue.Ready) {
                dependentPortfolio = new DependentPortfolio.Loaded(((TargetEntityManager$TargetEntityValue.Ready) targetEntityManager$TargetEntityValue).investmentHoldings);
            } else if (targetEntityManager$TargetEntityValue != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        gapComposer.end(false);
        return dependentPortfolio;
    }
}
