package androidx.lifecycle;

import android.os.Handler;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    public Handler handler;
    public int resumedCounter;
    public int startedCounter;
    public boolean pauseSent = true;
    public boolean stopSent = true;
    public final LifecycleRegistry registry = new LifecycleRegistry(this, true);
    public final AFLogger$$ExternalSyntheticLambda0 delayedPauseRunnable = new AFLogger$$ExternalSyntheticLambda0(this, 8);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.registry;
    }
}
