package defpackage;

/* loaded from: classes4.dex */
public final class euv {
    public final float a;
    public final float b;

    public euv(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euv)) {
            return false;
        }
        euv euvVar = (euv) obj;
        return cma.a(this.a, euvVar.a) && cma.a(this.b, euvVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("WizardContentUiConfig(itemHeight=", cma.b(this.a), ", itemWidth=", cma.b(this.b), ")");
    }
}
