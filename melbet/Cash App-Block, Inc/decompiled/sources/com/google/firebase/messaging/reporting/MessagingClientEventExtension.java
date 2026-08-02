package com.google.firebase.messaging.reporting;

import com.squareup.scannerview.SizeMap;

/* loaded from: classes4.dex */
public final class MessagingClientEventExtension {
    public final MessagingClientEvent messaging_client_event_;

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    public static SizeMap newBuilder() {
        SizeMap sizeMap = new SizeMap(7, false);
        sizeMap.mRatios = null;
        return sizeMap;
    }
}
