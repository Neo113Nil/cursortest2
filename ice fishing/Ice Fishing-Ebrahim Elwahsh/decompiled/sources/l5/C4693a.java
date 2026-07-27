package l5;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4693a {
    private boolean isDeniedByLifecycleCallback;
    private boolean isOneSignalPayload;
    private boolean isWorkManagerProcessing;

    public final boolean isProcessed() {
        return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
    }

    public final boolean isWorkManagerProcessing() {
        return this.isWorkManagerProcessing;
    }

    public final void setDeniedByLifecycleCallback(boolean z8) {
        this.isDeniedByLifecycleCallback = z8;
    }

    public final void setOneSignalPayload(boolean z8) {
        this.isOneSignalPayload = z8;
    }

    public final void setWorkManagerProcessing(boolean z8) {
        this.isWorkManagerProcessing = z8;
    }
}
