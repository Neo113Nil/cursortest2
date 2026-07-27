package android.content.Context;

import android.view.MotionEvent;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNavigationEpicRogue6269 {
    public static final FrostHunterNavigationEpicRogue6269 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterNavigationEpicRogue6269();

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(MotionEvent motionEvent, int i) {
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
