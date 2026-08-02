package defpackage;

/* loaded from: classes.dex */
public final class n6g implements lqc {
    public final float a;

    public n6g(float f) {
        this.a = f;
    }

    @Override // defpackage.lqc
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.lqc
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6g) && Float.compare(this.a, ((n6g) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
