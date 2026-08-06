package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gm0 {
    public static final defpackage.gm0 ZpBGe2uQfcn8 = new defpackage.gm0();

    public final boolean ZpBGe2uQfcn8(android.view.MotionEvent motionEvent, int i) {
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
