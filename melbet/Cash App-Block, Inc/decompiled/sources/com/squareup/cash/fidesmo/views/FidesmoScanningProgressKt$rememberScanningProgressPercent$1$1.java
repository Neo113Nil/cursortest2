package com.squareup.cash.fidesmo.views;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FidesmoScanningProgressKt$rememberScanningProgressPercent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $displayedPercent$delegate;
    public final /* synthetic */ ScanningProgressSegment $progressSegment;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public long J$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoScanningProgressKt$rememberScanningProgressPercent$1$1(ScanningProgressSegment scanningProgressSegment, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$progressSegment = scanningProgressSegment;
        this.$displayedPercent$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FidesmoScanningProgressKt$rememberScanningProgressPercent$1$1(this.$progressSegment, this.$displayedPercent$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FidesmoScanningProgressKt$rememberScanningProgressPercent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ba, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r2, r19) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r9, r19) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00ba -> B:6:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:18:0x0075). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        long max;
        int i3;
        int i4;
        long max2;
        int i5;
        int i6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        ScanningProgressSegment scanningProgressSegment = this.$progressSegment;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$displayedPercent$delegate;
        if (i7 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (scanningProgressSegment == null) {
                parcelableSnapshotMutableIntState.setIntValue(0);
                return Unit.INSTANCE;
            }
            int i8 = scanningProgressSegment.startInclusive;
            int max3 = Math.max(1, Math.abs(i8 - parcelableSnapshotMutableIntState.getIntValue()));
            i = i8;
            i2 = max3;
            max = Math.max(1L, 400 / max3);
            if (parcelableSnapshotMutableIntState.getIntValue() == i) {
            }
        } else if (i7 == 1) {
            max = this.J$0;
            i2 = this.I$1;
            i = this.I$0;
            SafeTrace.throwOnFailure(obj);
            int intValue = parcelableSnapshotMutableIntState.getIntValue();
            if (intValue < i) {
                intValue++;
            } else if (intValue > i) {
                intValue--;
            }
            parcelableSnapshotMutableIntState.setIntValue(intValue);
            if (parcelableSnapshotMutableIntState.getIntValue() == i) {
                this.I$0 = i;
                this.I$1 = i2;
                this.J$0 = max;
                this.label = 1;
            } else {
                i3 = scanningProgressSegment.endInclusive;
                int max4 = Math.max(1, i3 - parcelableSnapshotMutableIntState.getIntValue());
                int i9 = i;
                i4 = i2;
                max2 = Math.max(1L, 2000 / max4);
                i5 = max4;
                i6 = i9;
                if (parcelableSnapshotMutableIntState.getIntValue() < i3) {
                }
            }
        } else {
            if (i7 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            max2 = this.J$1;
            i5 = this.I$3;
            i3 = this.I$2;
            max = this.J$0;
            i4 = this.I$1;
            i6 = this.I$0;
            SafeTrace.throwOnFailure(obj);
            NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
            if (parcelableSnapshotMutableIntState.getIntValue() < i3) {
                return Unit.INSTANCE;
            }
            this.I$0 = i6;
            this.I$1 = i4;
            this.J$0 = max;
            this.I$2 = i3;
            this.I$3 = i5;
            this.J$1 = max2;
            this.label = 2;
        }
    }
}
