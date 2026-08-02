package com.squareup.cash.common.web;

import androidx.glance.appwidget.NormalizeCompositionTreeKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes7.dex */
public interface WebAppBridge {
    ReceiveChannel getWebEvents();

    void loadUrl(String str);

    void sendWebCommand(NormalizeCompositionTreeKt normalizeCompositionTreeKt);
}
