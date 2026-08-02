package com.bugsnag.android;

/* loaded from: classes.dex */
public interface Connectivity {
    boolean hasNetworkConnection();

    void registerForNetworkChanges();

    String retrieveNetworkAccessState();
}
