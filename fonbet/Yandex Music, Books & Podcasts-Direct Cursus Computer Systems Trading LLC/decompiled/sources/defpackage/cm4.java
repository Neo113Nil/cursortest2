package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cm4 implements zl6 {
    public final float a;

    public cm4(float f) {
        this.a = f;
    }

    @Override // defpackage.zl6
    public final float a(RectF rectF) {
        return hyf.x(this.a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm4) && this.a == ((cm4) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
