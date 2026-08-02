package app.cash.local.backend.real;

import app.cash.api.ApiResult;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.squareup.protos.cash.local.client.v1.GetActiveOrdersRequest;
import com.squareup.protos.cash.local.client.v1.GetActiveOrdersResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersRequest;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse$Response$SuggestedReorders;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealLocalOrderRepository$getActiveOrders$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealLocalOrderRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealLocalOrderRepository$getActiveOrders$1(RealLocalOrderRepository realLocalOrderRepository, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realLocalOrderRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealLocalOrderRepository realLocalOrderRepository = this.this$0;
        switch (i) {
            case 0:
                RealLocalOrderRepository$getActiveOrders$1 realLocalOrderRepository$getActiveOrders$1 = new RealLocalOrderRepository$getActiveOrders$1(realLocalOrderRepository, continuation, 0);
                realLocalOrderRepository$getActiveOrders$1.L$0 = obj;
                return realLocalOrderRepository$getActiveOrders$1;
            default:
                RealLocalOrderRepository$getActiveOrders$1 realLocalOrderRepository$getActiveOrders$12 = new RealLocalOrderRepository$getActiveOrders$1(realLocalOrderRepository, continuation, 1);
                realLocalOrderRepository$getActiveOrders$12.L$0 = obj;
                return realLocalOrderRepository$getActiveOrders$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealLocalOrderRepository$getActiveOrders$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r1.emit(r2, r19) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005a, code lost:
    
        if (r3 == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0045, code lost:
    
        if (r1.emit(r3, r19) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
    
        if (r1.emit(r2, r19) == r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0152, code lost:
    
        if (r3 == r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0140, code lost:
    
        if (r1.emit(r3, r19) == r10) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object activeOrders;
        List list;
        Object suggestedReorders;
        GetSuggestedReordersResponse.SuggestedReorders suggestedReorders2;
        int i = this.$r8$classId;
        RealLocalOrderRepository realLocalOrderRepository = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!realLocalOrderRepository.cachedActiveReorders.isEmpty()) {
                        List list2 = realLocalOrderRepository.cachedActiveReorders;
                        this.L$0 = flowCollector;
                        this.label = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    activeOrders = obj;
                    ApiResult apiResult = (ApiResult) activeOrders;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                            if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                Timber.Forest.e("getActiveOrders NetworkFailure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                                list = EmptyList.INSTANCE;
                            }
                        } else {
                            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "getActiveOrders HttpFailure [", "]"), new Object[0]);
                            list = EmptyList.INSTANCE;
                        }
                    } else {
                        list = ((GetActiveOrdersResponse) ((ApiResult.Success) apiResult).response).active_orders;
                    }
                    realLocalOrderRepository.cachedActiveReorders = list;
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                LocalService localService = realLocalOrderRepository.service;
                GetActiveOrdersRequest getActiveOrdersRequest = new GetActiveOrdersRequest(null);
                this.L$0 = flowCollector;
                this.label = 2;
                activeOrders = localService.getActiveOrders(getActiveOrdersRequest, this);
                break;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetSuggestedReordersResponse.SuggestedReorders suggestedReorders3 = realLocalOrderRepository.cachedSuggestedReorders;
                    if (suggestedReorders3 != null) {
                        this.L$0 = flowCollector2;
                        this.label = 1;
                        break;
                    }
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    suggestedReorders = obj;
                    ApiResult apiResult2 = (ApiResult) suggestedReorders;
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        if (!(apiResult2 instanceof ApiResult.Failure.HttpFailure)) {
                            if (!(apiResult2 instanceof ApiResult.Failure.NetworkFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                Timber.Forest.e("getSuggestedReorders NetworkFailure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult2).error);
                            }
                        } else {
                            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult2).code, "getSuggestedReorders HttpFailure [", "]"), new Object[0]);
                        }
                    } else {
                        zzij zzijVar = ((GetSuggestedReordersResponse) ((ApiResult.Success) apiResult2).response).response;
                        if (!(zzijVar instanceof GetSuggestedReordersResponse$Response$ErrorResponse)) {
                            if (!(zzijVar instanceof GetSuggestedReordersResponse$Response$SuggestedReorders)) {
                                if (zzijVar != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            } else {
                                suggestedReorders2 = ((GetSuggestedReordersResponse$Response$SuggestedReorders) zzijVar).value;
                                realLocalOrderRepository.cachedSuggestedReorders = suggestedReorders2;
                                if (suggestedReorders2 != null) {
                                    this.L$0 = null;
                                    this.label = 3;
                                    break;
                                }
                            }
                        } else {
                            Timber.Forest forest = Timber.Forest;
                            List list3 = ((GetSuggestedReordersResponse$Response$ErrorResponse) zzijVar).value.errors;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                String str = ((LocalErrorResponse.Error) it.next()).message;
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                            forest.e("getSuggestedReorders error: ".concat(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62)), new Object[0]);
                        }
                    }
                    suggestedReorders2 = null;
                    realLocalOrderRepository.cachedSuggestedReorders = suggestedReorders2;
                    if (suggestedReorders2 != null) {
                    }
                } else if (i3 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                LocalService localService2 = realLocalOrderRepository.service;
                GetSuggestedReordersRequest getSuggestedReordersRequest = new GetSuggestedReordersRequest(null, ByteString.EMPTY);
                this.L$0 = flowCollector2;
                this.label = 2;
                suggestedReorders = localService2.getSuggestedReorders(getSuggestedReordersRequest, this);
                break;
        }
        return null;
    }
}
