package android.content.Context;

import com.adjust.sdk.AdjustFactory;
import java.lang.Thread;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionNovaGamma2310 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
    }
}
