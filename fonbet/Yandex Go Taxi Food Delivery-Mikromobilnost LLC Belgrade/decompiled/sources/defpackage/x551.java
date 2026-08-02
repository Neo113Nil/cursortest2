package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class x551 implements um10 {
    public final qo5 a;

    public x551(qo5 qo5Var) {
        this.a = qo5Var;
    }

    @Override // defpackage.um10
    public final int a(f6w f6wVar, long j, int i, LayoutDirection layoutDirection) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return y6i0.d(this.a.a(i, i2, layoutDirection), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x551) && this.a.equals(((x551) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
