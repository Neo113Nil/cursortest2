package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.monetization.ads.exo.source.dash.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yads.af1;
import yads.yc2;

/* loaded from: classes7.dex */
public final class qw81 implements ra71, yj61 {
    public static final Pattern Q = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern R = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final ca71 A;
    public final xi71 B;
    public final wx71 C;
    public final bu81[] D;
    public final jv71 E;
    public final yc2 F;
    public final sc81 H;
    public final cw71 I;
    public e771 J;
    public ji41 M;
    public dh81 N;
    public int O;
    public List P;
    public final int a;
    public final n881 b;
    public final mr81 c;
    public final c981 w;
    public final ll81 x;
    public final mn71 y;
    public final long z;
    public qj61[] K = new qj61[0];
    public w581[] L = new w581[0];
    public final IdentityHashMap G = new IdentityHashMap();

    public qw81(int i, dh81 dh81Var, mn71 mn71Var, int i2, n881 n881Var, mr81 mr81Var, c981 c981Var, cw71 cw71Var, ll81 ll81Var, sc81 sc81Var, long j, ca71 ca71Var, xi71 xi71Var, jv71 jv71Var, c cVar, wl61 wl61Var) {
        int i3;
        int i4;
        int[][] iArr;
        qd81[] qd81VarArr;
        ol81 b;
        this.a = i;
        this.N = dh81Var;
        this.y = mn71Var;
        this.O = i2;
        this.b = n881Var;
        this.c = mr81Var;
        this.w = c981Var;
        this.I = cw71Var;
        this.x = ll81Var;
        this.H = sc81Var;
        this.z = j;
        this.A = ca71Var;
        this.B = xi71Var;
        this.E = jv71Var;
        this.F = new yc2(dh81Var, cVar, xi71Var);
        int i5 = 0;
        qj61[] qj61VarArr = this.K;
        jv71Var.getClass();
        this.M = new ji41(21, qj61VarArr);
        ey71 ey71Var = (ey71) dh81Var.m.get(i2);
        List list = ey71Var.d;
        this.P = list;
        List list2 = ey71Var.c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(((k881) list2.get(i6)).a, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            k881 k881Var = (k881) list2.get(i7);
            List list3 = k881Var.e;
            List list4 = k881Var.f;
            ol81 b2 = b("http://dashif.org/guidelines/trickmode", list3);
            b2 = b2 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b2;
            int i8 = (b2 == null || (i8 = sparseIntArray.get(Integer.parseInt(b2.b), -1)) == -1) ? i7 : i8;
            if (i8 == i7 && (b = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = b.b;
                int i9 = rf71.a;
                for (String str2 : str.split(",", -1)) {
                    int i10 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i10 != -1) {
                        i8 = Math.min(i8, i10);
                    }
                }
            }
            if (i8 != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(i8);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] f = aka1.f((Collection) arrayList.get(i11));
            iArr2[i11] = f;
            Arrays.sort(f);
        }
        boolean[] zArr = new boolean[size2];
        qd81[][] qd81VarArr2 = new qd81[size2][];
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            int[] iArr3 = iArr2[i12];
            int length = iArr3.length;
            int i14 = i5;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                List list7 = ((k881) list2.get(iArr3[i14])).c;
                for (int i15 = i5; i15 < list7.size(); i15++) {
                    if (!((x281) list7.get(i15)).w.isEmpty()) {
                        zArr[i12] = true;
                        i13++;
                        break;
                    }
                }
                i14++;
                i5 = 0;
            }
            int[] iArr4 = iArr2[i12];
            int length2 = iArr4.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    iArr = iArr2;
                    qd81VarArr = new qd81[0];
                    break;
                }
                int i17 = iArr4[i16];
                k881 k881Var2 = (k881) list2.get(i17);
                List list8 = ((k881) list2.get(i17)).d;
                int i18 = 0;
                while (i18 < list8.size()) {
                    ol81 ol81Var = (ol81) list8.get(i18);
                    int[] iArr5 = iArr4;
                    iArr = iArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ol81Var.a)) {
                        da81 da81Var = new da81();
                        da81Var.k = "application/cea-608";
                        da81Var.a = oyr.m(k881Var2.a, ":cea608", new StringBuilder());
                        qd81VarArr = c(ol81Var, Q, new qd81(da81Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(ol81Var.a)) {
                        da81 da81Var2 = new da81();
                        da81Var2.k = "application/cea-708";
                        da81Var2.a = oyr.m(k881Var2.a, ":cea708", new StringBuilder());
                        qd81VarArr = c(ol81Var, R, new qd81(da81Var2));
                        break;
                    }
                    i18++;
                    iArr4 = iArr5;
                    iArr2 = iArr;
                }
                i16++;
            }
            qd81VarArr2[i12] = qd81VarArr;
            if (qd81VarArr.length != 0) {
                i13++;
            }
            i12++;
            iArr2 = iArr;
            i5 = 0;
        }
        int[][] iArr6 = iArr2;
        int size3 = list.size() + i13 + size2;
        tu71[] tu71VarArr = new tu71[size3];
        bu81[] bu81VarArr = new bu81[size3];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr7 = iArr6[i19];
            ArrayList arrayList3 = new ArrayList();
            for (int i21 : iArr7) {
                arrayList3.addAll(((k881) list2.get(i21)).c);
            }
            int size4 = arrayList3.size();
            qd81[] qd81VarArr3 = new qd81[size4];
            int i22 = 0;
            while (i22 < size4) {
                int i23 = size2;
                qd81 qd81Var = ((x281) arrayList3.get(i22)).a;
                ((r281) c981Var).getClass();
                boolean[] zArr2 = zArr;
                int i24 = qd81Var.H != null ? 1 : 0;
                qd81[][] qd81VarArr4 = qd81VarArr2;
                da81 da81Var3 = new da81(qd81Var);
                da81Var3.D = i24;
                qd81VarArr3[i22] = new qd81(da81Var3);
                i22++;
                size2 = i23;
                qd81VarArr2 = qd81VarArr4;
                zArr = zArr2;
            }
            int i25 = size2;
            boolean[] zArr3 = zArr;
            qd81[][] qd81VarArr5 = qd81VarArr2;
            k881 k881Var3 = (k881) list2.get(iArr7[0]);
            int i26 = k881Var3.a;
            String num = i26 != -1 ? Integer.toString(i26) : q8a1.c(i19, "unset:");
            int i27 = i20 + 1;
            if (zArr3[i19]) {
                i3 = i27;
                i27 = i20 + 2;
            } else {
                i3 = -1;
            }
            if (qd81VarArr5[i19].length != 0) {
                i4 = i27 + 1;
            } else {
                i4 = i27;
                i27 = -1;
            }
            tu71VarArr[i20] = new tu71(num, qd81VarArr3);
            int i28 = i27;
            int i29 = i20;
            int i30 = i3;
            bu81VarArr[i29] = new bu81(k881Var3.b, 0, iArr7, i29, i30, i28, -1);
            int i31 = -1;
            if (i30 != -1) {
                String j2 = b64.j(num, ":emsg");
                da81 da81Var4 = new da81();
                da81Var4.a = j2;
                da81Var4.k = "application/x-emsg";
                tu71VarArr[i30] = new tu71(j2, new qd81(da81Var4));
                bu81VarArr[i30] = new bu81(5, 1, iArr7, i29, -1, -1, -1);
                i31 = -1;
            }
            if (i28 != i31) {
                tu71VarArr[i28] = new tu71(b64.j(num, ":cc"), qd81VarArr5[i19]);
                bu81VarArr[i28] = new bu81(3, 1, iArr7, i29, -1, -1, -1);
            }
            i19++;
            size2 = i25;
            qd81VarArr2 = qd81VarArr5;
            i20 = i4;
            zArr = zArr3;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            i981 i981Var = (i981) list.get(i32);
            da81 da81Var5 = new da81();
            StringBuilder sb = new StringBuilder();
            String str3 = i981Var.c;
            String str4 = i981Var.d;
            da81Var5.a = unr0.r(sb, str3, "/", str4);
            da81Var5.k = "application/x-emsg";
            qd81 qd81Var2 = new qd81(da81Var5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i981Var.c + "/" + str4);
            tu71VarArr[i20] = new tu71(unr0.m(i32, ":", sb2), qd81Var2);
            bu81VarArr[i20] = new bu81(5, 2, new int[0], -1, -1, -1, i32);
            i32++;
            i20++;
        }
        Pair create = Pair.create(new wx71(tu71VarArr), bu81VarArr);
        this.C = (wx71) create.first;
        this.D = (bu81[]) create.second;
    }

    public static ol81 b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ol81 ol81Var = (ol81) list.get(i);
            if (str.equals(ol81Var.a)) {
                return ol81Var;
            }
        }
        return null;
    }

    public static qd81[] c(ol81 ol81Var, Pattern pattern, qd81 qd81Var) {
        String str = ol81Var.b;
        if (str == null) {
            return new qd81[]{qd81Var};
        }
        int i = rf71.a;
        String[] split = str.split(";", -1);
        qd81[] qd81VarArr = new qd81[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new qd81[]{qd81Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            da81 da81Var = new da81(qd81Var);
            da81Var.a = qd81Var.a + ":" + parseInt;
            da81Var.C = parseInt;
            da81Var.c = matcher.group(2);
            qd81VarArr[i2] = new qd81(da81Var);
        }
        return qd81VarArr;
    }

    @Override // defpackage.ra71
    public final long D(long j, lb71 lb71Var) {
        long j2;
        long j3;
        long j4 = j;
        qj61[] qj61VarArr = this.K;
        int length = qj61VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            qj61 qj61Var = qj61VarArr[i2];
            if (qj61Var.a == 2) {
                sj8[] sj8VarArr = qj61Var.x.i;
                int length2 = sj8VarArr.length;
                while (i < length2) {
                    sj8 sj8Var = sj8VarArr[i];
                    ng61 ng61Var = (ng61) sj8Var.y;
                    long j5 = sj8Var.a;
                    long j6 = sj8Var.b;
                    if (ng61Var != null) {
                        long c = ng61Var.c(j4, j5) + j6;
                        long a = ng61Var.a(c - j6);
                        long k = ng61Var.k(j5);
                        if (a >= j4 || (k != -1 && c >= ((ng61Var.b() + j6) + k) - 1)) {
                            j2 = a;
                            j3 = j2;
                        } else {
                            j3 = ng61Var.a((c + 1) - j6);
                            j2 = a;
                        }
                        return lb71Var.a(j4, j2, j3);
                    }
                    i++;
                    j4 = j;
                }
            } else {
                i2++;
                j4 = j;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ra71
    public final long J(gk71[] gk71VarArr, boolean[] zArr, dg81[] dg81VarArr, boolean[] zArr2, long j) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        boolean z;
        int i6;
        tu71 tu71Var;
        tu71 tu71Var2;
        int i7;
        ds81 ds81Var;
        int i8;
        int length = gk71VarArr.length;
        int[] iArr2 = new int[length];
        int i9 = 0;
        while (true) {
            if (i9 >= gk71VarArr.length) {
                break;
            }
            gk71 gk71Var = gk71VarArr[i9];
            if (gk71Var != null) {
                int indexOf = this.C.b.indexOf(gk71Var.c());
                iArr2[i9] = indexOf >= 0 ? indexOf : -1;
            } else {
                iArr2[i9] = -1;
            }
            i9++;
        }
        for (int i10 = 0; i10 < gk71VarArr.length; i10++) {
            if (gk71VarArr[i10] == null || !zArr[i10]) {
                dg81 dg81Var = dg81VarArr[i10];
                if (dg81Var instanceof qj61) {
                    qj61 qj61Var = (qj61) dg81Var;
                    qj61Var.K = this;
                    ed81 ed81Var = qj61Var.F;
                    ed81Var.g();
                    ed81Var.r();
                    for (ed81 ed81Var2 : qj61Var.G) {
                        ed81Var2.g();
                        ed81Var2.r();
                    }
                    qj61Var.B.d(qj61Var);
                } else if (dg81Var instanceof t291) {
                    t291 t291Var = (t291) dg81Var;
                    boolean[] zArr3 = t291Var.x.w;
                    int i11 = t291Var.c;
                    if (!zArr3[i11]) {
                        ny61.k();
                        return 0L;
                    }
                    zArr3[i11] = false;
                }
                dg81VarArr[i10] = null;
            }
        }
        int i12 = 0;
        while (true) {
            boolean z2 = true;
            boolean z3 = true;
            if (i12 >= gk71VarArr.length) {
                int i13 = 0;
                while (i13 < gk71VarArr.length) {
                    gk71 gk71Var2 = gk71VarArr[i13];
                    if (gk71Var2 == null) {
                        iArr = iArr2;
                        i4 = i13;
                        i5 = length;
                        z = z2 ? 1 : 0;
                    } else {
                        dg81 dg81Var2 = dg81VarArr[i13];
                        if (dg81Var2 == null) {
                            zArr2[i13] = z2;
                            bu81 bu81Var = this.D[iArr2[i13]];
                            int i14 = bu81Var.c;
                            if (i14 == 0) {
                                int i15 = bu81Var.f;
                                boolean z4 = i15 != i ? z2 ? 1 : 0 : false;
                                if (z4) {
                                    tu71Var = this.C.a(i15);
                                    i6 = z2 ? 1 : 0;
                                } else {
                                    i6 = 0;
                                    tu71Var = null;
                                }
                                int i16 = bu81Var.g;
                                Object[] objArr = i16 != i ? z2 ? 1 : 0 : false;
                                if (objArr == true) {
                                    tu71Var2 = this.C.a(i16);
                                    i6 += tu71Var2.a;
                                } else {
                                    tu71Var2 = null;
                                }
                                qd81[] qd81VarArr = new qd81[i6];
                                int[] iArr3 = new int[i6];
                                if (z4) {
                                    qd81VarArr[0] = tu71Var.w[0];
                                    iArr3[0] = 5;
                                    i7 = z2 ? 1 : 0;
                                } else {
                                    i7 = 0;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (objArr != false) {
                                    for (int i17 = 0; i17 < tu71Var2.a; i17++) {
                                        qd81 qd81Var = tu71Var2.w[i17];
                                        qd81VarArr[i7] = qd81Var;
                                        iArr3[i7] = 3;
                                        arrayList.add(qd81Var);
                                        i7 += z2 ? 1 : 0;
                                    }
                                }
                                if (this.N.d && z4) {
                                    yc2 yc2Var = this.F;
                                    ds81Var = new ds81(yc2Var, yc2Var.b);
                                } else {
                                    ds81Var = null;
                                }
                                n881 n881Var = this.b;
                                ca71 ca71Var = this.A;
                                dh81 dh81Var = this.N;
                                mn71 mn71Var = this.y;
                                int i18 = this.O;
                                int[] iArr4 = bu81Var.a;
                                iArr = iArr2;
                                int i19 = bu81Var.b;
                                i4 = i13;
                                long j2 = this.z;
                                mr81 mr81Var = this.c;
                                u871 a = n881Var.a.a();
                                if (mr81Var != null) {
                                    a.S(mr81Var);
                                }
                                ds81 ds81Var2 = ds81Var;
                                i5 = length;
                                z = true;
                                qj61 qj61Var2 = new qj61(bu81Var.b, iArr3, qd81VarArr, new di81(n881Var.c, ca71Var, dh81Var, mn71Var, i18, iArr4, gk71Var2, i19, a, j2, n881Var.b, z4, arrayList, ds81Var), this, this.B, j, this.w, this.I, this.x, this.H);
                                synchronized (this) {
                                    this.G.put(qj61Var2, ds81Var2);
                                }
                                dg81VarArr[i4] = qj61Var2;
                            } else {
                                iArr = iArr2;
                                i4 = i13;
                                i5 = length;
                                z = z2 ? 1 : 0;
                                if (i14 == 2) {
                                    dg81VarArr[i4] = new w581((i981) this.P.get(bu81Var.d), gk71Var2.c().w[0], this.N.d);
                                }
                            }
                        } else {
                            iArr = iArr2;
                            i4 = i13;
                            i5 = length;
                            z = z2 ? 1 : 0;
                            if (dg81Var2 instanceof qj61) {
                                ((qj61) dg81Var2).x.j = gk71Var2;
                            }
                        }
                    }
                    i13 = i4 + 1;
                    z2 = z;
                    length = i5;
                    iArr2 = iArr;
                    i = -1;
                }
                int[] iArr5 = iArr2;
                int i20 = length;
                boolean z5 = z2 ? 1 : 0;
                int i21 = 0;
                while (i21 < gk71VarArr.length) {
                    if (dg81VarArr[i21] == null && gk71VarArr[i21] != null) {
                        int i22 = iArr5[i21];
                        bu81 bu81Var2 = this.D[i22];
                        if (bu81Var2.c == z5) {
                            if (i22 != -1) {
                                int i23 = bu81Var2.e;
                                i3 = 0;
                                i2 = i20;
                                while (i3 < i2) {
                                    int i24 = iArr5[i3];
                                    if (i24 == i23 && this.D[i24].c == 0) {
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                i2 = i20;
                            }
                            i3 = -1;
                            if (i3 == -1) {
                                dg81VarArr[i21] = new t581();
                            } else {
                                qj61 qj61Var3 = (qj61) dg81VarArr[i3];
                                int i25 = bu81Var2.b;
                                int i26 = 0;
                                while (true) {
                                    ed81[] ed81VarArr = qj61Var3.G;
                                    if (i26 >= ed81VarArr.length) {
                                        ny61.k();
                                        return 0L;
                                    }
                                    if (qj61Var3.b[i26] == i25) {
                                        boolean[] zArr4 = qj61Var3.w;
                                        if (zArr4[i26]) {
                                            ny61.k();
                                            return 0L;
                                        }
                                        zArr4[i26] = z5;
                                        ed81VarArr[i26].p(j, z5);
                                        dg81VarArr[i21] = new t291(qj61Var3, qj61Var3, qj61Var3.G[i26], i26);
                                    } else {
                                        i26++;
                                    }
                                }
                            }
                            i21++;
                            i20 = i2;
                        }
                    }
                    i2 = i20;
                    i21++;
                    i20 = i2;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (dg81 dg81Var3 : dg81VarArr) {
                    if (dg81Var3 instanceof qj61) {
                        arrayList2.add((qj61) dg81Var3);
                    } else if (dg81Var3 instanceof w581) {
                        arrayList3.add((w581) dg81Var3);
                    }
                }
                qj61[] qj61VarArr = new qj61[arrayList2.size()];
                this.K = qj61VarArr;
                arrayList2.toArray(qj61VarArr);
                w581[] w581VarArr = new w581[arrayList3.size()];
                this.L = w581VarArr;
                arrayList3.toArray(w581VarArr);
                jv71 jv71Var = this.E;
                qj61[] qj61VarArr2 = this.K;
                jv71Var.getClass();
                this.M = new ji41(21, qj61VarArr2);
                return j;
            }
            dg81 dg81Var4 = dg81VarArr[i12];
            if ((dg81Var4 instanceof t581) || (dg81Var4 instanceof t291)) {
                int i27 = iArr2[i12];
                if (i27 != -1) {
                    int i28 = this.D[i27].e;
                    i8 = 0;
                    while (i8 < length) {
                        int i29 = iArr2[i8];
                        if (i29 == i28 && this.D[i29].c == 0) {
                            break;
                        }
                        i8++;
                    }
                }
                i8 = -1;
                if (i8 == -1) {
                    z3 = dg81VarArr[i12] instanceof t581;
                } else {
                    dg81 dg81Var5 = dg81VarArr[i12];
                    if (!(dg81Var5 instanceof t291) || ((t291) dg81Var5).a != dg81VarArr[i8]) {
                        z3 = false;
                    }
                }
                if (z3) {
                    continue;
                } else {
                    dg81 dg81Var6 = dg81VarArr[i12];
                    if (dg81Var6 instanceof t291) {
                        t291 t291Var2 = (t291) dg81Var6;
                        boolean[] zArr5 = t291Var2.x.w;
                        int i30 = t291Var2.c;
                        if (!zArr5[i30]) {
                            ny61.k();
                            return 0L;
                        }
                        zArr5[i30] = false;
                    }
                    dg81VarArr[i12] = null;
                }
            }
            i12++;
        }
    }

    @Override // defpackage.ra71
    public final void a(long j) {
        long j2;
        for (qj61 qj61Var : this.K) {
            if (!qj61Var.n()) {
                ed81 ed81Var = qj61Var.F;
                int i = ed81Var.p;
                ed81Var.h(j, true);
                ed81 ed81Var2 = qj61Var.F;
                int i2 = ed81Var2.p;
                if (i2 > i) {
                    synchronized (ed81Var2) {
                        j2 = ed81Var2.o == 0 ? Long.MIN_VALUE : ed81Var2.m[ed81Var2.q];
                    }
                    int i3 = 0;
                    while (true) {
                        ed81[] ed81VarArr = qj61Var.G;
                        if (i3 >= ed81VarArr.length) {
                            break;
                        }
                        ed81VarArr[i3].h(j2, qj61Var.w[i3]);
                        i3++;
                    }
                }
                int min = Math.min(qj61Var.c(i2, 0), qj61Var.N);
                if (min > 0) {
                    ArrayList arrayList = qj61Var.D;
                    int i4 = rf71.a;
                    if (min > arrayList.size() || min < 0) {
                        w511.q();
                        return;
                    } else {
                        if (min != 0) {
                            arrayList.subList(0, min).clear();
                        }
                        qj61Var.N -= min;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.yj61
    public final void a(sn61 sn61Var) {
        throw null;
    }

    @Override // defpackage.ra71
    public final long e(long j) {
        lm81 lm81Var;
        boolean p;
        for (qj61 qj61Var : this.K) {
            qj61Var.M = j;
            if (qj61Var.n()) {
                qj61Var.L = j;
            } else {
                for (int i = 0; i < qj61Var.D.size(); i++) {
                    lm81Var = (lm81) qj61Var.D.get(i);
                    long j2 = lm81Var.g;
                    if (j2 == j && lm81Var.k == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                }
                lm81Var = null;
                ed81 ed81Var = qj61Var.F;
                if (lm81Var != null) {
                    int a = lm81Var.a(0);
                    synchronized (ed81Var) {
                        synchronized (ed81Var) {
                            ed81Var.r = 0;
                            f381 f381Var = ed81Var.a;
                            f381Var.x = (zer) f381Var.w;
                        }
                    }
                    int i2 = ed81Var.p;
                    if (a >= i2 && a <= ed81Var.o + i2) {
                        ed81Var.s = Long.MIN_VALUE;
                        ed81Var.r = a - i2;
                        p = true;
                    }
                    p = false;
                } else {
                    p = ed81Var.p(j, j < qj61Var.i());
                }
                if (p) {
                    ed81 ed81Var2 = qj61Var.F;
                    qj61Var.N = qj61Var.c(ed81Var2.p + ed81Var2.r, 0);
                    ed81[] ed81VarArr = qj61Var.G;
                    for (ed81 ed81Var3 : ed81VarArr) {
                        ed81Var3.p(j, true);
                    }
                } else {
                    qj61Var.L = j;
                    qj61Var.P = false;
                    qj61Var.D.clear();
                    qj61Var.N = 0;
                    if (qj61Var.B.e()) {
                        qj61Var.F.g();
                        for (ed81 ed81Var4 : qj61Var.G) {
                            ed81Var4.g();
                        }
                        af1 af1Var = qj61Var.B.b;
                        if (af1Var == null) {
                            ny61.k();
                            return 0L;
                        }
                        af1Var.a(false);
                    } else {
                        qj61Var.B.c = null;
                        qj61Var.F.n(false);
                        for (ed81 ed81Var5 : qj61Var.G) {
                            ed81Var5.n(false);
                        }
                    }
                }
            }
        }
        for (w581 w581Var : this.L) {
            int f = rf71.f(w581Var.c, j, true);
            w581Var.z = f;
            w581Var.A = (w581Var.w && f == w581Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.ra71
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.sn61
    public final long g() {
        return this.M.g();
    }

    @Override // defpackage.ra71
    public final wx71 getTrackGroups() {
        return this.C;
    }

    @Override // defpackage.sn61
    public final void h(long j) {
        this.M.h(j);
    }

    @Override // defpackage.sn61
    public final long i() {
        return this.M.i();
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        return this.M.isLoading();
    }

    @Override // defpackage.ra71
    public final void j() {
        this.A.a();
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        return this.M.k(j);
    }

    @Override // defpackage.ra71
    public final void x(e771 e771Var, long j) {
        this.J = e771Var;
        e771Var.a((ra71) this);
    }
}
