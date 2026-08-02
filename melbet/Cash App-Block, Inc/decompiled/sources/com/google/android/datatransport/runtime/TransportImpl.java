package com.google.android.datatransport.runtime;

import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.AutoValue_ProductData;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.HashMap;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public final class TransportImpl {
    public final String name;
    public final Encoding payloadEncoding;
    public final Transformer transformer;
    public final AutoValue_TransportContext transportContext;
    public final TransportRuntime transportInternal;

    public TransportImpl(AutoValue_TransportContext autoValue_TransportContext, String str, Encoding encoding2, Transformer transformer, TransportRuntime transportRuntime) {
        this.transportContext = autoValue_TransportContext;
        this.name = str;
        this.payloadEncoding = encoding2;
        this.transformer = transformer;
        this.transportInternal = transportRuntime;
    }

    public final void send(AutoValue_Event autoValue_Event) {
        TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0 = new TransportImpl$$ExternalSyntheticLambda0(0);
        TransportRuntime transportRuntime = this.transportInternal;
        DefaultScheduler defaultScheduler = transportRuntime.scheduler;
        Priority priority = autoValue_Event.priority;
        SVG builder = AutoValue_TransportContext.builder();
        AutoValue_TransportContext autoValue_TransportContext = this.transportContext;
        builder.setBackendName(autoValue_TransportContext.backendName);
        builder.idToElementMap = priority;
        builder.cssRules = autoValue_TransportContext.extras;
        AutoValue_TransportContext build = builder.build();
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.idCounter = new HashMap();
        subtreeManager.workflowSession = Long.valueOf(transportRuntime.eventClock.getTime());
        subtreeManager.interceptor = Long.valueOf(transportRuntime.uptimeClock.getTime());
        subtreeManager.snapshotCache = this.name;
        subtreeManager.emitActionToParent = new EncodedPayload(this.payloadEncoding, (byte[]) this.transformer.apply(autoValue_Event.payload));
        subtreeManager.contextForChildren = null;
        AutoValue_ProductData autoValue_ProductData = autoValue_Event.productData;
        if (autoValue_ProductData != null) {
            subtreeManager.children = autoValue_ProductData.productId;
        }
        defaultScheduler.executor.execute(new CardEntryActivityController$$ExternalSyntheticLambda1(defaultScheduler, build, transportImpl$$ExternalSyntheticLambda0, subtreeManager.m4005build()));
    }
}
