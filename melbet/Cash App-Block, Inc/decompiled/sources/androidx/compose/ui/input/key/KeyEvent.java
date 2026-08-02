package androidx.compose.ui.input.key;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class KeyEvent {
    public final android.view.KeyEvent nativeKeyEvent;

    public final boolean equals(Object obj) {
        if (obj instanceof KeyEvent) {
            return Intrinsics.areEqual(this.nativeKeyEvent, ((KeyEvent) obj).nativeKeyEvent);
        }
        return false;
    }

    public final int hashCode() {
        return this.nativeKeyEvent.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.nativeKeyEvent + ')';
    }
}
