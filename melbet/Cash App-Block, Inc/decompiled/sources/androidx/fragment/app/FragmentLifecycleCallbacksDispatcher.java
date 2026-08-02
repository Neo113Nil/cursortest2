package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class FragmentLifecycleCallbacksDispatcher {
    public final FragmentManager fragmentManager;
    public final CopyOnWriteArrayList lifecycleCallbacks = new CopyOnWriteArrayList();

    /* loaded from: classes3.dex */
    public final class FragmentLifecycleCallbacksHolder {
        public final FragmentStateAdapter.AnonymousClass2 callback;

        public FragmentLifecycleCallbacksHolder(FragmentStateAdapter.AnonymousClass2 anonymousClass2) {
            this.callback = anonymousClass2;
        }

        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public final void dispatchOnFragmentActivityCreated(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentActivityCreated(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentAttached(Fragment fragment, boolean z) {
        fragment.getClass();
        FragmentManager fragmentManager = this.fragmentManager;
        FragmentActivity fragmentActivity = fragmentManager.mHost.context;
        Fragment fragment2 = fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentAttached(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentCreated(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentCreated(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentDestroyed(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentDetached(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentDetached(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentPaused(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentPaused(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(Fragment fragment, boolean z) {
        fragment.getClass();
        FragmentManager fragmentManager = this.fragmentManager;
        FragmentActivity fragmentActivity = fragmentManager.mHost.context;
        Fragment fragment2 = fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentPreAttached(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentPreCreated(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentResumed(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentResumed(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentStarted(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentStarted(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentStopped(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentStopped(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean z) {
        fragment.getClass();
        view.getClass();
        FragmentManager fragmentManager = this.fragmentManager;
        Fragment fragment2 = fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment, view, bundle, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentViewCreated(fragmentManager, fragment, view);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = this.fragmentManager.mParent;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.mLifecycleCallbacksDispatcher.dispatchOnFragmentViewDestroyed(fragment, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (z) {
                fragmentLifecycleCallbacksHolder.getClass();
            } else {
                fragmentLifecycleCallbacksHolder.getCallback();
            }
        }
    }
}
