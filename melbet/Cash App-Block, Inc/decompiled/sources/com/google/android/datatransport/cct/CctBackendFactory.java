package com.google.android.datatransport.cct;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.AutoValue_CreationContext;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;

/* loaded from: classes4.dex */
public class CctBackendFactory {
    public TransportBackend create(CreationContext creationContext) {
        Context context = ((AutoValue_CreationContext) creationContext).applicationContext;
        AutoValue_CreationContext autoValue_CreationContext = (AutoValue_CreationContext) creationContext;
        return new CctTransportBackend(context, autoValue_CreationContext.wallClock, autoValue_CreationContext.monotonicClock);
    }
}
