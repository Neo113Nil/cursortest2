package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes6.dex */
public abstract class u4b1 {
    public static final int a(Long l, DisplayMetrics displayMetrics) {
        return m810.b(TypedValue.applyDimension(1, l != null ? l.longValue() : 0.0f, displayMetrics));
    }

    public static p6p0 b() {
        return p6p0.i;
    }

    public static final boolean c(tbv tbvVar) {
        if (tbvVar != null) {
            if (tbvVar instanceof qbv) {
                if (((qbv) tbvVar).b.length() != 0) {
                    return true;
                }
            } else if (tbvVar instanceof obv) {
                if (((obv) tbvVar).b.length() != 0) {
                    return true;
                }
            } else {
                if (tbvVar instanceof gbv) {
                    return true;
                }
                w511.b();
            }
        }
        return false;
    }
}
