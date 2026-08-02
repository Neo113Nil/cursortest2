package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h5 implements zl6 {
    public final float a;

    public h5(float f) {
        this.a = f;
    }

    @Override // defpackage.zl6
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5) && this.a == ((h5) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return su4.m(this.a, "px", new StringBuilder());
    }
}
