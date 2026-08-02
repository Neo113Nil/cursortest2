package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class so5 implements it1 {
    public final float a;

    public so5(float f) {
        this.a = f;
    }

    @Override // defpackage.it1
    public final int a(int i, int i2, LayoutDirection layoutDirection) {
        float f = (i2 - i) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f2 = this.a;
        if (layoutDirection != layoutDirection2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so5) && Float.compare(this.a, ((so5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
