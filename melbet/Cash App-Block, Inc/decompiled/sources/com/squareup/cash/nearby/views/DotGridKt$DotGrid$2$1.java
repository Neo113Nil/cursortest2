package com.squareup.cash.nearby.views;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DotGridKt$DotGrid$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activePhase$delegate;
    public final /* synthetic */ MutableFloatState $canvasHeight$delegate;
    public final /* synthetic */ MutableFloatState $canvasWidth$delegate;
    public final /* synthetic */ List $frozenPeople;
    public final /* synthetic */ Function1 $onPersonPositions;
    public final /* synthetic */ float $personEdgeInsetPx;
    public final /* synthetic */ MutableFloatState $personFoundElapsed$delegate;
    public final /* synthetic */ Set $personIds;
    public final /* synthetic */ SearchCircle $searchCircle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotGridKt$DotGrid$2$1(List list, Set set, SearchCircle searchCircle, float f, Function1 function1, MutableState mutableState, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, Continuation continuation) {
        super(2, continuation);
        this.$frozenPeople = list;
        this.$personIds = set;
        this.$searchCircle = searchCircle;
        this.$personEdgeInsetPx = f;
        this.$onPersonPositions = function1;
        this.$activePhase$delegate = mutableState;
        this.$canvasWidth$delegate = mutableFloatState;
        this.$canvasHeight$delegate = mutableFloatState2;
        this.$personFoundElapsed$delegate = mutableFloatState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DotGridKt$DotGrid$2$1(this.$frozenPeople, this.$personIds, this.$searchCircle, this.$personEdgeInsetPx, this.$onPersonPositions, this.$activePhase$delegate, this.$canvasWidth$delegate, this.$canvasHeight$delegate, this.$personFoundElapsed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DotGridKt$DotGrid$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        long computeSpreadPosition;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (((DotGridPhase) this.$activePhase$delegate.getValue()) == DotGridPhase.PersonFound) {
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.$canvasWidth$delegate;
            if (parcelableSnapshotMutableFloatState.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) this.$canvasHeight$delegate;
                if (parcelableSnapshotMutableFloatState2.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                    Set set = this.$personIds;
                    DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0 dotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0 = new DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0(0, set);
                    List list = this.$frozenPeople;
                    CollectionsKt__MutableCollectionsKt.removeAll(list, dotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0);
                    List<FrozenPerson> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FrozenPerson) it.next()).id);
                    }
                    for (String str : SetsKt___SetsKt.minus(set, (Iterable) CollectionsKt.toSet(arrayList))) {
                        if (list.isEmpty()) {
                            SearchCircle searchCircle = this.$searchCircle;
                            float f = searchCircle.x;
                            float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
                            float f2 = this.$personEdgeInsetPx;
                            computeSpreadPosition = searchCircle.m3668snapshotAtRc2DDho(DotGridKt.DotGrid$safeClamp(f, f2, floatValue), DotGridKt.DotGrid$safeClamp(searchCircle.y, f2, parcelableSnapshotMutableFloatState2.getFloatValue()), parcelableSnapshotMutableFloatState.getFloatValue(), parcelableSnapshotMutableFloatState2.getFloatValue());
                        } else {
                            computeSpreadPosition = DotGridKt.computeSpreadPosition(list, parcelableSnapshotMutableFloatState.getFloatValue(), parcelableSnapshotMutableFloatState2.getFloatValue());
                        }
                        list.add(new FrozenPerson(computeSpreadPosition, str, ((ParcelableSnapshotMutableFloatState) this.$personFoundElapsed$delegate).getFloatValue()));
                    }
                    if (!list.isEmpty() && (function1 = this.$onPersonPositions) != null) {
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                        for (FrozenPerson frozenPerson : list2) {
                            linkedHashMap.put(frozenPerson.id, new Offset(frozenPerson.position));
                        }
                        function1.invoke(linkedHashMap);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
