package com.squareup.cash.shopping.web;

import android.webkit.JavascriptInterface;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes7.dex */
public final class AfterPayCheckoutJavascriptInterface {
    public final BufferedChannel webEvents;

    public AfterPayCheckoutJavascriptInterface(BufferedChannel bufferedChannel) {
        this.webEvents = bufferedChannel;
    }

    @JavascriptInterface
    public final void postMessage(String str, String str2) {
        if (str != null) {
            ChannelResult.m4192getOrThrowimpl(this.webEvents.mo1159trySendJP2dKIU(new ShoppingWebBridgeEvent.AfterpayWebCheckoutFlowJsonEvents(str)));
        }
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        postMessage(str, null);
    }

    @JavascriptInterface
    public final void postMessage() {
        postMessage(null, null);
    }
}
