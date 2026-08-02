package defpackage;

/* loaded from: classes.dex */
public final class a1r implements n2i {
    public final float a;
    public final int b;

    public a1r(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1r.class == obj.getClass()) {
            a1r a1rVar = (a1r) obj;
            if (this.a == a1rVar.a && this.b == a1rVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
