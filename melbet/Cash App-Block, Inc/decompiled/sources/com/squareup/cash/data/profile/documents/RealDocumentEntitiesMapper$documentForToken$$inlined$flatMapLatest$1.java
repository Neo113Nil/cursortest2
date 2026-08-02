package com.squareup.cash.data.profile.documents;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealDocumentEntitiesMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1(Continuation continuation, RealDocumentEntitiesMapper realDocumentEntitiesMapper, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realDocumentEntitiesMapper;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealDocumentEntitiesMapper realDocumentEntitiesMapper = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1 realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1 = new RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1(continuation, realDocumentEntitiesMapper, 0);
                realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1.L$1 = obj2;
                return realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1 realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$12 = new RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1(continuation, realDocumentEntitiesMapper, 1);
                realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$12.L$1 = obj2;
                return realDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealDocumentEntitiesMapper realDocumentEntitiesMapper = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Document document = (Document) obj2;
                    RealCustomerStore realCustomerStore = realDocumentEntitiesMapper.customerStore;
                    String str = document.owner_token;
                    str.getClass();
                    Flow customerForId = realCustomerStore.getCustomerForId(str);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    Object collect = customerForId.collect(new RealBlockersHelper$collectBlockersActions$2(12, flowCollector, realDocumentEntitiesMapper, document), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) obj3;
                    RealCustomerStore realCustomerStore2 = realDocumentEntitiesMapper.customerStore;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String str2 = ((Document) it.next()).owner_token;
                        str2.getClass();
                        arrayList.add(str2);
                    }
                    RealCustomerStore$getCustomersForIds$$inlined$map$1 customersForIds = realCustomerStore2.getCustomersForIds(arrayList);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    Object collect2 = customersForIds.collect(new RealBlockersHelper$collectBlockersActions$2(13, flowCollector2, list, realDocumentEntitiesMapper), this);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (collect2 != coroutineSingletons3) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons3) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
