package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.request.CachePolicy;
import coil.view.Scale;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class qg70 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final wis0 d;
    public final Scale e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final meu j;
    public final u7x0 k;
    public final dd90 l;
    public final CachePolicy m;
    public final CachePolicy n;
    public final CachePolicy o;

    public qg70(Context context, Bitmap.Config config, ColorSpace colorSpace, wis0 wis0Var, Scale scale, boolean z, boolean z2, boolean z3, String str, meu meuVar, u7x0 u7x0Var, dd90 dd90Var, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = wis0Var;
        this.e = scale;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = meuVar;
        this.k = u7x0Var;
        this.l = dd90Var;
        this.m = cachePolicy;
        this.n = cachePolicy2;
        this.o = cachePolicy3;
    }

    public static qg70 a(qg70 qg70Var, Bitmap.Config config, CachePolicy cachePolicy) {
        Context context = qg70Var.a;
        ColorSpace colorSpace = qg70Var.c;
        wis0 wis0Var = qg70Var.d;
        Scale scale = qg70Var.e;
        boolean z = qg70Var.f;
        boolean z2 = qg70Var.g;
        boolean z3 = qg70Var.h;
        String str = qg70Var.i;
        meu meuVar = qg70Var.j;
        u7x0 u7x0Var = qg70Var.k;
        dd90 dd90Var = qg70Var.l;
        CachePolicy cachePolicy2 = qg70Var.m;
        CachePolicy cachePolicy3 = qg70Var.n;
        qg70Var.getClass();
        return new qg70(context, config, colorSpace, wis0Var, scale, z, z2, z3, str, meuVar, u7x0Var, dd90Var, cachePolicy2, cachePolicy3, cachePolicy);
    }

    public final Bitmap.Config b() {
        return this.b;
    }

    public final Context c() {
        return this.a;
    }

    public final CachePolicy d() {
        return this.o;
    }

    public final Scale e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg70)) {
            return false;
        }
        qg70 qg70Var = (qg70) obj;
        return jl40.l(this.a, qg70Var.a) && this.b == qg70Var.b && jl40.l(this.c, qg70Var.c) && jl40.l(this.d, qg70Var.d) && this.e == qg70Var.e && this.f == qg70Var.f && this.g == qg70Var.g && this.h == qg70Var.h && jl40.l(this.i, qg70Var.i) && jl40.l(this.j, qg70Var.j) && jl40.l(this.k, qg70Var.k) && jl40.l(this.l, qg70Var.l) && this.m == qg70Var.m && this.n == qg70Var.n && this.o == qg70Var.o;
    }

    public final wis0 f() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        int e = unr0.e(unr0.e(unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + unr0.d(unr0.d((((e + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.a)) * 31, 31, this.k.a), 31, this.l.a)) * 31)) * 31);
    }
}
