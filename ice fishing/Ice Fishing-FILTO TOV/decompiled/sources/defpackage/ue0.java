package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ue0 {
    public static final ue0 GWasM1elztuh = new ue0();

    public final boolean GWasM1elztuh(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
