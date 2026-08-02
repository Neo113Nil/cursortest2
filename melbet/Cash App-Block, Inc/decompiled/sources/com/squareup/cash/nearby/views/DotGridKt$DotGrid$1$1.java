package com.squareup.cash.nearby.views;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DotGridKt$DotGrid$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activePhase$delegate;
    public final /* synthetic */ MutableFloatState $btPulseElapsed$delegate;
    public final /* synthetic */ MutableFloatState $canvasHeight$delegate;
    public final /* synthetic */ MutableFloatState $canvasWidth$delegate;
    public final /* synthetic */ ChaserState $chaserState;
    public final /* synthetic */ MutableFloatState $errorPulseElapsed$delegate;
    public final /* synthetic */ MutableFloatState $formationElapsed$delegate;
    public final /* synthetic */ MutableState $formationHasPlayed$delegate;
    public final /* synthetic */ List $frozenPeople;
    public final /* synthetic */ MutableFloatState $nuxPulseElapsed$delegate;
    public final /* synthetic */ Function1 $onPersonPositions;
    public final /* synthetic */ Function1 $onPulsingReady;
    public final /* synthetic */ float $personEdgeInsetPx;
    public final /* synthetic */ MutableFloatState $personFoundElapsed$delegate;
    public final /* synthetic */ Set $personIds;
    public final /* synthetic */ DotGridPhase $phase;
    public final /* synthetic */ PulsingState $pulsingState;
    public final /* synthetic */ MutableFloatState $radialElapsed$delegate;
    public final /* synthetic */ MutableState $radialReverseActive$delegate;
    public final /* synthetic */ SearchCircle $searchCircle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotGridKt$DotGrid$1$1(DotGridPhase dotGridPhase, List list, ChaserState chaserState, Set set, SearchCircle searchCircle, float f, Function1 function1, PulsingState pulsingState, Function1 function12, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableFloatState mutableFloatState4, MutableFloatState mutableFloatState5, MutableFloatState mutableFloatState6, MutableFloatState mutableFloatState7, MutableFloatState mutableFloatState8, Continuation continuation) {
        super(2, continuation);
        this.$phase = dotGridPhase;
        this.$frozenPeople = list;
        this.$chaserState = chaserState;
        this.$personIds = set;
        this.$searchCircle = searchCircle;
        this.$personEdgeInsetPx = f;
        this.$onPersonPositions = function1;
        this.$pulsingState = pulsingState;
        this.$onPulsingReady = function12;
        this.$formationHasPlayed$delegate = mutableState;
        this.$radialReverseActive$delegate = mutableState2;
        this.$activePhase$delegate = mutableState3;
        this.$radialElapsed$delegate = mutableFloatState;
        this.$formationElapsed$delegate = mutableFloatState2;
        this.$personFoundElapsed$delegate = mutableFloatState3;
        this.$canvasWidth$delegate = mutableFloatState4;
        this.$canvasHeight$delegate = mutableFloatState5;
        this.$nuxPulseElapsed$delegate = mutableFloatState6;
        this.$btPulseElapsed$delegate = mutableFloatState7;
        this.$errorPulseElapsed$delegate = mutableFloatState8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DotGridKt$DotGrid$1$1(this.$phase, this.$frozenPeople, this.$chaserState, this.$personIds, this.$searchCircle, this.$personEdgeInsetPx, this.$onPersonPositions, this.$pulsingState, this.$onPulsingReady, this.$formationHasPlayed$delegate, this.$radialReverseActive$delegate, this.$activePhase$delegate, this.$radialElapsed$delegate, this.$formationElapsed$delegate, this.$personFoundElapsed$delegate, this.$canvasWidth$delegate, this.$canvasHeight$delegate, this.$nuxPulseElapsed$delegate, this.$btPulseElapsed$delegate, this.$errorPulseElapsed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DotGridKt$DotGrid$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        long computeSpreadPosition;
        boolean booleanValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState = this.$formationHasPlayed$delegate;
        boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
        MutableFloatState mutableFloatState = this.$radialElapsed$delegate;
        DotGridPhase dotGridPhase = this.$phase;
        MutableState mutableState2 = this.$radialReverseActive$delegate;
        MutableState mutableState3 = this.$activePhase$delegate;
        float f = RecyclerView.DECELERATION_RATE;
        if (booleanValue2) {
            booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
            if (!booleanValue) {
                DotGridPhase dotGridPhase2 = (DotGridPhase) mutableState3.getValue();
                DotGridPhase dotGridPhase3 = DotGridPhase.RadialPulsing;
                if ((dotGridPhase2 == dotGridPhase3 || ((DotGridPhase) mutableState3.getValue()) == DotGridPhase.RadialTransition) && dotGridPhase != DotGridPhase.RadialTransition && dotGridPhase != dotGridPhase3) {
                    if (((DotGridPhase) mutableState3.getValue()) != dotGridPhase3) {
                        float floatValue = 2.0f - ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                        if (floatValue >= RecyclerView.DECELERATION_RATE) {
                            f = floatValue;
                        }
                    }
                    ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(f);
                    mutableState2.setValue(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
            }
        }
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            mutableState3.setValue(dotGridPhase);
        }
        int ordinal = dotGridPhase.ordinal();
        ChaserState chaserState = this.$chaserState;
        SearchCircle searchCircle = this.$searchCircle;
        List list = this.$frozenPeople;
        switch (ordinal) {
            case 1:
                ((ParcelableSnapshotMutableFloatState) this.$formationElapsed$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                break;
            case 2:
                ((ParcelableSnapshotMutableFloatState) this.$nuxPulseElapsed$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                break;
            case 3:
                FrozenPerson frozenPerson = (FrozenPerson) CollectionsKt.lastOrNull(list);
                Offset offset = frozenPerson != null ? new Offset(frozenPerson.position) : null;
                if (offset != null) {
                    long j = offset.packedValue;
                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                    searchCircle.x = intBitsToFloat;
                    searchCircle.y = intBitsToFloat2;
                    searchCircle.vx = RecyclerView.DECELERATION_RATE;
                    searchCircle.vy = RecyclerView.DECELERATION_RATE;
                }
                list.clear();
                chaserState.reset();
                break;
            case 4:
                ((ParcelableSnapshotMutableFloatState) this.$personFoundElapsed$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                list.clear();
                chaserState.reset();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.$canvasWidth$delegate;
                if (parcelableSnapshotMutableFloatState.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) this.$canvasHeight$delegate;
                    if (parcelableSnapshotMutableFloatState2.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                        int i = 0;
                        for (String str : this.$personIds) {
                            int i2 = i + 1;
                            if (i == 0) {
                                float f2 = searchCircle.x;
                                float floatValue2 = parcelableSnapshotMutableFloatState.getFloatValue();
                                float f3 = this.$personEdgeInsetPx;
                                computeSpreadPosition = searchCircle.m3668snapshotAtRc2DDho(DotGridKt.DotGrid$safeClamp(f2, f3, floatValue2), DotGridKt.DotGrid$safeClamp(searchCircle.y, f3, parcelableSnapshotMutableFloatState2.getFloatValue()), parcelableSnapshotMutableFloatState.getFloatValue(), parcelableSnapshotMutableFloatState2.getFloatValue());
                            } else {
                                computeSpreadPosition = DotGridKt.computeSpreadPosition(list, parcelableSnapshotMutableFloatState.getFloatValue(), parcelableSnapshotMutableFloatState2.getFloatValue());
                            }
                            list.add(new FrozenPerson(computeSpreadPosition, str, RecyclerView.DECELERATION_RATE));
                            i = i2;
                        }
                        if (!list.isEmpty() && (function1 = this.$onPersonPositions) != null) {
                            List<FrozenPerson> list2 = list;
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (FrozenPerson frozenPerson2 : list2) {
                                linkedHashMap.put(frozenPerson2.id, new Offset(frozenPerson2.position));
                            }
                            function1.invoke(linkedHashMap);
                            break;
                        }
                    }
                }
                break;
            case 5:
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(RecyclerView.DECELERATION_RATE);
                mutableState2.setValue(Boolean.FALSE);
                break;
            case 6:
                PulsingState pulsingState = this.$pulsingState;
                pulsingState.elapsed = RecyclerView.DECELERATION_RATE;
                pulsingState.payWaveStartTimes.clear();
                Function1 function12 = this.$onPulsingReady;
                if (function12 != null) {
                    function12.invoke(pulsingState);
                    break;
                }
                break;
            case 7:
                ((ParcelableSnapshotMutableFloatState) this.$btPulseElapsed$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                break;
            case 8:
                ((ParcelableSnapshotMutableFloatState) this.$errorPulseElapsed$delegate).setFloatValue(RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }
}
