package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class MenuHostHelper {
    public final Runnable mOnInvalidateMenuCallback;
    public final CopyOnWriteArrayList mMenuProviders = new CopyOnWriteArrayList();
    public final HashMap mProviderToLifecycleContainers = new HashMap();

    /* loaded from: classes3.dex */
    public final class LifecycleContainer {
        public final Lifecycle mLifecycle;
        public LifecycleEventObserver mObserver;

        public LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle = lifecycle;
            this.mObserver = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        public final void clearObservers() {
            this.mLifecycle.removeObserver(this.mObserver);
            this.mObserver = null;
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.mOnInvalidateMenuCallback = runnable;
    }

    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.mMenuProviders.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
        }
        this.mOnInvalidateMenuCallback.run();
    }
}
