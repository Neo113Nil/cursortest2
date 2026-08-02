package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class rce {
    public final m6k A;
    public final Integer B;
    public final Integer C;
    public final Drawable D;
    public final tu7 E;
    public final yp7 F;
    public final Context a;
    public final Object b;
    public final i6s c;
    public final qce d;
    public final xwh e;
    public final String f;
    public final Bitmap.Config g;
    public final ilm h;
    public final List i;
    public final u7t j;
    public final zvd k;
    public final h4s l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final dq3 q;
    public final dq3 r;
    public final dq3 s;
    public final a t;
    public final a u;
    public final a v;
    public final a w;
    public final nyf x;
    public final bnq y;
    public final nso z;

    public rce(Context context, Object obj, i6s i6sVar, qce qceVar, xwh xwhVar, String str, Bitmap.Config config, ilm ilmVar, List list, u7t u7tVar, zvd zvdVar, h4s h4sVar, boolean z, boolean z2, boolean z3, boolean z4, dq3 dq3Var, dq3 dq3Var2, dq3 dq3Var3, a aVar, a aVar2, a aVar3, a aVar4, nyf nyfVar, bnq bnqVar, nso nsoVar, m6k m6kVar, Integer num, Integer num2, Drawable drawable, tu7 tu7Var, yp7 yp7Var) {
        this.a = context;
        this.b = obj;
        this.c = i6sVar;
        this.d = qceVar;
        this.e = xwhVar;
        this.f = str;
        this.g = config;
        this.h = ilmVar;
        this.i = list;
        this.j = u7tVar;
        this.k = zvdVar;
        this.l = h4sVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = dq3Var;
        this.r = dq3Var2;
        this.s = dq3Var3;
        this.t = aVar;
        this.u = aVar2;
        this.v = aVar3;
        this.w = aVar4;
        this.x = nyfVar;
        this.y = bnqVar;
        this.z = nsoVar;
        this.A = m6kVar;
        this.B = num;
        this.C = num2;
        this.D = drawable;
        this.E = tu7Var;
        this.F = yp7Var;
    }

    public static pce a(rce rceVar) {
        Context context = rceVar.a;
        rceVar.getClass();
        return new pce(rceVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce)) {
            return false;
        }
        rce rceVar = (rce) obj;
        return Intrinsics.d(this.a, rceVar.a) && this.b.equals(rceVar.b) && Intrinsics.d(this.c, rceVar.c) && Intrinsics.d(this.d, rceVar.d) && Intrinsics.d(this.e, rceVar.e) && Intrinsics.d(this.f, rceVar.f) && this.g == rceVar.g && this.h == rceVar.h && Intrinsics.d(this.i, rceVar.i) && Intrinsics.d(this.j, rceVar.j) && Intrinsics.d(this.k, rceVar.k) && this.l.equals(rceVar.l) && this.m == rceVar.m && this.n == rceVar.n && this.o == rceVar.o && this.p == rceVar.p && this.q == rceVar.q && this.r == rceVar.r && this.s == rceVar.s && Intrinsics.d(this.t, rceVar.t) && Intrinsics.d(this.u, rceVar.u) && Intrinsics.d(this.v, rceVar.v) && Intrinsics.d(this.w, rceVar.w) && Intrinsics.d(this.B, rceVar.B) && Intrinsics.d(this.C, rceVar.C) && Intrinsics.d(this.D, rceVar.D) && Intrinsics.d(this.x, rceVar.x) && this.y.equals(rceVar.y) && this.z == rceVar.z && this.A.equals(rceVar.A) && this.E.equals(rceVar.E) && Intrinsics.d(this.F, rceVar.F);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        i6s i6sVar = this.c;
        int hashCode2 = (hashCode + (i6sVar != null ? i6sVar.hashCode() : 0)) * 31;
        qce qceVar = this.d;
        int hashCode3 = (hashCode2 + (qceVar != null ? qceVar.hashCode() : 0)) * 31;
        xwh xwhVar = this.e;
        int hashCode4 = (hashCode3 + (xwhVar != null ? xwhVar.hashCode() : 0)) * 31;
        String str = this.f;
        int b = f1d.b(this.A.a, (this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e(f1d.b(this.l.a, (((this.j.hashCode() + k5r.d((this.h.hashCode() + ((this.g.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791, 31, this.i)) * 31) + Arrays.hashCode(this.k.a)) * 31, 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 961);
        Integer num = this.B;
        int hashCode5 = (b + (num != null ? num.hashCode() : 0)) * 961;
        Integer num2 = this.C;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable = this.D;
        return this.F.hashCode() + ((this.E.hashCode() + ((hashCode6 + (drawable != null ? drawable.hashCode() : 0)) * 29791)) * 31);
    }
}
