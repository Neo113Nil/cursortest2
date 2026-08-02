package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class nn implements zl6 {
    public final zl6 a;
    public final float b;

    public nn(float f, zl6 zl6Var) {
        while (zl6Var instanceof nn) {
            zl6Var = ((nn) zl6Var).a;
            f += ((nn) zl6Var).b;
        }
        this.a = zl6Var;
        this.b = f;
    }

    @Override // defpackage.zl6
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        return this.a.equals(nnVar.a) && this.b == nnVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
