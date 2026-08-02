package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class qo5 implements it1 {
    public final float a;

    public qo5(float f) {
        this.a = f;
    }

    @Override // defpackage.it1
    public final int a(int i, int i2, LayoutDirection layoutDirection) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo5) && Float.compare(this.a, ((qo5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
