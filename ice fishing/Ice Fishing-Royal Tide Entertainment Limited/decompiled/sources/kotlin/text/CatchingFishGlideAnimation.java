package kotlin.text;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class CatchingFishGlideAnimation {
    public static final CatchingFishGlideAnimation CatchingFishParcelableFAB = new CatchingFishGlideAnimation();

    public final boolean CatchingFishParcelableFAB(MotionEvent motionEvent, int i) {
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
