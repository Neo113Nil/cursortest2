package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes8.dex */
public final class rkj implements tkj {
    public final Integer a;

    @Override // defpackage.tkj
    public final int a() {
        return jl40.q(this.a.intValue(), 0);
    }

    @Override // defpackage.tkj
    public final Number b(DisplayMetrics displayMetrics) {
        return Float.valueOf(TypedValue.applyDimension(1, this.a.floatValue(), displayMetrics));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rkj) {
            return this.a.equals(((rkj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Dp(num=" + this.a + ')';
    }
}
