package defpackage;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yads.af0;
import yads.n62;
import yads.rw1;
import yads.t31;
import yads.uw1;
import yads.wk2;

/* loaded from: classes7.dex */
public abstract class x671 extends kr81 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kr81
    public final lu81 a(gy61[] gy61VarArr, wx71 wx71Var) {
        zu81 zu81Var;
        int i;
        boolean z;
        String str;
        boolean z2;
        wk2 wk2Var;
        boolean z3;
        int i2;
        wg71[] wg71VarArr;
        int i3;
        int i4;
        int i5;
        int i6;
        kzo kzoVar;
        int[] iArr;
        wx71 wx71Var2 = wx71Var;
        int i7 = 1;
        int[] iArr2 = new int[gy61VarArr.length + 1];
        int length = gy61VarArr.length + 1;
        tu71[][] tu71VarArr = new tu71[length][];
        int[][][] iArr3 = new int[gy61VarArr.length + 1][][];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = wx71Var2.a;
            tu71VarArr[i8] = new tu71[i9];
            iArr3[i8] = new int[i9][];
        }
        int length2 = gy61VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            iArr4[i10] = gy61VarArr[i10].k();
        }
        int i11 = 0;
        while (i11 < wx71Var2.a) {
            tu71 a = wx71Var2.a(i11);
            int i12 = a.c == 5 ? i7 : 0;
            int length3 = gy61VarArr.length;
            int i13 = i7;
            int i14 = 0;
            int i15 = 0;
            while (i14 < gy61VarArr.length) {
                gy61 gy61Var = gy61VarArr[i14];
                int i16 = i7;
                int i17 = 0;
                for (int i18 = 0; i18 < a.a; i18++) {
                    i17 = Math.max(i17, gy61Var.a(a.w[i18]) & 7);
                }
                int i19 = iArr2[i14] == 0 ? i16 : 0;
                if (i17 > i15 || (i17 == i15 && i12 != 0 && i13 == 0 && i19 != 0)) {
                    i13 = i19;
                    i15 = i17;
                    length3 = i14;
                }
                i14++;
                i7 = i16;
            }
            int i20 = i7;
            if (length3 == gy61VarArr.length) {
                iArr = new int[a.a];
            } else {
                gy61 gy61Var2 = gy61VarArr[length3];
                int[] iArr5 = new int[a.a];
                for (int i21 = 0; i21 < a.a; i21++) {
                    iArr5[i21] = gy61Var2.a(a.w[i21]);
                }
                iArr = iArr5;
            }
            int i22 = iArr2[length3];
            tu71VarArr[length3][i22] = a;
            iArr3[length3][i22] = iArr;
            iArr2[length3] = i22 + 1;
            i11++;
            wx71Var2 = wx71Var;
            i7 = i20;
        }
        int i23 = i7;
        int i24 = 7;
        wx71[] wx71VarArr = new wx71[gy61VarArr.length];
        String[] strArr = new String[gy61VarArr.length];
        int[] iArr6 = new int[gy61VarArr.length];
        for (int i25 = 0; i25 < gy61VarArr.length; i25++) {
            int i26 = iArr2[i25];
            wx71VarArr[i25] = new wx71((tu71[]) rf71.q(i26, tu71VarArr[i25]));
            iArr3[i25] = (int[][]) rf71.q(i26, iArr3[i25]);
            strArr[i25] = gy61VarArr[i25].c();
            iArr6[i25] = gy61VarArr[i25].b;
        }
        zp1 zp1Var = new zp1(iArr6, wx71VarArr, iArr4, iArr3, new wx71((tu71[]) rf71.q(iArr2[gy61VarArr.length], tu71VarArr[gy61VarArr.length])));
        ba71 ba71Var = (ba71) this;
        synchronized (ba71Var.c) {
            try {
                zu81Var = ba71Var.f;
                i = 32;
                if (zu81Var.e0 && rf71.a >= 32 && (kzoVar = ba71Var.g) != null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        throw new IllegalStateException();
                    }
                    if (((af0) kzoVar.x) == null && ((Handler) kzoVar.w) == null) {
                        kzoVar.x = new af0(ba71Var);
                        Handler handler = new Handler(myLooper);
                        kzoVar.w = handler;
                        ((Spatializer) kzoVar.c).addOnSpatializerStateChangedListener(new rlf(0, handler), (af0) kzoVar.x);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i27 = zp1Var.a;
        wg71[] wg71VarArr2 = new wg71[i27];
        int i28 = 2;
        Pair d = ba71.d(2, zp1Var, iArr3, new gs51(8, zu81Var, iArr4), new uw21(9));
        if (d != null) {
            wg71VarArr2[((Integer) d.second).intValue()] = (wg71) d.first;
        }
        int i29 = 0;
        while (true) {
            if (i29 >= zp1Var.a) {
                z = 0;
                break;
            }
            if (2 == ((int[]) zp1Var.b)[i29] && ((wx71[]) zp1Var.c)[i29].a > 0) {
                z = i23;
                break;
            }
            i29++;
        }
        Pair d2 = ba71.d(i23, zp1Var, iArr3, new f45(ba71Var, zu81Var, z), new uw21(12));
        if (d2 != null) {
            wg71VarArr2[((Integer) d2.second).intValue()] = (wg71) d2.first;
        }
        if (d2 == null) {
            str = null;
        } else {
            wg71 wg71Var = (wg71) d2.first;
            str = wg71Var.a.w[wg71Var.b[0]].c;
        }
        int i30 = 3;
        Pair d3 = ba71.d(3, zp1Var, iArr3, new gs51(i24, zu81Var, str), new uw21(8));
        if (d3 != null) {
            wg71VarArr2[((Integer) d3.second).intValue()] = (wg71) d3.first;
        }
        int i31 = 0;
        while (i31 < i27) {
            int i32 = ((int[]) zp1Var.b)[i31];
            if (i32 == i28 || i32 == 1 || i32 == i30) {
                wg71VarArr = wg71VarArr2;
                i3 = i;
                i4 = i31;
            } else {
                wx71 wx71Var3 = ((wx71[]) zp1Var.c)[i31];
                int[][] iArr7 = iArr3[i31];
                int i33 = 0;
                int i34 = 0;
                tu71 tu71Var = null;
                xo81 xo81Var = null;
                while (i33 < wx71Var3.a) {
                    tu71 a2 = wx71Var3.a(i33);
                    int[] iArr8 = iArr7[i33];
                    int i35 = i;
                    xo81 xo81Var2 = xo81Var;
                    int i36 = 0;
                    while (i36 < a2.a) {
                        wg71[] wg71VarArr3 = wg71VarArr2;
                        if (ba71.g(iArr8[i36], zu81Var.f0)) {
                            i5 = i36;
                            xo81 xo81Var3 = new xo81(iArr8[i5], a2.w[i36]);
                            if (xo81Var2 != null) {
                                i6 = i31;
                                if (u681.g(ena1.a(xo81Var3.b, xo81Var2.b)).e(xo81Var3.a, xo81Var2.a).a() <= 0) {
                                }
                            } else {
                                i6 = i31;
                            }
                            tu71Var = a2;
                            xo81Var2 = xo81Var3;
                            i34 = i5;
                        } else {
                            i5 = i36;
                            i6 = i31;
                        }
                        i36 = i5 + 1;
                        wg71VarArr2 = wg71VarArr3;
                        i31 = i6;
                    }
                    i33++;
                    i = i35;
                    xo81Var = xo81Var2;
                }
                wg71VarArr = wg71VarArr2;
                i3 = i;
                i4 = i31;
                wg71VarArr[i4] = tu71Var == null ? null : new wg71(tu71Var, new int[]{i34});
            }
            i31 = i4 + 1;
            i = i3;
            wg71VarArr2 = wg71VarArr;
            i30 = 3;
            i28 = 2;
        }
        wg71[] wg71VarArr4 = wg71VarArr2;
        int i37 = i;
        Object obj = null;
        int i38 = zp1Var.a;
        HashMap hashMap = new HashMap();
        for (int i39 = 0; i39 < i38; i39++) {
            ba71.f(((wx71[]) zp1Var.c)[i39], zu81Var, hashMap);
        }
        ba71.f((wx71) zp1Var.y, zu81Var, hashMap);
        for (int i40 = 0; i40 < i38; i40++) {
        }
        int i41 = zp1Var.a;
        for (int i42 = 0; i42 < i41; i42++) {
            wx71 wx71Var4 = ((wx71[]) zp1Var.c)[i42];
            Map map = (Map) zu81Var.i0.get(i42);
            if (map != null && map.containsKey(wx71Var4)) {
                Map map2 = (Map) zu81Var.i0.get(i42);
                if (map2 != null) {
                }
                wg71VarArr4[i42] = null;
            }
        }
        for (int i43 = 0; i43 < i27; i43++) {
            int i44 = ((int[]) zp1Var.b)[i43];
            if (zu81Var.j0.get(i43) || zu81Var.S.contains(Integer.valueOf(i44))) {
                wg71VarArr4[i43] = null;
            }
        }
        zr81 zr81Var = ba71Var.d;
        cq61 cq61Var = ba71Var.b;
        if (cq61Var == null) {
            ny61.k();
            return null;
        }
        zr81Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i45 = 0;
        while (i45 < i27) {
            wg71 wg71Var2 = wg71VarArr4[i45];
            if (wg71Var2 == null || wg71Var2.b.length <= 1) {
                arrayList.add(obj);
            } else {
                a181 a181Var = new a181();
                a181Var.d(new mo81(0L, 0L));
                arrayList.add(a181Var);
            }
            i45++;
            obj = null;
        }
        long[][] jArr = new long[i27][];
        for (int i46 = 0; i46 < i27; i46++) {
            wg71 wg71Var3 = wg71VarArr4[i46];
            if (wg71Var3 == null) {
                jArr[i46] = new long[0];
            } else {
                jArr[i46] = new long[wg71Var3.b.length];
                int i47 = 0;
                while (true) {
                    if (i47 >= wg71Var3.b.length) {
                        break;
                    }
                    jArr[i46][i47] = wg71Var3.a.w[r12[i47]].A;
                    i47++;
                }
                Arrays.sort(jArr[i46]);
            }
        }
        int[] iArr9 = new int[i27];
        long[] jArr2 = new long[i27];
        for (int i48 = 0; i48 < i27; i48++) {
            long[] jArr3 = jArr[i48];
            jArr2[i48] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        vu81.h(jArr2, arrayList);
        n62 n62Var = n62.a;
        n62Var.getClass();
        p681 p681Var = new p681(n62Var);
        ela1.a(2, "expectedValuesPerKey");
        Map a3 = p681Var.a();
        rw1 rw1Var = new rw1();
        uw1 uw1Var = new uw1();
        if (!a3.isEmpty()) {
            w511.q();
            return null;
        }
        uw1Var.w = a3;
        uw1Var.y = rw1Var;
        int i49 = 0;
        while (i49 < i27) {
            long[] jArr4 = jArr[i49];
            if (jArr4.length > 1) {
                int length4 = jArr4.length;
                double[] dArr = new double[length4];
                int i50 = 0;
                while (true) {
                    long[] jArr5 = jArr[i49];
                    double d4 = 0.0d;
                    if (i50 >= jArr5.length) {
                        break;
                    }
                    long j = jArr5[i50];
                    if (j != -1) {
                        d4 = Math.log(j);
                    }
                    dArr[i50] = d4;
                    i50++;
                }
                int i51 = length4 - 1;
                double d5 = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d6 = dArr[i52];
                    i52++;
                    long[][] jArr6 = jArr;
                    Double valueOf = Double.valueOf(d5 == 0.0d ? 1.0d : (((d6 + dArr[i52]) * 0.5d) - dArr[0]) / d5);
                    int i53 = i49;
                    Integer valueOf2 = Integer.valueOf(i53);
                    int i54 = i51;
                    Collection collection = (Collection) uw1Var.w.get(valueOf);
                    if (collection == null) {
                        List list = (List) uw1Var.y.get();
                        if (!list.add(valueOf2)) {
                            ny61.f("New Collection violated the Collection spec");
                            return null;
                        }
                        uw1Var.x++;
                        uw1Var.w.put(valueOf, list);
                    } else if (collection.add(valueOf2)) {
                        uw1Var.x++;
                    }
                    i51 = i54;
                    jArr = jArr6;
                    i49 = i53;
                }
            }
            i49++;
            jArr = jArr;
        }
        long[][] jArr7 = jArr;
        cw00 cw00Var = uw1Var.b;
        if (cw00Var == null) {
            cw00Var = new cw00(1, uw1Var);
            uw1Var.b = cw00Var;
        }
        t31 m = t31.m(cw00Var);
        for (int i55 = 0; i55 < m.size(); i55++) {
            int intValue = ((Integer) m.get(i55)).intValue();
            int i56 = iArr9[intValue] + 1;
            iArr9[intValue] = i56;
            jArr2[intValue] = jArr7[intValue][i56];
            vu81.h(jArr2, arrayList);
        }
        for (int i57 = 0; i57 < i27; i57++) {
            if (arrayList.get(i57) != null) {
                jArr2[i57] = jArr2[i57] * 2;
            }
        }
        vu81.h(jArr2, arrayList);
        a181 a181Var2 = new a181();
        for (int i58 = 0; i58 < arrayList.size(); i58++) {
            a181 a181Var3 = (a181) arrayList.get(i58);
            a181Var2.d(a181Var3 == null ? wk2.x : a181Var3.c());
        }
        wk2 c = a181Var2.c();
        gk71[] gk71VarArr = new gk71[i27];
        for (int i59 = 0; i59 < i27; i59++) {
            wg71 wg71Var4 = wg71VarArr4[i59];
            if (wg71Var4 != null) {
                int[] iArr10 = wg71Var4.b;
                if (iArr10.length != 0) {
                    int length5 = iArr10.length;
                    tu71 tu71Var2 = wg71Var4.a;
                    gk71VarArr[i59] = length5 == 1 ? new xm81(tu71Var2, new int[]{iArr10[0]}) : new vu81(tu71Var2, iArr10, cq61Var, (t31) c.get(i59));
                }
            }
        }
        v581[] v581VarArr = new v581[i27];
        for (int i60 = 0; i60 < i27; i60++) {
            v581VarArr[i60] = (zu81Var.j0.get(i60) || zu81Var.S.contains(Integer.valueOf(((int[]) zp1Var.b)[i60])) || (((int[]) zp1Var.b)[i60] != -2 && gk71VarArr[i60] == null)) ? null : v581.b;
        }
        boolean z4 = zu81Var.g0;
        char c2 = 65535;
        if (z4) {
            int i61 = -1;
            int i62 = -1;
            int i63 = 0;
            while (i63 < zp1Var.a) {
                int i64 = ((int[]) zp1Var.b)[i63];
                gk71 gk71Var = gk71VarArr[i63];
                if ((i64 == 1 || i64 == 2) && gk71Var != null) {
                    int[][] iArr11 = iArr3[i63];
                    int indexOf = ((wx71[]) zp1Var.c)[i63].b.indexOf(gk71Var.c());
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    int i65 = 0;
                    while (true) {
                        if (i65 < gk71Var.g()) {
                            i2 = i37;
                            if ((iArr11[indexOf][gk71Var.e(i65)] & 32) != i2) {
                                break;
                            }
                            i65++;
                            i37 = i2;
                        } else {
                            i2 = i37;
                            if (i64 == 1) {
                                if (i61 != -1) {
                                    z3 = false;
                                    break;
                                }
                                i61 = i63;
                            } else {
                                if (i62 != -1) {
                                    z3 = false;
                                    break;
                                }
                                i62 = i63;
                            }
                        }
                    }
                } else {
                    i2 = i37;
                }
                i63++;
                i37 = i2;
            }
            z3 = true;
            if (z3 & ((i61 == -1 || i62 == -1) ? false : true)) {
                v581 v581Var = new v581(true);
                v581VarArr[i61] = v581Var;
                v581VarArr[i62] = v581Var;
            }
        }
        Pair create = Pair.create(v581VarArr, gk71VarArr);
        gk71[] gk71VarArr2 = (gk71[]) create.second;
        List[] listArr = new List[gk71VarArr2.length];
        for (int i66 = 0; i66 < gk71VarArr2.length; i66++) {
            gk71 gk71Var2 = gk71VarArr2[i66];
            if (gk71Var2 != null) {
                wk2Var = t31.n(gk71Var2);
            } else {
                p481 p481Var = t31.b;
                wk2Var = wk2.x;
            }
            listArr[i66] = wk2Var;
        }
        a181 a181Var4 = new a181();
        for (int i67 = 0; i67 < zp1Var.a; i67++) {
            wx71 wx71Var5 = ((wx71[]) zp1Var.c)[i67];
            List list2 = listArr[i67];
            int i68 = 0;
            while (i68 < wx71Var5.a) {
                tu71 a4 = wx71Var5.a(i68);
                int[][][] iArr12 = (int[][][]) zp1Var.x;
                wx71[] wx71VarArr2 = (wx71[]) zp1Var.c;
                int i69 = wx71VarArr2[i67].a(i68).a;
                int[] iArr13 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((iArr12[i67][i68][i70] & 7) == 4) {
                        iArr13[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr13, i71);
                int i72 = 16;
                wx71 wx71Var6 = wx71Var5;
                String str2 = null;
                int i73 = 0;
                boolean z5 = false;
                int i74 = 0;
                while (i73 < copyOf.length) {
                    int[] iArr14 = copyOf;
                    String str3 = wx71VarArr2[i67].a(i68).w[copyOf[i73]].E;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str2 = str3;
                    } else {
                        z5 = (!rf71.o(str2, str3)) | z5;
                    }
                    i72 = Math.min(i72, iArr12[i67][i68][i73] & 24);
                    i73++;
                    copyOf = iArr14;
                    i74 = i75;
                }
                if (z5) {
                    i72 = Math.min(i72, ((int[]) zp1Var.w)[i67]);
                }
                boolean z6 = i72 != 0;
                int i76 = a4.a;
                int[] iArr15 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < a4.a; i77++) {
                    iArr15[i77] = ((int[][][]) zp1Var.x)[i67][i68][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list2.size()) {
                            z2 = false;
                            break;
                        }
                        gk71 gk71Var3 = (gk71) list2.get(i78);
                        if (gk71Var3.c().equals(a4) && gk71Var3.m(i77) != -1) {
                            z2 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z2;
                }
                a181Var4.d(new le81(a4, z6, iArr15, zArr));
                i68++;
                wx71Var5 = wx71Var6;
                c2 = 65535;
                listArr = listArr3;
            }
        }
        wx71 wx71Var7 = (wx71) zp1Var.y;
        for (int i79 = 0; i79 < wx71Var7.a; i79++) {
            tu71 a5 = wx71Var7.a(i79);
            int[] iArr16 = new int[a5.a];
            Arrays.fill(iArr16, 0);
            a181Var4.d(new le81(a5, false, iArr16, new boolean[a5.a]));
        }
        return new lu81((v581[]) create.first, (gk71[]) create.second, new ph81(a181Var4.c()), zp1Var);
    }
}
