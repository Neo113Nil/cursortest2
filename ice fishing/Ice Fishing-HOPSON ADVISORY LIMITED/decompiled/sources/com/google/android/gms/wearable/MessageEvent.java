package com.google.android.gms.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public interface MessageEvent {
    byte[] getData();

    String getPath();

    int getRequestId();

    String getSourceNodeId();
}
