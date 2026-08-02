package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class MotionEventVerifierApi29 {
    public static final MotionEventVerifierApi29 INSTANCE = new MotionEventVerifierApi29();

    public final boolean isValidMotionEvent(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
