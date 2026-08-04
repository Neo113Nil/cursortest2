package com.gamericefishpro.space.hf;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private boolean isDeniedByLifecycleCallback;
    private boolean isOneSignalPayload;
    private boolean isWorkManagerProcessing;

    public final boolean isProcessed() {
        return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
    }

    public final boolean isWorkManagerProcessing() {
        return this.isWorkManagerProcessing;
    }

    public final void setDeniedByLifecycleCallback(boolean z) {
        this.isDeniedByLifecycleCallback = z;
    }

    public final void setOneSignalPayload(boolean z) {
        this.isOneSignalPayload = z;
    }

    public final void setWorkManagerProcessing(boolean z) {
        this.isWorkManagerProcessing = z;
    }
}
