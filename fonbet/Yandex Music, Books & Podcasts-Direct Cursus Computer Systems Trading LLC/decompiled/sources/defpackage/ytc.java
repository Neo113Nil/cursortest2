package defpackage;

import androidx.fragment.app.o;

/* loaded from: classes.dex */
public interface ytc {
    void onBackStackChanged();

    default void onBackStackChangeCancelled() {
    }

    default void onBackStackChangeProgressed(ri2 ri2Var) {
    }

    default void onBackStackChangeCommitted(o oVar, boolean z) {
    }

    default void onBackStackChangeStarted(o oVar, boolean z) {
    }
}
