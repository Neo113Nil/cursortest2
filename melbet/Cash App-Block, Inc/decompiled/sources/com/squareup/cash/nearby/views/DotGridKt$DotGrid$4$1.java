package com.squareup.cash.nearby.views;

import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DotGridKt$DotGrid$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activePhase$delegate;
    public final /* synthetic */ MutableFloatState $btPulseElapsed$delegate;
    public final /* synthetic */ MutableFloatState $canvasHeight$delegate;
    public final /* synthetic */ MutableFloatState $canvasWidth$delegate;
    public final /* synthetic */ ChaserState $chaserState;
    public final /* synthetic */ MutableState $currentOnFormationComplete$delegate;
    public final /* synthetic */ MutableState $currentPhase$delegate;
    public final /* synthetic */ MutableState $currentPostFormationPhase$delegate;
    public final /* synthetic */ MutableFloatState $errorPulseElapsed$delegate;
    public final /* synthetic */ MutableFloatState $formationElapsed$delegate;
    public final /* synthetic */ MutableState $formationHasPlayed$delegate;
    public final /* synthetic */ List $frozenPeople;
    public final /* synthetic */ float $noiseSpeed;
    public final /* synthetic */ MutableFloatState $nuxPulseElapsed$delegate;
    public final /* synthetic */ Function1 $onPulsingReady;
    public final /* synthetic */ MutableFloatState $personFoundElapsed$delegate;
    public final /* synthetic */ PulsingState $pulsingState;
    public final /* synthetic */ MutableFloatState $radialElapsed$delegate;
    public final /* synthetic */ MutableState $radialReverseActive$delegate;
    public final /* synthetic */ MutableFloatState $rawDt$delegate;
    public final /* synthetic */ SearchCircle $searchCircle;
    public final /* synthetic */ MutableFloatState $time$delegate;
    public /* synthetic */ Object L$0;
    public Ref$LongRef L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotGridKt$DotGrid$4$1(float f, PulsingState pulsingState, Function1 function1, List list, SearchCircle searchCircle, ChaserState chaserState, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableState mutableState, MutableFloatState mutableFloatState3, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableFloatState mutableFloatState4, MutableFloatState mutableFloatState5, MutableState mutableState6, MutableFloatState mutableFloatState6, MutableFloatState mutableFloatState7, MutableFloatState mutableFloatState8, MutableFloatState mutableFloatState9, MutableFloatState mutableFloatState10, Continuation continuation) {
        super(2, continuation);
        this.$noiseSpeed = f;
        this.$pulsingState = pulsingState;
        this.$onPulsingReady = function1;
        this.$frozenPeople = list;
        this.$searchCircle = searchCircle;
        this.$chaserState = chaserState;
        this.$rawDt$delegate = mutableFloatState;
        this.$time$delegate = mutableFloatState2;
        this.$activePhase$delegate = mutableState;
        this.$formationElapsed$delegate = mutableFloatState3;
        this.$formationHasPlayed$delegate = mutableState2;
        this.$currentOnFormationComplete$delegate = mutableState3;
        this.$currentPhase$delegate = mutableState4;
        this.$currentPostFormationPhase$delegate = mutableState5;
        this.$nuxPulseElapsed$delegate = mutableFloatState4;
        this.$personFoundElapsed$delegate = mutableFloatState5;
        this.$radialReverseActive$delegate = mutableState6;
        this.$radialElapsed$delegate = mutableFloatState6;
        this.$btPulseElapsed$delegate = mutableFloatState7;
        this.$errorPulseElapsed$delegate = mutableFloatState8;
        this.$canvasWidth$delegate = mutableFloatState9;
        this.$canvasHeight$delegate = mutableFloatState10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DotGridKt$DotGrid$4$1 dotGridKt$DotGrid$4$1 = new DotGridKt$DotGrid$4$1(this.$noiseSpeed, this.$pulsingState, this.$onPulsingReady, this.$frozenPeople, this.$searchCircle, this.$chaserState, this.$rawDt$delegate, this.$time$delegate, this.$activePhase$delegate, this.$formationElapsed$delegate, this.$formationHasPlayed$delegate, this.$currentOnFormationComplete$delegate, this.$currentPhase$delegate, this.$currentPostFormationPhase$delegate, this.$nuxPulseElapsed$delegate, this.$personFoundElapsed$delegate, this.$radialReverseActive$delegate, this.$radialElapsed$delegate, this.$btPulseElapsed$delegate, this.$errorPulseElapsed$delegate, this.$canvasWidth$delegate, this.$canvasHeight$delegate, continuation);
        dotGridKt$DotGrid$4$1.L$0 = obj;
        return dotGridKt$DotGrid$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DotGridKt$DotGrid$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0084 -> B:5:0x0087). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final Ref$LongRef ref$LongRef;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ref$LongRef = new Ref$LongRef();
            if (JobKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$LongRef ref$LongRef2 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            ref$LongRef = ref$LongRef2;
            boolean z = true;
            if (JobKt.isActive(coroutineScope)) {
                final float f = this.$noiseSpeed;
                final PulsingState pulsingState = this.$pulsingState;
                final Function1 function1 = this.$onPulsingReady;
                final List list = this.$frozenPeople;
                final SearchCircle searchCircle = this.$searchCircle;
                final ChaserState chaserState = this.$chaserState;
                final MutableFloatState mutableFloatState = this.$rawDt$delegate;
                final MutableFloatState mutableFloatState2 = this.$time$delegate;
                final MutableState mutableState = this.$activePhase$delegate;
                final MutableFloatState mutableFloatState3 = this.$formationElapsed$delegate;
                final MutableState mutableState2 = this.$formationHasPlayed$delegate;
                final MutableState mutableState3 = this.$currentOnFormationComplete$delegate;
                final MutableState mutableState4 = this.$currentPhase$delegate;
                final MutableState mutableState5 = this.$currentPostFormationPhase$delegate;
                final MutableFloatState mutableFloatState4 = this.$nuxPulseElapsed$delegate;
                final MutableFloatState mutableFloatState5 = this.$personFoundElapsed$delegate;
                final MutableState mutableState6 = this.$radialReverseActive$delegate;
                final MutableFloatState mutableFloatState6 = this.$radialElapsed$delegate;
                final MutableFloatState mutableFloatState7 = this.$btPulseElapsed$delegate;
                final MutableFloatState mutableFloatState8 = this.$errorPulseElapsed$delegate;
                final MutableFloatState mutableFloatState9 = this.$canvasWidth$delegate;
                final MutableFloatState mutableFloatState10 = this.$canvasHeight$delegate;
                Function1 function12 = new Function1() { // from class: com.squareup.cash.nearby.views.DotGridKt$DotGrid$4$1$$ExternalSyntheticLambda0
                    /* JADX WARN: Removed duplicated region for block: B:55:0x01f8  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x020c  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0226  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj2) {
                        boolean booleanValue;
                        MutableState mutableState7;
                        MutableFloatState mutableFloatState11;
                        float f2;
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState;
                        MutableState mutableState8;
                        boolean booleanValue2;
                        long longValue = ((Long) obj2).longValue();
                        Ref$LongRef ref$LongRef3 = Ref$LongRef.this;
                        if (ref$LongRef3.element != 0) {
                            float f3 = (longValue - r4) / 1.0E9f;
                            ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(f3);
                            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) mutableFloatState2;
                            parcelableSnapshotMutableFloatState2.setFloatValue((f * f3) + parcelableSnapshotMutableFloatState2.getFloatValue());
                            MutableState mutableState9 = mutableState;
                            DotGridPhase dotGridPhase = (DotGridPhase) mutableState9.getValue();
                            DotGridPhase dotGridPhase2 = DotGridPhase.Formation;
                            MutableState mutableState10 = mutableState3;
                            MutableState mutableState11 = mutableState4;
                            if (dotGridPhase == dotGridPhase2) {
                                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState3 = (ParcelableSnapshotMutableFloatState) mutableFloatState3;
                                parcelableSnapshotMutableFloatState3.setFloatValue(parcelableSnapshotMutableFloatState3.getFloatValue() + f3);
                                if (parcelableSnapshotMutableFloatState3.getFloatValue() >= 2.5f) {
                                    mutableState2.setValue(Boolean.TRUE);
                                    Function0 function0 = (Function0) mutableState10.getValue();
                                    if (function0 != null) {
                                        function0.invoke();
                                    }
                                    mutableState9.setValue(((DotGridPhase) mutableState11.getValue()) == dotGridPhase2 ? (DotGridPhase) mutableState5.getValue() : (DotGridPhase) mutableState11.getValue());
                                }
                            }
                            DotGridPhase dotGridPhase3 = (DotGridPhase) mutableState9.getValue();
                            DotGridPhase dotGridPhase4 = DotGridPhase.NuxPulse;
                            MutableFloatState mutableFloatState12 = mutableFloatState4;
                            if (dotGridPhase3 == dotGridPhase4) {
                                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState4 = (ParcelableSnapshotMutableFloatState) mutableFloatState12;
                                parcelableSnapshotMutableFloatState4.setFloatValue(parcelableSnapshotMutableFloatState4.getFloatValue() + f3);
                            }
                            DotGridPhase dotGridPhase5 = (DotGridPhase) mutableState9.getValue();
                            DotGridPhase dotGridPhase6 = DotGridPhase.PersonFound;
                            MutableFloatState mutableFloatState13 = mutableFloatState5;
                            if (dotGridPhase5 == dotGridPhase6) {
                                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState5 = (ParcelableSnapshotMutableFloatState) mutableFloatState13;
                                parcelableSnapshotMutableFloatState5.setFloatValue(parcelableSnapshotMutableFloatState5.getFloatValue() + f3);
                            }
                            DotGridPhase dotGridPhase7 = (DotGridPhase) mutableState9.getValue();
                            DotGridPhase dotGridPhase8 = DotGridPhase.RadialTransition;
                            PulsingState pulsingState2 = pulsingState;
                            MutableState mutableState12 = mutableState6;
                            MutableFloatState mutableFloatState14 = mutableFloatState6;
                            if (dotGridPhase7 == dotGridPhase8) {
                                booleanValue2 = ((Boolean) mutableState12.getValue()).booleanValue();
                                if (!booleanValue2) {
                                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState6 = (ParcelableSnapshotMutableFloatState) mutableFloatState14;
                                    parcelableSnapshotMutableFloatState6.setFloatValue(parcelableSnapshotMutableFloatState6.getFloatValue() + f3);
                                    if (parcelableSnapshotMutableFloatState6.getFloatValue() >= 2.0f) {
                                        mutableState9.setValue(DotGridPhase.RadialPulsing);
                                        pulsingState2.elapsed = RecyclerView.DECELERATION_RATE;
                                        pulsingState2.payWaveStartTimes.clear();
                                        Function1 function13 = function1;
                                        if (function13 != null) {
                                            function13.invoke(pulsingState2);
                                        }
                                    }
                                }
                            }
                            booleanValue = ((Boolean) mutableState12.getValue()).booleanValue();
                            SearchCircle searchCircle2 = searchCircle;
                            MutableFloatState mutableFloatState15 = mutableFloatState7;
                            MutableFloatState mutableFloatState16 = mutableFloatState8;
                            if (booleanValue) {
                                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState7 = (ParcelableSnapshotMutableFloatState) mutableFloatState14;
                                mutableFloatState11 = mutableFloatState16;
                                parcelableSnapshotMutableFloatState7.setFloatValue(parcelableSnapshotMutableFloatState7.getFloatValue() + f3);
                                if (parcelableSnapshotMutableFloatState7.getFloatValue() >= 2.0f) {
                                    DotGridPhase dotGridPhase9 = (DotGridPhase) mutableState11.getValue();
                                    mutableState12.setValue(Boolean.FALSE);
                                    mutableState9.setValue(dotGridPhase9);
                                    parcelableSnapshotMutableFloatState7.setFloatValue(RecyclerView.DECELERATION_RATE);
                                    int ordinal = dotGridPhase9.ordinal();
                                    if (ordinal != 2) {
                                        List list2 = list;
                                        ChaserState chaserState2 = chaserState;
                                        if (ordinal != 3) {
                                            if (ordinal == 4) {
                                                ((ParcelableSnapshotMutableFloatState) mutableFloatState13).setFloatValue(RecyclerView.DECELERATION_RATE);
                                                list2.clear();
                                                chaserState2.reset();
                                            } else if (ordinal == 7) {
                                                ((ParcelableSnapshotMutableFloatState) mutableFloatState15).setFloatValue(RecyclerView.DECELERATION_RATE);
                                            } else if (ordinal == 8) {
                                                ((ParcelableSnapshotMutableFloatState) mutableFloatState11).setFloatValue(RecyclerView.DECELERATION_RATE);
                                            }
                                            mutableState7 = mutableState9;
                                            f2 = f3;
                                            mutableState8 = mutableState10;
                                        } else {
                                            FrozenPerson frozenPerson = (FrozenPerson) CollectionsKt.lastOrNull(list2);
                                            mutableState7 = mutableState9;
                                            Offset offset = frozenPerson != null ? new Offset(frozenPerson.position) : null;
                                            if (offset != null) {
                                                long j = offset.packedValue;
                                                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                                f2 = f3;
                                                mutableState8 = mutableState10;
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                                                searchCircle2.x = intBitsToFloat;
                                                searchCircle2.y = intBitsToFloat2;
                                                searchCircle2.vx = RecyclerView.DECELERATION_RATE;
                                                searchCircle2.vy = RecyclerView.DECELERATION_RATE;
                                            } else {
                                                f2 = f3;
                                                mutableState8 = mutableState10;
                                            }
                                            list2.clear();
                                            chaserState2.reset();
                                        }
                                    } else {
                                        mutableState7 = mutableState9;
                                        f2 = f3;
                                        mutableState8 = mutableState10;
                                        ((ParcelableSnapshotMutableFloatState) mutableFloatState12).setFloatValue(RecyclerView.DECELERATION_RATE);
                                    }
                                    Function0 function02 = (Function0) mutableState8.getValue();
                                    if (function02 != null) {
                                        function02.invoke();
                                    }
                                    if (((DotGridPhase) mutableState7.getValue()) == DotGridPhase.RadialPulsing && !((Boolean) mutableState12.getValue()).booleanValue()) {
                                        float f4 = pulsingState2.elapsed + f2;
                                        pulsingState2.elapsed = f4;
                                        int i2 = 0;
                                        pulsingState2.payWaveStartTimes.removeIf(new PulsingState$$ExternalSyntheticLambda1(i2, new PulsingState$$ExternalSyntheticLambda0(f4 - 3.0f, i2)));
                                    }
                                    if (((DotGridPhase) mutableState7.getValue()) == DotGridPhase.BluetoothPulse) {
                                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState8 = (ParcelableSnapshotMutableFloatState) mutableFloatState15;
                                        parcelableSnapshotMutableFloatState8.setFloatValue(parcelableSnapshotMutableFloatState8.getFloatValue() + f2);
                                    }
                                    if (((DotGridPhase) mutableState7.getValue()) == DotGridPhase.ErrorPulse) {
                                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState9 = (ParcelableSnapshotMutableFloatState) mutableFloatState11;
                                        parcelableSnapshotMutableFloatState9.setFloatValue(parcelableSnapshotMutableFloatState9.getFloatValue() + f2);
                                    }
                                    parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState9;
                                    if (parcelableSnapshotMutableFloatState.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState10 = (ParcelableSnapshotMutableFloatState) mutableFloatState10;
                                        if (parcelableSnapshotMutableFloatState10.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                                            searchCircle2.update(f2, parcelableSnapshotMutableFloatState.getFloatValue() / 2.0f, parcelableSnapshotMutableFloatState10.getFloatValue() / 2.0f, parcelableSnapshotMutableFloatState.getFloatValue(), parcelableSnapshotMutableFloatState10.getFloatValue());
                                        }
                                    }
                                } else {
                                    mutableState7 = mutableState9;
                                }
                            } else {
                                mutableState7 = mutableState9;
                                mutableFloatState11 = mutableFloatState16;
                            }
                            f2 = f3;
                            if (((DotGridPhase) mutableState7.getValue()) == DotGridPhase.RadialPulsing) {
                                float f42 = pulsingState2.elapsed + f2;
                                pulsingState2.elapsed = f42;
                                int i22 = 0;
                                pulsingState2.payWaveStartTimes.removeIf(new PulsingState$$ExternalSyntheticLambda1(i22, new PulsingState$$ExternalSyntheticLambda0(f42 - 3.0f, i22)));
                            }
                            if (((DotGridPhase) mutableState7.getValue()) == DotGridPhase.BluetoothPulse) {
                            }
                            if (((DotGridPhase) mutableState7.getValue()) == DotGridPhase.ErrorPulse) {
                            }
                            parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState9;
                            if (parcelableSnapshotMutableFloatState.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                            }
                        }
                        ref$LongRef3.element = longValue;
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = coroutineScope;
                this.L$1 = ref$LongRef;
                z = true;
                this.label = 1;
                if (ArcSplineKt.withInfiniteAnimationFrameNanos(this, function12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (JobKt.isActive(coroutineScope)) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
