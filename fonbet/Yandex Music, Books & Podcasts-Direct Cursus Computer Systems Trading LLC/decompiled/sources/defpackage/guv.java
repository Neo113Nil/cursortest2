package defpackage;

/* loaded from: classes4.dex */
public final class guv {
    public final float a;
    public final float b;

    public guv(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guv)) {
            return false;
        }
        guv guvVar = (guv) obj;
        return cma.a(this.a, guvVar.a) && cma.a(this.b, guvVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("WizardDimensions(likedArtistsScreenTopAppBarElevationRes=", cma.b(this.a), ", artistCardBorderRadiusDp=", cma.b(this.b), ")");
    }
}
