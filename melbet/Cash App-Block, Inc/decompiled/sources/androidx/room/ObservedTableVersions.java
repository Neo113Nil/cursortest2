package androidx.room;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.Data;
import androidx.datastore.core.Final;
import androidx.datastore.core.ReadException;
import androidx.datastore.core.State;
import androidx.datastore.core.UnInitialized;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ObservedTableVersions {
    public final StateFlowImpl versions;

    public ObservedTableVersions() {
        this.versions = FlowKt.MutableStateFlow(UnInitialized.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void collect(TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2, ContinuationImpl continuationImpl) {
        ObservedTableVersions$collect$1 observedTableVersions$collect$1;
        int i;
        if (continuationImpl instanceof ObservedTableVersions$collect$1) {
            observedTableVersions$collect$1 = (ObservedTableVersions$collect$1) continuationImpl;
            int i2 = observedTableVersions$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                observedTableVersions$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = observedTableVersions$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observedTableVersions$collect$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    observedTableVersions$collect$1.label = 1;
                    this.versions.collect(triggerBasedInvalidationTracker$createFlow$1$2, observedTableVersions$collect$1);
                    return;
                }
            }
        }
        observedTableVersions$collect$1 = new ObservedTableVersions$collect$1(this, continuationImpl);
        Object obj2 = observedTableVersions$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observedTableVersions$collect$1.label;
        if (i == 0) {
        }
    }

    public State getCurrentState() {
        return (State) this.versions.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r6.version > r2.version) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void tryUpdate(State state) {
        StateFlowImpl stateFlowImpl;
        Object value;
        State state2;
        state.getClass();
        do {
            stateFlowImpl = this.versions;
            value = stateFlowImpl.getValue();
            state2 = (State) value;
            if (!(state2 instanceof ReadException ? true : Intrinsics.areEqual(state2, UnInitialized.INSTANCE))) {
                if (!(state2 instanceof Data)) {
                    if (!(state2 instanceof Final)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
            }
            state2 = state;
        } while (!stateFlowImpl.compareAndSet(value, state2));
    }

    public ObservedTableVersions(int i) {
        this.versions = FlowKt.MutableStateFlow(new int[i]);
    }
}
