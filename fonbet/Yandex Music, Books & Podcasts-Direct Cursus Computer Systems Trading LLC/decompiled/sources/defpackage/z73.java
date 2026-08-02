package defpackage;

import android.graphics.RenderEffect;

/* loaded from: classes.dex */
public final class z73 extends qwn {
    public final float b;
    public final float c;
    public final int d;

    public z73(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.qwn
    public final RenderEffect b() {
        return rf0.f(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return this.b == z73Var.b && this.c == z73Var.c && this.d == z73Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + eta.a(Float.hashCode(this.b) * 31, this.c, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) ivf.N(this.d)) + ')';
    }
}
