package a;

import a0.b0;
import a0.d0;
import a0.e0;
import ac.i;
import ad.h;
import ad.p;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.os.Looper;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import b0.j0;
import b0.k0;
import b0.o0;
import b0.p0;
import bc.a0;
import e1.c;
import e1.d;
import f1.i0;
import f1.q;
import i7.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.e;
import l1.f;
import l1.h0;
import l1.j;
import l1.m;
import l1.n;
import l1.u;
import m0.r;
import m0.x1;
import m0.x2;
import m0.z;
import n0.l0;
import o4.o;
import org.fortheloss.st.R;
import p4.l;
import r1.v;
import u.n0;
import v.t;
import x.k;
import y1.y0;
import z.c0;
import z.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f0a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1b = 0;

    public static final f A() {
        f fVar = f0a;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f4034a;
        i0 i0Var = new i0(q.f2277b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(12.0f, 17.27f));
        arrayList.add(new m(18.18f, 21.0f));
        arrayList.add(new u(-1.64f, -7.03f));
        arrayList.add(new m(22.0f, 9.24f));
        arrayList.add(new u(-7.19f, -0.61f));
        arrayList.add(new m(12.0f, 2.0f));
        arrayList.add(new m(9.19f, 8.63f));
        arrayList.add(new m(2.0f, 9.24f));
        arrayList.add(new u(5.46f, 4.73f));
        arrayList.add(new m(5.82f, 21.0f));
        arrayList.add(j.f4042c);
        e.a(eVar, arrayList, i0Var);
        f b2 = eVar.b();
        f0a = b2;
        return b2;
    }

    public static final int B(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final boolean C(d dVar) {
        long j3 = dVar.f1939e;
        return (j3 >>> 32) == (4294967295L & j3) && j3 == dVar.f1940f && j3 == dVar.f1941g && j3 == dVar.f1942h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void D(Context context) {
        LinkedHashMap linkedHashMap;
        pc.j.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        pc.j.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            o.d().a(l.f5488a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            pc.j.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(p4.a.f5450a.a(context), "androidx.work.workdb");
            String[] strArr = l.f5489b;
            int B = a0.B(strArr.length);
            if (B < 16) {
                B = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(B);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            i iVar = new i(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = a0.C(iVar);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        o.d().g(l.f5488a, "Over-writing contents of " + file3);
                    }
                    o.d().a(l.f5488a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static final void G(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            u1.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            float[] fArr8 = fArr4[i18];
            pc.j.e(fArr8, "<this>");
            pc.j.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr9 = fArr5[i19];
                float t3 = t(fArr7, fArr9);
                for (int i20 = 0; i20 < i10; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr9[i20] * t3);
                }
            }
            float sqrt = (float) Math.sqrt(t(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f10 = 1.0f / sqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                fArr7[i21] = fArr7[i21] * f10;
            }
            float[] fArr10 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr10[i22] = i22 < i18 ? 0.0f : t(fArr7, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float t10 = t(fArr5[i23], fArr2);
            float[] fArr11 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    t10 -= fArr11[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = t10 / fArr11[i23];
        }
    }

    public static final s2.j H(c cVar) {
        return new s2.j(Math.round(cVar.f1931a), Math.round(cVar.f1932b), Math.round(cVar.f1933c), Math.round(cVar.f1934d));
    }

    public static final y0.n I(y0.n nVar, float f10) {
        return (f10 == 1.0f && f10 == 1.0f) ? nVar : androidx.compose.ui.graphics.a.c(nVar, f10, f10, null, 524284);
    }

    public static final void J(l0 l0Var, int i10, Object obj) {
        l0Var.f5020h[(l0Var.f5021i - l0Var.f5016d[l0Var.f5017e - 1].f5008b) + i10] = obj;
    }

    public static final void K(l0 l0Var, int i10, Object obj, int i11, Object obj2) {
        int i12 = l0Var.f5021i - l0Var.f5016d[l0Var.f5017e - 1].f5008b;
        Object[] objArr = l0Var.f5020h;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static void L(String str, int i10, oc.a aVar, int i11) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        ec.a aVar2 = new ec.a(aVar);
        if (i10 > 0) {
            aVar2.setPriority(i10);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        aVar2.start();
    }

    public static String M(long j3) {
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + a0.L(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + a0.L(Float.intBitsToFloat(i10)) + ", " + a0.L(Float.intBitsToFloat(i11)) + ')';
    }

    public static ad.e a(int i10, int i11, ad.a aVar) {
        int i12 = i11 & 2;
        ad.a aVar2 = ad.a.f280g;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i10 == -2) {
            if (aVar != aVar2) {
                return new p(1, aVar);
            }
            ad.i.f325a.getClass();
            return new ad.e(h.f324b);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == aVar2 ? new ad.e(i10) : new p(i10, aVar) : new ad.e(Integer.MAX_VALUE) : aVar == aVar2 ? new ad.e(0) : new p(1, aVar);
        }
        if (aVar == aVar2) {
            return new p(1, ad.a.f281h);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final void b(y0.n nVar, b0 b0Var, c0 c0Var, g gVar, y0.d dVar, k kVar, boolean z10, oc.c cVar, r rVar, int i10) {
        y0.d dVar2;
        int i11;
        boolean z11;
        k kVar2;
        k kVar3;
        boolean z12;
        y0.d dVar3;
        b0 b0Var2;
        rVar.Z(-740714857);
        int i12 = i10 | 13306896 | (rVar.h(cVar) ? 67108864 : 33554432);
        if ((38347923 & i12) == 38347922 && rVar.B()) {
            rVar.S();
            b0Var2 = b0Var;
            dVar3 = dVar;
            kVar3 = kVar;
            z12 = z10;
        } else {
            rVar.U();
            if ((i10 & 1) == 0 || rVar.z()) {
                float f10 = e0.f42a;
                Object[] objArr = new Object[0];
                v0.j jVar = b0.f15w;
                boolean d10 = rVar.d(0) | rVar.d(0);
                Object M = rVar.M();
                Object obj = m0.l.f4646a;
                if (d10 || M == obj) {
                    M = new d0(0);
                    rVar.i0(M);
                }
                b0Var = (b0) v0.k.b(objArr, jVar, null, (oc.a) M, rVar, 0, 4);
                y0.d dVar4 = y0.c.f8430r;
                float f11 = n0.f6623a;
                s2.c cVar2 = (s2.c) rVar.j(y0.f8709h);
                boolean c3 = rVar.c(cVar2.c());
                Object M2 = rVar.M();
                if (c3 || M2 == obj) {
                    M2 = new t(new m7.g(cVar2));
                    rVar.i0(M2);
                }
                t tVar = (t) M2;
                boolean f12 = rVar.f(tVar);
                Object M3 = rVar.M();
                if (f12 || M3 == obj) {
                    M3 = new k(tVar);
                    rVar.i0(M3);
                }
                dVar2 = dVar4;
                i11 = i12 & (-3670129);
                z11 = true;
                kVar2 = (k) M3;
            } else {
                rVar.S();
                i11 = i12 & (-3670129);
                dVar2 = dVar;
                kVar2 = kVar;
                z11 = z10;
            }
            b0 b0Var3 = b0Var;
            rVar.r();
            b.f(nVar, b0Var3, c0Var, kVar2, z11, dVar2, gVar, cVar, rVar, 907570566, (i11 >> 18) & 896);
            kVar3 = kVar2;
            z12 = z11;
            dVar3 = dVar2;
            b0Var2 = b0Var3;
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a0.b(nVar, b0Var2, c0Var, gVar, dVar3, kVar3, z12, cVar, i10);
        }
    }

    public static final void c(u0.d dVar, r rVar, int i10) {
        r rVar2;
        rVar.Z(674185128);
        if ((i10 & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            x2 x2Var = v0.g.f7043a;
            v0.e eVar = (v0.e) rVar.j(x2Var);
            Object[] objArr = {eVar};
            v0.j jVar = new v0.j(k0.f842g, new j0(eVar, 1));
            boolean h10 = rVar.h(eVar);
            Object M = rVar.M();
            if (h10 || M == m0.l.f4646a) {
                M = new p0(0, eVar);
                rVar.i0(M);
            }
            rVar2 = rVar;
            b0.n0 n0Var = (b0.n0) v0.k.b(objArr, jVar, null, (oc.a) M, rVar2, 0, 4);
            z.a(x2Var.a(n0Var), u0.e.e(1863926504, new a1.f(3, n0Var, dVar), rVar2), rVar2, 56);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new o0(dVar, i10);
        }
    }

    public static final d d(float f10, float f11, float f12, float f13, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new d(f10, f11, f12, f13, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final int e(int i10, o0.e eVar) {
        int i11 = eVar.f5136i - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = eVar.f5134g;
            int i14 = ((b0.h) objArr[i13]).f825a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((b0.h) objArr[i12]).f825a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static final Object[] f(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        bc.l.T(objArr, objArr2, 0, i10, 6);
        bc.l.R(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        bc.l.T(objArr, objArr2, 0, i10, 6);
        bc.l.R(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] h(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        bc.l.T(objArr, objArr2, 0, i10, 6);
        bc.l.R(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final void i(s1.c cVar, r1.n nVar) {
        l7.a aVar = cVar.f6379b;
        l7.a aVar2 = cVar.f6378a;
        boolean a6 = v.a(nVar);
        long j3 = nVar.f5964b;
        long j6 = 0;
        if (a6) {
            s1.a[] aVarArr = (s1.a[]) aVar2.f4209d;
            bc.l.V(0, aVarArr.length, null, aVarArr);
            aVar2.f4207b = 0;
            s1.a[] aVarArr2 = (s1.a[]) aVar.f4209d;
            bc.l.V(0, aVarArr2.length, null, aVarArr2);
            aVar.f4207b = 0;
            cVar.f6380c = 0L;
        }
        if (!v.b(nVar)) {
            List list = nVar.f5973k;
            if (list == null) {
                list = bc.v.f1067g;
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                r1.b bVar = (r1.b) list.get(i10);
                long j10 = bVar.f5927a;
                long g8 = e1.b.g(bVar.f5929c, j6);
                aVar2.b(j10, Float.intBitsToFloat((int) (g8 >> 32)));
                aVar.b(j10, Float.intBitsToFloat((int) (g8 & 4294967295L)));
                i10++;
                j6 = 0;
            }
            long g10 = e1.b.g(nVar.f5974l, 0L);
            aVar2.b(j3, Float.intBitsToFloat((int) (g10 >> 32)));
            aVar.b(j3, Float.intBitsToFloat((int) (g10 & 4294967295L)));
        }
        if (v.b(nVar) && j3 - cVar.f6380c > 40) {
            s1.a[] aVarArr3 = (s1.a[]) aVar2.f4209d;
            bc.l.V(0, aVarArr3.length, null, aVarArr3);
            aVar2.f4207b = 0;
            s1.a[] aVarArr4 = (s1.a[]) aVar.f4209d;
            bc.l.V(0, aVarArr4.length, null, aVarArr4);
            aVar.f4207b = 0;
            cVar.f6380c = 0L;
        }
        cVar.f6380c = j3;
    }

    public static final void l(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void n(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void o(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(a4.d.f(i10, i11, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static int p(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void q(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static void r(String str, String str2, Object obj) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, String.format(str2, obj));
        }
    }

    public static void s(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            l7.b bVar = (l7.b) obj;
            l7.h hVar = new l7.h(bVar);
            for (l7.r rVar : bVar.f4214b) {
                boolean z10 = bVar.f4217e == 0;
                l7.i iVar = new l7.i(rVar, !z10);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (l7.h hVar2 : (Set) it.next()) {
                for (l7.j jVar : hVar2.f4231a.f4215c) {
                    if (jVar.f4238c == 0) {
                        Set<l7.h> set2 = (Set) hashMap.get(new l7.i(jVar.f4236a, jVar.f4237b == 2));
                        if (set2 != null) {
                            for (l7.h hVar3 : set2) {
                                hVar2.f4232b.add(hVar3);
                                hVar3.f4233c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            l7.h hVar4 = (l7.h) it3.next();
            if (hVar4.f4233c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            l7.h hVar5 = (l7.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it4 = hVar5.f4232b.iterator();
            while (it4.hasNext()) {
                l7.h hVar6 = (l7.h) it4.next();
                hVar6.f4233c.remove(hVar5);
                if (hVar6.f4233c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            l7.h hVar7 = (l7.h) it5.next();
            if (!hVar7.f4233c.isEmpty() && !hVar7.f4232b.isEmpty()) {
                arrayList2.add(hVar7.f4231a);
            }
        }
        throw new l7.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final float t(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static void u(String str, String str2, Exception exc) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static final boolean v(long j3, long j6) {
        return j3 == j6;
    }

    public static final int w(Cursor cursor, String str) {
        String str2;
        pc.j.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            pc.j.d(columnNames, "c.columnNames");
            str2 = bc.l.a0(63, columnNames);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final float x(Layout layout, int i10, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        i2.j jVar = i2.l.f3149a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : j2.d.f3500a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float y(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        i2.j jVar = i2.l.f3149a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? j2.d.f3500a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final ViewParent z(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public abstract void E(Throwable th);

    public abstract void F(x4.n nVar);

    public n6.a j(Context context, Looper looper, p6.d dVar, Object obj, n6.f fVar, n6.g gVar) {
        return k(context, looper, dVar, obj, fVar, gVar);
    }

    public n6.a k(Context context, Looper looper, p6.d dVar, Object obj, n6.f fVar, n6.g gVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
