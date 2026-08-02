package app.cash.local.presenters.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.OpenTabCartOverride;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class OpenTabStateKt {
    public static final ActiveOpenTabCartResolution activeOpenTabCartResolution(CartBuilder cartBuilder, GetBuyerInfoResponse.BuyerInfo buyerInfo) {
        LocalCart localCart = buyerInfo != null ? buyerInfo.active_cart : null;
        OpenTabCartOverride openTabCartOverride = (OpenTabCartOverride) ((RealCartBuilder) cartBuilder).openTabCartOverrideState.getValue();
        if (openTabCartOverride == null) {
            return new ActiveOpenTabCartResolution(localCart, null);
        }
        LocalCart localCart2 = openTabCartOverride.cart;
        if (buyerInfo != null && localCart == null) {
            return new ActiveOpenTabCartResolution(null, openTabCartOverride);
        }
        if (localCart == null || (Intrinsics.areEqual(localCart.token, localCart2.token) && (!getHasOpenTabRounds(localCart) || Intrinsics.areEqual(localCart.version, openTabCartOverride.staleBuyerInfoCartVersion) || Intrinsics.areEqual(localCart.version, openTabCartOverride.submittedCartVersion) || Intrinsics.areEqual(localCart.version, localCart2.version)))) {
            localCart = localCart2;
        }
        return new ActiveOpenTabCartResolution(localCart, localCart != localCart2 ? openTabCartOverride : null);
    }

    public static final boolean getHasOpenTabRounds(LocalCart localCart) {
        LocalCart.OpenTabInfo openTabInfo;
        List<LocalCart.OpenTabInfo.Round> list;
        return (localCart == null || (openTabInfo = localCart.open_tab_info) == null || (list = openTabInfo.rounds) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public static final boolean isClosedInStoreOpenTab(LocalOrder localOrder) {
        LocalCart.OpenTabInfo openTabInfo;
        List<LocalCart.OpenTabInfo.Round> list;
        localOrder.getClass();
        LocalFulfillment localFulfillment = localOrder.fulfillment;
        if ((localFulfillment != null ? localFulfillment.type : null) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE && (openTabInfo = localOrder.open_tab_info) != null && (list = openTabInfo.rounds) != null && (!list.isEmpty())) {
            LocalOrder.OrderStatus orderStatus = localOrder.order_status;
            if (orderStatus != null ? Intrinsics.areEqual(orderStatus.is_in_progress, Boolean.FALSE) : false) {
                LocalOrder.OrderStatus orderStatus2 = localOrder.order_status;
                if (!(orderStatus2 != null ? Intrinsics.areEqual(orderStatus2.is_cancelled, Boolean.TRUE) : false) && localOrder.paid_at != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final LocalCart rememberActiveOpenTabCart(CartBuilder cartBuilder, GetBuyerInfoResponse.BuyerInfo buyerInfo, Composer composer) {
        cartBuilder.getClass();
        ActiveOpenTabCartResolution activeOpenTabCartResolution = activeOpenTabCartResolution(cartBuilder, buyerInfo);
        OpenTabCartOverride openTabCartOverride = activeOpenTabCartResolution.overrideToClear;
        Continuation continuation = null;
        Integer valueOf = openTabCartOverride != null ? Integer.valueOf(System.identityHashCode(openTabCartOverride)) : null;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changedInstance = gapComposer.changedInstance(openTabCartOverride) | gapComposer.changedInstance(cartBuilder);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new EventBridge$sendEvent$1(openTabCartOverride, cartBuilder, continuation, 5);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
        return activeOpenTabCartResolution.activeCart;
    }
}
