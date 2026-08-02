package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class zn2 {
    public final vn2 a;
    public final bn2 b;
    public final ym2 c;
    public final xn2 d;

    public zn2(vn2 vn2Var, bn2 bn2Var, ym2 ym2Var, xn2 xn2Var) {
        this.a = vn2Var;
        this.b = bn2Var;
        this.c = ym2Var;
        this.d = xn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn2)) {
            return false;
        }
        zn2 zn2Var = (zn2) obj;
        if (!this.a.equals(zn2Var.a) || !this.b.equals(zn2Var.b) || !this.c.equals(zn2Var.c) || !this.d.equals(zn2Var.d)) {
            return false;
        }
        Object obj2 = dii.b;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return dii.b.hashCode() + tlm.d(this.d.a, (this.c.hashCode() + f1d.a(R.drawable.ic_offline_mode_lte_wi_fi_40, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "BarAboveUiConfig(stringResources=" + this.a + ", drawableResources=" + this.b + ", colors=" + this.c + ", textStyles=" + this.d + ", colorizeText=" + dii.b + ")";
    }
}
