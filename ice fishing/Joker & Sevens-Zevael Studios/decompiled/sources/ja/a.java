package ja;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
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

    public final void setDeniedByLifecycleCallback(boolean z10) {
        this.isDeniedByLifecycleCallback = z10;
    }

    public final void setOneSignalPayload(boolean z10) {
        this.isOneSignalPayload = z10;
    }

    public final void setWorkManagerProcessing(boolean z10) {
        this.isWorkManagerProcessing = z10;
    }
}
