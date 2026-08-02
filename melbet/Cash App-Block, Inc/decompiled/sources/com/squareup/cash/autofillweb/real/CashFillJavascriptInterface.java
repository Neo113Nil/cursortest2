package com.squareup.cash.autofillweb.real;

import android.webkit.JavascriptInterface;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes5.dex */
public final class CashFillJavascriptInterface {
    public final Channel webEvents;

    public CashFillJavascriptInterface(BufferedChannel bufferedChannel) {
        bufferedChannel.getClass();
        this.webEvents = bufferedChannel;
    }

    @JavascriptInterface
    public final void postMessage(String str, String str2) {
        if (str != null) {
            ChannelResult.m4192getOrThrowimpl(this.webEvents.mo1159trySendJP2dKIU(new CashFillJsonEvents(str)));
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
