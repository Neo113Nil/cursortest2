package com.squareup.cash.family.familyhub.backend.real.sync;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealTargetEntityManager$syncValues$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $triggerCount$delegate;
    public final /* synthetic */ RealTargetEntityManager this$0;

    public /* synthetic */ RealTargetEntityManager$syncValues$1$1$1(RealTargetEntityManager realTargetEntityManager, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, int i) {
        this.$r8$classId = i;
        this.this$0 = realTargetEntityManager;
        this.$triggerCount$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        EmptyMap emptyMap;
        Object value2;
        EmptyMap emptyMap2;
        Object value3;
        EmptyMap emptyMap3;
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$triggerCount$delegate;
        RealTargetEntityManager realTargetEntityManager = this.this$0;
        switch (i) {
            case 0:
                TargetEntityManager$TargetEntityEvent$Refresh targetEntityManager$TargetEntityEvent$Refresh = (TargetEntityManager$TargetEntityEvent$Refresh) obj;
                if (!(targetEntityManager$TargetEntityEvent$Refresh instanceof TargetEntityManager$TargetEntityEvent$Refresh)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    if (targetEntityManager$TargetEntityEvent$Refresh.clearCache) {
                        StateFlowImpl stateFlowImpl = realTargetEntityManager.cachedSyncValues;
                        do {
                            value = stateFlowImpl.getValue();
                            emptyMap = EmptyMap.INSTANCE;
                            emptyMap.getClass();
                        } while (!stateFlowImpl.compareAndSet(value, emptyMap));
                    }
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                    break;
                }
            case 1:
                TargetEntityManager$TargetEntityEvent$Refresh targetEntityManager$TargetEntityEvent$Refresh2 = (TargetEntityManager$TargetEntityEvent$Refresh) obj;
                if (!(targetEntityManager$TargetEntityEvent$Refresh2 instanceof TargetEntityManager$TargetEntityEvent$Refresh)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    if (targetEntityManager$TargetEntityEvent$Refresh2.clearCache) {
                        StateFlowImpl stateFlowImpl2 = realTargetEntityManager.cachedInvestmentHoldings;
                        do {
                            value2 = stateFlowImpl2.getValue();
                            emptyMap2 = EmptyMap.INSTANCE;
                            emptyMap2.getClass();
                        } while (!stateFlowImpl2.compareAndSet(value2, emptyMap2));
                    }
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                    break;
                }
            default:
                TargetEntityManager$TargetEntityEvent$Refresh targetEntityManager$TargetEntityEvent$Refresh3 = (TargetEntityManager$TargetEntityEvent$Refresh) obj;
                if (!(targetEntityManager$TargetEntityEvent$Refresh3 instanceof TargetEntityManager$TargetEntityEvent$Refresh)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    if (targetEntityManager$TargetEntityEvent$Refresh3.clearCache) {
                        StateFlowImpl stateFlowImpl3 = realTargetEntityManager.cachedRecurringPreferences;
                        do {
                            value3 = stateFlowImpl3.getValue();
                            emptyMap3 = EmptyMap.INSTANCE;
                            emptyMap3.getClass();
                        } while (!stateFlowImpl3.compareAndSet(value3, emptyMap3));
                    }
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                    break;
                }
        }
        return null;
    }
}
