package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rwj {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final lmq d;
    public final nso e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final zvd j;
    public final h4s k;
    public final m6k l;
    public final dq3 m;
    public final dq3 n;
    public final dq3 o;

    public rwj(Context context, Bitmap.Config config, ColorSpace colorSpace, lmq lmqVar, nso nsoVar, boolean z, boolean z2, boolean z3, String str, zvd zvdVar, h4s h4sVar, m6k m6kVar, dq3 dq3Var, dq3 dq3Var2, dq3 dq3Var3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = lmqVar;
        this.e = nsoVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = zvdVar;
        this.k = h4sVar;
        this.l = m6kVar;
        this.m = dq3Var;
        this.n = dq3Var2;
        this.o = dq3Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwj)) {
            return false;
        }
        rwj rwjVar = (rwj) obj;
        if (Intrinsics.d(this.a, rwjVar.a) && this.b == rwjVar.b) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.d(this.c, rwjVar.c)) && Intrinsics.d(this.d, rwjVar.d) && this.e == rwjVar.e && this.f == rwjVar.f && this.g == rwjVar.g && this.h == rwjVar.h && Intrinsics.d(this.i, rwjVar.i) && Intrinsics.d(this.j, rwjVar.j) && Intrinsics.d(this.k, rwjVar.k) && Intrinsics.d(this.l, rwjVar.l) && this.m == rwjVar.m && this.n == rwjVar.n && this.o == rwjVar.o;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        int e = k5r.e(k5r.e(k5r.e((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + f1d.b(this.l.a, f1d.b(this.k.a, (((e + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.a)) * 31, 31), 31)) * 31)) * 31);
    }
}
