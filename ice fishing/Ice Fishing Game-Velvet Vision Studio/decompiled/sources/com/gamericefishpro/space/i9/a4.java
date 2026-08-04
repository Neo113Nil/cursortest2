package com.gamericefishpro.space.i9;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.UserManager;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.j;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.r;
import com.onesignal.core.activities.PermissionsActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a4 {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static com.gamericefishpro.space.u1.f c;
    public static com.gamericefishpro.space.u1.f d;

    public static final int A(com.gamericefishpro.space.c6.c stmt, String name) {
        Intrinsics.checkNotNullParameter(stmt, "stmt");
        Intrinsics.checkNotNullParameter(name, "name");
        int iQ = q(stmt, name);
        if (iQ >= 0) {
            return iQ;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(stmt.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + CollectionsKt.A(arrayList, null, null, null, null, 63) + ']');
    }

    public static float C(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return com.gamericefishpro.space.h4.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int D(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean E(com.gamericefishpro.space.m1.u uVar) {
        com.gamericefishpro.space.h2.f0 f0Var;
        com.gamericefishpro.space.h2.f1 f1Var;
        com.gamericefishpro.space.h2.f0 f0Var2;
        com.gamericefishpro.space.h2.f1 f1Var2 = uVar.A;
        return (f1Var2 == null || (f0Var = f1Var2.H) == null || !f0Var.I() || (f1Var = uVar.A) == null || (f0Var2 = f1Var.H) == null || !f0Var2.H()) ? false : true;
    }

    public static Typeface F(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, d5.q(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static float G(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return com.gamericefishpro.space.h4.d.c(edgeEffect, f, f2);
        }
        com.gamericefishpro.space.h4.c.a(edgeEffect, f, f2);
        return f;
    }

    public static final void H(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            com.gamericefishpro.space.e2.a.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] destination = fArr5[i9];
            float[] fArr7 = fArr4[i9];
            Intrinsics.checkNotNullParameter(fArr7, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float fS = s(destination, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    destination[i11] = destination[i11] - (fArr8[i11] * fS);
                }
            }
            float fSqrt = (float) Math.sqrt(s(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                destination[i12] = destination[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : s(destination, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fS2 = s(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fS2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fS2 / fArr10[i14];
        }
    }

    public static final void I(com.gamericefishpro.space.t0.h2 h2Var, com.gamericefishpro.space.t0.c cVar, int i) {
        while (true) {
            int i2 = h2Var.v;
            if (i > i2 && i < h2Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            h2Var.M();
            if (h2Var.y(h2Var.v)) {
                cVar.l();
            }
            h2Var.j();
        }
    }

    public static String J(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + com.gamericefishpro.space.i.a.R(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + com.gamericefishpro.space.i.a.R(Float.intBitsToFloat(i)) + ", " + com.gamericefishpro.space.i.a.R(Float.intBitsToFloat(i2)) + ')';
    }

    public static void K(String str, List list, int i) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void L(String str, List list, int i) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void M(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean N(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double dC = nVar.c();
        return !dC.isNaN() && dC.doubleValue() >= 0.0d && dC.equals(Double.valueOf(Math.floor(dC.doubleValue())));
    }

    public static w O(String str) {
        w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (w) w.E0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Unsupported commandId ", str));
    }

    public static boolean P(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof r) || (nVar instanceof l)) {
            return true;
        }
        if (nVar instanceof g) {
            if (Double.isNaN(nVar.c().doubleValue()) || Double.isNaN(nVar2.c().doubleValue())) {
                return false;
            }
            return nVar.c().equals(nVar2.c());
        }
        if (nVar instanceof q) {
            return nVar.m().equals(nVar2.m());
        }
        if (nVar instanceof e) {
            return nVar.b().equals(nVar2.b());
        }
        return nVar == nVar2;
    }

    public static int Q(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2))) % 4.294967296E9d);
    }

    public static double R(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        return ((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2));
    }

    public static Object S(n nVar) {
        if (n.k.equals(nVar)) {
            return null;
        }
        if (n.j.equals(nVar)) {
            return "";
        }
        if (nVar instanceof k) {
            return T((k) nVar);
        }
        if (!(nVar instanceof d)) {
            return !nVar.c().isNaN() ? nVar.c() : nVar.m();
        }
        ArrayList arrayList = new ArrayList();
        d dVar = (d) nVar;
        int i = 0;
        while (i < dVar.r()) {
            if (i >= dVar.r()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i);
                throw new NoSuchElementException(sb.toString());
            }
            int i2 = i + 1;
            Object objS = S(dVar.s(i));
            if (objS != null) {
                arrayList.add(objS);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap T(k kVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(kVar.d.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objS = S(kVar.f(str));
            if (objS != null) {
                map.put(str, objS);
            }
        }
        return map;
    }

    public static void U(com.gamericefishpro.space.u6.n nVar) {
        int iQ = Q(nVar.j("runtime.counter").c().doubleValue() + 1.0d);
        if (iQ > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        nVar.h("runtime.counter", new g(Double.valueOf(iQ)));
    }

    public static final void a(com.gamericefishpro.space.d7.l entry, com.gamericefishpro.space.t0.r rVar, int i) {
        String str;
        com.gamericefishpro.space.h2.y yVar;
        boolean z;
        boolean z2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        rVar2.b0(-385937764);
        if (((i | (rVar2.f(entry) ? 4 : 2)) & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-1363808149);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = new SimpleDateFormat("dd MMM, HH:mm", Locale.getDefault());
                rVar2.k0(objP);
            }
            rVar2.p(false);
            long j = entry.g;
            boolean z3 = entry.e;
            String str2 = ((SimpleDateFormat) objP).format(new Date(j));
            long jC = com.gamericefishpro.space.o1.o.c(z3 ? 4283215696L : 4294922834L);
            if (z3) {
                str = "WIN";
            } else {
                str = Intrinsics.a(entry.f, "TIME_UP") ? "TIME'S UP" : "NO MOVES";
            }
            String str3 = str;
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            float f = 16;
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f));
            long jC2 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.5f);
            com.gamericefishpro.space.o1.g0 g0Var = com.gamericefishpro.space.o1.o.b;
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(mVarB, jC2, g0Var);
            float f2 = 1;
            long j2 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(mVarE, f2, com.gamericefishpro.space.o1.s.c(j2, 0.15f), com.gamericefishpro.space.k0.e.a(f)), f);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarL, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar2 = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, eVar4);
            com.gamericefishpro.space.h1.m mVarB2 = com.gamericefishpro.space.d0.g1.b(jVar, 1.0f);
            com.gamericefishpro.space.h1.d dVar2 = com.gamericefishpro.space.h1.b.D;
            com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.e, dVar2, rVar, 54);
            int iHashCode2 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarB2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, eVar4);
            com.gamericefishpro.space.d0.f fVar = com.gamericefishpro.space.d0.h.a;
            com.gamericefishpro.space.d0.d1 d1VarA2 = com.gamericefishpro.space.d0.b1.a(fVar, dVar2, rVar, 48);
            int iHashCode3 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL3 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF3, eVar4);
            float f3 = 14;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.f(jVar, 46), com.gamericefishpro.space.k0.e.a(f3)), com.gamericefishpro.space.o1.s.c(j2, 0.1f), g0Var), f2, com.gamericefishpro.space.o1.s.c(j2, 0.2f), com.gamericefishpro.space.k0.e.a(f3));
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode4 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL4 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarG, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL4, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF4, eVar4);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.u6.f.z(), null, com.gamericefishpro.space.d0.g1.f(jVar, 24), j2, rVar, 3504);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, f3), rVar);
            com.gamericefishpro.space.d0.v vVar = com.gamericefishpro.space.d0.h.b;
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(vVar, com.gamericefishpro.space.h1.b.F, rVar, 0);
            int iHashCode5 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL5 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF5 = com.gamericefishpro.space.d9.h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL5, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF5, eVar4);
            float f4 = f;
            com.gamericefishpro.space.q0.r0.a(com.gamericefishpro.space.m5.a.g(entry.b, "Level "), null, j2, com.gamericefishpro.space.hj.c.C(16), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            Intrinsics.b(str2);
            com.gamericefishpro.space.q0.r0.a(str2, null, com.gamericefishpro.space.o1.s.c(j2, 0.6f), com.gamericefishpro.space.hj.c.C(12), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 24960, 0, 262122);
            rVar.p(true);
            rVar.p(true);
            com.gamericefishpro.space.d0.b0 b0VarA2 = com.gamericefishpro.space.d0.z.a(vVar, com.gamericefishpro.space.h1.b.H, rVar, 48);
            int iHashCode6 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL6 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF6 = com.gamericefishpro.space.d9.h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar = yVar2;
                rVar.k(yVar);
            } else {
                yVar = yVar2;
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL6, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode6, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF6, eVar4);
            com.gamericefishpro.space.h2.y yVar3 = yVar;
            com.gamericefishpro.space.q0.r0.a(str3, null, jC, com.gamericefishpro.space.hj.c.C(14), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new com.gamericefishpro.space.r2.i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), 2.0f, 2), 16769023), rVar, 1597440, 12582912, 130986);
            rVar2 = rVar;
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, 4), rVar2);
            rVar2.a0(1354259431);
            if (z3) {
                com.gamericefishpro.space.d0.d1 d1VarA3 = com.gamericefishpro.space.d0.b1.a(fVar, dVar2, rVar2, 48);
                int iHashCode7 = Long.hashCode(rVar2.T);
                com.gamericefishpro.space.t0.l1 l1VarL7 = rVar2.l();
                com.gamericefishpro.space.h1.m mVarF7 = com.gamericefishpro.space.d9.h.F(jVar, rVar2);
                rVar2.d0();
                if (rVar2.S) {
                    rVar2.k(yVar3);
                } else {
                    rVar2.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar2, d1VarA3, eVar);
                com.gamericefishpro.space.t0.i.B(rVar2, l1VarL7, eVar2);
                com.gamericefishpro.space.m5.a.o(iHashCode7, rVar2, eVar3, rVar2, dVar);
                com.gamericefishpro.space.t0.i.B(rVar2, mVarF7, eVar4);
                rVar2.a0(768605256);
                int i2 = 0;
                while (i2 < 3) {
                    float f5 = f4;
                    com.gamericefishpro.space.q0.j.b(d5.G(), null, com.gamericefishpro.space.d0.g1.f(jVar, f5), i2 < entry.d ? com.gamericefishpro.space.l7.c.e : com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.2f), rVar2, 432);
                    i2++;
                    f4 = f5;
                }
                rVar2.p(false);
                com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, 6), rVar2);
                z = false;
                com.gamericefishpro.space.q0.r0.a(String.valueOf(entry.c), null, com.gamericefishpro.space.l7.c.e, com.gamericefishpro.space.hj.c.C(14), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
                rVar2 = rVar;
                z2 = true;
                rVar2.p(true);
            } else {
                z = false;
                z2 = true;
            }
            rVar2.p(z);
            rVar2.p(z2);
            rVar2.p(z2);
            rVar2.p(z2);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.n1(i, 9, entry);
        }
    }

    public static final void b(com.gamericefishpro.space.h1.m mVar, String label, com.gamericefishpro.space.u1.f icon, Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(74978168);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(label) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(icon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(onClick) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-815857137);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            com.gamericefishpro.space.t0.s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 2 : 0, null, "press", rVar2, 384, 10);
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(com.gamericefishpro.space.d0.g1.d(mVar, 60), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.d0.h0 h0Var = com.gamericefishpro.space.d0.g1.c;
            float f = 3;
            float f2 = 16;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13), com.gamericefishpro.space.o1.o.c(4278202455L), com.gamericefishpro.space.k0.e.a(f2)), rVar2, 0);
            com.gamericefishpro.space.h1.m mVarI2 = com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarN = com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarI2, com.gamericefishpro.space.o1.s.c(j, 0.15f), com.gamericefishpro.space.k0.e.a(f2)), 1, com.gamericefishpro.space.o1.s.c(j, 0.4f), com.gamericefishpro.space.k0.e.a(f2)), f2, 0.0f, 2);
            com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.c, com.gamericefishpro.space.h1.b.D, rVar2, 54);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarN, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.q0.j.b(icon, label, com.gamericefishpro.space.d0.g1.f(jVar, 20), j, rVar2, ((i3 >> 6) & 14) | 3456 | (i3 & 112));
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, 8), rVar2);
            com.gamericefishpro.space.q0.r0.a(label, null, j, com.gamericefishpro.space.hj.c.C(13), com.gamericefishpro.space.u2.k.w, com.gamericefishpro.space.hj.c.G(4294967296L, (float) 0.5d), null, 0L, 0, false, 0, 0, new com.gamericefishpro.space.r2.i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 2.0f), 16769023), rVar, ((i3 >> 3) & 14) | 102261120, 12582912, 130730);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.a(mVar, label, icon, onClick, i, 1);
        }
    }

    public static final void c(final String title, final String description, com.gamericefishpro.space.u1.f fVar, Integer num, long j, com.gamericefishpro.space.t0.r rVar, final int i, final int i2) {
        com.gamericefishpro.space.u1.f fVar2;
        int i3;
        Integer num2;
        int i4;
        long j2;
        com.gamericefishpro.space.h2.e eVar;
        com.gamericefishpro.space.h2.y yVar;
        long j3;
        com.gamericefishpro.space.h2.e eVar2;
        com.gamericefishpro.space.h2.e eVar3;
        char c2;
        boolean z;
        com.gamericefishpro.space.h2.e eVar4;
        com.gamericefishpro.space.h2.d dVar;
        long j4;
        com.gamericefishpro.space.u1.f fVar3;
        int i5;
        final Integer num3;
        final com.gamericefishpro.space.u1.f fVar4;
        final long j5;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        rVar2.b0(741919660);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i | 384;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i3 = (rVar2.f(fVar2) ? 256 : 128) | i;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 3072;
            num2 = num;
        } else {
            num2 = num;
            i4 = i3 | (rVar2.f(num2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 |= 24576;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 24576) == 0) {
                i4 |= rVar2.e(j2) ? 16384 : 8192;
            }
        }
        if ((i4 & 9363) == 9362 && rVar2.E()) {
            rVar2.V();
            fVar4 = fVar2;
            num3 = num2;
            j5 = j2;
        } else {
            com.gamericefishpro.space.u1.f fVar5 = i6 != 0 ? null : fVar2;
            Integer num4 = i7 != 0 ? null : num2;
            if (i8 != 0) {
                j2 = com.gamericefishpro.space.o1.s.c;
            }
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            float f = 16;
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f)), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.5f), com.gamericefishpro.space.o1.o.b);
            float f2 = 1;
            long j6 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(mVarE, f2, com.gamericefishpro.space.o1.s.c(j6, 0.15f), com.gamericefishpro.space.k0.e.a(f)), f);
            com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarL, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            int i9 = i4;
            com.gamericefishpro.space.h2.y yVar2 = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar5);
            com.gamericefishpro.space.h2.e eVar6 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar7 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar7);
            com.gamericefishpro.space.h2.d dVar2 = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar2);
            com.gamericefishpro.space.h2.e eVar8 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar8);
            long j7 = j2;
            float f3 = 14;
            com.gamericefishpro.space.u1.f fVar6 = fVar5;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.f(jVar, 52), com.gamericefishpro.space.k0.e.a(f3)), com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j6, 0.2f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j6, 0.05f))), 0.0f, 14), null, 6), f2, com.gamericefishpro.space.o1.s.c(j6, 0.3f), com.gamericefishpro.space.k0.e.a(f3));
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar5);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar6);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar7, rVar2, dVar2);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar8);
            if (num4 != null) {
                rVar2.a0(1534406388);
                yVar = yVar2;
                eVar2 = eVar7;
                c2 = ' ';
                eVar4 = eVar6;
                j3 = j6;
                z = true;
                eVar = eVar5;
                eVar3 = eVar8;
                dVar = dVar2;
                com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(num4.intValue(), rVar2, (i9 >> 9) & 14), title, com.gamericefishpro.space.d0.g1.f(jVar, 32), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 25016, 104);
                rVar2 = rVar;
                rVar2.p(false);
                j4 = j7;
                fVar3 = fVar6;
                i5 = 14;
            } else {
                eVar = eVar5;
                yVar = yVar2;
                j3 = j6;
                eVar2 = eVar7;
                eVar3 = eVar8;
                c2 = ' ';
                z = true;
                eVar4 = eVar6;
                dVar = dVar2;
                if (fVar6 != null) {
                    rVar2.a0(1534727331);
                    i5 = 14;
                    com.gamericefishpro.space.q0.j.b(fVar6, title, com.gamericefishpro.space.d0.g1.f(jVar, 28), j7, rVar2, ((i9 >> 6) & 14) | 432 | ((i9 >> 3) & 7168));
                    fVar3 = fVar6;
                    j4 = j7;
                    rVar2.p(false);
                } else {
                    j4 = j7;
                    fVar3 = fVar6;
                    i5 = 14;
                    rVar2.a0(1534965659);
                    rVar2.p(false);
                }
            }
            rVar2.p(z);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, f), rVar2);
            com.gamericefishpro.space.h1.m mVarA = com.gamericefishpro.space.d0.e1.a();
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, 0);
            int iHashCode3 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL3 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarA, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL3, eVar4);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar2, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, eVar3);
            long j8 = j3;
            com.gamericefishpro.space.q0.r0.a(title, null, j8, com.gamericefishpro.space.hj.c.C(17), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new com.gamericefishpro.space.r2.i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.8f), (((long) Float.floatToRawIntBits(0.0f)) << c2) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 2.0f), 16769023), rVar, 1597830, 12582912, 130986);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, 4), rVar);
            com.gamericefishpro.space.q0.r0.a(description, null, com.gamericefishpro.space.o1.s.c(j8, 0.75f), com.gamericefishpro.space.hj.c.C(i5), com.gamericefishpro.space.u2.k.v, 0L, null, com.gamericefishpro.space.hj.c.C(18), 0, false, 0, 0, null, rVar, 1597830, 48, 260010);
            rVar.p(true);
            rVar.p(true);
            num3 = num4;
            fVar4 = fVar3;
            j5 = j4;
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.p7.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a4.c(title, description, fVar4, num3, j5, (r) obj, i.D(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x02df  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x031d  */
    /* JADX WARN: Code duplicated, block: B:126:0x034c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0387  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x0429  */
    /* JADX WARN: Code duplicated, block: B:146:0x044e  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:150:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:153:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:157:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:163:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x0528  */
    /* JADX WARN: Code duplicated, block: B:167:0x052c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0562  */
    /* JADX WARN: Code duplicated, block: B:171:0x0566  */
    /* JADX WARN: Code duplicated, block: B:174:0x05af  */
    /* JADX WARN: Code duplicated, block: B:176:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x023d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    /* JADX WARN: Code duplicated, block: B:95:0x026a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0297  */
    /* JADX WARN: Code duplicated, block: B:99:0x0299  */
    public static final void d(final com.gamericefishpro.space.i7.d type, final int i, final int i2, final boolean z, final Function0 onUse, final Function0 onBuy, com.gamericefishpro.space.t0.r rVar, final int i3) {
        int i4;
        String str;
        com.gamericefishpro.space.t0.f fVar;
        com.gamericefishpro.space.t0.s2 s2VarE;
        boolean z2;
        float f;
        float f2;
        long j;
        float f3;
        com.gamericefishpro.space.h2.e eVar;
        float f4;
        com.gamericefishpro.space.o1.i0 i0VarE;
        float f5;
        Object objP;
        boolean z3;
        Object objP2;
        com.gamericefishpro.space.h1.e eVar2;
        boolean z4;
        com.gamericefishpro.space.h2.e eVar3;
        float f6;
        com.gamericefishpro.space.t0.f fVar2;
        com.gamericefishpro.space.h2.e eVar4;
        com.gamericefishpro.space.t0.r rVar2;
        boolean z5;
        com.gamericefishpro.space.h2.d dVar;
        com.gamericefishpro.space.h2.e eVar5;
        com.gamericefishpro.space.h2.e eVar6;
        long jC;
        boolean z6;
        long jC2;
        Object objP3;
        boolean z7;
        Object objP4;
        long jC3;
        String strValueOf;
        com.gamericefishpro.space.t0.r rVar3 = rVar;
        com.gamericefishpro.space.o1.g0 g0Var = com.gamericefishpro.space.o1.o.b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onUse, "onUse");
        Intrinsics.checkNotNullParameter(onBuy, "onBuy");
        rVar3.b0(-1799477160);
        if ((i3 & 6) == 0) {
            i4 = (rVar3.f(type) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= rVar3.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= rVar3.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= rVar3.g(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= rVar3.h(onUse) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= rVar3.h(onBuy) ? 131072 : 65536;
        }
        int i5 = i4;
        if ((i5 & 74899) == 74898 && rVar3.E()) {
            rVar3.V();
        } else {
            long jC4 = com.gamericefishpro.space.n7.f.c(type);
            String str2 = type.e;
            int i6 = type.i;
            boolean z8 = i2 >= i6;
            boolean z9 = i > 0;
            com.gamericefishpro.space.t0.f fVar3 = com.gamericefishpro.space.t0.n.a;
            if (z) {
                rVar3.a0(1615642655);
                str = str2;
                fVar = fVar3;
                s2VarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("pu", rVar3), 1.0f, 1.15f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(400, 2, com.gamericefishpro.space.w.t.a), com.gamericefishpro.space.w.j0.e), "pu_s", rVar3, 29112);
                rVar3.p(false);
            } else {
                str = str2;
                fVar = fVar3;
                rVar3.a0(1615865483);
                rVar3.a0(-2026084985);
                Object objP5 = rVar3.P();
                if (objP5 == fVar) {
                    objP5 = new com.gamericefishpro.space.t0.b1(1.0f);
                    rVar3.k0(objP5);
                }
                s2VarE = (com.gamericefishpro.space.t0.b1) objP5;
                rVar3.p(false);
                rVar3.p(false);
            }
            com.gamericefishpro.space.h1.c cVar = com.gamericefishpro.space.h1.b.G;
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.d0.g1.g(jVar, 105);
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(com.gamericefishpro.space.d0.h.b, cVar, rVar3, 48);
            int iHashCode = Long.hashCode(rVar3.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar3.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarG, rVar3);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar3.d0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.n0();
            }
            com.gamericefishpro.space.h2.e eVar7 = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar3, b0VarA, eVar7);
            com.gamericefishpro.space.h2.e eVar8 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar3, l1VarL, eVar8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar9 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar3, numValueOf, eVar9);
            com.gamericefishpro.space.h2.d dVar2 = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar3, dVar2);
            com.gamericefishpro.space.h2.e eVar10 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar3, mVarF, eVar10);
            com.gamericefishpro.space.t0.s2 s2Var = s2VarE;
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.i, false);
            int iHashCode2 = Long.hashCode(rVar3.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar3.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(jVar, rVar3);
            rVar3.d0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar3, l0VarD, eVar7);
            com.gamericefishpro.space.t0.i.B(rVar3, l1VarL2, eVar8);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar3, eVar9, rVar3, dVar2);
            com.gamericefishpro.space.t0.i.B(rVar3, mVarF2, eVar10);
            float f7 = 8;
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.l1.h.f(com.gamericefishpro.space.d0.g1.f(com.gamericefishpro.space.d0.j.o(jVar, 0.0f, f7, f7, 0.0f, 9), 76), ((Number) s2Var.getValue()).floatValue());
            if (z) {
                f = 24;
                z2 = z9;
            } else {
                z2 = z9;
                if (z2) {
                    f = 12;
                } else {
                    f = 4;
                }
                f2 = 20;
                com.gamericefishpro.space.k0.d dVarA = com.gamericefishpro.space.k0.e.a(f2);
                if (!z2 || z) {
                    j = jC4;
                } else {
                    j = com.gamericefishpro.space.o1.s.f;
                }
                com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.l1.h.g(mVarF3, f, dVarA, 0L, j, 12), com.gamericefishpro.space.k0.e.a(f2));
                if (z) {
                    eVar = eVar10;
                    f4 = f2;
                    f3 = f7;
                    i0VarE = com.gamericefishpro.space.n9.a0.d(14, com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(jC4, 0.7f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.b)));
                } else {
                    f3 = f7;
                    eVar = eVar10;
                    f4 = f2;
                    if (z2) {
                        i0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(jC4, 0.4f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.b)), 0.0f, 14);
                    } else {
                        i0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.1f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.b)), 0.0f, 14);
                    }
                }
                com.gamericefishpro.space.h1.m mVarD = com.gamericefishpro.space.y.q.d(mVarB, i0VarE, null, 6);
                if (z) {
                    f5 = 3;
                } else {
                    f5 = 2;
                }
                com.gamericefishpro.space.h1.m mVarG2 = com.gamericefishpro.space.y.q.g(mVarD, f5, (!z2 || z) ? jC4 : com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.2f), com.gamericefishpro.space.k0.e.a(f4));
                rVar3.a0(1425443432);
                objP = rVar3.P();
                if (objP == fVar) {
                    objP = com.gamericefishpro.space.t0.y0.d(rVar3);
                }
                com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
                rVar3.p(false);
                rVar3.a0(1425448108);
                if ((i5 & 57344) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = rVar3.P();
                if (z3 || objP2 == fVar) {
                    objP2 = new com.gamericefishpro.space.n7.r(2, onUse);
                    rVar3.k0(objP2);
                }
                rVar3.p(false);
                com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(mVarG2, iVar, z2, (Function0) objP2, 24);
                eVar2 = com.gamericefishpro.space.h1.b.w;
                com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(eVar2, false);
                z4 = z2;
                int iHashCode3 = Long.hashCode(rVar3.T);
                com.gamericefishpro.space.t0.l1 l1VarL3 = rVar3.l();
                com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarI, rVar3);
                rVar3.d0();
                if (rVar3.S) {
                    rVar3.k(yVar);
                } else {
                    rVar3.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar3, l0VarD2, eVar7);
                com.gamericefishpro.space.t0.i.B(rVar3, l1VarL3, eVar8);
                com.gamericefishpro.space.m5.a.o(iHashCode3, rVar3, eVar9, rVar3, dVar2);
                eVar3 = eVar;
                com.gamericefishpro.space.t0.i.B(rVar3, mVarF4, eVar3);
                com.gamericefishpro.space.t1.b bVarI = com.gamericefishpro.space.u6.f.I(type.d, rVar3, 0);
                com.gamericefishpro.space.h1.m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.d0.g1.c, f3);
                if (!z4 || z) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.4f;
                }
                fVar2 = fVar;
                String str3 = str;
                eVar4 = eVar9;
                com.gamericefishpro.space.y.q.b(bVarI, str3, mVarL, null, com.gamericefishpro.space.f2.h.b, f6, rVar3, 24968, 72);
                rVar2 = rVar3;
                rVar2.p(true);
                rVar2.a0(1425465920);
                if (i > 0) {
                    com.gamericefishpro.space.k0.d dVar3 = com.gamericefishpro.space.k0.e.a;
                    long j2 = com.gamericefishpro.space.o1.s.c;
                    com.gamericefishpro.space.h1.m mVarG3 = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.l1.h.g(com.gamericefishpro.space.d0.g1.f(jVar, 28), 6, dVar3, 0L, 0L, 28), dVar3), jC4, g0Var), 2, j2, dVar3);
                    com.gamericefishpro.space.f2.l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(eVar2, false);
                    int iHashCode4 = Long.hashCode(rVar2.T);
                    com.gamericefishpro.space.t0.l1 l1VarL4 = rVar2.l();
                    com.gamericefishpro.space.h1.m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarG3, rVar2);
                    rVar2.d0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar2, l0VarD3, eVar7);
                    eVar5 = eVar8;
                    com.gamericefishpro.space.t0.i.B(rVar2, l1VarL4, eVar5);
                    com.gamericefishpro.space.m5.a.o(iHashCode4, rVar2, eVar4, rVar2, dVar2);
                    com.gamericefishpro.space.t0.i.B(rVar2, mVarF5, eVar3);
                    if (i > 99) {
                        strValueOf = "99+";
                    } else {
                        strValueOf = String.valueOf(i);
                    }
                    eVar4 = eVar4;
                    String str4 = strValueOf;
                    z5 = true;
                    dVar = dVar2;
                    eVar6 = eVar3;
                    com.gamericefishpro.space.q0.r0.a(str4, null, j2, com.gamericefishpro.space.hj.c.C(12), com.gamericefishpro.space.u2.k.z, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
                    rVar2 = rVar;
                    rVar2.p(true);
                } else {
                    z5 = true;
                    dVar = dVar2;
                    eVar5 = eVar8;
                    eVar6 = eVar3;
                }
                rVar2.p(false);
                rVar2.p(z5);
                float f8 = 4;
                com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, f8), rVar2);
                if (!z4 || z) {
                    jC = com.gamericefishpro.space.o1.s.c;
                } else {
                    jC = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.5f);
                }
                long jC5 = com.gamericefishpro.space.hj.c.C(12);
                com.gamericefishpro.space.u2.k kVar = com.gamericefishpro.space.u2.k.z;
                com.gamericefishpro.space.q0.r0.a(str3, null, jC, jC5, kVar, 0L, new com.gamericefishpro.space.b3.k(3), 0L, 0, false, 1, 0, null, rVar, 1597440, 24576, 244650);
                com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, f8), rVar);
                float f9 = 12;
                com.gamericefishpro.space.h1.m mVarB2 = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.d(jVar, 26), com.gamericefishpro.space.k0.e.a(f9));
                z6 = z8;
                if (z6) {
                    jC2 = com.gamericefishpro.space.n7.f.d;
                } else {
                    jC2 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.1f);
                }
                com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(mVarB2, jC2, g0Var);
                rVar.a0(128107145);
                objP3 = rVar.P();
                if (objP3 == fVar2) {
                    objP3 = com.gamericefishpro.space.t0.y0.d(rVar);
                }
                com.gamericefishpro.space.b0.i iVar2 = (com.gamericefishpro.space.b0.i) objP3;
                rVar.p(false);
                rVar.a0(128111437);
                if ((i5 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objP4 = rVar.P();
                if (z7 || objP4 == fVar2) {
                    objP4 = new com.gamericefishpro.space.n7.r(3, onBuy);
                    rVar.k0(objP4);
                }
                rVar.p(false);
                com.gamericefishpro.space.h1.m mVarN = com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.y.q.i(mVarE, iVar2, z6, (Function0) objP4, 24), f9, 0.0f, 2);
                com.gamericefishpro.space.f2.l0 l0VarD4 = com.gamericefishpro.space.d0.r.d(eVar2, false);
                int iHashCode5 = Long.hashCode(rVar.T);
                com.gamericefishpro.space.t0.l1 l1VarL5 = rVar.l();
                com.gamericefishpro.space.h1.m mVarF6 = com.gamericefishpro.space.d9.h.F(mVarN, rVar);
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, l0VarD4, eVar7);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL5, eVar5);
                com.gamericefishpro.space.h2.e eVar11 = eVar4;
                com.gamericefishpro.space.h2.d dVar4 = dVar;
                com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar11, rVar, dVar4);
                com.gamericefishpro.space.h2.e eVar12 = eVar6;
                com.gamericefishpro.space.t0.i.B(rVar, mVarF6, eVar12);
                com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar, 48);
                int iHashCode6 = Long.hashCode(rVar.T);
                com.gamericefishpro.space.t0.l1 l1VarL6 = rVar.l();
                com.gamericefishpro.space.h1.m mVarF7 = com.gamericefishpro.space.d9.h.F(jVar, rVar);
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, d1VarA, eVar7);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL6, eVar5);
                com.gamericefishpro.space.m5.a.o(iHashCode6, rVar, eVar11, rVar, dVar4);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF7, eVar12);
                com.gamericefishpro.space.q0.r0.a("🪙", null, 0L, com.gamericefishpro.space.hj.c.C(12), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 24582, 0, 262126);
                com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, f8), rVar);
                String strValueOf2 = String.valueOf(i6);
                if (z6) {
                    jC3 = com.gamericefishpro.space.o1.s.b;
                } else {
                    jC3 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.5f);
                }
                com.gamericefishpro.space.q0.r0.a(strValueOf2, null, jC3, com.gamericefishpro.space.hj.c.C(13), kVar, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597440, 0, 262058);
                rVar3 = rVar;
                rVar3.p(true);
                rVar3.p(true);
                rVar3.p(true);
            }
            f2 = 20;
            com.gamericefishpro.space.k0.d dVarA2 = com.gamericefishpro.space.k0.e.a(f2);
            if (z2) {
                j = jC4;
            } else {
                j = jC4;
            }
            com.gamericefishpro.space.h1.m mVarB3 = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.l1.h.g(mVarF3, f, dVarA2, 0L, j, 12), com.gamericefishpro.space.k0.e.a(f2));
            if (z) {
                eVar = eVar10;
                f4 = f2;
                f3 = f7;
                i0VarE = com.gamericefishpro.space.n9.a0.d(14, com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(jC4, 0.7f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.b)));
            } else {
                f3 = f7;
                eVar = eVar10;
                f4 = f2;
                if (z2) {
                    i0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(jC4, 0.4f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.b)), 0.0f, 14);
                } else {
                    i0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.1f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.b)), 0.0f, 14);
                }
            }
            com.gamericefishpro.space.h1.m mVarD2 = com.gamericefishpro.space.y.q.d(mVarB3, i0VarE, null, 6);
            if (z) {
                f5 = 3;
            } else {
                f5 = 2;
            }
            com.gamericefishpro.space.h1.m mVarG4 = com.gamericefishpro.space.y.q.g(mVarD2, f5, (!z2 || z) ? jC4 : com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.2f), com.gamericefishpro.space.k0.e.a(f4));
            rVar3.a0(1425443432);
            objP = rVar3.P();
            if (objP == fVar) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar3);
            }
            com.gamericefishpro.space.b0.i iVar3 = (com.gamericefishpro.space.b0.i) objP;
            rVar3.p(false);
            rVar3.a0(1425448108);
            if ((i5 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP2 = rVar3.P();
            if (z3) {
                objP2 = new com.gamericefishpro.space.n7.r(2, onUse);
                rVar3.k0(objP2);
            } else {
                objP2 = new com.gamericefishpro.space.n7.r(2, onUse);
                rVar3.k0(objP2);
            }
            rVar3.p(false);
            com.gamericefishpro.space.h1.m mVarI2 = com.gamericefishpro.space.y.q.i(mVarG4, iVar3, z2, (Function0) objP2, 24);
            eVar2 = com.gamericefishpro.space.h1.b.w;
            com.gamericefishpro.space.f2.l0 l0VarD5 = com.gamericefishpro.space.d0.r.d(eVar2, false);
            z4 = z2;
            int iHashCode7 = Long.hashCode(rVar3.T);
            com.gamericefishpro.space.t0.l1 l1VarL7 = rVar3.l();
            com.gamericefishpro.space.h1.m mVarF8 = com.gamericefishpro.space.d9.h.F(mVarI2, rVar3);
            rVar3.d0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar3, l0VarD5, eVar7);
            com.gamericefishpro.space.t0.i.B(rVar3, l1VarL7, eVar8);
            com.gamericefishpro.space.m5.a.o(iHashCode7, rVar3, eVar9, rVar3, dVar2);
            eVar3 = eVar;
            com.gamericefishpro.space.t0.i.B(rVar3, mVarF8, eVar3);
            com.gamericefishpro.space.t1.b bVarI2 = com.gamericefishpro.space.u6.f.I(type.d, rVar3, 0);
            com.gamericefishpro.space.h1.m mVarL2 = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.d0.g1.c, f3);
            if (z4) {
                f6 = 1.0f;
            } else {
                f6 = 1.0f;
            }
            fVar2 = fVar;
            String str5 = str;
            eVar4 = eVar9;
            com.gamericefishpro.space.y.q.b(bVarI2, str5, mVarL2, null, com.gamericefishpro.space.f2.h.b, f6, rVar3, 24968, 72);
            rVar2 = rVar3;
            rVar2.p(true);
            rVar2.a0(1425465920);
            if (i > 0) {
                com.gamericefishpro.space.k0.d dVar5 = com.gamericefishpro.space.k0.e.a;
                long j3 = com.gamericefishpro.space.o1.s.c;
                com.gamericefishpro.space.h1.m mVarG5 = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.l1.h.g(com.gamericefishpro.space.d0.g1.f(jVar, 28), 6, dVar5, 0L, 0L, 28), dVar5), jC4, g0Var), 2, j3, dVar5);
                com.gamericefishpro.space.f2.l0 l0VarD6 = com.gamericefishpro.space.d0.r.d(eVar2, false);
                int iHashCode8 = Long.hashCode(rVar2.T);
                com.gamericefishpro.space.t0.l1 l1VarL8 = rVar2.l();
                com.gamericefishpro.space.h1.m mVarF9 = com.gamericefishpro.space.d9.h.F(mVarG5, rVar2);
                rVar2.d0();
                if (rVar2.S) {
                    rVar2.k(yVar);
                } else {
                    rVar2.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar2, l0VarD6, eVar7);
                eVar5 = eVar8;
                com.gamericefishpro.space.t0.i.B(rVar2, l1VarL8, eVar5);
                com.gamericefishpro.space.m5.a.o(iHashCode8, rVar2, eVar4, rVar2, dVar2);
                com.gamericefishpro.space.t0.i.B(rVar2, mVarF9, eVar3);
                if (i > 99) {
                    strValueOf = "99+";
                } else {
                    strValueOf = String.valueOf(i);
                }
                eVar4 = eVar4;
                String str6 = strValueOf;
                z5 = true;
                dVar = dVar2;
                eVar6 = eVar3;
                com.gamericefishpro.space.q0.r0.a(str6, null, j3, com.gamericefishpro.space.hj.c.C(12), com.gamericefishpro.space.u2.k.z, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
                rVar2 = rVar;
                rVar2.p(true);
            } else {
                z5 = true;
                dVar = dVar2;
                eVar5 = eVar8;
                eVar6 = eVar3;
            }
            rVar2.p(false);
            rVar2.p(z5);
            float f10 = 4;
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, f10), rVar2);
            if (z4) {
                jC = com.gamericefishpro.space.o1.s.c;
            } else {
                jC = com.gamericefishpro.space.o1.s.c;
            }
            long jC6 = com.gamericefishpro.space.hj.c.C(12);
            com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.z;
            com.gamericefishpro.space.q0.r0.a(str5, null, jC, jC6, kVar2, 0L, new com.gamericefishpro.space.b3.k(3), 0L, 0, false, 1, 0, null, rVar, 1597440, 24576, 244650);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.d(jVar, f10), rVar);
            float f11 = 12;
            com.gamericefishpro.space.h1.m mVarB4 = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.d(jVar, 26), com.gamericefishpro.space.k0.e.a(f11));
            z6 = z8;
            if (z6) {
                jC2 = com.gamericefishpro.space.n7.f.d;
            } else {
                jC2 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.1f);
            }
            com.gamericefishpro.space.h1.m mVarE2 = com.gamericefishpro.space.y.q.e(mVarB4, jC2, g0Var);
            rVar.a0(128107145);
            objP3 = rVar.P();
            if (objP3 == fVar2) {
                objP3 = com.gamericefishpro.space.t0.y0.d(rVar);
            }
            com.gamericefishpro.space.b0.i iVar4 = (com.gamericefishpro.space.b0.i) objP3;
            rVar.p(false);
            rVar.a0(128111437);
            if ((i5 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            objP4 = rVar.P();
            if (z7) {
                objP4 = new com.gamericefishpro.space.n7.r(3, onBuy);
                rVar.k0(objP4);
            } else {
                objP4 = new com.gamericefishpro.space.n7.r(3, onBuy);
                rVar.k0(objP4);
            }
            rVar.p(false);
            com.gamericefishpro.space.h1.m mVarN2 = com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.y.q.i(mVarE2, iVar4, z6, (Function0) objP4, 24), f11, 0.0f, 2);
            com.gamericefishpro.space.f2.l0 l0VarD7 = com.gamericefishpro.space.d0.r.d(eVar2, false);
            int iHashCode9 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL9 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF10 = com.gamericefishpro.space.d9.h.F(mVarN2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD7, eVar7);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL9, eVar5);
            com.gamericefishpro.space.h2.e eVar13 = eVar4;
            com.gamericefishpro.space.h2.d dVar6 = dVar;
            com.gamericefishpro.space.m5.a.o(iHashCode9, rVar, eVar13, rVar, dVar6);
            com.gamericefishpro.space.h2.e eVar14 = eVar6;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF10, eVar14);
            com.gamericefishpro.space.d0.d1 d1VarA2 = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar, 48);
            int iHashCode10 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL10 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF11 = com.gamericefishpro.space.d9.h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA2, eVar7);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL10, eVar5);
            com.gamericefishpro.space.m5.a.o(iHashCode10, rVar, eVar13, rVar, dVar6);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF11, eVar14);
            com.gamericefishpro.space.q0.r0.a("🪙", null, 0L, com.gamericefishpro.space.hj.c.C(12), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 24582, 0, 262126);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, f10), rVar);
            String strValueOf3 = String.valueOf(i6);
            if (z6) {
                jC3 = com.gamericefishpro.space.o1.s.b;
            } else {
                jC3 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.5f);
            }
            com.gamericefishpro.space.q0.r0.a(strValueOf3, null, jC3, com.gamericefishpro.space.hj.c.C(13), kVar2, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597440, 0, 262058);
            rVar3 = rVar;
            rVar3.p(true);
            rVar3.p(true);
            rVar3.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar3.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.n7.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a4.d(type, i, i2, z, onUse, onBuy, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(1874868149);
        if (i == 0 && rVar.E()) {
            rVar.V();
        } else {
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.d0.g1.d(com.gamericefishpro.space.d0.g1.b(com.gamericefishpro.space.h1.j.a, 1.0f), 1), 20, 0.0f, 2), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.1f), com.gamericefishpro.space.o1.o.b), rVar, 6);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.r2.u(i, 14);
        }
    }

    public static final void f(com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.t0.r rVar2;
        com.gamericefishpro.space.t0.r rVar3 = rVar;
        rVar3.b0(32724421);
        if (i == 0 && rVar3.E()) {
            rVar3.V();
            rVar2 = rVar3;
        } else {
            rVar3.a0(2006524319);
            Object objP = rVar3.P();
            boolean z = false;
            Object obj = objP;
            if (objP == com.gamericefishpro.space.t0.n.a) {
                ArrayList arrayList = new ArrayList(15);
                for (int i2 = 0; i2 < 15; i2++) {
                    com.gamericefishpro.space.hi.d.d.getClass();
                    arrayList.add(Float.valueOf(com.gamericefishpro.space.hi.d.e.a().nextFloat()));
                }
                rVar3.k0(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            rVar3.p(false);
            com.gamericefishpro.space.d0.h0 h0Var = com.gamericefishpro.space.d0.g1.c;
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar3.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar3.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(h0Var, rVar3);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar3.d0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar3, l0VarD, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar3, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar3, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar3, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar3, mVarF, com.gamericefishpro.space.h2.f.c);
            rVar3.a0(-871907243);
            int i3 = 0;
            com.gamericefishpro.space.t0.r rVar4 = rVar3;
            for (Object obj2 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    com.gamericefishpro.space.ph.x.i();
                    throw null;
                }
                float fFloatValue = ((Number) obj2).floatValue();
                com.gamericefishpro.space.q0.r0.a("❄", com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.h1.j.a, fFloatValue * ((float) 350), ((Number) com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("snow_" + i3, rVar4), -50.0f, 1200.0f, com.gamericefishpro.space.w.c.l(new com.gamericefishpro.space.w.o1((i3 * 150) + 2000, i3 * 200, com.gamericefishpro.space.w.t.b), com.gamericefishpro.space.w.j0.d), com.gamericefishpro.space.m5.a.g(i3, "y_"), rVar4, 4488).v.getValue()).floatValue()), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, (0.3f * fFloatValue) + 0.4f), com.gamericefishpro.space.hj.c.C(((int) (((float) 8) * fFloatValue)) + 10), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 6, 0, 262120);
                rVar4 = rVar;
                i3 = i4;
                z = false;
            }
            rVar4.p(z);
            rVar4.p(true);
            rVar2 = rVar4;
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.r2.u(i, 18);
        }
    }

    public static final void g(final float f, final com.gamericefishpro.space.h1.m mVar, long j, long j2, long j3, com.gamericefishpro.space.t0.r rVar, final int i) {
        long j4;
        long j5;
        final long j6;
        final long j7;
        final long j8;
        rVar.b0(-1400325427);
        if (((i | (rVar.c(f) ? 4 : 2) | (rVar.f(mVar) ? 32 : 16) | 28032) & 9363) == 9362 && rVar.E()) {
            rVar.V();
            j8 = j;
            j6 = j2;
            j7 = j3;
        } else {
            long jC = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.2f);
            final long jC2 = com.gamericefishpro.space.o1.o.c(4278233855L);
            final long jC3 = com.gamericefishpro.space.o1.o.c(4278220497L);
            float fB = com.gamericefishpro.space.ji.f.b(f, 0.0f, 1.0f);
            com.gamericefishpro.space.w.i iVarO = com.gamericefishpro.space.w.c.o(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 2, com.gamericefishpro.space.w.t.a);
            com.gamericefishpro.space.w.v0 v0Var = com.gamericefishpro.space.w.d.a;
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (iVarO == v0Var) {
                rVar.a0(1144089983);
                boolean zC = rVar.c(0.01f);
                Object objP = rVar.P();
                if (zC || objP == obj) {
                    objP = com.gamericefishpro.space.w.c.n(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                    rVar.k0(objP);
                }
                iVarO = (com.gamericefishpro.space.w.v0) objP;
                rVar.p(false);
            } else {
                rVar.a0(1144199909);
                rVar.p(false);
            }
            com.gamericefishpro.space.t0.s2 s2VarB = com.gamericefishpro.space.w.d.b(Float.valueOf(fB), com.gamericefishpro.space.w.c.j, iVarO, Float.valueOf(0.01f), "progress_anim", rVar, 24576, 0);
            final com.gamericefishpro.space.w.z zVarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("stripe_anim", rVar), 0.0f, 1.0f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(800, 2, com.gamericefishpro.space.w.t.b), com.gamericefishpro.space.w.j0.d), "stripe_offset", rVar, 29112);
            float f2 = 4;
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.d(mVar, 8), com.gamericefishpro.space.k0.e.a(f2)), jC, com.gamericefishpro.space.o1.o.b);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarE, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            Function0 function0 = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(function0);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.b(com.gamericefishpro.space.d0.g1.b, ((Number) s2VarB.getValue()).floatValue()), com.gamericefishpro.space.k0.e.a(f2));
            rVar.a0(-561002477);
            boolean zF = rVar.f(zVarE);
            Object objP2 = rVar.P();
            if (zF || objP2 == obj) {
                objP2 = new Function1() { // from class: com.gamericefishpro.space.v7.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        com.gamericefishpro.space.q1.d Canvas = (com.gamericefishpro.space.q1.d) obj2;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        com.gamericefishpro.space.q1.d.n0(Canvas, a0.e(x.f(new s(jC2), new s(jC3)), 0.0f, 14), 0L, Canvas.c(), 0.0f, null, 122);
                        float fR = Canvas.r(14);
                        float fR2 = Canvas.r(10);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.c() & 4294967295L));
                        float f3 = fR2 + fR;
                        for (float fFloatValue = (((Number) zVarE.getValue()).floatValue() * f3) + (-f3); fFloatValue < Float.intBitsToFloat((int) (Canvas.c() >> 32)); fFloatValue += f3) {
                            com.gamericefishpro.space.o1.h hVarA = j.a();
                            Path path = hVarA.a;
                            path.moveTo(fFloatValue, Float.intBitsToFloat((int) (Canvas.c() & 4294967295L)));
                            float f4 = fFloatValue + fR;
                            hVarA.d(f4, Float.intBitsToFloat((int) (Canvas.c() & 4294967295L)));
                            hVarA.d(f4 + fIntBitsToFloat, 0.0f);
                            hVarA.d(fFloatValue + fIntBitsToFloat, 0.0f);
                            path.close();
                            Canvas.O(hVarA, s.c(s.c, 0.25f), com.gamericefishpro.space.q1.f.b);
                        }
                        com.gamericefishpro.space.q1.d.n0(Canvas, a0.e(x.f(new s(s.c(s.c, 0.5f)), new s(s.f)), Float.intBitsToFloat((int) (Canvas.c() & 4294967295L)) / 1.5f, 8), 0L, Canvas.c(), 0.0f, null, 122);
                        return Unit.a;
                    }
                };
                j4 = jC2;
                j5 = jC3;
                rVar.k0(objP2);
            } else {
                j4 = jC2;
                j5 = jC3;
            }
            rVar.p(false);
            com.gamericefishpro.space.y.q.a(0, mVarB, rVar, (Function1) objP2);
            rVar.p(true);
            j6 = j4;
            j7 = j5;
            j8 = jC;
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(f, mVar, j8, j6, j7, i) { // from class: com.gamericefishpro.space.v7.b
                public final /* synthetic */ float d;
                public final /* synthetic */ m e;
                public final /* synthetic */ long i;
                public final /* synthetic */ long v;
                public final /* synthetic */ long w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(1);
                    a4.g(this.d, this.e, this.i, this.v, this.w, (r) obj2, iD);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:105:0x0189  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:127:0x020a  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:0x014e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x015f  */
    public static final void h(com.gamericefishpro.space.g0.a aVar, com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.g0.v vVar, com.gamericefishpro.space.d0.u0 u0Var, com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.d0.d dVar, com.gamericefishpro.space.z.k kVar, boolean z, com.gamericefishpro.space.y.l lVar, Function1 function1, com.gamericefishpro.space.t0.r rVar, int i, int i2) {
        com.gamericefishpro.space.h1.m mVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        com.gamericefishpro.space.d0.g gVar2;
        int i7;
        com.gamericefishpro.space.d0.d dVar2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        boolean z3;
        boolean z4;
        com.gamericefishpro.space.g0.v vVar2;
        com.gamericefishpro.space.d0.u0 u0Var2;
        com.gamericefishpro.space.y.l lVar2;
        com.gamericefishpro.space.h1.m mVar3;
        com.gamericefishpro.space.d0.g gVar3;
        com.gamericefishpro.space.d0.d dVar3;
        com.gamericefishpro.space.z.k kVar2;
        com.gamericefishpro.space.t0.p1 p1VarT;
        int i14;
        boolean zD;
        Object objP;
        com.gamericefishpro.space.g0.v vVar3;
        int i15;
        com.gamericefishpro.space.d0.u0 w0Var;
        com.gamericefishpro.space.d0.d dVar4;
        com.gamericefishpro.space.z.k kVarW;
        int i16;
        boolean z5;
        com.gamericefishpro.space.y.l lVarA;
        com.gamericefishpro.space.d0.d dVar5;
        com.gamericefishpro.space.d0.u0 u0Var3;
        com.gamericefishpro.space.d0.g gVar4;
        int i17;
        boolean z6;
        Object objP2;
        rVar.b0(-2072102870);
        int i18 = (rVar.f(aVar) ? 4 : 2) | i;
        int i19 = i2 & 2;
        if (i19 == 0) {
            if ((i & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVar.f(mVar2) ? 32 : 16;
            }
            i3 = i18 | 128;
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (rVar.f(u0Var)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 24576;
                if ((i & 196608) == 0) {
                    if ((i2 & 32) == 0) {
                        gVar2 = gVar;
                        int i20 = rVar.f(gVar2) ? 131072 : 65536;
                        i6 |= i20;
                    } else {
                        gVar2 = gVar;
                    }
                    i6 |= i20;
                } else {
                    gVar2 = gVar;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        dVar2 = dVar;
                        if (rVar.f(dVar2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i6 |= i8;
                    }
                    i9 = i6 | 4194304;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                        if ((100663296 & i) == 0) {
                            z2 = z;
                            if (rVar.g(z2)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i9 |= i11;
                        }
                        i12 = i9 | 268435456;
                        if (rVar.h(function1)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        z3 = true;
                        if ((i12 & 306783379) == 306783378 || (i13 & 3) != 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (rVar.S(i12 & 1, z4)) {
                            rVar.X();
                            i14 = i & 1;
                            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
                            if (i14 != 0 || rVar.B()) {
                                if (i19 != 0) {
                                    mVar2 = com.gamericefishpro.space.h1.j.a;
                                }
                                com.gamericefishpro.space.g0.l lVar3 = com.gamericefishpro.space.g0.w.a;
                                Object[] objArr = new Object[0];
                                com.gamericefishpro.space.u6.c cVar = com.gamericefishpro.space.g0.v.w;
                                zD = rVar.d(0) | rVar.d(0);
                                objP = rVar.P();
                                if (zD || objP == fVar) {
                                    objP = new com.gamericefishpro.space.a5.h(17);
                                    rVar.k0(objP);
                                }
                                vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr, cVar, (Function0) objP, rVar, 0);
                                i15 = i12 & (-897);
                                if (i4 != 0) {
                                    float f = 0;
                                    w0Var = new com.gamericefishpro.space.d0.w0(f, f, f, f);
                                } else {
                                    w0Var = u0Var;
                                }
                                if ((i2 & 32) != 0) {
                                    gVar2 = com.gamericefishpro.space.d0.h.b;
                                    i15 = i12 & (-459649);
                                }
                                if (i7 != 0) {
                                    dVar4 = com.gamericefishpro.space.d0.h.a;
                                } else {
                                    dVar4 = dVar2;
                                }
                                kVarW = y3.w(rVar);
                                if (i10 != 0) {
                                    z2 = true;
                                }
                                com.gamericefishpro.space.d0.g gVar5 = gVar2;
                                i16 = i15 & (-1908408321);
                                mVar3 = mVar2;
                                z5 = z2;
                                lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                                dVar5 = dVar4;
                                u0Var3 = w0Var;
                                gVar4 = gVar5;
                            } else {
                                rVar.V();
                                int i21 = i12 & (-897);
                                if ((i2 & 32) != 0) {
                                    i21 = i12 & (-459649);
                                }
                                u0Var3 = u0Var;
                                kVarW = kVar;
                                mVar3 = mVar2;
                                z5 = z2;
                                gVar4 = gVar2;
                                dVar5 = dVar2;
                                lVarA = lVar;
                                i16 = i21 & (-1908408321);
                                vVar3 = vVar;
                            }
                            rVar.q();
                            i17 = (i16 & 14) | ((i16 >> 15) & 112);
                            boolean z7 = (((i17 & 14) ^ 6) <= 4 && rVar.f(aVar)) || (i17 & 6) == 4;
                            com.gamericefishpro.space.g0.v vVar4 = vVar3;
                            if ((((i17 & 112) ^ 48) > 32 || !rVar.f(dVar5)) && (i17 & 48) != 32) {
                            }
                            z6 = z7 | z3;
                            objP2 = rVar.P();
                            if (z6 || objP2 == fVar) {
                                objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                                rVar.k0(objP2);
                            }
                            int i22 = i16 >> 3;
                            vVar2 = vVar4;
                            com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i22 & 29360128) | (i22 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                            u0Var2 = u0Var3;
                            gVar3 = gVar4;
                            lVar2 = lVarA;
                            z2 = z5;
                            kVar2 = kVarW;
                            dVar3 = dVar5;
                        } else {
                            rVar.V();
                            vVar2 = vVar;
                            u0Var2 = u0Var;
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            gVar3 = gVar2;
                            dVar3 = dVar2;
                            kVar2 = kVar;
                        }
                        p1VarT = rVar.t();
                        if (p1VarT != null) {
                            p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                        }
                    }
                    i9 = i6 | 104857600;
                    z2 = z;
                    i12 = i9 | 268435456;
                    if (rVar.h(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    z3 = true;
                    if ((i12 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (rVar.S(i12 & 1, z4)) {
                        rVar.X();
                        i14 = i & 1;
                        com.gamericefishpro.space.t0.f fVar2 = com.gamericefishpro.space.t0.n.a;
                        if (i14 != 0) {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar4 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr2 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar2 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr2, cVar2, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f2 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f2, f2, f2, f2);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar6 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar6;
                        } else {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar5 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr3 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar3 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr3, cVar3, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f3 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f3, f3, f3, f3);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar7 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar7;
                        }
                        rVar.q();
                        i17 = (i16 & 14) | ((i16 >> 15) & 112);
                        if (((i17 & 14) ^ 6) <= 4) {
                        }
                        com.gamericefishpro.space.g0.v vVar5 = vVar3;
                        z3 = ((i17 & 112) ^ 48) > 32 ? false : false;
                        z6 = z7 | z3;
                        objP2 = rVar.P();
                        if (z6) {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        } else {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        }
                        int i23 = i16 >> 3;
                        vVar2 = vVar5;
                        com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i23 & 29360128) | (i23 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                        u0Var2 = u0Var3;
                        gVar3 = gVar4;
                        lVar2 = lVarA;
                        z2 = z5;
                        kVar2 = kVarW;
                        dVar3 = dVar5;
                    } else {
                        rVar.V();
                        vVar2 = vVar;
                        u0Var2 = u0Var;
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        gVar3 = gVar2;
                        dVar3 = dVar2;
                        kVar2 = kVar;
                    }
                    p1VarT = rVar.t();
                    if (p1VarT != null) {
                        p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                    }
                }
                i6 |= 1572864;
                dVar2 = dVar;
                i9 = i6 | 4194304;
                i10 = i2 & 256;
                if (i10 != 0) {
                    if ((100663296 & i) == 0) {
                        z2 = z;
                        if (rVar.g(z2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i9 |= i11;
                    }
                    i12 = i9 | 268435456;
                    if (rVar.h(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    z3 = true;
                    if ((i12 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (rVar.S(i12 & 1, z4)) {
                        rVar.X();
                        i14 = i & 1;
                        com.gamericefishpro.space.t0.f fVar3 = com.gamericefishpro.space.t0.n.a;
                        if (i14 != 0) {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar6 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr4 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar4 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr4, cVar4, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f4 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f4, f4, f4, f4);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar8 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar8;
                        } else {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar7 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr5 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar5 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr5, cVar5, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f5 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f5, f5, f5, f5);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar9 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar9;
                        }
                        rVar.q();
                        i17 = (i16 & 14) | ((i16 >> 15) & 112);
                        if (((i17 & 14) ^ 6) <= 4) {
                        }
                        com.gamericefishpro.space.g0.v vVar6 = vVar3;
                        if (((i17 & 112) ^ 48) > 32) {
                        }
                        z6 = z7 | z3;
                        objP2 = rVar.P();
                        if (z6) {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        } else {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        }
                        int i24 = i16 >> 3;
                        vVar2 = vVar6;
                        com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i24 & 29360128) | (i24 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                        u0Var2 = u0Var3;
                        gVar3 = gVar4;
                        lVar2 = lVarA;
                        z2 = z5;
                        kVar2 = kVarW;
                        dVar3 = dVar5;
                    } else {
                        rVar.V();
                        vVar2 = vVar;
                        u0Var2 = u0Var;
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        gVar3 = gVar2;
                        dVar3 = dVar2;
                        kVar2 = kVar;
                    }
                    p1VarT = rVar.t();
                    if (p1VarT != null) {
                        p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                    }
                }
                i9 = i6 | 104857600;
                z2 = z;
                i12 = i9 | 268435456;
                if (rVar.h(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                z3 = true;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (rVar.S(i12 & 1, z4)) {
                    rVar.X();
                    i14 = i & 1;
                    com.gamericefishpro.space.t0.f fVar4 = com.gamericefishpro.space.t0.n.a;
                    if (i14 != 0) {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar8 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr6 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar6 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr6, cVar6, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f6 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f6, f6, f6, f6);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar10 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar10;
                    } else {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar9 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr7 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar7 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr7, cVar7, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f7 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f7, f7, f7, f7);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar11 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar11;
                    }
                    rVar.q();
                    i17 = (i16 & 14) | ((i16 >> 15) & 112);
                    if (((i17 & 14) ^ 6) <= 4) {
                    }
                    com.gamericefishpro.space.g0.v vVar7 = vVar3;
                    if (((i17 & 112) ^ 48) > 32) {
                    }
                    z6 = z7 | z3;
                    objP2 = rVar.P();
                    if (z6) {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    }
                    int i25 = i16 >> 3;
                    vVar2 = vVar7;
                    com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i25 & 29360128) | (i25 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                    u0Var2 = u0Var3;
                    gVar3 = gVar4;
                    lVar2 = lVarA;
                    z2 = z5;
                    kVar2 = kVarW;
                    dVar3 = dVar5;
                } else {
                    rVar.V();
                    vVar2 = vVar;
                    u0Var2 = u0Var;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    gVar3 = gVar2;
                    dVar3 = dVar2;
                    kVar2 = kVar;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                }
            }
            i3 = i18 | 3200;
            i6 = i3 | 24576;
            if ((i & 196608) == 0) {
                if ((i2 & 32) == 0) {
                    gVar2 = gVar;
                    if (rVar.f(gVar2)) {
                    }
                    i6 |= i20;
                } else {
                    gVar2 = gVar;
                }
                i6 |= i20;
            } else {
                gVar2 = gVar;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    dVar2 = dVar;
                    if (rVar.f(dVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                }
                i9 = i6 | 4194304;
                i10 = i2 & 256;
                if (i10 != 0) {
                    if ((100663296 & i) == 0) {
                        z2 = z;
                        if (rVar.g(z2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i9 |= i11;
                    }
                    i12 = i9 | 268435456;
                    if (rVar.h(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    z3 = true;
                    if ((i12 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (rVar.S(i12 & 1, z4)) {
                        rVar.X();
                        i14 = i & 1;
                        com.gamericefishpro.space.t0.f fVar5 = com.gamericefishpro.space.t0.n.a;
                        if (i14 != 0) {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar10 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr8 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar8 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr8, cVar8, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f8 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f8, f8, f8, f8);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar12 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar12;
                        } else {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar11 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr9 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar9 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr9, cVar9, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f9 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f9, f9, f9, f9);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar13 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar13;
                        }
                        rVar.q();
                        i17 = (i16 & 14) | ((i16 >> 15) & 112);
                        if (((i17 & 14) ^ 6) <= 4) {
                        }
                        com.gamericefishpro.space.g0.v vVar8 = vVar3;
                        if (((i17 & 112) ^ 48) > 32) {
                        }
                        z6 = z7 | z3;
                        objP2 = rVar.P();
                        if (z6) {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        } else {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        }
                        int i26 = i16 >> 3;
                        vVar2 = vVar8;
                        com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i26 & 29360128) | (i26 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                        u0Var2 = u0Var3;
                        gVar3 = gVar4;
                        lVar2 = lVarA;
                        z2 = z5;
                        kVar2 = kVarW;
                        dVar3 = dVar5;
                    } else {
                        rVar.V();
                        vVar2 = vVar;
                        u0Var2 = u0Var;
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        gVar3 = gVar2;
                        dVar3 = dVar2;
                        kVar2 = kVar;
                    }
                    p1VarT = rVar.t();
                    if (p1VarT != null) {
                        p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                    }
                }
                i9 = i6 | 104857600;
                z2 = z;
                i12 = i9 | 268435456;
                if (rVar.h(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                z3 = true;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (rVar.S(i12 & 1, z4)) {
                    rVar.X();
                    i14 = i & 1;
                    com.gamericefishpro.space.t0.f fVar6 = com.gamericefishpro.space.t0.n.a;
                    if (i14 != 0) {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar12 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr10 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar10 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr10, cVar10, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f10 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f10, f10, f10, f10);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar14 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar14;
                    } else {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar13 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr11 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar11 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr11, cVar11, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f11 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f11, f11, f11, f11);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar15 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar15;
                    }
                    rVar.q();
                    i17 = (i16 & 14) | ((i16 >> 15) & 112);
                    if (((i17 & 14) ^ 6) <= 4) {
                    }
                    com.gamericefishpro.space.g0.v vVar9 = vVar3;
                    if (((i17 & 112) ^ 48) > 32) {
                    }
                    z6 = z7 | z3;
                    objP2 = rVar.P();
                    if (z6) {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    }
                    int i27 = i16 >> 3;
                    vVar2 = vVar9;
                    com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i27 & 29360128) | (i27 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                    u0Var2 = u0Var3;
                    gVar3 = gVar4;
                    lVar2 = lVarA;
                    z2 = z5;
                    kVar2 = kVarW;
                    dVar3 = dVar5;
                } else {
                    rVar.V();
                    vVar2 = vVar;
                    u0Var2 = u0Var;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    gVar3 = gVar2;
                    dVar3 = dVar2;
                    kVar2 = kVar;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                }
            }
            i6 |= 1572864;
            dVar2 = dVar;
            i9 = i6 | 4194304;
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    z2 = z;
                    if (rVar.g(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i9 |= i11;
                }
                i12 = i9 | 268435456;
                if (rVar.h(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                z3 = true;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (rVar.S(i12 & 1, z4)) {
                    rVar.X();
                    i14 = i & 1;
                    com.gamericefishpro.space.t0.f fVar7 = com.gamericefishpro.space.t0.n.a;
                    if (i14 != 0) {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar14 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr12 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar12 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr12, cVar12, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f12 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f12, f12, f12, f12);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar16 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar16;
                    } else {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar15 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr13 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar13 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr13, cVar13, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f13 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f13, f13, f13, f13);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar17 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar17;
                    }
                    rVar.q();
                    i17 = (i16 & 14) | ((i16 >> 15) & 112);
                    if (((i17 & 14) ^ 6) <= 4) {
                    }
                    com.gamericefishpro.space.g0.v vVar10 = vVar3;
                    if (((i17 & 112) ^ 48) > 32) {
                    }
                    z6 = z7 | z3;
                    objP2 = rVar.P();
                    if (z6) {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    }
                    int i28 = i16 >> 3;
                    vVar2 = vVar10;
                    com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i28 & 29360128) | (i28 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                    u0Var2 = u0Var3;
                    gVar3 = gVar4;
                    lVar2 = lVarA;
                    z2 = z5;
                    kVar2 = kVarW;
                    dVar3 = dVar5;
                } else {
                    rVar.V();
                    vVar2 = vVar;
                    u0Var2 = u0Var;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    gVar3 = gVar2;
                    dVar3 = dVar2;
                    kVar2 = kVar;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                }
            }
            i9 = i6 | 104857600;
            z2 = z;
            i12 = i9 | 268435456;
            if (rVar.h(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            z3 = true;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (rVar.S(i12 & 1, z4)) {
                rVar.X();
                i14 = i & 1;
                com.gamericefishpro.space.t0.f fVar8 = com.gamericefishpro.space.t0.n.a;
                if (i14 != 0) {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar16 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr14 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar14 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr14, cVar14, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f14 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f14, f14, f14, f14);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar18 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar18;
                } else {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar17 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr15 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar15 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr15, cVar15, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f15 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f15, f15, f15, f15);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar19 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar19;
                }
                rVar.q();
                i17 = (i16 & 14) | ((i16 >> 15) & 112);
                if (((i17 & 14) ^ 6) <= 4) {
                }
                com.gamericefishpro.space.g0.v vVar11 = vVar3;
                if (((i17 & 112) ^ 48) > 32) {
                }
                z6 = z7 | z3;
                objP2 = rVar.P();
                if (z6) {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                } else {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                }
                int i29 = i16 >> 3;
                vVar2 = vVar11;
                com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i29 & 29360128) | (i29 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                u0Var2 = u0Var3;
                gVar3 = gVar4;
                lVar2 = lVarA;
                z2 = z5;
                kVar2 = kVarW;
                dVar3 = dVar5;
            } else {
                rVar.V();
                vVar2 = vVar;
                u0Var2 = u0Var;
                lVar2 = lVar;
                mVar3 = mVar2;
                gVar3 = gVar2;
                dVar3 = dVar2;
                kVar2 = kVar;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        i3 = i18 | 128;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (rVar.f(u0Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            if ((i & 196608) == 0) {
                if ((i2 & 32) == 0) {
                    gVar2 = gVar;
                    if (rVar.f(gVar2)) {
                    }
                    i6 |= i20;
                } else {
                    gVar2 = gVar;
                }
                i6 |= i20;
            } else {
                gVar2 = gVar;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    dVar2 = dVar;
                    if (rVar.f(dVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                }
                i9 = i6 | 4194304;
                i10 = i2 & 256;
                if (i10 != 0) {
                    if ((100663296 & i) == 0) {
                        z2 = z;
                        if (rVar.g(z2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i9 |= i11;
                    }
                    i12 = i9 | 268435456;
                    if (rVar.h(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    z3 = true;
                    if ((i12 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (rVar.S(i12 & 1, z4)) {
                        rVar.X();
                        i14 = i & 1;
                        com.gamericefishpro.space.t0.f fVar9 = com.gamericefishpro.space.t0.n.a;
                        if (i14 != 0) {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar18 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr16 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar16 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr16, cVar16, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f16 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f16, f16, f16, f16);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar110 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar110;
                        } else {
                            if (i19 != 0) {
                                mVar2 = com.gamericefishpro.space.h1.j.a;
                            }
                            com.gamericefishpro.space.g0.l lVar19 = com.gamericefishpro.space.g0.w.a;
                            Object[] objArr17 = new Object[0];
                            com.gamericefishpro.space.u6.c cVar17 = com.gamericefishpro.space.g0.v.w;
                            zD = rVar.d(0) | rVar.d(0);
                            objP = rVar.P();
                            if (zD) {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            } else {
                                objP = new com.gamericefishpro.space.a5.h(17);
                                rVar.k0(objP);
                            }
                            vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr17, cVar17, (Function0) objP, rVar, 0);
                            i15 = i12 & (-897);
                            if (i4 != 0) {
                                float f17 = 0;
                                w0Var = new com.gamericefishpro.space.d0.w0(f17, f17, f17, f17);
                            } else {
                                w0Var = u0Var;
                            }
                            if ((i2 & 32) != 0) {
                                gVar2 = com.gamericefishpro.space.d0.h.b;
                                i15 = i12 & (-459649);
                            }
                            if (i7 != 0) {
                                dVar4 = com.gamericefishpro.space.d0.h.a;
                            } else {
                                dVar4 = dVar2;
                            }
                            kVarW = y3.w(rVar);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            com.gamericefishpro.space.d0.g gVar111 = gVar2;
                            i16 = i15 & (-1908408321);
                            mVar3 = mVar2;
                            z5 = z2;
                            lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                            dVar5 = dVar4;
                            u0Var3 = w0Var;
                            gVar4 = gVar111;
                        }
                        rVar.q();
                        i17 = (i16 & 14) | ((i16 >> 15) & 112);
                        if (((i17 & 14) ^ 6) <= 4) {
                        }
                        com.gamericefishpro.space.g0.v vVar12 = vVar3;
                        if (((i17 & 112) ^ 48) > 32) {
                        }
                        z6 = z7 | z3;
                        objP2 = rVar.P();
                        if (z6) {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        } else {
                            objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                            rVar.k0(objP2);
                        }
                        int i210 = i16 >> 3;
                        vVar2 = vVar12;
                        com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i210 & 29360128) | (i210 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                        u0Var2 = u0Var3;
                        gVar3 = gVar4;
                        lVar2 = lVarA;
                        z2 = z5;
                        kVar2 = kVarW;
                        dVar3 = dVar5;
                    } else {
                        rVar.V();
                        vVar2 = vVar;
                        u0Var2 = u0Var;
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        gVar3 = gVar2;
                        dVar3 = dVar2;
                        kVar2 = kVar;
                    }
                    p1VarT = rVar.t();
                    if (p1VarT != null) {
                        p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                    }
                }
                i9 = i6 | 104857600;
                z2 = z;
                i12 = i9 | 268435456;
                if (rVar.h(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                z3 = true;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (rVar.S(i12 & 1, z4)) {
                    rVar.X();
                    i14 = i & 1;
                    com.gamericefishpro.space.t0.f fVar10 = com.gamericefishpro.space.t0.n.a;
                    if (i14 != 0) {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar110 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr18 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar18 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr18, cVar18, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f18 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f18, f18, f18, f18);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar112 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar112;
                    } else {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar111 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr19 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar19 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr19, cVar19, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f19 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f19, f19, f19, f19);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar113 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar113;
                    }
                    rVar.q();
                    i17 = (i16 & 14) | ((i16 >> 15) & 112);
                    if (((i17 & 14) ^ 6) <= 4) {
                    }
                    com.gamericefishpro.space.g0.v vVar13 = vVar3;
                    if (((i17 & 112) ^ 48) > 32) {
                    }
                    z6 = z7 | z3;
                    objP2 = rVar.P();
                    if (z6) {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    }
                    int i211 = i16 >> 3;
                    vVar2 = vVar13;
                    com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i211 & 29360128) | (i211 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                    u0Var2 = u0Var3;
                    gVar3 = gVar4;
                    lVar2 = lVarA;
                    z2 = z5;
                    kVar2 = kVarW;
                    dVar3 = dVar5;
                } else {
                    rVar.V();
                    vVar2 = vVar;
                    u0Var2 = u0Var;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    gVar3 = gVar2;
                    dVar3 = dVar2;
                    kVar2 = kVar;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                }
            }
            i6 |= 1572864;
            dVar2 = dVar;
            i9 = i6 | 4194304;
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    z2 = z;
                    if (rVar.g(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i9 |= i11;
                }
                i12 = i9 | 268435456;
                if (rVar.h(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                z3 = true;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (rVar.S(i12 & 1, z4)) {
                    rVar.X();
                    i14 = i & 1;
                    com.gamericefishpro.space.t0.f fVar11 = com.gamericefishpro.space.t0.n.a;
                    if (i14 != 0) {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar112 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr110 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar110 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr110, cVar110, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f110 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f110, f110, f110, f110);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar114 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar114;
                    } else {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar113 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr111 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar111 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr111, cVar111, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f111 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f111, f111, f111, f111);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar115 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar115;
                    }
                    rVar.q();
                    i17 = (i16 & 14) | ((i16 >> 15) & 112);
                    if (((i17 & 14) ^ 6) <= 4) {
                    }
                    com.gamericefishpro.space.g0.v vVar14 = vVar3;
                    if (((i17 & 112) ^ 48) > 32) {
                    }
                    z6 = z7 | z3;
                    objP2 = rVar.P();
                    if (z6) {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    }
                    int i212 = i16 >> 3;
                    vVar2 = vVar14;
                    com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i212 & 29360128) | (i212 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                    u0Var2 = u0Var3;
                    gVar3 = gVar4;
                    lVar2 = lVarA;
                    z2 = z5;
                    kVar2 = kVarW;
                    dVar3 = dVar5;
                } else {
                    rVar.V();
                    vVar2 = vVar;
                    u0Var2 = u0Var;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    gVar3 = gVar2;
                    dVar3 = dVar2;
                    kVar2 = kVar;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                }
            }
            i9 = i6 | 104857600;
            z2 = z;
            i12 = i9 | 268435456;
            if (rVar.h(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            z3 = true;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (rVar.S(i12 & 1, z4)) {
                rVar.X();
                i14 = i & 1;
                com.gamericefishpro.space.t0.f fVar12 = com.gamericefishpro.space.t0.n.a;
                if (i14 != 0) {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar114 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr112 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar112 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr112, cVar112, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f112 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f112, f112, f112, f112);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar116 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar116;
                } else {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar115 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr113 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar113 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr113, cVar113, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f113 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f113, f113, f113, f113);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar117 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar117;
                }
                rVar.q();
                i17 = (i16 & 14) | ((i16 >> 15) & 112);
                if (((i17 & 14) ^ 6) <= 4) {
                }
                com.gamericefishpro.space.g0.v vVar15 = vVar3;
                if (((i17 & 112) ^ 48) > 32) {
                }
                z6 = z7 | z3;
                objP2 = rVar.P();
                if (z6) {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                } else {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                }
                int i213 = i16 >> 3;
                vVar2 = vVar15;
                com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i213 & 29360128) | (i213 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                u0Var2 = u0Var3;
                gVar3 = gVar4;
                lVar2 = lVarA;
                z2 = z5;
                kVar2 = kVarW;
                dVar3 = dVar5;
            } else {
                rVar.V();
                vVar2 = vVar;
                u0Var2 = u0Var;
                lVar2 = lVar;
                mVar3 = mVar2;
                gVar3 = gVar2;
                dVar3 = dVar2;
                kVar2 = kVar;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
            }
        }
        i3 = i18 | 3200;
        i6 = i3 | 24576;
        if ((i & 196608) == 0) {
            if ((i2 & 32) == 0) {
                gVar2 = gVar;
                if (rVar.f(gVar2)) {
                }
                i6 |= i20;
            } else {
                gVar2 = gVar;
            }
            i6 |= i20;
        } else {
            gVar2 = gVar;
        }
        i7 = i2 & 64;
        if (i7 != 0) {
            if ((1572864 & i) == 0) {
                dVar2 = dVar;
                if (rVar.f(dVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            }
            i9 = i6 | 4194304;
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    z2 = z;
                    if (rVar.g(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i9 |= i11;
                }
                i12 = i9 | 268435456;
                if (rVar.h(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                z3 = true;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (rVar.S(i12 & 1, z4)) {
                    rVar.X();
                    i14 = i & 1;
                    com.gamericefishpro.space.t0.f fVar13 = com.gamericefishpro.space.t0.n.a;
                    if (i14 != 0) {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar116 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr114 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar114 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr114, cVar114, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f114 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f114, f114, f114, f114);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar118 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar118;
                    } else {
                        if (i19 != 0) {
                            mVar2 = com.gamericefishpro.space.h1.j.a;
                        }
                        com.gamericefishpro.space.g0.l lVar117 = com.gamericefishpro.space.g0.w.a;
                        Object[] objArr115 = new Object[0];
                        com.gamericefishpro.space.u6.c cVar115 = com.gamericefishpro.space.g0.v.w;
                        zD = rVar.d(0) | rVar.d(0);
                        objP = rVar.P();
                        if (zD) {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        } else {
                            objP = new com.gamericefishpro.space.a5.h(17);
                            rVar.k0(objP);
                        }
                        vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr115, cVar115, (Function0) objP, rVar, 0);
                        i15 = i12 & (-897);
                        if (i4 != 0) {
                            float f115 = 0;
                            w0Var = new com.gamericefishpro.space.d0.w0(f115, f115, f115, f115);
                        } else {
                            w0Var = u0Var;
                        }
                        if ((i2 & 32) != 0) {
                            gVar2 = com.gamericefishpro.space.d0.h.b;
                            i15 = i12 & (-459649);
                        }
                        if (i7 != 0) {
                            dVar4 = com.gamericefishpro.space.d0.h.a;
                        } else {
                            dVar4 = dVar2;
                        }
                        kVarW = y3.w(rVar);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        com.gamericefishpro.space.d0.g gVar119 = gVar2;
                        i16 = i15 & (-1908408321);
                        mVar3 = mVar2;
                        z5 = z2;
                        lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                        dVar5 = dVar4;
                        u0Var3 = w0Var;
                        gVar4 = gVar119;
                    }
                    rVar.q();
                    i17 = (i16 & 14) | ((i16 >> 15) & 112);
                    if (((i17 & 14) ^ 6) <= 4) {
                    }
                    com.gamericefishpro.space.g0.v vVar16 = vVar3;
                    if (((i17 & 112) ^ 48) > 32) {
                    }
                    z6 = z7 | z3;
                    objP2 = rVar.P();
                    if (z6) {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                        rVar.k0(objP2);
                    }
                    int i214 = i16 >> 3;
                    vVar2 = vVar16;
                    com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i214 & 29360128) | (i214 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                    u0Var2 = u0Var3;
                    gVar3 = gVar4;
                    lVar2 = lVarA;
                    z2 = z5;
                    kVar2 = kVarW;
                    dVar3 = dVar5;
                } else {
                    rVar.V();
                    vVar2 = vVar;
                    u0Var2 = u0Var;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    gVar3 = gVar2;
                    dVar3 = dVar2;
                    kVar2 = kVar;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
                }
            }
            i9 = i6 | 104857600;
            z2 = z;
            i12 = i9 | 268435456;
            if (rVar.h(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            z3 = true;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (rVar.S(i12 & 1, z4)) {
                rVar.X();
                i14 = i & 1;
                com.gamericefishpro.space.t0.f fVar14 = com.gamericefishpro.space.t0.n.a;
                if (i14 != 0) {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar118 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr116 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar116 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr116, cVar116, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f116 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f116, f116, f116, f116);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar1110 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar1110;
                } else {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar119 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr117 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar117 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr117, cVar117, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f117 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f117, f117, f117, f117);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar1111 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar1111;
                }
                rVar.q();
                i17 = (i16 & 14) | ((i16 >> 15) & 112);
                if (((i17 & 14) ^ 6) <= 4) {
                }
                com.gamericefishpro.space.g0.v vVar17 = vVar3;
                if (((i17 & 112) ^ 48) > 32) {
                }
                z6 = z7 | z3;
                objP2 = rVar.P();
                if (z6) {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                } else {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                }
                int i215 = i16 >> 3;
                vVar2 = vVar17;
                com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i215 & 29360128) | (i215 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                u0Var2 = u0Var3;
                gVar3 = gVar4;
                lVar2 = lVarA;
                z2 = z5;
                kVar2 = kVarW;
                dVar3 = dVar5;
            } else {
                rVar.V();
                vVar2 = vVar;
                u0Var2 = u0Var;
                lVar2 = lVar;
                mVar3 = mVar2;
                gVar3 = gVar2;
                dVar3 = dVar2;
                kVar2 = kVar;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
            }
        }
        i6 |= 1572864;
        dVar2 = dVar;
        i9 = i6 | 4194304;
        i10 = i2 & 256;
        if (i10 != 0) {
            if ((100663296 & i) == 0) {
                z2 = z;
                if (rVar.g(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i9 |= i11;
            }
            i12 = i9 | 268435456;
            if (rVar.h(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            z3 = true;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (rVar.S(i12 & 1, z4)) {
                rVar.X();
                i14 = i & 1;
                com.gamericefishpro.space.t0.f fVar15 = com.gamericefishpro.space.t0.n.a;
                if (i14 != 0) {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar1110 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr118 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar118 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr118, cVar118, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f118 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f118, f118, f118, f118);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar1112 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar1112;
                } else {
                    if (i19 != 0) {
                        mVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.g0.l lVar1111 = com.gamericefishpro.space.g0.w.a;
                    Object[] objArr119 = new Object[0];
                    com.gamericefishpro.space.u6.c cVar119 = com.gamericefishpro.space.g0.v.w;
                    zD = rVar.d(0) | rVar.d(0);
                    objP = rVar.P();
                    if (zD) {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    } else {
                        objP = new com.gamericefishpro.space.a5.h(17);
                        rVar.k0(objP);
                    }
                    vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr119, cVar119, (Function0) objP, rVar, 0);
                    i15 = i12 & (-897);
                    if (i4 != 0) {
                        float f119 = 0;
                        w0Var = new com.gamericefishpro.space.d0.w0(f119, f119, f119, f119);
                    } else {
                        w0Var = u0Var;
                    }
                    if ((i2 & 32) != 0) {
                        gVar2 = com.gamericefishpro.space.d0.h.b;
                        i15 = i12 & (-459649);
                    }
                    if (i7 != 0) {
                        dVar4 = com.gamericefishpro.space.d0.h.a;
                    } else {
                        dVar4 = dVar2;
                    }
                    kVarW = y3.w(rVar);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    com.gamericefishpro.space.d0.g gVar1113 = gVar2;
                    i16 = i15 & (-1908408321);
                    mVar3 = mVar2;
                    z5 = z2;
                    lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                    dVar5 = dVar4;
                    u0Var3 = w0Var;
                    gVar4 = gVar1113;
                }
                rVar.q();
                i17 = (i16 & 14) | ((i16 >> 15) & 112);
                if (((i17 & 14) ^ 6) <= 4) {
                }
                com.gamericefishpro.space.g0.v vVar18 = vVar3;
                if (((i17 & 112) ^ 48) > 32) {
                }
                z6 = z7 | z3;
                objP2 = rVar.P();
                if (z6) {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                } else {
                    objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                    rVar.k0(objP2);
                }
                int i216 = i16 >> 3;
                vVar2 = vVar18;
                com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i216 & 29360128) | (i216 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
                u0Var2 = u0Var3;
                gVar3 = gVar4;
                lVar2 = lVarA;
                z2 = z5;
                kVar2 = kVarW;
                dVar3 = dVar5;
            } else {
                rVar.V();
                vVar2 = vVar;
                u0Var2 = u0Var;
                lVar2 = lVar;
                mVar3 = mVar2;
                gVar3 = gVar2;
                dVar3 = dVar2;
                kVar2 = kVar;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
            }
        }
        i9 = i6 | 104857600;
        z2 = z;
        i12 = i9 | 268435456;
        if (rVar.h(function1)) {
            i13 = 4;
        } else {
            i13 = 2;
        }
        z3 = true;
        if ((i12 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (rVar.S(i12 & 1, z4)) {
            rVar.X();
            i14 = i & 1;
            com.gamericefishpro.space.t0.f fVar16 = com.gamericefishpro.space.t0.n.a;
            if (i14 != 0) {
                if (i19 != 0) {
                    mVar2 = com.gamericefishpro.space.h1.j.a;
                }
                com.gamericefishpro.space.g0.l lVar1112 = com.gamericefishpro.space.g0.w.a;
                Object[] objArr1110 = new Object[0];
                com.gamericefishpro.space.u6.c cVar1110 = com.gamericefishpro.space.g0.v.w;
                zD = rVar.d(0) | rVar.d(0);
                objP = rVar.P();
                if (zD) {
                    objP = new com.gamericefishpro.space.a5.h(17);
                    rVar.k0(objP);
                } else {
                    objP = new com.gamericefishpro.space.a5.h(17);
                    rVar.k0(objP);
                }
                vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr1110, cVar1110, (Function0) objP, rVar, 0);
                i15 = i12 & (-897);
                if (i4 != 0) {
                    float f1110 = 0;
                    w0Var = new com.gamericefishpro.space.d0.w0(f1110, f1110, f1110, f1110);
                } else {
                    w0Var = u0Var;
                }
                if ((i2 & 32) != 0) {
                    gVar2 = com.gamericefishpro.space.d0.h.b;
                    i15 = i12 & (-459649);
                }
                if (i7 != 0) {
                    dVar4 = com.gamericefishpro.space.d0.h.a;
                } else {
                    dVar4 = dVar2;
                }
                kVarW = y3.w(rVar);
                if (i10 != 0) {
                    z2 = true;
                }
                com.gamericefishpro.space.d0.g gVar1114 = gVar2;
                i16 = i15 & (-1908408321);
                mVar3 = mVar2;
                z5 = z2;
                lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                dVar5 = dVar4;
                u0Var3 = w0Var;
                gVar4 = gVar1114;
            } else {
                if (i19 != 0) {
                    mVar2 = com.gamericefishpro.space.h1.j.a;
                }
                com.gamericefishpro.space.g0.l lVar1113 = com.gamericefishpro.space.g0.w.a;
                Object[] objArr1111 = new Object[0];
                com.gamericefishpro.space.u6.c cVar1111 = com.gamericefishpro.space.g0.v.w;
                zD = rVar.d(0) | rVar.d(0);
                objP = rVar.P();
                if (zD) {
                    objP = new com.gamericefishpro.space.a5.h(17);
                    rVar.k0(objP);
                } else {
                    objP = new com.gamericefishpro.space.a5.h(17);
                    rVar.k0(objP);
                }
                vVar3 = (com.gamericefishpro.space.g0.v) com.gamericefishpro.space.e1.k.b(objArr1111, cVar1111, (Function0) objP, rVar, 0);
                i15 = i12 & (-897);
                if (i4 != 0) {
                    float f1111 = 0;
                    w0Var = new com.gamericefishpro.space.d0.w0(f1111, f1111, f1111, f1111);
                } else {
                    w0Var = u0Var;
                }
                if ((i2 & 32) != 0) {
                    gVar2 = com.gamericefishpro.space.d0.h.b;
                    i15 = i12 & (-459649);
                }
                if (i7 != 0) {
                    dVar4 = com.gamericefishpro.space.d0.h.a;
                } else {
                    dVar4 = dVar2;
                }
                kVarW = y3.w(rVar);
                if (i10 != 0) {
                    z2 = true;
                }
                com.gamericefishpro.space.d0.g gVar1115 = gVar2;
                i16 = i15 & (-1908408321);
                mVar3 = mVar2;
                z5 = z2;
                lVarA = com.gamericefishpro.space.y.y0.a(rVar);
                dVar5 = dVar4;
                u0Var3 = w0Var;
                gVar4 = gVar1115;
            }
            rVar.q();
            i17 = (i16 & 14) | ((i16 >> 15) & 112);
            if (((i17 & 14) ^ 6) <= 4) {
            }
            com.gamericefishpro.space.g0.v vVar19 = vVar3;
            if (((i17 & 112) ^ 48) > 32) {
            }
            z6 = z7 | z3;
            objP2 = rVar.P();
            if (z6) {
                objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                rVar.k0(objP2);
            } else {
                objP2 = new com.gamericefishpro.space.g0.c(new com.gamericefishpro.space.d0.w(2, aVar, dVar5));
                rVar.k0(objP2);
            }
            int i217 = i16 >> 3;
            vVar2 = vVar19;
            com.gamericefishpro.space.i.a.i(mVar3, vVar2, (com.gamericefishpro.space.g0.c) objP2, u0Var3, kVarW, z5, lVarA, gVar4, dVar5, function1, rVar, (i217 & 29360128) | (i217 & 14) | 196608 | (i16 & 7168) | 24576 | ((i16 << 12) & 1879048192), ((i16 >> 18) & 14) | ((i13 << 3) & 112));
            u0Var2 = u0Var3;
            gVar3 = gVar4;
            lVar2 = lVarA;
            z2 = z5;
            kVar2 = kVarW;
            dVar3 = dVar5;
        } else {
            rVar.V();
            vVar2 = vVar;
            u0Var2 = u0Var;
            lVar2 = lVar;
            mVar3 = mVar2;
            gVar3 = gVar2;
            dVar3 = dVar2;
            kVar2 = kVar;
        }
        p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.g0.e(aVar, mVar3, vVar2, u0Var2, gVar3, dVar3, kVar2, z2, lVar2, function1, i, i2);
        }
    }

    public static final void i(com.gamericefishpro.space.f5.k kVar, com.gamericefishpro.space.e1.c cVar, com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(233973821);
        if ((((rVar.h(kVar) ? 4 : 2) | i | (rVar.h(cVar) ? 32 : 16)) & 147) == 146 && rVar.E()) {
            rVar.V();
        } else {
            com.gamericefishpro.space.t0.i.b(new com.gamericefishpro.space.n.p[]{com.gamericefishpro.space.d5.a.a.a(kVar), com.gamericefishpro.space.a5.i.a.a(kVar), com.gamericefishpro.space.a6.a.a.a(kVar)}, com.gamericefishpro.space.b1.n.c(1808964477, new com.gamericefishpro.space.g5.m(1, cVar, hVar), rVar), rVar, 56);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.x(kVar, cVar, hVar, i, 1);
        }
    }

    public static final void j(boolean z, Function2 function2, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        rVar.b0(-642000585);
        if ((i & 6) == 0) {
            i2 = (rVar.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(function2) ? 32 : 16;
        }
        if (rVar.S(i2 & 1, (i2 & 19) != 18)) {
            Object objA = com.gamericefishpro.space.k5.a.a(rVar);
            if (objA == null) {
                rVar.a0(1512740606);
                objA = com.gamericefishpro.space.e.p.a(rVar);
                rVar.p(false);
            } else {
                rVar.a0(1512737723);
                rVar.p(false);
            }
            if (objA == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zF = rVar.f(objA);
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (zF || objP == fVar) {
                com.gamericefishpro.space.j5.c cVar = objA instanceof com.gamericefishpro.space.j5.c ? (com.gamericefishpro.space.j5.c) objA : null;
                com.gamericefishpro.space.tb.s sVarC = cVar != null ? cVar.c() : null;
                com.gamericefishpro.space.d.t tVar = objA instanceof com.gamericefishpro.space.d.t ? (com.gamericefishpro.space.d.t) objA : null;
                objP = new com.gamericefishpro.space.f.c(sVarC, tVar != null ? tVar.a() : null);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.f.c cVar2 = (com.gamericefishpro.space.f.c) objP;
            Object objP2 = rVar.P();
            if (objP2 == fVar) {
                objP2 = com.gamericefishpro.space.t0.i.n(kotlin.coroutines.g.d, rVar);
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) objP2;
            long j = rVar.T;
            boolean zF2 = rVar.f(cVar2) | rVar.e(j);
            Object objP3 = rVar.P();
            if (zF2 || objP3 == fVar) {
                objP3 = new com.gamericefishpro.space.e.m(xVar, new com.gamericefishpro.space.e.r(j, objA));
                rVar.k0(objP3);
            }
            com.gamericefishpro.space.e.m mVar = (com.gamericefishpro.space.e.m) objP3;
            rVar.a0(-348514256);
            boolean zH = rVar.h(mVar) | rVar.h(function2);
            Object objP4 = rVar.P();
            if (zH || objP4 == fVar) {
                objP4 = new com.gamericefishpro.space.e.e(1, mVar, function2);
                rVar.k0(objP4);
            }
            com.gamericefishpro.space.t0.i.g((Function0) objP4, rVar);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zH2 = rVar.h(mVar) | (i4 == 4);
            Object objP5 = rVar.P();
            if (zH2 || objP5 == fVar) {
                objP5 = new com.gamericefishpro.space.e.f(1, mVar, z);
                rVar.k0(objP5);
            }
            com.gamericefishpro.space.d9.h.g(boolValueOf, mVar, null, (Function1) objP5, rVar, i4);
            boolean zH3 = rVar.h(cVar2) | rVar.h(mVar);
            Object objP6 = rVar.P();
            if (zH3 || objP6 == fVar) {
                objP6 = new com.gamericefishpro.space.d0.q0(8, cVar2, mVar);
                rVar.k0(objP6);
            }
            com.gamericefishpro.space.t0.i.c(cVar2, mVar, (Function1) objP6, rVar);
            rVar.p(false);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.e.g(z, function2, i, 1);
        }
    }

    public static final void k(com.gamericefishpro.space.e1.c cVar, com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(832919318);
        int i2 = (rVar.h(cVar) ? 4 : 2) | i | (rVar.h(hVar) ? 32 : 16);
        if ((i2 & 19) == 18 && rVar.E()) {
            rVar.V();
        } else {
            Object objP = rVar.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.f5.q(9);
                rVar.k0(objP);
            }
            Function1 function1 = (Function1) objP;
            com.gamericefishpro.space.z4.y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar);
            if (y0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            com.gamericefishpro.space.ei.g modelClass = com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.g5.a.class);
            com.gamericefishpro.space.c5.e eVar = new com.gamericefishpro.space.c5.e(0);
            eVar.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.g5.a.class), function1);
            com.gamericefishpro.space.c5.d factory = eVar.c();
            com.gamericefishpro.space.c5.c defaultCreationExtras = y0VarA instanceof com.gamericefishpro.space.z4.k ? ((com.gamericefishpro.space.z4.k) y0VarA).e() : com.gamericefishpro.space.c5.a.b;
            com.gamericefishpro.space.z4.x0 store = y0VarA.f();
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            com.gamericefishpro.space.u6.i iVar = new com.gamericefishpro.space.u6.i(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            String strB = modelClass.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            com.gamericefishpro.space.g5.a aVar = (com.gamericefishpro.space.g5.a) iVar.d(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            aVar.d = new com.gamericefishpro.space.vb.c(cVar);
            cVar.a(aVar.c, hVar, rVar, ((i2 << 6) & 896) | (i2 & 112));
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 4, cVar, hVar);
        }
    }

    public static final void l(com.gamericefishpro.space.vb.c cVar, com.gamericefishpro.space.b2.m mVar, long j) {
        com.gamericefishpro.space.c2.b bVar = (com.gamericefishpro.space.c2.b) cVar.e;
        bVar.getClass();
        com.gamericefishpro.space.c2.e eVar = (com.gamericefishpro.space.c2.e) bVar.c;
        com.gamericefishpro.space.c2.e eVar2 = (com.gamericefishpro.space.c2.e) bVar.b;
        boolean zO = d5.o(mVar);
        long j2 = mVar.b;
        if (zO) {
            com.gamericefishpro.space.c2.a[] aVarArr = eVar2.d;
            com.gamericefishpro.space.ph.u.i(0, aVarArr.length, null, aVarArr);
            eVar2.e = 0;
            com.gamericefishpro.space.c2.a[] aVarArr2 = eVar.d;
            com.gamericefishpro.space.ph.u.i(0, aVarArr2.length, null, aVarArr2);
            eVar.e = 0;
            bVar.a = 0L;
        }
        if (!d5.p(mVar)) {
            List list = mVar.k;
            if (list == null) {
                list = com.gamericefishpro.space.ph.g0.d;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                com.gamericefishpro.space.b2.a aVar = (com.gamericefishpro.space.b2.a) list.get(i);
                bVar.a(aVar.a, com.gamericefishpro.space.n1.b.e(aVar.c, j));
            }
            bVar.a(j2, com.gamericefishpro.space.n1.b.e(mVar.l, j));
        }
        if (d5.p(mVar) && j2 - bVar.a > 40) {
            com.gamericefishpro.space.c2.a[] aVarArr3 = eVar2.d;
            com.gamericefishpro.space.ph.u.i(0, aVarArr3.length, null, aVarArr3);
            eVar2.e = 0;
            com.gamericefishpro.space.c2.a[] aVarArr4 = eVar.d;
            com.gamericefishpro.space.ph.u.i(0, aVarArr4.length, null, aVarArr4);
            eVar.e = 0;
            bVar.a = 0L;
        }
        bVar.a = j2;
    }

    public static final Context m(com.gamericefishpro.space.pj.a aVar) throws com.gamericefishpro.space.h3.b {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        try {
            return (Context) aVar.a(com.gamericefishpro.space.ei.b0.a(Context.class));
        } catch (com.gamericefishpro.space.gj.a unused) {
            Intrinsics.checkNotNullParameter("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", "s");
            throw new com.gamericefishpro.space.h3.b("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 3);
        }
    }

    public static void n(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final int q(com.gamericefishpro.space.c6.c cVar, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int iR = r(cVar, name);
        if (iR >= 0) {
            return iR;
        }
        int iR2 = r(cVar, "`" + name + '`');
        if (iR2 >= 0) {
            return iR2;
        }
        return -1;
    }

    public static final int r(com.gamericefishpro.space.c6.c cVar, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnCount = cVar.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (Intrinsics.a(name, cVar.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final float s(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final com.gamericefishpro.space.wh.b t(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new com.gamericefishpro.space.wh.b(entries);
    }

    public static final boolean u(long j, long j2) {
        return j == j2;
    }

    public static final com.gamericefishpro.space.m1.u v(com.gamericefishpro.space.m1.u uVar) {
        com.gamericefishpro.space.m1.u uVarF = ((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).f();
        if (uVarF == null || !uVarF.G) {
            return null;
        }
        return uVarF;
    }

    public static final com.gamericefishpro.space.n1.c w(com.gamericefishpro.space.m1.u uVar) {
        com.gamericefishpro.space.h2.f1 f1Var;
        if (uVar.G && (f1Var = uVar.A) != null) {
            com.gamericefishpro.space.f2.u uVarH = com.gamericefishpro.space.f2.x.h(f1Var);
            if (!uVarH.E()) {
                uVarH = null;
            }
            if (uVarH != null) {
                return uVar.D0(uVarH);
            }
        }
        return com.gamericefishpro.space.n1.c.e;
    }

    public static final String x() {
        Intrinsics.checkNotNullParameter(com.gamericefishpro.space.rj.a.a, "<this>");
        byte[] byteArray = new byte[16];
        com.gamericefishpro.space.oi.a.a.nextBytes(byteArray);
        Intrinsics.checkNotNullParameter(byteArray, "randomBytes");
        byte b2 = (byte) (byteArray[6] & 15);
        byteArray[6] = b2;
        byteArray[6] = (byte) (b2 | 64);
        byte b3 = (byte) (byteArray[8] & 63);
        byteArray[8] = b3;
        byteArray[8] = (byte) (b3 | 128);
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        long jU = com.gamericefishpro.space.b9.a.u(0, byteArray);
        long jU2 = com.gamericefishpro.space.b9.a.u(8, byteArray);
        return ((jU == 0 && jU2 == 0) ? com.gamericefishpro.space.oi.b.i : new com.gamericefishpro.space.oi.b(jU, jU2)).toString();
    }

    public static final com.gamericefishpro.space.u6.j y(com.gamericefishpro.space.u6.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new com.gamericefishpro.space.u6.j(pVar.a, pVar.t);
    }

    public static final com.gamericefishpro.space.m1.u z(com.gamericefishpro.space.m1.u uVar) {
        boolean z = uVar.d.G;
        if (z) {
            if (!z) {
                com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
            }
            com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
            com.gamericefishpro.space.h1.l lVar = uVar.d;
            com.gamericefishpro.space.h1.l lVar2 = lVar.y;
            if (lVar2 == null) {
                com.gamericefishpro.space.h2.k.b(eVar, lVar);
            } else {
                eVar.b(lVar2);
            }
            while (true) {
                int i = eVar.i;
                if (i == 0) {
                    break;
                }
                com.gamericefishpro.space.h1.l lVarE = (com.gamericefishpro.space.h1.l) eVar.l(i - 1);
                if ((lVarE.v & 1024) == 0) {
                    com.gamericefishpro.space.h2.k.b(eVar, lVarE);
                } else {
                    while (lVarE != null) {
                        if ((lVarE.i & 1024) != 0) {
                            com.gamericefishpro.space.v0.e eVar2 = null;
                            while (lVarE != null) {
                                if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                    com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) lVarE;
                                    if (uVar2.d.G) {
                                        int iOrdinal = uVar2.F0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return uVar2;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new com.gamericefishpro.space.oh.k();
                                        }
                                    }
                                } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                    int i2 = 0;
                                    for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                        if ((lVar3.i & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                lVarE = lVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar2.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar2.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                lVarE = com.gamericefishpro.space.h2.k.e(eVar2);
                            }
                            break;
                        }
                        lVarE = lVarE.y;
                    }
                }
            }
        }
        return null;
    }

    public abstract void B(com.gamericefishpro.space.ka.x xVar, float f, float f2);
}
