package defpackage;

import android.view.View;

/* loaded from: classes4.dex */
public interface qwc0 {
    void dispose();

    View getView();

    default void onFlutterViewAttached(View view) {
    }

    default void onFlutterViewDetached() {
    }

    default void onInputConnectionLocked() {
    }

    default void onInputConnectionUnlocked() {
    }
}
