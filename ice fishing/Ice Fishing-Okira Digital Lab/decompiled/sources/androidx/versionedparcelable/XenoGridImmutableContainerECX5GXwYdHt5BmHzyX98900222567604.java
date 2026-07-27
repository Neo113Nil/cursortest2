package androidx.versionedparcelable;

import android.view.MotionEvent;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridImmutableContainerECX5GXwYdHt5BmHzyX98900222567604 {
    public static final XenoGridImmutableContainerECX5GXwYdHt5BmHzyX98900222567604 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new XenoGridImmutableContainerECX5GXwYdHt5BmHzyX98900222567604();

    public final boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(MotionEvent motionEvent, int i) {
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
