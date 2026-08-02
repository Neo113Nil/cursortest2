package androidx.lifecycle;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner lifecycleOwner) {
    }

    default void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    default void onPause(LifecycleOwner lifecycleOwner) {
    }

    default void onResume(LifecycleOwner lifecycleOwner) {
    }

    default void onStart(LifecycleOwner lifecycleOwner) {
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
    }
}
