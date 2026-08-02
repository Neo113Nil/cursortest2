package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public interface ylr {
    void addScrollListener(RecyclerView.g gVar);

    View asView();

    boolean interceptOnBackPressed();

    default void onDestroy(boolean z) {
    }

    default void onPause() {
    }

    default void onResume() {
    }

    default void onStop() {
    }

    void removeScrollListener(RecyclerView.g gVar);

    default void setCanScroll(boolean z) {
    }

    default void setFloatButtons(eor eorVar, eor eorVar2) {
    }

    default void updateVisibilities() {
    }
}
