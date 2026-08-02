package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.trackselection.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class ct7 {
    public static final zwj j = new al5(new mj(13));
    public z0t a;
    public yk2 b;
    public qah c;
    public final Object d = new Object();
    public final Context e;
    public final ysb f;
    public a g;
    public xs7 h;
    public dv1 i;

    public ct7(Context context, w0t w0tVar, ysb ysbVar) {
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = ysbVar;
        if (w0tVar instanceof a) {
            this.g = (a) w0tVar;
        } else {
            a aVar = a.y0;
            aVar.getClass();
            us7 us7Var = new us7(aVar);
            us7Var.e(w0tVar);
            this.g = new a(us7Var);
        }
        this.i = dv1.g;
        if (this.g.t0 && context == null) {
            vq1.n0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void b(yvs yvsVar, a aVar, HashMap hashMap) {
        for (int i = 0; i < yvsVar.a; i++) {
            s0t s0tVar = (s0t) aVar.D.get(yvsVar.a(i));
            if (s0tVar != null) {
                xvs xvsVar = s0tVar.a;
                s0t s0tVar2 = (s0t) hashMap.get(Integer.valueOf(xvsVar.c));
                if (s0tVar2 == null || (s0tVar2.b.isEmpty() && !s0tVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(xvsVar.c), s0tVar);
                }
            }
        }
    }

    public static int c(dsc dscVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(dscVar.d)) {
            return 4;
        }
        String f = f(str);
        String f2 = f(dscVar.d);
        if (f2 == null || f == null) {
            return (z && f2 == null) ? 1 : 0;
        }
        if (f2.startsWith(f) || f.startsWith(f2)) {
            return 3;
        }
        int i = dvt.a;
        return f2.split("-", 2)[0].equals(f.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean g(a aVar, int i, dsc dscVar) {
        if ((i & 3584) == 0) {
            return false;
        }
        u0t u0tVar = aVar.u;
        if (u0tVar.c && (i & 2048) == 0) {
            return false;
        }
        if (u0tVar.b) {
            boolean z = (dscVar.G == 0 && dscVar.H == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair j(int i, qah qahVar, int[][][] iArr, zs7 zs7Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        qah qahVar2 = qahVar;
        ArrayList arrayList = new ArrayList();
        int i3 = qahVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == qahVar2.b[i4]) {
                yvs yvsVar = qahVar2.c[i4];
                for (int i5 = 0; i5 < yvsVar.a; i5++) {
                    xvs a = yvsVar.a(i5);
                    qsn h = zs7Var.h(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        at7 at7Var = (at7) h.get(i7);
                        int a2 = at7Var.a();
                        if (zArr[i7] || a2 == 0) {
                            i2 = i3;
                        } else {
                            if (a2 == 1) {
                                randomAccess = yde.y(at7Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(at7Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    at7 at7Var2 = (at7) h.get(i8);
                                    int i9 = i3;
                                    if (at7Var2.a() == 2 && at7Var.b(at7Var2)) {
                                        arrayList2.add(at7Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            qahVar2 = qahVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((at7) list.get(i10)).c;
        }
        at7 at7Var3 = (at7) list.get(0);
        return Pair.create(new xsb(0, at7Var3.b, iArr2), Integer.valueOf(at7Var3.a));
    }

    public final us7 a() {
        a d = d();
        d.getClass();
        return new us7(d);
    }

    public final a d() {
        a aVar;
        synchronized (this.d) {
            aVar = this.g;
        }
        return aVar;
    }

    public final void e() {
        boolean z;
        z0t z0tVar;
        xs7 xs7Var;
        synchronized (this.d) {
            try {
                z = this.g.t0 && dvt.a >= 32 && (xs7Var = this.h) != null && xs7Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (z0tVar = this.a) == null) {
            return;
        }
        z0tVar.a();
    }

    public Pair h(qah qahVar, int[][][] iArr, a aVar, String str) {
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        String str2 = null;
        if (aVar.u.a == 2) {
            return null;
        }
        if (aVar.x && (context = this.e) != null && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
            int i = dvt.a;
            str2 = locale.toLanguageTag();
        }
        return j(3, qahVar, iArr, new u13(3, aVar, str, str2), new mj(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    public final c1t i(at2[] at2VarArr, yvs yvsVar, uvh uvhVar, sis sisVar) {
        a aVar;
        boolean z;
        String str;
        int i;
        Pair j2;
        Context context;
        xvs xvsVar;
        Pair j3;
        char c;
        boolean z2;
        qsn qsnVar;
        Object obj;
        u0t u0tVar;
        int i2;
        Object xsbVar;
        yvs yvsVar2;
        int[][] iArr;
        int[] iArr2;
        yvs yvsVar3 = yvsVar;
        int i3 = 1;
        int[] iArr3 = new int[at2VarArr.length + 1];
        int length = at2VarArr.length + 1;
        xvs[][] xvsVarArr = new xvs[length][];
        int[][][] iArr4 = new int[at2VarArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = yvsVar3.a;
            xvsVarArr[i4] = new xvs[i5];
            iArr4[i4] = new int[i5][];
        }
        int length2 = at2VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr5[i6] = at2VarArr[i6].J();
        }
        int i7 = 0;
        while (i7 < yvsVar3.a) {
            xvs a = yvsVar3.a(i7);
            int i8 = a.c == 5 ? i3 : 0;
            int length3 = at2VarArr.length;
            int i9 = i3;
            int i10 = 0;
            int i11 = 0;
            while (i10 < at2VarArr.length) {
                at2 at2Var = at2VarArr[i10];
                int i12 = 0;
                int[] iArr6 = iArr3;
                int i13 = i3;
                for (int i14 = 0; i14 < a.a; i14++) {
                    i12 = Math.max(i12, at2Var.I(a.d[i14]) & 7);
                }
                int i15 = iArr6[i10] == 0 ? i13 : 0;
                if (i12 > i11 || (i12 == i11 && i8 != 0 && i9 == 0 && i15 != 0)) {
                    i11 = i12;
                    i9 = i15;
                    length3 = i10;
                }
                i10++;
                i3 = i13;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr3;
            int i16 = i3;
            if (length3 == at2VarArr.length) {
                iArr2 = new int[a.a];
            } else {
                at2 at2Var2 = at2VarArr[length3];
                int[] iArr8 = new int[a.a];
                for (int i17 = 0; i17 < a.a; i17++) {
                    iArr8[i17] = at2Var2.I(a.d[i17]);
                }
                iArr2 = iArr8;
            }
            int i18 = iArr7[length3];
            xvsVarArr[length3][i18] = a;
            iArr4[length3][i18] = iArr2;
            iArr7[length3] = i18 + 1;
            i7++;
            yvsVar3 = yvsVar;
            i3 = i16;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        int i19 = i3;
        int i20 = 0;
        yvs[] yvsVarArr = new yvs[at2VarArr.length];
        String[] strArr = new String[at2VarArr.length];
        int[] iArr10 = new int[at2VarArr.length];
        for (int i21 = 0; i21 < at2VarArr.length; i21++) {
            int i22 = iArr9[i21];
            yvsVarArr[i21] = new yvs((xvs[]) dvt.a0(i22, xvsVarArr[i21]));
            iArr4[i21] = (int[][]) dvt.a0(i22, iArr4[i21]);
            strArr[i21] = at2VarArr[i21].k();
            iArr10[i21] = at2VarArr[i21].b;
        }
        qah qahVar = new qah(iArr10, yvsVarArr, iArr5, iArr4, new yvs((xvs[]) dvt.a0(iArr9[at2VarArr.length], xvsVarArr[at2VarArr.length])));
        synchronized (this.d) {
            aVar = this.g;
        }
        if (aVar.t0 && dvt.a >= 32 && this.h == null) {
            this.h = new xs7(this.e, this);
        }
        int i23 = qahVar.a;
        xsb[] xsbVarArr = new xsb[i23];
        int i24 = 0;
        while (true) {
            if (i24 >= qahVar.a) {
                z = 0;
                break;
            }
            if (2 == iArr10[i24] && yvsVarArr[i24].a > 0) {
                z = i19;
                break;
            }
            i24++;
        }
        Pair j4 = j(i19, qahVar, iArr4, new ps7(this, aVar, z, iArr5, 0), new mj(11));
        if (j4 != null) {
            xsbVarArr[((Integer) j4.second).intValue()] = (xsb) j4.first;
        }
        if (j4 == null) {
            str = null;
        } else {
            xsb xsbVar2 = (xsb) j4.first;
            str = xsbVar2.a.d[xsbVar2.b[0]].d;
        }
        u0t u0tVar2 = aVar.u;
        if (u0tVar2.a == 2) {
            i = 2;
            j2 = null;
        } else {
            Point B = (!aVar.k || (context = this.e) == null) ? null : dvt.B(context);
            i = 2;
            j2 = j(2, qahVar, iArr4, new os7(aVar, str, iArr5, B, 0), new mj(10));
        }
        int i25 = 4;
        if ((aVar.A || j2 == null) && u0tVar2.a != i) {
            xvsVar = null;
            j3 = j(4, qahVar, iArr4, new n(27, aVar), new mj(9));
        } else {
            xvsVar = null;
            j3 = null;
        }
        if (j3 != null) {
            xsbVarArr[((Integer) j3.second).intValue()] = (xsb) j3.first;
        } else if (j2 != null) {
            xsbVarArr[((Integer) j2.second).intValue()] = (xsb) j2.first;
        }
        Pair h = h(qahVar, iArr4, aVar, str);
        if (h != null) {
            xsbVarArr[((Integer) h.second).intValue()] = (xsb) h.first;
        }
        int i26 = 0;
        while (i26 < i23) {
            int i27 = iArr10[i26];
            if (i27 == i || i27 == 1 || i27 == 3 || i27 == i25) {
                u0tVar = u0tVar2;
                i2 = i26;
            } else {
                yvs yvsVar4 = yvsVarArr[i26];
                int[][] iArr11 = iArr4[i26];
                if (u0tVar2.a == i) {
                    u0tVar = u0tVar2;
                    i2 = i26;
                } else {
                    xvs xvsVar2 = xvsVar;
                    xvs xvsVar3 = xvsVar2;
                    int i28 = i20;
                    int i29 = i28;
                    while (i28 < yvsVar4.a) {
                        xvs a2 = yvsVar4.a(i28);
                        int[] iArr12 = iArr11[i28];
                        u0t u0tVar3 = u0tVar2;
                        int i30 = i26;
                        ts7 ts7Var = xvsVar3;
                        int i31 = i29;
                        xvs xvsVar4 = xvsVar2;
                        int i32 = i20;
                        while (i32 < a2.a) {
                            int i33 = i32;
                            if (at2.o(iArr12[i32], aVar.u0)) {
                                yvsVar2 = yvsVar4;
                                ts7 ts7Var2 = new ts7(a2.d[i33], iArr12[i33]);
                                if (ts7Var != 0) {
                                    iArr = iArr11;
                                    if (dl5.a.c(ts7Var2.b, ts7Var.b).c(ts7Var2.a, ts7Var.a).e() <= 0) {
                                    }
                                } else {
                                    iArr = iArr11;
                                }
                                ts7Var = ts7Var2;
                                xvsVar4 = a2;
                                i31 = i33;
                            } else {
                                yvsVar2 = yvsVar4;
                                iArr = iArr11;
                            }
                            i32 = i33 + 1;
                            yvsVar4 = yvsVar2;
                            iArr11 = iArr;
                            ts7Var = ts7Var;
                        }
                        i28++;
                        xvsVar2 = xvsVar4;
                        i29 = i31;
                        i26 = i30;
                        xvsVar3 = ts7Var;
                        u0tVar2 = u0tVar3;
                    }
                    u0tVar = u0tVar2;
                    i2 = i26;
                    if (xvsVar2 != null) {
                        xsbVar = new xsb(i20, xvsVar2, new int[]{i29});
                        xsbVarArr[i2] = xsbVar;
                    }
                }
                xsbVar = xvsVar;
                xsbVarArr[i2] = xsbVar;
            }
            i26 = i2 + 1;
            u0tVar2 = u0tVar;
            i20 = 0;
            i = 2;
            i25 = 4;
        }
        int i34 = qahVar.a;
        yvs[] yvsVarArr2 = qahVar.c;
        HashMap hashMap = new HashMap();
        for (int i35 = 0; i35 < i34; i35++) {
            b(yvsVarArr2[i35], aVar, hashMap);
        }
        b(qahVar.f, aVar, hashMap);
        int i36 = 0;
        while (true) {
            c = 65535;
            if (i36 >= i34) {
                break;
            }
            s0t s0tVar = (s0t) hashMap.get(Integer.valueOf(qahVar.b[i36]));
            if (s0tVar != null) {
                xvs xvsVar5 = s0tVar.a;
                yde ydeVar = s0tVar.b;
                xsbVarArr[i36] = (ydeVar.isEmpty() || yvsVarArr2[i36].b(xvsVar5) == -1) ? xvsVar : new xsb(0, xvsVar5, zc4.Y(ydeVar));
            }
            i36++;
        }
        int i37 = qahVar.a;
        for (int i38 = 0; i38 < i37; i38++) {
            yvs yvsVar5 = qahVar.c[i38];
            Map map = (Map) aVar.w0.get(i38);
            if (map != null && map.containsKey(yvsVar5)) {
                Map map2 = (Map) aVar.w0.get(i38);
                vs7 vs7Var = map2 != null ? (vs7) map2.get(yvsVar5) : xvsVar;
                if (vs7Var != 0) {
                    int[] iArr13 = vs7Var.b;
                    if (iArr13.length != 0) {
                        obj = new xsb(0, yvsVar5.a(vs7Var.a), iArr13);
                        xsbVarArr[i38] = obj;
                    }
                }
                obj = xvsVar;
                xsbVarArr[i38] = obj;
            }
        }
        for (int i39 = 0; i39 < i23; i39++) {
            int i40 = qahVar.b[i39];
            if (aVar.x0.get(i39) || aVar.E.contains(Integer.valueOf(i40))) {
                xsbVarArr[i39] = xvsVar;
            }
        }
        ysb ysbVar = this.f;
        yk2 yk2Var = this.b;
        vq1.B(yk2Var);
        zsb[] i41 = ysbVar.i(xsbVarArr, yk2Var);
        gxn[] gxnVarArr = new gxn[i23];
        for (int i42 = 0; i42 < i23; i42++) {
            gxnVarArr[i42] = (aVar.x0.get(i42) || aVar.E.contains(Integer.valueOf(qahVar.b[i42])) || (qahVar.b[i42] != -2 && i41[i42] == null)) ? xvsVar : gxn.c;
        }
        if (aVar.u.a != 0) {
            int i43 = -1;
            int i44 = 0;
            int i45 = 0;
            while (true) {
                if (i45 < qahVar.a) {
                    int i46 = qahVar.b[i45];
                    zsb zsbVar = i41[i45];
                    if (i46 != 1 && zsbVar != null) {
                        break;
                    }
                    if (i46 == 1 && zsbVar != null && zsbVar.length() == 1) {
                        if (g(aVar, iArr4[i45][qahVar.c[i45].b(zsbVar.n())][zsbVar.f(0)], zsbVar.s())) {
                            i44++;
                            i43 = i45;
                        }
                    }
                    i45++;
                } else if (i44 == 1) {
                    int i47 = aVar.u.b ? 1 : 2;
                    gxn gxnVar = gxnVarArr[i43];
                    gxnVarArr[i43] = new gxn(i47, gxnVar != 0 && gxnVar.b);
                }
            }
        }
        Pair create = Pair.create(gxnVarArr, i41);
        zsb[] zsbVarArr = (zsb[]) create.second;
        List[] listArr = new List[zsbVarArr.length];
        for (int i48 = 0; i48 < zsbVarArr.length; i48++) {
            zsb zsbVar2 = zsbVarArr[i48];
            if (zsbVar2 != null) {
                qsnVar = yde.y(zsbVar2);
            } else {
                ude udeVar = yde.b;
                qsnVar = qsn.e;
            }
            listArr[i48] = qsnVar;
        }
        tde tdeVar = new tde(4);
        int i49 = 0;
        while (true) {
            int i50 = qahVar.a;
            yvs[] yvsVarArr3 = qahVar.c;
            if (i49 >= i50) {
                break;
            }
            yvs yvsVar6 = yvsVarArr3[i49];
            List list = listArr[i49];
            int i51 = 0;
            while (i51 < yvsVar6.a) {
                xvs a3 = yvsVar6.a(i51);
                int i52 = yvsVarArr3[i49].a(i51).a;
                int[] iArr14 = new int[i52];
                int i53 = 0;
                for (int i54 = 0; i54 < i52; i54++) {
                    if ((qahVar.e[i49][i51][i54] & 7) == 4) {
                        iArr14[i53] = i54;
                        i53++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr14, i53);
                Object obj2 = xvsVar;
                List[] listArr2 = listArr;
                int i55 = 16;
                int i56 = 0;
                boolean z3 = false;
                int i57 = 0;
                while (i56 < copyOf.length) {
                    Object obj3 = yvsVarArr3[i49].a(i51).d[copyOf[i56]].n;
                    int i58 = i57 + 1;
                    if (i57 == 0) {
                        obj2 = obj3;
                    } else {
                        z3 = (!Objects.equals(obj2, obj3)) | z3;
                    }
                    i55 = Math.min(i55, qahVar.e[i49][i51][i56] & 24);
                    i56++;
                    i57 = i58;
                }
                if (z3) {
                    i55 = Math.min(i55, qahVar.d[i49]);
                }
                boolean z4 = i55 != 0;
                int i59 = a3.a;
                int[] iArr15 = new int[i59];
                boolean[] zArr = new boolean[i59];
                for (int i60 = 0; i60 < a3.a; i60++) {
                    iArr15[i60] = qahVar.e[i49][i51][i60] & 7;
                    int i61 = 0;
                    while (true) {
                        if (i61 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        zsb zsbVar3 = (zsb) list.get(i61);
                        if (zsbVar3.n().equals(a3) && zsbVar3.l(i60) != -1) {
                            z2 = true;
                            break;
                        }
                        i61++;
                    }
                    zArr[i60] = z2;
                }
                tdeVar.a(new d3t(a3, z4, iArr15, zArr));
                i51++;
                c = 65535;
                listArr = listArr2;
            }
            i49++;
        }
        yvs yvsVar7 = qahVar.f;
        for (int i62 = 0; i62 < yvsVar7.a; i62++) {
            xvs a4 = yvsVar7.a(i62);
            int[] iArr16 = new int[a4.a];
            Arrays.fill(iArr16, 0);
            tdeVar.a(new d3t(a4, false, iArr16, new boolean[a4.a]));
        }
        return new c1t((gxn[]) create.first, (zsb[]) create.second, new e3t(tdeVar.f()), qahVar);
    }

    public final void k(a aVar) {
        boolean equals;
        aVar.getClass();
        synchronized (this.d) {
            equals = this.g.equals(aVar);
            this.g = aVar;
        }
        if (equals) {
            return;
        }
        if (aVar.t0 && this.e == null) {
            vq1.n0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        z0t z0tVar = this.a;
        if (z0tVar != null) {
            z0tVar.a();
        }
    }
}
