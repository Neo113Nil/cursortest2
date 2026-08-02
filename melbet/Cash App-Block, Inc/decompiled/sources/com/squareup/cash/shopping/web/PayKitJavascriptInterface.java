package com.squareup.cash.shopping.web;

import android.webkit.JavascriptInterface;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes7.dex */
public final class PayKitJavascriptInterface {
    public final BufferedChannel webEvents;

    public PayKitJavascriptInterface(BufferedChannel bufferedChannel) {
        this.webEvents = bufferedChannel;
    }

    @JavascriptInterface
    public final void authorizeCustomerRequest(String str) {
        str.getClass();
        ChannelResult.m4192getOrThrowimpl(this.webEvents.mo1159trySendJP2dKIU(new ShoppingWebBridgeEvent.PayKitShopBridgeEvent.AuthorizeCustomerRequest(str)));
    }

    @JavascriptInterface
    public final void promptToAuthorizeCustomerRequest(String str) {
        str.getClass();
        ChannelResult.m4192getOrThrowimpl(this.webEvents.mo1159trySendJP2dKIU(new ShoppingWebBridgeEvent.PayKitShopBridgeEvent.PromptToAuthorize(str)));
    }
}
