package defpackage;

import android.util.Size;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class x84 {
    public final Size a;
    public final HashMap b;
    public final Size c;
    public final HashMap d;
    public final Size e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;

    public x84(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4, HashMap hashMap5, HashMap hashMap6) {
        if (size == null) {
            ny61.t("Null analysisSize");
            throw null;
        }
        this.a = size;
        this.b = hashMap;
        if (size2 == null) {
            ny61.t("Null previewSize");
            throw null;
        }
        this.c = size2;
        this.d = hashMap2;
        if (size3 == null) {
            ny61.t("Null recordSize");
            throw null;
        }
        this.e = size3;
        this.f = hashMap3;
        this.g = hashMap4;
        this.h = hashMap5;
        this.i = hashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        x84 x84Var = (x84) obj;
        return this.a.equals(x84Var.a) && this.b.equals(x84Var.b) && this.c.equals(x84Var.c) && this.d.equals(x84Var.d) && this.e.equals(x84Var.e) && this.f.equals(x84Var.f) && this.g.equals(x84Var.g) && this.h.equals(x84Var.h) && this.i.equals(x84Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
