package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class v97 implements p7q {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public v97(jc7 jc7Var, mjm mjmVar, w4i w4iVar) {
        teo teoVar = jc7Var.g;
        this.d = jc7Var;
        this.e = new qeo(-1, "", "");
        Collection collection = jc7Var.e;
        this.f = collection == null ? c5b.a : collection;
        ArrayList h0 = CollectionsKt.h0(collection == null ? c5b.a : collection, new wm4(new mjm(15, this)));
        Context context = jc7Var.a;
        String str = jc7Var.b;
        usr usrVar = jc7Var.c;
        p97 p97Var = jc7Var.d;
        boolean z = jc7Var.f;
        Executor executor = jc7Var.h;
        Executor executor2 = jc7Var.i;
        Intent intent = jc7Var.j;
        boolean z2 = jc7Var.k;
        boolean z3 = jc7Var.l;
        Set set = jc7Var.m;
        String str2 = jc7Var.n;
        File file = jc7Var.o;
        Callable callable = jc7Var.p;
        List list = jc7Var.q;
        List list2 = jc7Var.r;
        boolean z4 = jc7Var.s;
        yjo yjoVar = jc7Var.t;
        CoroutineContext coroutineContext = jc7Var.u;
        context.getClass();
        p97Var.getClass();
        executor.getClass();
        executor2.getClass();
        list.getClass();
        list2.getClass();
        jc7 jc7Var2 = new jc7(context, str, usrVar, p97Var, h0, z, teoVar, executor, executor2, intent, z2, z3, set, str2, file, callable, list, list2, z4, yjoVar, coroutineContext);
        jc7Var2.v = jc7Var.v;
        vsr vsrVar = (vsr) mjmVar.invoke(jc7Var2);
        this.h = vsrVar;
        f4m f4mVar = new f4m(vsrVar);
        String str3 = jc7Var.b;
        this.g = new y9k(f4mVar, str3 == null ? ":memory:" : str3, w4iVar);
        boolean z5 = teoVar == teo.c;
        if (vsrVar != null) {
            vsrVar.setWriteAheadLoggingEnabled(z5);
        }
    }

    public static final void a(v97 v97Var, xjo xjoVar) {
        Object t7oVar;
        yeo yeoVar = (yeo) v97Var.e;
        f(xjoVar);
        jc7 jc7Var = (jc7) v97Var.d;
        teo teoVar = jc7Var.g;
        teo teoVar2 = teo.c;
        if (teoVar == teoVar2) {
            p6g.s(xjoVar, "PRAGMA journal_mode = WAL");
        } else {
            p6g.s(xjoVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (jc7Var.g == teoVar2) {
            p6g.s(xjoVar, "PRAGMA synchronous = NORMAL");
        } else {
            p6g.s(xjoVar, "PRAGMA synchronous = FULL");
        }
        cko D0 = xjoVar.D0("PRAGMA user_version");
        try {
            D0.q();
            int i = (int) D0.getLong(0);
            i4w.w(D0, null);
            int i2 = yeoVar.c;
            if (i != i2) {
                p6g.s(xjoVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    r7o r7oVar = z7o.b;
                    if (i == 0) {
                        v97Var.o(xjoVar);
                    } else {
                        v97Var.p(xjoVar, i, i2);
                    }
                    p6g.s(xjoVar, "PRAGMA user_version = " + i2);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (!(t7oVar instanceof t7o)) {
                    p6g.s(xjoVar, "END TRANSACTION");
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    p6g.s(xjoVar, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            v97Var.r(xjoVar);
        } finally {
        }
    }

    public static void f(xjo xjoVar) {
        cko D0 = xjoVar.D0("PRAGMA busy_timeout");
        try {
            D0.q();
            long j = D0.getLong(0);
            i4w.w(D0, null);
            if (j < 3000) {
                p6g.s(xjoVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i4w.w(D0, th);
                throw th2;
            }
        }
    }

    public void b(sx7 sx7Var, int i, ArrayList arrayList, ijo ijoVar) {
        ynv ynvVar = sx7Var.d;
        ijo ijoVar2 = ynvVar.c;
        sx7 sx7Var2 = ynvVar.i;
        sx7 sx7Var3 = ynvVar.h;
        if (ijoVar2 == null) {
            ba6 ba6Var = (ba6) this.d;
            if (ynvVar == ba6Var.d || ynvVar == ba6Var.e) {
                return;
            }
            if (ijoVar == null) {
                ijoVar = new ijo();
                ijoVar.a = null;
                ijoVar.b = new ArrayList();
                ijoVar.a = ynvVar;
                arrayList.add(ijoVar);
            }
            ynvVar.c = ijoVar;
            ijoVar.b.add(ynvVar);
            Iterator it = sx7Var3.k.iterator();
            while (it.hasNext()) {
                px7 px7Var = (px7) it.next();
                if (px7Var instanceof sx7) {
                    b((sx7) px7Var, i, arrayList, ijoVar);
                }
            }
            Iterator it2 = sx7Var2.k.iterator();
            while (it2.hasNext()) {
                px7 px7Var2 = (px7) it2.next();
                if (px7Var2 instanceof sx7) {
                    b((sx7) px7Var2, i, arrayList, ijoVar);
                }
            }
            if (i == 1 && (ynvVar instanceof f1u)) {
                Iterator it3 = ((f1u) ynvVar).k.k.iterator();
                while (it3.hasNext()) {
                    px7 px7Var3 = (px7) it3.next();
                    if (px7Var3 instanceof sx7) {
                        b((sx7) px7Var3, i, arrayList, ijoVar);
                    }
                }
            }
            Iterator it4 = sx7Var3.l.iterator();
            while (it4.hasNext()) {
                b((sx7) it4.next(), i, arrayList, ijoVar);
            }
            Iterator it5 = sx7Var2.l.iterator();
            while (it5.hasNext()) {
                b((sx7) it5.next(), i, arrayList, ijoVar);
            }
            if (i == 1 && (ynvVar instanceof f1u)) {
                Iterator it6 = ((f1u) ynvVar).k.l.iterator();
                while (it6.hasNext()) {
                    b((sx7) it6.next(), i, arrayList, ijoVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(ba6 ba6Var) {
        Iterator it;
        z96 z96Var;
        z96 z96Var2;
        int i;
        z96 z96Var3;
        z96 z96Var4;
        z96 z96Var5;
        z96 z96Var6;
        z96 z96Var7;
        z96 z96Var8;
        Iterator it2 = ba6Var.u0.iterator();
        while (it2.hasNext()) {
            aa6 aa6Var = (aa6) it2.next();
            z96[] z96VarArr = aa6Var.U;
            o86[] o86VarArr = aa6Var.R;
            o86 o86Var = aa6Var.M;
            o86 o86Var2 = aa6Var.K;
            o86 o86Var3 = aa6Var.L;
            o86 o86Var4 = aa6Var.J;
            z96 z96Var9 = z96VarArr[0];
            z96 z96Var10 = z96VarArr[1];
            if (aa6Var.i0 == 8) {
                aa6Var.a = true;
            } else {
                float f = aa6Var.w;
                z96 z96Var11 = z96.c;
                if (f < 1.0f && z96Var9 == z96Var11) {
                    aa6Var.r = 2;
                }
                float f2 = aa6Var.z;
                if (f2 < 1.0f && z96Var10 == z96Var11) {
                    aa6Var.s = 2;
                }
                float f3 = aa6Var.Y;
                z96 z96Var12 = z96.b;
                z96 z96Var13 = z96.a;
                if (f3 > 0.0f) {
                    if (z96Var9 == z96Var11 && (z96Var10 == z96Var12 || z96Var10 == z96Var13)) {
                        aa6Var.r = 3;
                    } else if (z96Var10 == z96Var11 && (z96Var9 == z96Var12 || z96Var9 == z96Var13)) {
                        aa6Var.s = 3;
                    } else if (z96Var9 == z96Var11 && z96Var10 == z96Var11) {
                        it = it2;
                        if (aa6Var.r == 0) {
                            aa6Var.r = 3;
                        }
                        if (aa6Var.s == 0) {
                            aa6Var.s = 3;
                        }
                        if (z96Var9 == z96Var11 && aa6Var.r == 1 && (o86Var4.f == null || o86Var3.f == null)) {
                            z96Var9 = z96Var12;
                        }
                        if (z96Var10 == z96Var11 && aa6Var.s == 1 && (o86Var2.f == null || o86Var.f == null)) {
                            z96Var10 = z96Var12;
                        }
                        x3e x3eVar = aa6Var.d;
                        x3eVar.d = z96Var9;
                        int i2 = aa6Var.r;
                        x3eVar.a = i2;
                        f1u f1uVar = aa6Var.e;
                        f1uVar.d = z96Var10;
                        int i3 = aa6Var.s;
                        f1uVar.a = i3;
                        z96Var = z96.d;
                        if ((z96Var9 != z96Var || z96Var9 == z96Var13 || z96Var9 == z96Var12) && (z96Var10 == z96Var || z96Var10 == z96Var13 || z96Var10 == z96Var12)) {
                            z96Var2 = z96Var10;
                            int r = aa6Var.r();
                            if (z96Var9 == z96Var) {
                                r = (ba6Var.r() - o86Var4.g) - o86Var3.g;
                                z96Var9 = z96Var13;
                            }
                            int l = aa6Var.l();
                            if (z96Var2 != z96Var) {
                                i = (ba6Var.l() - o86Var2.g) - o86Var.g;
                                z96Var3 = z96Var13;
                            } else {
                                i = l;
                                z96Var3 = z96Var2;
                            }
                            k(aa6Var, z96Var9, r, z96Var3, i);
                            aa6Var.d.e.d(aa6Var.r());
                            aa6Var.e.e.d(aa6Var.l());
                            aa6Var.a = true;
                        } else {
                            if (z96Var9 != z96Var11 || (z96Var10 != z96Var12 && z96Var10 != z96Var13)) {
                                z96Var4 = z96Var10;
                                z96Var5 = z96Var12;
                            } else if (i2 == 3) {
                                if (z96Var10 == z96Var12) {
                                    k(aa6Var, z96Var12, 0, z96Var12, 0);
                                }
                                int l2 = aa6Var.l();
                                k(aa6Var, z96Var13, (int) ((l2 * aa6Var.Y) + 0.5f), z96Var13, l2);
                                aa6Var.d.e.d(aa6Var.r());
                                aa6Var.e.e.d(aa6Var.l());
                                aa6Var.a = true;
                            } else if (i2 == 1) {
                                k(aa6Var, z96Var12, 0, z96Var10, 0);
                                aa6Var.d.e.m = aa6Var.r();
                            } else {
                                z96Var5 = z96Var12;
                                z96Var4 = z96Var10;
                                if (i2 == 2) {
                                    z96 z96Var14 = ba6Var.U[0];
                                    if (z96Var14 == z96Var13 || z96Var14 == z96Var) {
                                        k(aa6Var, z96Var13, (int) ((f * ba6Var.r()) + 0.5f), z96Var4, aa6Var.l());
                                        aa6Var.d.e.d(aa6Var.r());
                                        aa6Var.e.e.d(aa6Var.l());
                                        aa6Var.a = true;
                                    } else {
                                        z96Var13 = z96Var13;
                                    }
                                } else {
                                    z96Var13 = z96Var13;
                                    if (o86VarArr[0].f == null || o86VarArr[1].f == null) {
                                        k(aa6Var, z96Var5, 0, z96Var4, 0);
                                        aa6Var.d.e.d(aa6Var.r());
                                        aa6Var.e.e.d(aa6Var.l());
                                        aa6Var.a = true;
                                    }
                                }
                            }
                            if (z96Var4 != z96Var11 || (z96Var9 != z96Var5 && z96Var9 != z96Var13)) {
                                z96 z96Var15 = z96Var4;
                                z96Var6 = z96Var5;
                                z96Var7 = z96Var13;
                                z96Var8 = z96Var15;
                            } else if (i3 == 3) {
                                if (z96Var9 == z96Var5) {
                                    k(aa6Var, z96Var5, 0, z96Var5, 0);
                                }
                                int r2 = aa6Var.r();
                                float f4 = aa6Var.Y;
                                if (aa6Var.Z == -1) {
                                    f4 = 1.0f / f4;
                                }
                                k(aa6Var, z96Var13, r2, z96Var13, (int) ((r2 * f4) + 0.5f));
                                aa6Var.d.e.d(aa6Var.r());
                                aa6Var.e.e.d(aa6Var.l());
                                aa6Var.a = true;
                            } else {
                                z96 z96Var16 = z96Var13;
                                if (i3 == 1) {
                                    k(aa6Var, z96Var9, 0, z96Var5, 0);
                                    aa6Var.e.e.m = aa6Var.l();
                                } else {
                                    z96 z96Var17 = z96Var5;
                                    z96 z96Var18 = z96Var9;
                                    if (i3 == 2) {
                                        z96 z96Var19 = ba6Var.U[1];
                                        if (z96Var19 == z96Var16 || z96Var19 == z96Var) {
                                            k(aa6Var, z96Var18, aa6Var.r(), z96Var16, (int) ((f2 * ba6Var.l()) + 0.5f));
                                            aa6Var.d.e.d(aa6Var.r());
                                            aa6Var.e.e.d(aa6Var.l());
                                            aa6Var.a = true;
                                        } else {
                                            z96Var8 = z96Var4;
                                            z96Var6 = z96Var17;
                                            z96Var9 = z96Var18;
                                            z96Var7 = z96Var16;
                                        }
                                    } else {
                                        z96Var9 = z96Var18;
                                        z96Var7 = z96Var16;
                                        if (o86VarArr[2].f == null || o86VarArr[3].f == null) {
                                            k(aa6Var, z96Var17, 0, z96Var4, 0);
                                            aa6Var.d.e.d(aa6Var.r());
                                            aa6Var.e.e.d(aa6Var.l());
                                            aa6Var.a = true;
                                        } else {
                                            z96Var8 = z96Var4;
                                            z96Var6 = z96Var17;
                                        }
                                    }
                                }
                            }
                            if (z96Var9 == z96Var11 && z96Var8 == z96Var11) {
                                if (i2 == 1 || i3 == 1) {
                                    k(aa6Var, z96Var6, 0, z96Var6, 0);
                                    aa6Var.d.e.m = aa6Var.r();
                                    aa6Var.e.e.m = aa6Var.l();
                                } else if (i3 == 2 && i2 == 2) {
                                    z96[] z96VarArr2 = ba6Var.U;
                                    if (z96VarArr2[0] == z96Var7 && z96VarArr2[1] == z96Var7) {
                                        k(aa6Var, z96Var7, (int) ((f * ba6Var.r()) + 0.5f), z96Var7, (int) ((f2 * ba6Var.l()) + 0.5f));
                                        aa6Var.d.e.d(aa6Var.r());
                                        aa6Var.e.e.d(aa6Var.l());
                                        aa6Var.a = true;
                                    }
                                }
                            }
                        }
                        it2 = it;
                    }
                }
                it = it2;
                if (z96Var9 == z96Var11) {
                    z96Var9 = z96Var12;
                }
                if (z96Var10 == z96Var11) {
                    z96Var10 = z96Var12;
                }
                x3e x3eVar2 = aa6Var.d;
                x3eVar2.d = z96Var9;
                int i22 = aa6Var.r;
                x3eVar2.a = i22;
                f1u f1uVar2 = aa6Var.e;
                f1uVar2.d = z96Var10;
                int i32 = aa6Var.s;
                f1uVar2.a = i32;
                z96Var = z96.d;
                if (z96Var9 != z96Var) {
                }
                z96Var2 = z96Var10;
                int r3 = aa6Var.r();
                if (z96Var9 == z96Var) {
                }
                int l3 = aa6Var.l();
                if (z96Var2 != z96Var) {
                }
                k(aa6Var, z96Var9, r3, z96Var3, i);
                aa6Var.d.e.d(aa6Var.r());
                aa6Var.e.e.d(aa6Var.l());
                aa6Var.a = true;
                it2 = it;
            }
        }
    }

    public void d() {
        ba6 ba6Var = (ba6) this.d;
        ArrayList arrayList = (ArrayList) this.i;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        ba6 ba6Var2 = (ba6) this.e;
        ba6Var2.d.f();
        ba6Var2.e.f();
        arrayList2.add(ba6Var2.d);
        arrayList2.add(ba6Var2.e);
        Iterator it = ba6Var2.u0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            if (aa6Var instanceof grd) {
                hrd hrdVar = new hrd(aa6Var);
                aa6Var.d.f();
                aa6Var.e.f();
                hrdVar.f = ((grd) aa6Var).y0;
                arrayList2.add(hrdVar);
            } else {
                if (aa6Var.y()) {
                    if (aa6Var.b == null) {
                        aa6Var.b = new ta4(aa6Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(aa6Var.b);
                } else {
                    arrayList2.add(aa6Var.d);
                }
                if (aa6Var.z()) {
                    if (aa6Var.c == null) {
                        aa6Var.c = new ta4(aa6Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(aa6Var.c);
                } else {
                    arrayList2.add(aa6Var.e);
                }
                if (aa6Var instanceof fxd) {
                    arrayList2.add(new exd(aa6Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((ynv) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ynv ynvVar = (ynv) it3.next();
            if (ynvVar.b != ba6Var2) {
                ynvVar.d();
            }
        }
        arrayList.clear();
        g(ba6Var.d, 0, arrayList);
        g(ba6Var.e, 1, arrayList);
        this.b = false;
    }

    public int e(ba6 ba6Var, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        ba6 ba6Var2 = ba6Var;
        ArrayList arrayList2 = (ArrayList) this.i;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            ynv ynvVar = ((ijo) arrayList2.get(i3)).a;
            if (!(ynvVar instanceof ta4) ? !(i != 0 ? (ynvVar instanceof f1u) : (ynvVar instanceof x3e)) : ((ta4) ynvVar).f != i) {
                sx7 sx7Var = (i == 0 ? ba6Var2.d : ba6Var2.e).h;
                sx7 sx7Var2 = (i == 0 ? ba6Var2.d : ba6Var2.e).i;
                sx7 sx7Var3 = ynvVar.h;
                sx7 sx7Var4 = ynvVar.i;
                boolean contains = sx7Var3.l.contains(sx7Var);
                boolean contains2 = sx7Var4.l.contains(sx7Var2);
                long j3 = ynvVar.j();
                if (contains && contains2) {
                    long b = ijo.b(sx7Var3, j);
                    long a = ijo.a(sx7Var4, j);
                    long j4 = b - j3;
                    int i4 = sx7Var4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = sx7Var3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    aa6 aa6Var = ynvVar.b;
                    if (i == 0) {
                        f = aa6Var.f0;
                    } else if (i == 1) {
                        f = aa6Var.g0;
                    } else {
                        aa6Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (sx7Var3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) su4.e(1.0f, f, f2, 0.5f)))) - sx7Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    max = contains ? Math.max(ijo.b(sx7Var3, sx7Var3.f), sx7Var3.f + j3) : contains2 ? Math.max(-ijo.a(sx7Var4, sx7Var4.f), (-sx7Var4.f) + j3) : (ynvVar.j() + sx7Var3.f) - sx7Var4.f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                max = j;
            }
            j2 = Math.max(j2, max);
            i3++;
            ba6Var2 = ba6Var;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) j2;
    }

    public void g(ynv ynvVar, int i, ArrayList arrayList) {
        sx7 sx7Var = ynvVar.h;
        sx7 sx7Var2 = ynvVar.i;
        Iterator it = sx7Var.k.iterator();
        while (it.hasNext()) {
            px7 px7Var = (px7) it.next();
            if (px7Var instanceof sx7) {
                b((sx7) px7Var, i, arrayList, null);
            } else if (px7Var instanceof ynv) {
                b(((ynv) px7Var).h, i, arrayList, null);
            }
        }
        Iterator it2 = sx7Var2.k.iterator();
        while (it2.hasNext()) {
            px7 px7Var2 = (px7) it2.next();
            if (px7Var2 instanceof sx7) {
                b((sx7) px7Var2, i, arrayList, null);
            } else if (px7Var2 instanceof ynv) {
                b(((ynv) px7Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((f1u) ynvVar).k.k.iterator();
            while (it3.hasNext()) {
                px7 px7Var3 = (px7) it3.next();
                if (px7Var3 instanceof sx7) {
                    b((sx7) px7Var3, i, arrayList, null);
                }
            }
        }
    }

    public synchronized boolean h() {
        boolean z;
        boolean z2;
        Boolean bool = (Boolean) this.i;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                aec aecVar = (aec) this.e;
                aecVar.a();
                w97 w97Var = (w97) aecVar.g.get();
                synchronized (w97Var) {
                    z2 = w97Var.a;
                }
                z = z2;
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        i(z);
        return z;
    }

    public void i(boolean z) {
        String s = hrg.s("Crashlytics automatic data collection ", z ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.i) == null ? "global Firebase setting" : this.c ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", s, null);
        }
    }

    public nsp j(mwk mwkVar) {
        ((jkl) this.f).getClass();
        mwkVar.getClass();
        return o2g.b0(mwkVar) ? nsp.b : this.b ? this.c ? nsp.c : nsp.d : nsp.a;
    }

    public void k(aa6 aa6Var, z96 z96Var, int i, z96 z96Var2, int i2) {
        fv2 fv2Var = (fv2) this.h;
        fv2Var.a = z96Var;
        fv2Var.b = z96Var2;
        fv2Var.c = i;
        fv2Var.d = i2;
        ((awm) this.g).d(aa6Var, fv2Var);
        aa6Var.P(fv2Var.e);
        aa6Var.M(fv2Var.f);
        aa6Var.E = fv2Var.h;
        aa6Var.J(fv2Var.g);
    }

    public void l() {
        vu2 vu2Var;
        Iterator it = ((ba6) this.d).u0.iterator();
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            if (!aa6Var.a) {
                z96[] z96VarArr = aa6Var.U;
                boolean z = false;
                z96 z96Var = z96VarArr[0];
                z96 z96Var2 = z96VarArr[1];
                int i = aa6Var.r;
                int i2 = aa6Var.s;
                z96 z96Var3 = z96.c;
                z96 z96Var4 = z96.b;
                boolean z2 = z96Var == z96Var4 || (z96Var == z96Var3 && i == 1);
                if (z96Var2 == z96Var4 || (z96Var2 == z96Var3 && i2 == 1)) {
                    z = true;
                }
                v38 v38Var = aa6Var.d.e;
                boolean z3 = v38Var.j;
                v38 v38Var2 = aa6Var.e.e;
                boolean z4 = v38Var2.j;
                boolean z5 = z2;
                z96 z96Var5 = z96.a;
                if (z3 && z4) {
                    k(aa6Var, z96Var5, v38Var.g, z96Var5, v38Var2.g);
                    aa6Var.a = true;
                } else if (z3 && z) {
                    k(aa6Var, z96Var5, v38Var.g, z96Var4, v38Var2.g);
                    f1u f1uVar = aa6Var.e;
                    if (z96Var2 == z96Var3) {
                        f1uVar.e.m = aa6Var.l();
                    } else {
                        f1uVar.e.d(aa6Var.l());
                        aa6Var.a = true;
                    }
                } else if (z4 && z5) {
                    k(aa6Var, z96Var4, v38Var.g, z96Var5, v38Var2.g);
                    x3e x3eVar = aa6Var.d;
                    if (z96Var == z96Var3) {
                        x3eVar.e.m = aa6Var.r();
                    } else {
                        x3eVar.e.d(aa6Var.r());
                        aa6Var.a = true;
                    }
                }
                if (aa6Var.a && (vu2Var = aa6Var.e.l) != null) {
                    vu2Var.d(aa6Var.c0);
                }
            }
        }
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return (dtp) this.h;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        usp uspVar;
        zsp zspVar;
        szuVar.getClass();
        jkl jklVar = (jkl) this.f;
        jzs jzsVar = szuVar.l;
        nyn nynVar = szuVar.c;
        jklVar.getClass();
        jzsVar.getClass();
        boolean b0 = o2g.b0(jzsVar);
        e5q e5qVar = szuVar.a;
        int ordinal = hdg.W(e5qVar).ordinal();
        if (ordinal == 0) {
            uspVar = new usp(nynVar);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            uspVar = new usp(nynVar);
        }
        int ordinal2 = hdg.W(e5qVar).ordinal();
        if (ordinal2 == 0) {
            zspVar = ysp.a;
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                return null;
            }
            zspVar = new xsp(szuVar.l() instanceof eyu);
        }
        return new dtp(uspVar, zspVar, b0 ? ssp.a : new rsp((p5n) this.d), new atp((qpl) this.e), b0 ? new osp((xgl) this.g) : psp.a, j(jzsVar));
    }

    public void o(xjo xjoVar) {
        yeo yeoVar = (yeo) this.e;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (D0.q()) {
                if (D0.getLong(0) == 0) {
                    z = true;
                }
            }
            i4w.w(D0, null);
            yeoVar.a(xjoVar);
            if (!z) {
                c7f g = yeoVar.g(xjoVar);
                if (!g.b) {
                    e7o.i(g.c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + yeoVar.a + "')");
            yeoVar.c(xjoVar);
            Iterator it = ((List) this.f).iterator();
            while (it.hasNext()) {
                ((wm4) it.next()).getClass();
                if (xjoVar instanceof qsr) {
                    ((qsr) xjoVar).a.getClass();
                }
            }
        } finally {
        }
    }

    public void p(xjo xjoVar, int i, int i2) {
        yeo yeoVar = (yeo) this.e;
        xjoVar.getClass();
        jc7 jc7Var = (jc7) this.d;
        List z = c9g.z(jc7Var.d, i, i2);
        if (z != null) {
            yeoVar.f(xjoVar);
            Iterator it = z.iterator();
            while (it.hasNext()) {
                ((i5i) it.next()).a(xjoVar);
            }
            c7f g = yeoVar.g(xjoVar);
            if (!g.b) {
                e7o.i(g.c, "Migration didn't properly handle: ");
                return;
            }
            yeoVar.e(xjoVar);
            p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + yeoVar.a + "')");
            return;
        }
        if (c9g.K(jc7Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (jc7Var.s) {
            cko D0 = xjoVar.D0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                n8g b = t75.b();
                while (D0.q()) {
                    String x0 = D0.x0(0);
                    if (!c.v(x0, "sqlite_", false) && !x0.equals("android_metadata")) {
                        b.add(new Pair(x0, Boolean.valueOf(Intrinsics.d(D0.x0(1), "view"))));
                    }
                }
                n8g a = t75.a(b);
                i4w.w(D0, null);
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) ezdVar.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        p6g.s(xjoVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        p6g.s(xjoVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            yeoVar.b(xjoVar);
        }
        Iterator it2 = ((List) this.f).iterator();
        while (it2.hasNext()) {
            ((wm4) it2.next()).getClass();
            if (xjoVar instanceof qsr) {
                ((qsr) xjoVar).a.getClass();
            }
        }
        yeoVar.a(xjoVar);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return (dtp) this.h;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        usp uspVar;
        zsp zspVar;
        dtp dtpVar = (dtp) this.h;
        maqVar.getClass();
        if (!(maqVar instanceof jbq)) {
            if (maqVar instanceof vaq) {
                return (dtp) this.i;
            }
            if (maqVar instanceof eaq) {
                return dtpVar;
            }
            if (maqVar instanceof raq) {
                return dtpVar;
            }
            b6e.s();
            return null;
        }
        jbq jbqVar = (jbq) maqVar;
        nyn nynVar = jbqVar.e;
        bbq bbqVar = jbqVar.b;
        int ordinal = avf.J(bbqVar).ordinal();
        boolean z = true;
        if (ordinal == 0) {
            uspVar = new usp(nynVar);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            uspVar = new usp(nynVar);
        }
        int ordinal2 = avf.J(bbqVar).ordinal();
        if (ordinal2 == 0) {
            zspVar = ysp.a;
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                return null;
            }
            fyu s = jbqVar.s();
            if (!(s instanceof eyu)) {
                if (!Intrinsics.d(s, dyu.a)) {
                    b6e.s();
                    return null;
                }
                z = false;
            }
            zspVar = new xsp(z);
        }
        zsp zspVar2 = zspVar;
        atp atpVar = new atp((qpl) this.e);
        jkl jklVar = (jkl) this.f;
        faq b = jbqVar.b();
        jklVar.getClass();
        return new dtp(uspVar, zspVar2, ssp.a, atpVar, o2g.b0(b) ? new osp((xgl) this.g) : psp.a, j(jbqVar.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(xjo xjoVar) {
        boolean z;
        Object t7oVar;
        c7f g;
        xjoVar.getClass();
        yeo yeoVar = (yeo) this.e;
        cko D0 = xjoVar.D0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (D0.q()) {
                if (D0.getLong(0) != 0) {
                    z = true;
                    i4w.w(D0, null);
                    if (z) {
                        p6g.s(xjoVar, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            r7o r7oVar = z7o.b;
                            g = yeoVar.g(xjoVar);
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                        }
                        if (!g.b) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g.c).toString());
                        }
                        yeoVar.e(xjoVar);
                        p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + yeoVar.a + "')");
                        t7oVar = Unit.a;
                        if (!(t7oVar instanceof t7o)) {
                            p6g.s(xjoVar, "END TRANSACTION");
                        }
                        Throwable a = z7o.a(t7oVar);
                        if (a != null) {
                            p6g.s(xjoVar, "ROLLBACK TRANSACTION");
                            throw a;
                        }
                    } else {
                        D0 = xjoVar.D0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String x0 = D0.q() ? D0.x0(0) : null;
                            i4w.w(D0, null);
                            if (!yeoVar.a.equals(x0) && !yeoVar.b.equals(x0)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + yeoVar.a + ", found: " + x0).toString());
                            }
                        } finally {
                        }
                    }
                    yeoVar.d(xjoVar);
                    for (wm4 wm4Var : (List) this.f) {
                        wm4Var.getClass();
                        if (xjoVar instanceof qsr) {
                            wm4Var.a(((qsr) xjoVar).a);
                        }
                    }
                    this.b = true;
                }
            }
            z = false;
            i4w.w(D0, null);
            if (z) {
            }
            yeoVar.d(xjoVar);
            while (r0.hasNext()) {
            }
            this.b = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        dtp dtpVar = (dtp) this.h;
        t1qVar.getClass();
        m1q m1qVar = t1qVar.c;
        if (m1qVar instanceof c2q) {
            return new dtp(vsp.a, ysp.a, ssp.a, new atp((qpl) this.e), psp.a, j(m1qVar));
        }
        if ((m1qVar instanceof j1q) || (m1qVar instanceof e2q)) {
            return dtpVar;
        }
        b6e.s();
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4);
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3);
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2);
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return CollectionsKt.X(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        jkl jklVar = (jkl) this.f;
        i5u i5uVar = u7uVar.c;
        jklVar.getClass();
        return new dtp(vsp.a, ysp.a, o2g.b0(i5uVar) ? ssp.a : new rsp((p5n) this.d), new atp((qpl) this.e), psp.a, j(i5uVar));
    }

    public /* synthetic */ v97() {
    }

    public v97(jc7 jc7Var, yeo yeoVar, w4i w4iVar) {
        int i;
        Object e66Var;
        this.d = jc7Var;
        this.e = yeoVar;
        Object obj = jc7Var.e;
        teo teoVar = jc7Var.g;
        usr usrVar = jc7Var.c;
        yjo yjoVar = jc7Var.t;
        String str = jc7Var.b;
        this.f = obj == null ? c5b.a : obj;
        if (yjoVar != null) {
            this.h = null;
            if (yjoVar.n()) {
                e66Var = new y9k(new qne(this, yjoVar), str == null ? ":memory:" : str, w4iVar);
            } else if (str == null) {
                e66Var = new e66(new qne(this, yjoVar));
            } else {
                qne qneVar = new qne(this, yjoVar);
                int ordinal = teoVar.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        qq6.e(teoVar, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int ordinal2 = teoVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    qq6.e(teoVar, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                e66Var = new e66(qneVar, str, i);
            }
            this.g = e66Var;
        } else if (usrVar != null) {
            Context context = jc7Var.a;
            context.getClass();
            vsr create = usrVar.create(new tsr(context, str, new reo(this, yeoVar.c), false, false));
            this.h = create;
            this.g = new y9k(new f4m(create), str == null ? ":memory:" : str, w4iVar);
        } else {
            xq0.x("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        boolean z = teoVar == teo.c;
        vsr vsrVar = (vsr) this.h;
        if (vsrVar != null) {
            vsrVar.setWriteAheadLoggingEnabled(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v97(boolean z, boolean z2, cak cakVar, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, cakVar, l, l2, l3, l4, r9);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
    }

    public v97(p5n p5nVar, qpl qplVar, jkl jklVar, xgl xglVar, boolean z, boolean z2) {
        p5nVar.getClass();
        qplVar.getClass();
        jklVar.getClass();
        this.d = p5nVar;
        this.e = qplVar;
        this.f = jklVar;
        this.g = xglVar;
        this.b = z;
        this.c = z2;
        atp atpVar = new atp(qplVar);
        nsp nspVar = nsp.b;
        vsp vspVar = vsp.a;
        ysp yspVar = ysp.a;
        ssp sspVar = ssp.a;
        psp pspVar = psp.a;
        this.h = new dtp(vspVar, yspVar, sspVar, atpVar, pspVar, nspVar);
        this.i = new dtp(vspVar, yspVar, sspVar, btp.a, pspVar, nspVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v97(aec aecVar) {
        Boolean bool;
        Boolean bool2;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.f = obj;
        this.g = new i8s();
        this.b = false;
        this.c = false;
        this.h = new i8s();
        aecVar.a();
        Context context = aecVar.a;
        this.e = aecVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.d = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.c = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                if (bool2 != null) {
                    this.c = false;
                    bool = null;
                } else {
                    this.c = true;
                    bool = Boolean.valueOf(Boolean.TRUE.equals(bool2));
                }
            }
            bool2 = null;
            if (bool2 != null) {
            }
        }
        this.i = bool;
        synchronized (obj) {
            try {
                if (h()) {
                    ((i8s) this.g).d(null);
                    this.b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public v97(boolean z, boolean z2, cak cakVar, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = cakVar;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = uah.o(map);
    }
}
