package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;

/* loaded from: classes.dex */
public final class Event implements JsonStream.Streamable {
    public final EventInternal impl;
    public final Logger logger;

    public Event(Throwable th, ImmutableConfig immutableConfig, SeverityReason severityReason, Metadata metadata, FeatureFlags featureFlags, Logger logger) {
        this(new EventInternal(th, immutableConfig, severityReason, metadata, featureFlags, 96), logger);
    }

    public final void addMetadata(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            logNull$1("addMetadata");
        } else {
            this.impl.metadata.addMetadata(str, str2, obj);
        }
    }

    public final void logNull$1(String str) {
        this.logger.e("Invalid null value supplied to event." + str + ", ignoring");
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }

    public Event(EventInternal eventInternal, Logger logger) {
        this.impl = eventInternal;
        this.logger = logger;
    }
}
