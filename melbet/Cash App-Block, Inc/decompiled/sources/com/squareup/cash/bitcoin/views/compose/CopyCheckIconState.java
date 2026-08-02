package com.squareup.cash.bitcoin.views.compose;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CopyCheckIconState {
    public final StateFlowImpl _showCheckMark = FlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showCheck(ContinuationImpl continuationImpl) {
        CopyCheckIconState$showCheck$1 copyCheckIconState$showCheck$1;
        int i;
        if (continuationImpl instanceof CopyCheckIconState$showCheck$1) {
            copyCheckIconState$showCheck$1 = (CopyCheckIconState$showCheck$1) continuationImpl;
            int i2 = copyCheckIconState$showCheck$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                copyCheckIconState$showCheck$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = copyCheckIconState$showCheck$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = copyCheckIconState$showCheck$1.label;
                StateFlowImpl stateFlowImpl = this._showCheckMark;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) stateFlowImpl.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    Boolean bool = Boolean.TRUE;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    copyCheckIconState$showCheck$1.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, copyCheckIconState$showCheck$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Boolean bool2 = Boolean.FALSE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool2);
                return Unit.INSTANCE;
            }
        }
        copyCheckIconState$showCheck$1 = new CopyCheckIconState$showCheck$1(this, continuationImpl);
        Object obj2 = copyCheckIconState$showCheck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = copyCheckIconState$showCheck$1.label;
        StateFlowImpl stateFlowImpl2 = this._showCheckMark;
        if (i != 0) {
        }
        Boolean bool22 = Boolean.FALSE;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, bool22);
        return Unit.INSTANCE;
    }
}
