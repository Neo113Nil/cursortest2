package defpackage;

/* loaded from: classes4.dex */
public final class zd5 {
    public final float a;
    public final float b;

    public zd5(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd5)) {
            return false;
        }
        zd5 zd5Var = (zd5) obj;
        return cma.a(this.a, zd5Var.a) && cma.a(this.b, zd5Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("CommonLyricsSizes(maxWidth=", cma.b(this.a), ", settingsPanelBottomInset=", cma.b(this.b), ")");
    }
}
