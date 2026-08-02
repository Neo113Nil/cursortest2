package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class skj implements tkj {
    public final Integer a;

    public /* synthetic */ skj(Integer num) {
        this.a = num;
    }

    public static final /* synthetic */ skj c(Integer num) {
        return new skj(num);
    }

    @Override // defpackage.tkj
    public final int a() {
        return jl40.q(this.a.intValue(), 0);
    }

    @Override // defpackage.tkj
    public final Number b(DisplayMetrics displayMetrics) {
        return Float.valueOf(TypedValue.applyDimension(2, this.a.floatValue(), displayMetrics));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof skj) {
            return this.a.equals(((skj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Sp(num=" + this.a + ')';
    }
}
