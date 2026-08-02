package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes10.dex */
public final class y1o implements khx {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final khx g;
    public final Map h;
    public final mg70 i;
    public int j;

    public y1o(Object obj, khx khxVar, int i, int i2, Map map, Class cls, Class cls2, mg70 mg70Var) {
        z2a1.e(obj, "Argument must not be null");
        this.b = obj;
        z2a1.e(khxVar, "Signature must not be null");
        this.g = khxVar;
        this.c = i;
        this.d = i2;
        z2a1.e(map, "Argument must not be null");
        this.h = map;
        z2a1.e(cls, "Resource class must not be null");
        this.e = cls;
        z2a1.e(cls2, "Transcode class must not be null");
        this.f = cls2;
        z2a1.e(mg70Var, "Argument must not be null");
        this.i = mg70Var;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof y1o) {
            y1o y1oVar = (y1o) obj;
            if (this.b.equals(y1oVar.b) && this.g.equals(y1oVar.g) && this.d == y1oVar.d && this.c == y1oVar.c && this.h.equals(y1oVar.h) && this.e.equals(y1oVar.e) && this.f.equals(y1oVar.f) && this.i.equals(y1oVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.b.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
