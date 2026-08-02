package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class h8b implements daf {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final daf g;
    public final Map h;
    public final pwj i;
    public int j;

    public h8b(Object obj, daf dafVar, int i, int i2, Map map, Class cls, Class cls2, pwj pwjVar) {
        w1g.s(obj, "Argument must not be null");
        this.b = obj;
        this.g = dafVar;
        this.c = i;
        this.d = i2;
        w1g.s(map, "Argument must not be null");
        this.h = map;
        w1g.s(cls, "Resource class must not be null");
        this.e = cls;
        w1g.s(cls2, "Transcode class must not be null");
        this.f = cls2;
        w1g.s(pwjVar, "Argument must not be null");
        this.i = pwjVar;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof h8b) {
            h8b h8bVar = (h8b) obj;
            if (this.b.equals(h8bVar.b) && this.g.equals(h8bVar.g) && this.d == h8bVar.d && this.c == h8bVar.c && this.h.equals(h8bVar.h) && this.e.equals(h8bVar.e) && this.f.equals(h8bVar.f) && this.i.equals(h8bVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daf
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
