package app.cash.local.presenters.brand.orders;

import androidx.compose.runtime.MutableState;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.cdf.localclient.FulfillmentType;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowViewOrderStatus;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalOrderStatusPresenter$models$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $loadedOrder$delegate;
    public final /* synthetic */ LocalOrderStatusPresenter this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalOrderStatusPresenter$models$3$1$1(LocalOrderStatusPresenter localOrderStatusPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localOrderStatusPresenter;
        this.$loadedOrder$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalOrderStatusPresenter$models$3$1$1(this.this$0, this.$loadedOrder$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalOrderStatusPresenter$models$3$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FulfillmentType fulfillmentType;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LocalOrderStatusPresenter localOrderStatusPresenter = this.this$0;
        Analytics analytics = localOrderStatusPresenter.analytics;
        MutableState mutableState = this.$loadedOrder$delegate;
        LocalOrder.LocalOrderBrand localOrderBrand = ((LocalOrder) mutableState.getValue()).local_order_brand;
        String str2 = localOrderBrand != null ? localOrderBrand.token : null;
        LocalLocationSummary localLocationSummary = ((LocalOrder) mutableState.getValue()).location_summary;
        String str3 = localLocationSummary != null ? localLocationSummary.token : null;
        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localOrderStatusPresenter.sessionManager);
        LocalCart localCart = ((LocalOrder) mutableState.getValue()).cart;
        String str4 = localCart != null ? localCart.token : null;
        String str5 = ((LocalOrder) mutableState.getValue()).token;
        LocalFulfillment localFulfillment = ((LocalOrder) mutableState.getValue()).fulfillment;
        LocalFulfillmentType localFulfillmentType = localFulfillment != null ? localFulfillment.type : null;
        switch (localFulfillmentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                fulfillmentType = FulfillmentType.PICKUP;
                break;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 6:
                fulfillmentType = FulfillmentType.DELIVERY;
                break;
        }
        FulfillmentType fulfillmentType2 = fulfillmentType;
        LocalOrder.OrderStatus orderStatus = ((LocalOrder) mutableState.getValue()).order_status;
        if (orderStatus != null) {
            Integer num = orderStatus.current_status_index;
            str = num != null ? (String) CollectionsKt.getOrNull(num.intValue(), orderStatus.possible_statuses) : null;
        } else {
            str = null;
        }
        analytics.track(new LocalClientCheckoutFlowViewOrderStatus(str2, str3, activeAccountTokenOrNull, str4, str5, fulfillmentType2, str), null);
        return Unit.INSTANCE;
    }
}
