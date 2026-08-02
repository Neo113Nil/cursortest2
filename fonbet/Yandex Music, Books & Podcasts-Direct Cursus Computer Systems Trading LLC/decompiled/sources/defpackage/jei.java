package defpackage;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class jei {
    public static final jei a = new jei();

    public final boolean a(@NotNull MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
