package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class twn {
    public final float a;
    public final float b;
    public final List c;
    public final ynn d;
    public final ai3 e;

    public twn(float f, float f2, List list, ynn ynnVar, o6g o6gVar) {
        this.a = f;
        this.b = f2;
        this.c = list;
        this.d = ynnVar;
        this.e = o6gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twn)) {
            return false;
        }
        twn twnVar = (twn) obj;
        return cma.a(this.a, twnVar.a) && Float.compare(this.b, twnVar.b) == 0 && this.c.equals(twnVar.c) && Float.compare(1.0f, 1.0f) == 0 && this.d.equals(twnVar.d) && Intrinsics.d(this.e, twnVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + eta.a(k5r.d(eta.a(Float.hashCode(this.a) * 31, this.b, 31), 31, this.c), 1.0f, 31)) * 31;
        ai3 ai3Var = this.e;
        return (hashCode + (ai3Var == null ? 0 : ai3Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RenderEffectParams(blurRadius=" + cma.b(this.a) + ", noiseFactor=" + this.b + ", tints=" + this.c + ", tintAlphaModulate=1.0, contentBounds=" + this.d + ", mask=" + this.e + ", progressive=null)";
    }
}
