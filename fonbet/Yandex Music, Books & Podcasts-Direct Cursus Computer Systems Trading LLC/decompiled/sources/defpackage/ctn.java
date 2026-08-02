package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ctn implements zl6 {
    public final float a;

    public ctn(float f) {
        this.a = f;
    }

    @Override // defpackage.zl6
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctn) && this.a == ((ctn) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return f1d.i(new StringBuilder(), (int) (this.a * 100.0f), "%");
    }
}
