package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class yp7 {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final u7t e;
    public final ilm f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final dq3 m;
    public final dq3 n;
    public final dq3 o;

    public yp7(a aVar, a aVar2, a aVar3, a aVar4, u7t u7tVar, ilm ilmVar, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, dq3 dq3Var, dq3 dq3Var2, dq3 dq3Var3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = u7tVar;
        this.f = ilmVar;
        this.g = config;
        this.h = z;
        this.i = z2;
        this.j = drawable;
        this.k = drawable2;
        this.l = drawable3;
        this.m = dq3Var;
        this.n = dq3Var2;
        this.o = dq3Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp7)) {
            return false;
        }
        yp7 yp7Var = (yp7) obj;
        return Intrinsics.d(this.a, yp7Var.a) && Intrinsics.d(this.b, yp7Var.b) && Intrinsics.d(this.c, yp7Var.c) && Intrinsics.d(this.d, yp7Var.d) && Intrinsics.d(this.e, yp7Var.e) && this.f == yp7Var.f && this.g == yp7Var.g && this.h == yp7Var.h && this.i == yp7Var.i && Intrinsics.d(this.j, yp7Var.j) && Intrinsics.d(this.k, yp7Var.k) && Intrinsics.d(this.l, yp7Var.l) && this.m == yp7Var.m && this.n == yp7Var.n && this.o == yp7Var.o;
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i);
        Drawable drawable = this.j;
        int hashCode = (e + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.k;
        int hashCode2 = (hashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.l;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((hashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yp7() {
        this(r2, r3, r3, r3, u7t.a, r7, r8, true, false, null, null, null, r14, r14, r14);
        dq7 dq7Var = ca8.a;
        bsd bsdVar = j5h.a.g;
        mn7 mn7Var = mn7.d;
        ilm ilmVar = ilm.c;
        Bitmap.Config config = k.b;
        dq3 dq3Var = dq3.ENABLED;
    }
}
