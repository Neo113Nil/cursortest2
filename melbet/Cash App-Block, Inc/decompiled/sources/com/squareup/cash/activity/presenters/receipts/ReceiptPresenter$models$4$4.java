package com.squareup.cash.activity.presenters.receipts;

import androidx.compose.runtime.State;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractClick;
import com.squareup.cash.cdf.productdiscovery.ProductDiscoveryContentInteractClick;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ReceiptPresenter$models$4$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ReceiptViewEvent $event;
    public final /* synthetic */ State $intermediateState$delegate;
    public final /* synthetic */ ActivityItemEventHandler $itemEventHandler;
    public int label;
    public final /* synthetic */ ReceiptPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptPresenter$models$4$4(State state, ActivityItemEventHandler activityItemEventHandler, ReceiptViewEvent receiptViewEvent, ReceiptPresenter receiptPresenter, Continuation continuation) {
        super(2, continuation);
        this.$event = receiptViewEvent;
        this.this$0 = receiptPresenter;
        this.$itemEventHandler = activityItemEventHandler;
        this.$intermediateState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReceiptPresenter$models$4$4(this.$intermediateState$delegate, this.$itemEventHandler, this.$event, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiptPresenter$models$4$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Placement placement;
        Object obj2;
        ReceiptPresenter receiptPresenter = this.this$0;
        ActivityAnalyticsService activityAnalyticsService = receiptPresenter.activityAnalyticsService;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ReceiptViewEvent.UpsellClicked upsellClicked = (ReceiptViewEvent.UpsellClicked) this.$event;
            FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData = upsellClicked.upsell.product_discovery_data;
            if (productDiscoveryData != null) {
                ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService.track(new ProductDiscoveryContentInteractClick(productDiscoveryData.product_discovery_flow_token, productDiscoveryData.product_major, productDiscoveryData.product_minor, productDiscoveryData.product_category, productDiscoveryData.content_token, productDiscoveryData.content_template_token, ProductDiscoveryContentInteractClick.ClickElement.CONTENT_CTA), null);
            }
            ReceiptSection.Upsell upsell = upsellClicked.upsell;
            FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData = upsell.on_demand_message_data;
            if (onDemandMessageData != null) {
                PaymentHistoryButton paymentHistoryButton = upsell.button;
                String str = paymentHistoryButton != null ? paymentHistoryButton.url : null;
                Analytics analytics = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                String str2 = onDemandMessageData.campaign_token;
                long currentTimeMillis = System.currentTimeMillis();
                String str3 = onDemandMessageData.template_token;
                Integer num = onDemandMessageData.template_version;
                String str4 = onDemandMessageData.placement;
                if (str4 != null) {
                    Iterator it = Placement.$ENTRIES.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (Intrinsics.areEqual(((Placement) obj2).name(), str4)) {
                            break;
                        }
                    }
                    placement = (Placement) obj2;
                } else {
                    placement = null;
                }
                analytics.track(new OnDemandMessageInteractClick(str2, Long.valueOf(currentTimeMillis), str, placement, str3, num, AppMessageFormat.CARD, CollectionsKt.joinToString$default(onDemandMessageData.product_types, null, null, null, 0, null, null, 63), 16), null);
            }
            PaymentHistoryButton paymentHistoryButton2 = upsellClicked.upsell.button;
            if (paymentHistoryButton2 != null) {
                ReceiptPresenter.IntermediateState intermediateState = (ReceiptPresenter.IntermediateState) this.$intermediateState$delegate.getValue();
                this.label = 1;
                if (ReceiptPresenter.access$handleButtonClick(receiptPresenter, this.$itemEventHandler, intermediateState, paymentHistoryButton2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
