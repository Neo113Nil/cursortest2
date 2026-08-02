package com.squareup.cash.boost.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.family.familyhub.presenters.FamilyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RealBoostRepository$getBoostsForTokens$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ ArrayList $tokens$inlined;

    /* renamed from: com.squareup.cash.boost.backend.RealBoostRepository$getBoostsForTokens$$inlined$map$1$2$1, reason: invalid class name */
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
            return RealBoostRepository$getBoostsForTokens$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealBoostRepository$getBoostsForTokens$$inlined$map$1$2(FlowCollector flowCollector, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$tokens$inlined = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        FamilyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1 familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1;
        int i2;
        Object obj2;
        int i3 = this.$r8$classId;
        ArrayList arrayList = this.$tokens$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : (List) obj) {
                                if (arrayList.contains(((RewardWithSelection) obj4).token) || arrayList.isEmpty()) {
                                    arrayList2.add(obj4);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList2, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj32 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof FamilyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1) {
                    familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1 = (FamilyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1) continuation;
                    int i5 = familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj5 = familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            List list = (List) obj;
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj6 : arrayList) {
                                String str = (String) obj6;
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((Recipient) obj2).customerId, str)) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                linkedHashMap.put(obj6, (Recipient) obj2);
                            }
                            familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(linkedHashMap, familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1 = new FamilyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1(this, continuation);
                Object obj52 = familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = familyPendingRequestsPresenter$models$lambda$6$1$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
