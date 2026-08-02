package androidx.compose.runtime.internal;

/* loaded from: classes.dex */
public abstract class AwaiterQueue$Awaiter {
    public abstract void cancel();

    public abstract void resumeWithException(Throwable th);
}
