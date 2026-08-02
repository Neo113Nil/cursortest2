package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* loaded from: classes3.dex */
public abstract class LongPressResult {

    public final class Canceled extends LongPressResult {
        public static final Canceled INSTANCE = new Canceled();
    }

    public final class Released extends LongPressResult {
        public final PointerInputChange finalUpChange;

        public Released(PointerInputChange pointerInputChange) {
            this.finalUpChange = pointerInputChange;
        }
    }

    public final class Success extends LongPressResult {
        public static final Success INSTANCE = new Success();
    }
}
