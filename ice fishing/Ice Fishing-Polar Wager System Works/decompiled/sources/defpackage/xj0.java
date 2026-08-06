package defpackage;

/* loaded from: classes.dex */
public final class xj0 {
    public static final defpackage.xj0 IHQe1A4L2xu = new defpackage.xj0();

    public final boolean IHQe1A4L2xu(android.view.MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((java.lang.Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (java.lang.Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
