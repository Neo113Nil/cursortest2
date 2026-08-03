package p3;

import android.view.View;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i10) {
        return false;
    }

    public int getOrderedChildIndex(int i10) {
        return i10;
    }

    public void onViewDragStateChanged(int i10) {
    }

    public void onEdgeDragStarted(int i10, int i11) {
    }

    public void onEdgeTouched(int i10, int i11) {
    }

    public void onViewCaptured(View view, int i10) {
    }

    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
    }
}
