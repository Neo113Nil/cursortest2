package com.squareup.cash.activity.backend.loader;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.OrderActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.support.presenters.ArticlePresenter$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.PaymentRenderData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.ProtoAdapter;
import java.time.Instant;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ReceiptGetRequestHandler extends KeysetHandle {
    public final ZiplineActivityItemFormatter activityItemFormatter;
    public final Lazy paymentRenderDataJsonAdapter$delegate;

    public final class OrderPaymentHistoryAdapterItem implements PaymentHistoryActivityItem, ActivityItem {
        public final /* synthetic */ OrderActivityItem $$delegate_0;
        public final UiPayment uiPayment;
        public final UiCustomer uiRecipient;
        public final UiCustomer uiSender;

        public OrderPaymentHistoryAdapterItem(OrderActivityItem orderActivityItem, String str) {
            str.getClass();
            this.$$delegate_0 = orderActivityItem;
            this.uiPayment = new UiPayment(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY);
            OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
            UiCustomer uiCustomer = orderActivityData.sender;
            if (uiCustomer == null) {
                uiCustomer = new UiCustomer(null, null, null, null, null, null, -1);
            }
            this.uiSender = uiCustomer;
            UiCustomer uiCustomer2 = orderActivityData.recipient;
            if (uiCustomer2 == null) {
                uiCustomer2 = new UiCustomer(null, null, null, null, null, null, -1);
            }
            this.uiRecipient = uiCustomer2;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final ActivityItemGlobalId getActivityItemGlobalId() {
            return ((OrderActivityData) this.$$delegate_0).activityItemGlobalId;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final Instant getDisplayInstant() {
            return ((OrderActivityData) this.$$delegate_0).displayInstant;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final Set getProductClassifiers() {
            return ((OrderActivityData) this.$$delegate_0).productClassifiers;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final ActivityItemGlobalId getReferenceItemId() {
            return ((OrderActivityData) this.$$delegate_0).referenceItemId;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final Role getRole() {
            return Role.RECIPIENT;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final String getRowId() {
            return ((OrderActivityData) this.$$delegate_0).rowId;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final ActivityRowSection getSection() {
            return ((OrderActivityData) this.$$delegate_0).section;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final PaymentState getState() {
            return null;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final TransactionType getTransactionType() {
            return null;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final UiPayment getUiPayment() {
            return this.uiPayment;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final UiCustomer getUiRecipient() {
            return this.uiRecipient;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final UiCustomer getUiSender() {
            return this.uiSender;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final long getVersion() {
            return ((OrderActivityData) this.$$delegate_0).version;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final boolean isBadged() {
            return false;
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final boolean isOffline() {
            return false;
        }
    }

    public ReceiptGetRequestHandler(ActivityClientService activityClientService, ZiplineActivityItemFormatter ziplineActivityItemFormatter, Moshi moshi) {
        super(14, activityClientService, ziplineActivityItemFormatter);
        this.activityItemFormatter = ziplineActivityItemFormatter;
        this.paymentRenderDataJsonAdapter$delegate = LazyKt.lazy(new ArticlePresenter$$ExternalSyntheticLambda0(moshi, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.google.crypto.tink.KeysetHandle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestItem(ActivitiesManager.ActivityContext activityContext, ActivityItemGlobalId activityItemGlobalId, ContinuationImpl continuationImpl) {
        ReceiptGetRequestHandler$requestItem$1 receiptGetRequestHandler$requestItem$1;
        int i;
        ActivitiesManager$ActivityGetHandler$Result activitiesManager$ActivityGetHandler$Result;
        if (continuationImpl instanceof ReceiptGetRequestHandler$requestItem$1) {
            receiptGetRequestHandler$requestItem$1 = (ReceiptGetRequestHandler$requestItem$1) continuationImpl;
            int i2 = receiptGetRequestHandler$requestItem$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                receiptGetRequestHandler$requestItem$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = receiptGetRequestHandler$requestItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = receiptGetRequestHandler$requestItem$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    receiptGetRequestHandler$requestItem$1.label = 1;
                    obj = KeysetHandle.requestItem$suspendImpl(this, activityContext, activityItemGlobalId, receiptGetRequestHandler$requestItem$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj.getClass();
                        return new ActivitiesManager$ActivityGetHandler$Success((PaymentHistoryActivityItem) obj);
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                activitiesManager$ActivityGetHandler$Result = (ActivitiesManager$ActivityGetHandler$Result) obj;
                if (activitiesManager$ActivityGetHandler$Result instanceof ActivitiesManager$ActivityGetHandler$Success) {
                    ActivityItem activityItem = ((ActivitiesManager$ActivityGetHandler$Success) activitiesManager$ActivityGetHandler$Result).item;
                    if (activityItem instanceof OrderActivityItem) {
                        OrderActivityItem orderActivityItem = (OrderActivityItem) activityItem;
                        ProtoAdapter protoAdapter = PaymentRenderData.ADAPTER;
                        PaymentRenderData.Builder builder = new PaymentRenderData.Builder();
                        CashAppPayOrderRenderData cashAppPayOrderRenderData = ((OrderActivityData) orderActivityItem).orderRenderData;
                        builder.created_at = cashAppPayOrderRenderData.created_at;
                        builder.is_pwc_payment = Boolean.TRUE;
                        builder.cash_app_pay_order_render_data = cashAppPayOrderRenderData;
                        String json = ((JsonAdapter) this.paymentRenderDataJsonAdapter$delegate.getValue()).toJson(builder.build());
                        json.getClass();
                        OrderPaymentHistoryAdapterItem orderPaymentHistoryAdapterItem = new OrderPaymentHistoryAdapterItem(orderActivityItem, json);
                        receiptGetRequestHandler$requestItem$1.label = 2;
                        obj = ZiplineActivityItemFormatter.format$default(this.activityItemFormatter, orderPaymentHistoryAdapterItem, receiptGetRequestHandler$requestItem$1);
                    }
                }
                return activitiesManager$ActivityGetHandler$Result;
            }
        }
        receiptGetRequestHandler$requestItem$1 = new ReceiptGetRequestHandler$requestItem$1(this, continuationImpl);
        Object obj2 = receiptGetRequestHandler$requestItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = receiptGetRequestHandler$requestItem$1.label;
        if (i != 0) {
        }
        activitiesManager$ActivityGetHandler$Result = (ActivitiesManager$ActivityGetHandler$Result) obj2;
        if (activitiesManager$ActivityGetHandler$Result instanceof ActivitiesManager$ActivityGetHandler$Success) {
        }
        return activitiesManager$ActivityGetHandler$Result;
    }
}
