package defpackage;

/* loaded from: classes10.dex */
public final class y64 extends uiv {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public y64(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.kf61
    public final float a() {
        return this.b;
    }

    @Override // defpackage.kf61
    public final float b() {
        return this.d;
    }

    @Override // defpackage.kf61
    public final float c() {
        return this.c;
    }

    @Override // defpackage.kf61
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uiv) {
            y64 y64Var = (y64) ((uiv) obj);
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(y64Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(y64Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(y64Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(y64Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        sb.append(this.b);
        sb.append(", minZoomRatio=");
        sb.append(this.c);
        sb.append(", linearZoom=");
        return uw51.i(sb, this.d, "}");
    }
}
