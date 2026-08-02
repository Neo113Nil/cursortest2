package com.squareup.cash.clientrouting.routers.core;

import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.bitcoin.navigation.RealBitcoinRefreshInvoiceManager;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class BackgroundRouter {
    public final RealAfterpayAppletRepository afterpayAppletRepository;
    public final RealAppMessageManager appMessageManager;
    public final ForcedLazyKt$forcedLazy$1 deviceId;
    public final RealGpsLocationManager gpsLocationManager;
    public final CoroutineContext ioContext;
    public final RealOffersSheetRepository offerSheetRepository;
    public final RealBitcoinRefreshInvoiceManager refreshInvoiceManager;
    public final RealRequestReviewFlagWrapper requestReviewFlagWrapper;
    public final CoroutineScope scope;

    public BackgroundRouter(RealRequestReviewFlagWrapper realRequestReviewFlagWrapper, RealAfterpayAppletRepository realAfterpayAppletRepository, RealOffersSheetRepository realOffersSheetRepository, RealBitcoinRefreshInvoiceManager realBitcoinRefreshInvoiceManager, RealGpsLocationManager realGpsLocationManager, RealAppMessageManager realAppMessageManager, ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        realAppMessageManager.getClass();
        forcedLazyKt$forcedLazy$1.getClass();
        coroutineContext.getClass();
        this.requestReviewFlagWrapper = realRequestReviewFlagWrapper;
        this.afterpayAppletRepository = realAfterpayAppletRepository;
        this.offerSheetRepository = realOffersSheetRepository;
        this.refreshInvoiceManager = realBitcoinRefreshInvoiceManager;
        this.gpsLocationManager = realGpsLocationManager;
        this.appMessageManager = realAppMessageManager;
        this.deviceId = forcedLazyKt$forcedLazy$1;
        this.ioContext = coroutineContext;
        this.scope = coroutineScope;
    }
}
