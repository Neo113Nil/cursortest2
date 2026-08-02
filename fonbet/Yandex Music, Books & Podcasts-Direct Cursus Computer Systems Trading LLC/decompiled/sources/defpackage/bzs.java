package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bzs {
    public static final bzs e = new bzs(120.0f, 80.0f, null, 0.5f);
    public final float a;
    public final float b;
    public final Float c;
    public final float d;

    public bzs(float f, float f2, Float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzs)) {
            return false;
        }
        bzs bzsVar = (bzs) obj;
        return Float.compare(this.a, bzsVar.a) == 0 && Float.compare(this.b, bzsVar.b) == 0 && Intrinsics.d(this.c, bzsVar.c) && Float.compare(this.d, bzsVar.d) == 0;
    }

    public final int hashCode() {
        int a = eta.a(Float.hashCode(this.a) * 31, this.b, 31);
        Float f = this.c;
        return Float.hashCode(this.d) + ((a + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "TrackParameters(bpm=" + this.a + ", hue=" + this.b + ", collectionHue=" + this.c + ", energy=" + this.d + ")";
    }
}
