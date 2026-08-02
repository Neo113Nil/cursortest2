package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;

/* loaded from: classes15.dex */
public interface tv10 {
    default void onEnterSelectionMode() {
    }

    default void onExitSelectionMode() {
    }

    default void onMessageSelected(long j, LocalMessageRef localMessageRef) {
    }

    default void onMessageUnselected(long j, LocalMessageRef localMessageRef) {
    }

    void onSelectionChanged();
}
