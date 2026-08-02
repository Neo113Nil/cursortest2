package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class LifecycleLifecycle implements Lifecycle, LifecycleObserver {
    public final androidx.lifecycle.Lifecycle lifecycle;
    public final HashSet lifecycleListeners = new HashSet();

    public LifecycleLifecycle(androidx.lifecycle.Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void addListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.add(lifecycleListener);
        androidx.lifecycle.Lifecycle lifecycle = this.lifecycle;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            lifecycleListener.onDestroy();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void removeListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.remove(lifecycleListener);
    }
}
