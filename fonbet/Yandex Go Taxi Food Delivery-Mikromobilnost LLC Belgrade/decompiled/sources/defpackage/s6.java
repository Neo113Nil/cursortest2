package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s6 implements xre {
    public final float a;

    public s6(float f) {
        this.a = f;
    }

    @Override // defpackage.xre
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6) && this.a == ((s6) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return uw51.i(new StringBuilder(), this.a, "px");
    }
}
