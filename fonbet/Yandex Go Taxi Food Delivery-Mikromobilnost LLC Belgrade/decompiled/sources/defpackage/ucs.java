package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public interface ucs {
    default void onBackStackChangeCancelled() {
    }

    default void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    default void onBackStackChangeProgressed(je4 je4Var) {
    }

    default void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    void onBackStackChanged();
}
