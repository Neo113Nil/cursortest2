package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class rb1 implements xre {
    public final xre a;
    public final float b;

    public rb1(float f, xre xreVar) {
        while (xreVar instanceof rb1) {
            xreVar = ((rb1) xreVar).a;
            f += ((rb1) xreVar).b;
        }
        this.a = xreVar;
        this.b = f;
    }

    @Override // defpackage.xre
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb1)) {
            return false;
        }
        rb1 rb1Var = (rb1) obj;
        return this.a.equals(rb1Var.a) && this.b == rb1Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
