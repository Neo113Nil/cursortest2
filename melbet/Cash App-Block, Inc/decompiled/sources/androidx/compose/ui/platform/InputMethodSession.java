package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import com.squareup.contour.ContourLayout$geometry$1;

/* loaded from: classes.dex */
public final class InputMethodSession {
    public boolean disposed;
    public final ContourLayout$geometry$1 onAllConnectionsClosed;
    public final PlatformTextInputMethodRequest request;
    public final Object lock = new Object();
    public final MutableVector connections = new MutableVector(0, new WeakReference[16]);

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, ContourLayout$geometry$1 contourLayout$geometry$1) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = contourLayout$geometry$1;
    }
}
