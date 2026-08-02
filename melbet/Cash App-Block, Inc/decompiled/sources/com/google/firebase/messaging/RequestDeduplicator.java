package com.google.firebase.messaging;

import androidx.collection.ArrayMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class RequestDeduplicator {
    public final Executor executor;
    public final ArrayMap getTokenRequests = new ArrayMap(0);

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }
}
