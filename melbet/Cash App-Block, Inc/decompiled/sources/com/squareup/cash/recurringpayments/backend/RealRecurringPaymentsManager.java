package com.squareup.cash.recurringpayments.backend;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsRequest;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsResponse;
import com.squareup.protos.cash.p2pencoreedge.RecurringPaymentsService;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecurringPaymentsManager {
    public final RecurringPaymentsService appService;
    public final StateFlowImpl recurringPayments = FlowKt.MutableStateFlow(RecurringPayments.NotLoaded.INSTANCE);
    public final StateFlowImpl optimisticPaymentDisplay = FlowKt.MutableStateFlow(null);

    public RealRecurringPaymentsManager(RecurringPaymentsService recurringPaymentsService) {
        this.appService = recurringPaymentsService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0126, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x006f, code lost:
    
        if (r1 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0061, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRecurringPayments(GetRecurringPaymentsRequest getRecurringPaymentsRequest, ContinuationImpl continuationImpl) {
        RealRecurringPaymentsManager$loadRecurringPayments$1 realRecurringPaymentsManager$loadRecurringPayments$1;
        int i;
        GetRecurringPaymentsRequest getRecurringPaymentsRequest2;
        if (continuationImpl instanceof RealRecurringPaymentsManager$loadRecurringPayments$1) {
            realRecurringPaymentsManager$loadRecurringPayments$1 = (RealRecurringPaymentsManager$loadRecurringPayments$1) continuationImpl;
            int i2 = realRecurringPaymentsManager$loadRecurringPayments$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecurringPaymentsManager$loadRecurringPayments$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRecurringPaymentsManager$loadRecurringPayments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecurringPaymentsManager$loadRecurringPayments$1.label;
                StateFlowImpl stateFlowImpl = this.recurringPayments;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    getRecurringPaymentsRequest2 = getRecurringPaymentsRequest;
                    realRecurringPaymentsManager$loadRecurringPayments$1.L$0 = getRecurringPaymentsRequest2;
                    realRecurringPaymentsManager$loadRecurringPayments$1.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, RecurringPayments.Loading.INSTANCE);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            GetRecurringPaymentsResponse getRecurringPaymentsResponse = (GetRecurringPaymentsResponse) ((ApiResult.Success) apiResult).response;
                            List<GetRecurringPaymentsResponse.RecurringPaymentWrapper> list = getRecurringPaymentsResponse.recurring_payments;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (GetRecurringPaymentsResponse.RecurringPaymentWrapper recurringPaymentWrapper : list) {
                                com.squareup.cash.p2pencore.v1.RecurringPayment recurringPayment = recurringPaymentWrapper.recurring_payment;
                                String str = recurringPayment != null ? recurringPayment.token : null;
                                if (str == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    return null;
                                }
                                Money money = recurringPayment != null ? recurringPayment.amount : null;
                                if (money == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    return null;
                                }
                                String str2 = recurringPaymentWrapper.schedule_description;
                                if (str2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    return null;
                                }
                                arrayList.add(new RecurringPayment(str, money, str2, recurringPaymentWrapper.time_to_payment, recurringPayment != null ? recurringPayment.initiator_note : null, recurringPaymentWrapper.edit_url, (recurringPayment != null ? recurringPayment.canceled_at : null) != null));
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (!((RecurringPayment) it.next()).isCanceled) {
                                        this.optimisticPaymentDisplay.setValue(null);
                                        break;
                                    }
                                }
                            }
                            RecurringPayments.Loaded loaded = new RecurringPayments.Loaded(getRecurringPaymentsResponse.create_url, arrayList);
                            realRecurringPaymentsManager$loadRecurringPayments$1.L$0 = null;
                            realRecurringPaymentsManager$loadRecurringPayments$1.label = 3;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, loaded);
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            realRecurringPaymentsManager$loadRecurringPayments$1.L$0 = null;
                            realRecurringPaymentsManager$loadRecurringPayments$1.label = 4;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, RecurringPayments.Error.INSTANCE);
                        }
                        return coroutineSingletons;
                    }
                    GetRecurringPaymentsRequest getRecurringPaymentsRequest3 = realRecurringPaymentsManager$loadRecurringPayments$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    getRecurringPaymentsRequest2 = getRecurringPaymentsRequest3;
                }
                realRecurringPaymentsManager$loadRecurringPayments$1.L$0 = null;
                realRecurringPaymentsManager$loadRecurringPayments$1.label = 2;
                obj = this.appService.getRecurringPayments(getRecurringPaymentsRequest2, realRecurringPaymentsManager$loadRecurringPayments$1);
            }
        }
        realRecurringPaymentsManager$loadRecurringPayments$1 = new RealRecurringPaymentsManager$loadRecurringPayments$1(this, continuationImpl);
        Object obj2 = realRecurringPaymentsManager$loadRecurringPayments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecurringPaymentsManager$loadRecurringPayments$1.label;
        StateFlowImpl stateFlowImpl2 = this.recurringPayments;
        if (i != 0) {
        }
        realRecurringPaymentsManager$loadRecurringPayments$1.L$0 = null;
        realRecurringPaymentsManager$loadRecurringPayments$1.label = 2;
        obj2 = this.appService.getRecurringPayments(getRecurringPaymentsRequest2, realRecurringPaymentsManager$loadRecurringPayments$1);
    }
}
