package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.view.Precision;

/* loaded from: classes.dex */
public final class tih {
    public final jse a;
    public final jse b;
    public final jse c;
    public final jse d;
    public final qx01 e;
    public final Precision f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final CachePolicy m;
    public final CachePolicy n;
    public final CachePolicy o;

    public tih(int i) {
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a.x;
        mdh mdhVar = mdh.b;
        re60 re60Var = qx01.a;
        Precision precision = Precision.AUTOMATIC;
        Bitmap.Config config = m.b;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        this.a = g6uVar;
        this.b = mdhVar;
        this.c = mdhVar;
        this.d = mdhVar;
        this.e = re60Var;
        this.f = precision;
        this.g = config;
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = cachePolicy;
        this.n = cachePolicy;
        this.o = cachePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tih)) {
            return false;
        }
        tih tihVar = (tih) obj;
        return jl40.l(this.a, tihVar.a) && jl40.l(this.b, tihVar.b) && jl40.l(this.c, tihVar.c) && jl40.l(this.d, tihVar.d) && jl40.l(this.e, tihVar.e) && this.f == tihVar.f && this.g == tihVar.g && this.h == tihVar.h && this.i == tihVar.i && jl40.l(this.j, tihVar.j) && jl40.l(this.k, tihVar.k) && jl40.l(this.l, tihVar.l) && this.m == tihVar.m && this.n == tihVar.n && this.o == tihVar.o;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i);
        Drawable drawable = this.j;
        int hashCode = (e + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.k;
        int hashCode2 = (hashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.l;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((hashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public tih() {
        this(0);
    }
}
