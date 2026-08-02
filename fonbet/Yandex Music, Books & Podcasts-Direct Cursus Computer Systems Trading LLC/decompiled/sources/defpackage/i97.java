package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i97 implements woh, zgp {
    public static final Pattern A = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int a;
    public final b97 b;
    public final t6t c;
    public final gra d;
    public final xeg e;
    public final kkp f;
    public final long g;
    public final ogg h;
    public final zi7 i;
    public final yvs j;
    public final h97[] k;
    public final rwd l;
    public final qcl m;
    public final x0 o;
    public final cra p;
    public final ndl q;
    public voh r;
    public qr5 u;
    public d97 v;
    public int w;
    public List x;
    public long z;
    public boolean y = true;
    public wk4[] s = new wk4[0];
    public xib[] t = new xib[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public i97(int i, d97 d97Var, kkp kkpVar, int i2, b97 b97Var, t6t t6tVar, gra graVar, cra craVar, xeg xegVar, x0 x0Var, long j, ogg oggVar, zi7 zi7Var, rwd rwdVar, znk znkVar, ndl ndlVar) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        dsc[][] dscVarArr;
        dsc[] dscVarArr2;
        iy7 d;
        int i5;
        HashMap hashMap;
        String[] strArr;
        Integer num;
        this.a = i;
        this.v = d97Var;
        this.f = kkpVar;
        this.w = i2;
        this.b = b97Var;
        this.c = t6tVar;
        this.d = graVar;
        this.p = craVar;
        this.e = xegVar;
        this.o = x0Var;
        this.g = j;
        this.h = oggVar;
        this.i = zi7Var;
        this.l = rwdVar;
        this.q = ndlVar;
        boolean z = true;
        this.m = new qcl(d97Var, znkVar, zi7Var);
        int i6 = 0;
        rwdVar.getClass();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        this.u = new qr5(qsnVar, qsnVar);
        pkk b = d97Var.b(i2);
        List list = b.d;
        this.x = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap I = gdg.I(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            I.put(Long.valueOf(((nj) list2.get(i7)).a), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        int i8 = 0;
        while (i8 < size) {
            nj njVar = (nj) list2.get(i8);
            List list3 = njVar.e;
            List list4 = njVar.f;
            boolean z2 = z;
            iy7 d2 = d("http://dashif.org/guidelines/trickmode", list3);
            d2 = d2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d2;
            int intValue = (d2 == null || (num = (Integer) I.get(Long.valueOf(Long.parseLong(d2.b)))) == null) ? i8 : num.intValue();
            if (intValue == i8 && (d = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d.b;
                int i9 = dvt.a;
                String[] split = str.split(StringUtils.COMMA, -1);
                int length = split.length;
                int i10 = i6;
                while (i10 < length) {
                    Integer num2 = (Integer) I.get(Long.valueOf(Long.parseLong(split[i10])));
                    if (num2 != null) {
                        nj njVar2 = (nj) list2.get(num2.intValue());
                        i5 = size;
                        int i11 = njVar.b;
                        hashMap = I;
                        List list5 = njVar.c;
                        strArr = split;
                        int i12 = njVar2.b;
                        List list6 = njVar2.c;
                        if (i11 == i12) {
                            if (!list5.isEmpty() && !list6.isEmpty()) {
                                dsc dscVar = ((a0o) list5.get(0)).a;
                                dsc dscVar2 = ((a0o) list6.get(0)).a;
                                if (Objects.equals(dscVar.d, dscVar2.d)) {
                                    if (dscVar.f != dscVar2.f) {
                                    }
                                }
                            }
                            intValue = Math.min(intValue, num2.intValue());
                        }
                    } else {
                        i5 = size;
                        hashMap = I;
                        strArr = split;
                    }
                    i10++;
                    size = i5;
                    I = hashMap;
                    split = strArr;
                }
            }
            int i13 = size;
            HashMap hashMap2 = I;
            if (intValue != i8) {
                List list7 = (List) sparseArray.get(i8);
                List list8 = (List) sparseArray.get(intValue);
                list8.addAll(list7);
                sparseArray.put(i8, list8);
                arrayList.remove(list7);
            }
            i8++;
            z = z2;
            size = i13;
            I = hashMap2;
            i6 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] Y = zc4.Y((Collection) arrayList.get(i14));
            iArr2[i14] = Y;
            Arrays.sort(Y);
        }
        boolean[] zArr2 = new boolean[size2];
        dsc[][] dscVarArr3 = new dsc[size2][];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr3 = iArr2[i15];
            int length2 = iArr3.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list9 = ((nj) list2.get(iArr3[i17])).c;
                iArr = iArr2;
                for (int i18 = 0; i18 < list9.size(); i18++) {
                    if (!((a0o) list9.get(i18)).d.isEmpty()) {
                        zArr2[i15] = z3;
                        i16++;
                        break;
                    }
                }
                i17++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i15];
            int length3 = iArr4.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length3) {
                    zArr = zArr2;
                    dscVarArr = dscVarArr3;
                    dscVarArr2 = new dsc[0];
                    break;
                }
                int i20 = iArr4[i19];
                nj njVar3 = (nj) list2.get(i20);
                List list10 = ((nj) list2.get(i20)).d;
                int[] iArr5 = iArr4;
                int i21 = 0;
                while (i21 < list10.size()) {
                    iy7 iy7Var = (iy7) list10.get(i21);
                    zArr = zArr2;
                    dscVarArr = dscVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(iy7Var.a)) {
                        bsc bscVar = new bsc();
                        bscVar.m = l5i.p("application/cea-608");
                        bscVar.a = hrg.m(njVar3.a, ":cea608", new StringBuilder());
                        dscVarArr2 = o(iy7Var, A, new dsc(bscVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(iy7Var.a)) {
                        bsc bscVar2 = new bsc();
                        bscVar2.m = l5i.p("application/cea-708");
                        bscVar2.a = hrg.m(njVar3.a, ":cea708", new StringBuilder());
                        dscVarArr2 = o(iy7Var, B, new dsc(bscVar2));
                        break;
                    }
                    i21++;
                    dscVarArr3 = dscVarArr;
                    zArr2 = zArr;
                }
                i19++;
                iArr4 = iArr5;
            }
            dscVarArr[i15] = dscVarArr2;
            if (dscVarArr2.length != 0) {
                i16++;
            }
            i15++;
            dscVarArr3 = dscVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        dsc[][] dscVarArr4 = dscVarArr3;
        int size3 = list.size() + i16 + size2;
        xvs[] xvsVarArr = new xvs[size3];
        h97[] h97VarArr = new h97[size3];
        int i22 = 0;
        int i23 = 0;
        while (i22 < size2) {
            int[] iArr7 = iArr6[i22];
            ArrayList arrayList3 = new ArrayList();
            for (int i24 : iArr7) {
                arrayList3.addAll(((nj) list2.get(i24)).c);
            }
            int size4 = arrayList3.size();
            dsc[] dscVarArr5 = new dsc[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size2;
                dsc dscVar3 = ((a0o) arrayList3.get(i25)).a;
                int i27 = i23;
                bsc a = dscVar3.a();
                a.L = graVar.t(dscVar3);
                dscVarArr5[i25] = new dsc(a);
                i25++;
                size2 = i26;
                i23 = i27;
            }
            int i28 = size2;
            int i29 = i23;
            nj njVar4 = (nj) list2.get(iArr7[0]);
            long j2 = njVar4.a;
            String l = j2 != -1 ? Long.toString(j2) : k5r.i(i22, "unset:");
            int i30 = i29 + 1;
            if (zArr3[i22]) {
                i3 = i29 + 2;
            } else {
                i3 = i30;
                i30 = -1;
            }
            if (dscVarArr4[i22].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List list11 = list2;
            int i31 = 0;
            while (i31 < size4) {
                int i32 = i31;
                dscVarArr5[i32] = b97Var.l(dscVarArr5[i32]);
                i31 = i32 + 1;
            }
            xvsVarArr[i29] = new xvs(l, dscVarArr5);
            int i33 = njVar4.b;
            ude udeVar2 = yde.b;
            qsn qsnVar2 = qsn.e;
            h97 h97Var = new h97(i33, 0, iArr7, i29, i30, i3, -1, qsnVar2);
            int i34 = i29;
            h97VarArr[i34] = h97Var;
            int i35 = -1;
            if (i30 != -1) {
                String n = ouj.n(l, ":emsg");
                bsc bscVar3 = new bsc();
                bscVar3.a = n;
                bscVar3.m = l5i.p("application/x-emsg");
                xvsVarArr[i30] = new xvs(n, new dsc(bscVar3));
                h97 h97Var2 = new h97(5, 1, iArr7, i34, -1, -1, -1, qsnVar2);
                i34 = i34;
                h97VarArr[i30] = h97Var2;
                i35 = -1;
            }
            if (i3 != i35) {
                String n2 = ouj.n(l, ":cc");
                h97VarArr[i3] = new h97(3, 1, iArr7, i34, -1, -1, -1, yde.w(dscVarArr4[i22]));
                dsc[] dscVarArr6 = dscVarArr4[i22];
                for (int i36 = 0; i36 < dscVarArr6.length; i36++) {
                    dscVarArr6[i36] = b97Var.l(dscVarArr6[i36]);
                }
                xvsVarArr[i3] = new xvs(n2, dscVarArr4[i22]);
            }
            i22++;
            size2 = i28;
            i23 = i4;
            list2 = list11;
        }
        int i37 = 0;
        while (i37 < list.size()) {
            zib zibVar = (zib) list.get(i37);
            bsc bscVar4 = new bsc();
            bscVar4.a = zibVar.a();
            bscVar4.m = l5i.p("application/x-emsg");
            xvsVarArr[i23] = new xvs(zibVar.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i37, new dsc(bscVar4));
            ude udeVar3 = yde.b;
            h97VarArr[i23] = new h97(5, 2, new int[0], -1, -1, -1, i37, qsn.e);
            i37++;
            i23++;
        }
        Pair create = Pair.create(new yvs(xvsVarArr), h97VarArr);
        this.j = (yvs) create.first;
        this.k = (h97[]) create.second;
    }

    public static iy7 d(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            iy7 iy7Var = (iy7) list.get(i);
            if (str.equals(iy7Var.a)) {
                return iy7Var;
            }
        }
        return null;
    }

    public static dsc[] o(iy7 iy7Var, Pattern pattern, dsc dscVar) {
        String str = iy7Var.b;
        if (str == null) {
            return new dsc[]{dscVar};
        }
        int i = dvt.a;
        String[] split = str.split(";", -1);
        dsc[] dscVarArr = new dsc[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new dsc[]{dscVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            bsc a = dscVar.a();
            a.a = dscVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + parseInt;
            a.H = parseInt;
            a.d = matcher.group(2);
            dscVarArr[i2] = new dsc(a);
        }
        return dscVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16, types: [b97] */
    /* JADX WARN: Type inference failed for: r9v10, types: [yde] */
    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        xvs xvsVar;
        qsn qsnVar;
        int i5;
        pcl pclVar;
        boolean z2;
        int[] iArr3 = new int[zsbVarArr.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= zsbVarArr.length) {
                break;
            }
            zsb zsbVar = zsbVarArr[i7];
            if (zsbVar != null) {
                iArr3[i7] = this.j.b(zsbVar.n());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < zsbVarArr.length; i8++) {
            if (zsbVarArr[i8] == null || !zArr[i8]) {
                aoo aooVar = aooVarArr[i8];
                if (aooVar instanceof wk4) {
                    ((wk4) aooVar).C(this);
                } else if (aooVar instanceof vk4) {
                    vk4 vk4Var = (vk4) aooVar;
                    boolean[] zArr3 = vk4Var.e.d;
                    int i9 = vk4Var.c;
                    vq1.A(zArr3[i9]);
                    zArr3[i9] = false;
                }
                aooVarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= zsbVarArr.length) {
                break;
            }
            aoo aooVar2 = aooVarArr[i10];
            if ((aooVar2 instanceof i5b) || (aooVar2 instanceof vk4)) {
                int j2 = j(iArr3, i10);
                if (j2 == -1) {
                    z2 = aooVarArr[i10] instanceof i5b;
                } else {
                    aoo aooVar3 = aooVarArr[i10];
                    z2 = (aooVar3 instanceof vk4) && ((vk4) aooVar3).a == aooVarArr[j2];
                }
                if (!z2) {
                    aoo aooVar4 = aooVarArr[i10];
                    if (aooVar4 instanceof vk4) {
                        vk4 vk4Var2 = (vk4) aooVar4;
                        boolean[] zArr4 = vk4Var2.e.d;
                        int i11 = vk4Var2.c;
                        vq1.A(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    aooVarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < zsbVarArr.length) {
            zsb zsbVar2 = zsbVarArr[i12];
            if (zsbVar2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i12;
            } else {
                aoo aooVar5 = aooVarArr[i12];
                if (aooVar5 == null) {
                    zArr2[i12] = z;
                    h97 h97Var = this.k[iArr3[i12]];
                    int i13 = h97Var.c;
                    if (i13 == 0) {
                        int i14 = h97Var.f;
                        ?? r27 = i14 != i ? z ? 1 : 0 : i6;
                        if (r27 != 0) {
                            xvsVar = this.j.a(i14);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            xvsVar = null;
                        }
                        int i15 = h97Var.g;
                        if (i15 != i) {
                            qsnVar = this.k[i15].h;
                        } else {
                            ude udeVar = yde.b;
                            qsnVar = qsn.e;
                        }
                        int size = qsnVar.size() + i4;
                        dsc[] dscVarArr = new dsc[size];
                        int[] iArr4 = new int[size];
                        if (r27 != 0) {
                            dscVarArr[i6] = xvsVar.d[i6];
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i16 = i6; i16 < qsnVar.size(); i16++) {
                            dsc dscVar = (dsc) qsnVar.get(i16);
                            dscVarArr[i5] = dscVar;
                            iArr4[i5] = 3;
                            arrayList.add(dscVar);
                            i5 += z ? 1 : 0;
                        }
                        if (!this.v.d || r27 == 0) {
                            pclVar = null;
                        } else {
                            qcl qclVar = this.m;
                            pclVar = new pcl(qclVar, qclVar.a);
                        }
                        iArr2 = iArr3;
                        i3 = i12;
                        pcl pclVar2 = pclVar;
                        i2 = 0;
                        wk4 wk4Var = new wk4(h97Var.b, iArr4, dscVarArr, this.b.d(this.h, this.v, this.f, this.w, h97Var.a, zsbVar2, h97Var.b, this.g, r27, arrayList, pclVar, this.c, this.q), this, this.i, j, this.d, this.p, this.e, this.o, this.y);
                        synchronized (this) {
                            this.n.put(wk4Var, pclVar2);
                        }
                        aooVarArr[i3] = wk4Var;
                    } else {
                        iArr2 = iArr3;
                        i2 = i6;
                        i3 = i12;
                        if (i13 == 2) {
                            aooVarArr[i3] = new xib((zib) this.x.get(h97Var.d), zsbVar2.n().d[i2], this.v.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i12;
                    if (aooVar5 instanceof wk4) {
                        ((c97) ((wk4) aooVar5).e).j(zsbVar2);
                    }
                }
            }
            i12 = i3 + 1;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr5 = iArr3;
        ?? r32 = i6;
        int i17 = r32 == true ? 1 : 0;
        while (i17 < zsbVarArr.length) {
            if (aooVarArr[i17] != null || zsbVarArr[i17] == null) {
                iArr = iArr5;
            } else {
                h97 h97Var2 = this.k[iArr5[i17]];
                if (h97Var2.c == 1) {
                    iArr = iArr5;
                    int j3 = j(iArr, i17);
                    if (j3 != -1) {
                        wk4 wk4Var2 = (wk4) aooVarArr[j3];
                        int i18 = h97Var2.b;
                        boolean[] zArr5 = wk4Var2.d;
                        zno[] znoVarArr = wk4Var2.n;
                        for (int i19 = r32 == true ? 1 : 0; i19 < znoVarArr.length; i19++) {
                            if (wk4Var2.b[i19] == i18) {
                                vq1.A(!zArr5[i19]);
                                zArr5[i19] = true;
                                znoVarArr[i19].C(j, true);
                                aooVarArr[i17] = new vk4(wk4Var2, wk4Var2, znoVarArr[i19], i19);
                            }
                        }
                        e7o.n();
                        return 0L;
                    }
                    aooVarArr[i17] = new i5b();
                    i17++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i17++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = aooVarArr.length;
        for (int i20 = r32 == true ? 1 : 0; i20 < length; i20++) {
            aoo aooVar6 = aooVarArr[i20];
            if (aooVar6 instanceof wk4) {
                arrayList2.add((wk4) aooVar6);
            } else if (aooVar6 instanceof xib) {
                arrayList3.add((xib) aooVar6);
            }
        }
        wk4[] wk4VarArr = new wk4[arrayList2.size()];
        this.s = wk4VarArr;
        arrayList2.toArray(wk4VarArr);
        xib[] xibVarArr = new xib[arrayList3.size()];
        this.t = xibVarArr;
        arrayList3.toArray(xibVarArr);
        rwd rwdVar = this.l;
        AbstractList O = ldg.O(new qq6(13), arrayList2);
        rwdVar.getClass();
        this.u = new qr5(arrayList2, O);
        if (this.y) {
            this.y = r32;
            this.z = j;
        }
        return j;
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        this.r.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        for (wk4 wk4Var : this.s) {
            if (wk4Var.a == 2) {
                return wk4Var.e.c(j, hapVar);
            }
        }
        return j;
    }

    @Override // defpackage.ahp
    public final long e() {
        return this.u.e();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.u.f();
    }

    @Override // defpackage.woh
    public final long h(long j) {
        for (wk4 wk4Var : this.s) {
            wk4Var.D(j);
        }
        for (xib xibVar : this.t) {
            int a = dvt.a(xibVar.c, j, true);
            xibVar.g = a;
            xibVar.h = (xibVar.d && a == xibVar.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.woh
    public final long i() {
        wk4[] wk4VarArr = this.s;
        int length = wk4VarArr.length;
        for (int i = 0; i < length; i++) {
            wk4 wk4Var = wk4VarArr[i];
            wk4Var.getClass();
            try {
                if (wk4Var.x) {
                    return this.z;
                }
            } finally {
                wk4Var.x = false;
            }
        }
        return -9223372036854775807L;
    }

    public final int j(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            h97[] h97VarArr = this.k;
            int i3 = h97VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && h97VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.woh
    public final void k() {
        this.h.b();
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.r = vohVar;
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final yvs m() {
        return this.j;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        return this.u.n(dhgVar);
    }

    @Override // defpackage.ahp
    public final long r() {
        return this.u.r();
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        for (wk4 wk4Var : this.s) {
            wk4Var.s(j, z);
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        for (wk4 wk4Var : this.s) {
            if (!wk4Var.i.I()) {
                long d = this.v.d(this.w);
                zno znoVar = wk4Var.m;
                vq1.A(!wk4Var.i.I());
                if (!wk4Var.z() && d != -9223372036854775807L && !wk4Var.k.isEmpty()) {
                    fs2 w = wk4Var.w();
                    long j2 = w.l;
                    if (j2 == -9223372036854775807L) {
                        j2 = w.h;
                    }
                    if (j2 > d) {
                        long n = znoVar.n();
                        if (n > d) {
                            znoVar.i(d);
                            for (zno znoVar2 : wk4Var.n) {
                                znoVar2.i(d);
                            }
                            wk4Var.g.e0(wk4Var.a, d, n);
                        }
                    }
                }
            }
        }
        this.u.t(j);
    }
}
