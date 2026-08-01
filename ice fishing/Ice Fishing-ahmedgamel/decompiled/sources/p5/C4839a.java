package p5;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4839a {
    private boolean isDeniedByLifecycleCallback;
    private boolean isOneSignalPayload;
    private boolean isWorkManagerProcessing;

    public final boolean isProcessed() {
        return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
    }

    public final boolean isWorkManagerProcessing() {
        return this.isWorkManagerProcessing;
    }

    public final void setDeniedByLifecycleCallback(boolean z3) {
        this.isDeniedByLifecycleCallback = z3;
    }

    public final void setOneSignalPayload(boolean z3) {
        this.isOneSignalPayload = z3;
    }

    public final void setWorkManagerProcessing(boolean z3) {
        this.isWorkManagerProcessing = z3;
    }
}
