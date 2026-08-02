package androidx.compose.foundation.lazy.layout;

/* loaded from: classes3.dex */
public final class PriorityTask {
    public final int priority;
    public final PrefetchHandleProvider$HandleAndRequestImpl request;

    public PriorityTask(int i, PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl) {
        this.priority = i;
        this.request = prefetchHandleProvider$HandleAndRequestImpl;
    }
}
