package com.squareup.cash.instruments.backend.real;

import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.instruments.backend.api.InstrumentManagerKt;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealInstrumentManager$syncValueBased$$inlined$map$1 implements Flow {
    public final /* synthetic */ boolean $includePending$inlined;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.instruments.backend.real.RealInstrumentManager$syncValueBased$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ boolean $includePending$inlined;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.instruments.backend.real.RealInstrumentManager$syncValueBased$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, boolean z) {
            this.$this_unsafeFlow = flowCollector;
            this.$includePending$inlined = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    anonymousClass1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : (List) obj) {
                            CashInstrumentType cashInstrumentType = ((Instrument) obj3).cash_instrument_type;
                            Object obj4 = linkedHashMap.get(cashInstrumentType);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(cashInstrumentType, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : list) {
                                Instrument instrument = (Instrument) obj5;
                                if (this.$includePending$inlined || !Intrinsics.areEqual(instrument.pending_verification, Boolean.TRUE)) {
                                    arrayList.add(obj5);
                                }
                            }
                            linkedHashMap2.put(key, CollectionsKt.sortedWith(arrayList, new SemanticsSortKt$special$$inlined$thenBy$1(new b.C0008b(16), 5)));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = linkedHashMap2.entrySet().iterator();
                        while (it.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll((Iterable) ((Map.Entry) it.next()).getValue(), arrayList2);
                        }
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(InstrumentManagerKt.toCommonInstrument((Instrument) it2.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.$this_unsafeFlow.emit(arrayList3, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            anonymousClass1 = new AnonymousClass1(continuation);
            Object obj22 = anonymousClass1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = anonymousClass1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public RealInstrumentManager$syncValueBased$$inlined$map$1(StateFlow stateFlow, boolean z) {
        this.$this_unsafeTransform$inlined = stateFlow;
        this.$includePending$inlined = z;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$includePending$inlined), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
