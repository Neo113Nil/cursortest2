package com.squareup.cash.clientsync.util.coroutines;

import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public abstract class ClientSyncDispatchers {
    public static final DefaultIoScheduler IO;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        IO = DefaultIoScheduler.INSTANCE;
    }
}
