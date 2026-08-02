package com.google.android.datatransport.runtime.scheduling;

import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class DefaultScheduler {
    public static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    public final MetadataBackendRegistry backendRegistry;
    public final SQLiteEventStore eventStore;
    public final Executor executor;
    public final SQLiteEventStore guard;
    public final SVG workScheduler;

    public DefaultScheduler(Executor executor, MetadataBackendRegistry metadataBackendRegistry, SVG svg, SQLiteEventStore sQLiteEventStore, SQLiteEventStore sQLiteEventStore2) {
        this.executor = executor;
        this.backendRegistry = metadataBackendRegistry;
        this.workScheduler = svg;
        this.eventStore = sQLiteEventStore;
        this.guard = sQLiteEventStore2;
    }
}
