package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class enc implements ggi {
    public final nx0 a;
    public final nx0 b;
    public final float c;
    public final pd d;
    public final float e;
    public final wmc f;
    public final pyc g;
    public final pyc h;
    public final pyc i;

    public enc(nx0 nx0Var, nx0 nx0Var2, float f, pd pdVar, float f2, wmc wmcVar) {
        pdVar.getClass();
        this.a = nx0Var;
        this.b = nx0Var2;
        this.c = f;
        this.d = pdVar;
        this.e = f2;
        this.f = wmcVar;
        this.g = new ep5(12);
        this.h = new ep5(15);
        this.i = new ep5(17);
    }

    @Override // defpackage.ggi
    public final int a(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        this.f.a(ffhVar, list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null, ia6.b(0, i, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        int L = fxeVar.L(this.c);
        list4.getClass();
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int intValue = ((Number) this.g.invoke((ffh) list4.get(i2), Integer.valueOf(i2), Integer.valueOf(i))).intValue() + L;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + intValue) - L);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += intValue;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0358 A[LOOP:1: B:102:0x0356->B:103:0x0358, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0367 A[LOOP:2: B:106:0x0365->B:107:0x0367, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0372 A[LOOP:3: B:110:0x0370->B:111:0x0372, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ggi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, long j) {
        Iterator it;
        eqi eqiVar;
        soi soiVar;
        ArrayList arrayList;
        long R;
        xqn xqnVar;
        ffh ffhVar;
        float f;
        ffh ffhVar2;
        Iterator it2;
        qpe qpeVar;
        Integer valueOf;
        Integer valueOf2;
        nmc nmcVar;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        Iterator it3;
        int i6;
        ffh ffhVar3;
        int i7;
        int i8;
        int i9;
        int i10;
        lu6 lu6Var;
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f2;
        String str;
        long j2;
        String str2;
        String str3;
        long j3;
        ArrayList arrayList2;
        int i20;
        int i21;
        int d;
        int i22;
        String str4;
        int i23;
        int i24;
        int i25;
        int i26;
        String str5;
        String str6;
        float f3;
        int[] iArr;
        int[] iArr2;
        int i27;
        ffh ffhVar4;
        long j4;
        qpe qpeVar2;
        int i28;
        qpe qpeVar3;
        lu6 b;
        long a;
        long a2;
        mfhVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return mfh.m0(mfhVar, 0, 0, new qxb(29));
        }
        if (ga6.h(j) == 0) {
            rmc rmcVar = rmc.a;
        }
        List list2 = (List) CollectionsKt.Q(list);
        if (list2.isEmpty()) {
            return mfh.m0(mfhVar, 0, 0, new cnc(1));
        }
        List list3 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar5 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar6 = list4 != null ? (ffh) CollectionsKt.firstOrNull(list4) : null;
        list2.size();
        bqf bqfVar = bqf.a;
        long R2 = y7g.R(y7g.s(10, y7g.r(j, bqfVar)));
        if (ffhVar5 != null) {
            if (jnc.b(jnc.a(ffhVar5)) != 0.0f) {
                ffhVar5.z(ffhVar5.G(Integer.MAX_VALUE));
                if (ffhVar6 != null) {
                    if (jnc.b(jnc.a(ffhVar6)) == 0.0f) {
                        jnc.a(ffhVar6);
                        ksk M = ffhVar6.M(R2);
                        M.a0();
                        M.Z();
                        M.a0();
                        M.Z();
                    } else {
                        ffhVar6.z(ffhVar6.G(Integer.MAX_VALUE));
                    }
                }
                it = list2.iterator();
                long r = y7g.r(j, bqfVar);
                it.getClass();
                eqiVar = new eqi(new lfh[16]);
                int i29 = ga6.i(r);
                int k = ga6.k(r);
                int h = ga6.h(r);
                soi soiVar2 = vpe.a;
                soiVar = new soi();
                ArrayList arrayList3 = new ArrayList();
                int ceil = (int) Math.ceil(mfhVar.n0(this.c));
                int ceil2 = (int) Math.ceil(mfhVar.n0(this.e));
                long a3 = ia6.a(0, i29, 0, h);
                arrayList = arrayList3;
                R = y7g.R(y7g.s(14, a3));
                int i30 = 0;
                xqnVar = new xqn();
                if (it.hasNext()) {
                    f = 0.0f;
                    ffhVar2 = null;
                } else {
                    try {
                        ffhVar = (ffh) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        ffhVar = null;
                    }
                    f = 0.0f;
                    ffhVar2 = ffhVar;
                }
                if (ffhVar2 == null) {
                    if (jnc.b(jnc.a(ffhVar2)) == f) {
                        jnc.a(ffhVar2);
                        ksk M2 = ffhVar2.M(R);
                        xqnVar.a = M2;
                        a2 = qpe.a(M2.a0(), M2.Z());
                    } else {
                        int G = ffhVar2.G(Integer.MAX_VALUE);
                        a2 = qpe.a(G, ffhVar2.z(G));
                    }
                    it2 = it;
                    qpeVar = new qpe(a2);
                } else {
                    it2 = it;
                    qpeVar = null;
                }
                valueOf = qpeVar == null ? Integer.valueOf((int) (qpeVar.a >> 32)) : null;
                valueOf2 = qpeVar == null ? Integer.valueOf((int) (qpeVar.a & 4294967295L)) : null;
                int[] iArr3 = new int[16];
                int[] iArr4 = new int[16];
                nmcVar = new nmc(this.f, r, ceil, ceil2);
                i = ceil;
                lu6 b2 = nmcVar.b(it2.hasNext(), 0, qpe.a(i29, h), qpeVar, 0, 0, 0, false, false);
                z = b2.b;
                if (z && z) {
                    rmc rmcVar2 = rmc.a;
                }
                i2 = 0;
                int i31 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                it3 = it2;
                i6 = i29;
                ffhVar3 = ffhVar2;
                int[] iArr5 = iArr4;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = h;
                lu6Var = b2;
                int[] iArr6 = iArr3;
                while (!lu6Var.b && ffhVar3 != null) {
                    valueOf.getClass();
                    int intValue = valueOf.intValue();
                    valueOf2.getClass();
                    int intValue2 = valueOf2.intValue();
                    int i32 = i;
                    int i33 = i9 + intValue;
                    int max = Math.max(i2, intValue2);
                    int i34 = i6 - intValue;
                    int i35 = i7 + 1;
                    ArrayList arrayList4 = arrayList;
                    arrayList4.add(ffhVar3);
                    soiVar.h(i7, xqnVar.a);
                    int i36 = i35 - i3;
                    if (it3.hasNext()) {
                        ffhVar3 = null;
                    } else {
                        try {
                            ffhVar4 = (ffh) it3.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            ffhVar4 = null;
                        }
                        ffhVar3 = ffhVar4;
                    }
                    xqnVar.a = null;
                    if (ffhVar3 == null) {
                        if (jnc.b(jnc.a(ffhVar3)) == f) {
                            jnc.a(ffhVar3);
                            ksk M3 = ffhVar3.M(R);
                            xqnVar.a = M3;
                            j4 = R;
                            a = qpe.a(M3.a0(), M3.Z());
                        } else {
                            j4 = R;
                            int G2 = ffhVar3.G(Integer.MAX_VALUE);
                            a = qpe.a(G2, ffhVar3.z(G2));
                        }
                        qpeVar2 = new qpe(a);
                    } else {
                        j4 = R;
                        qpeVar2 = null;
                    }
                    Integer valueOf3 = qpeVar2 == null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i32) : null;
                    Integer valueOf4 = qpeVar2 == null ? Integer.valueOf((int) (qpeVar2.a & 4294967295L)) : null;
                    boolean hasNext = it3.hasNext();
                    long a4 = qpe.a(i34, i10);
                    if (qpeVar2 != null) {
                        i28 = i34;
                        qpeVar3 = null;
                    } else {
                        valueOf3.getClass();
                        int intValue3 = valueOf3.intValue();
                        valueOf4.getClass();
                        i28 = i34;
                        qpeVar3 = new qpe(qpe.a(intValue3, valueOf4.intValue()));
                    }
                    b = nmcVar.b(hasNext, i36, a4, qpeVar3, i4, i5, max, false, false);
                    if (b.a) {
                        i6 = i28;
                        valueOf = valueOf3;
                    } else {
                        int min = Math.min(Math.max(k, i33), i29);
                        int i37 = i5 + max;
                        if (b.b) {
                            rmc rmcVar3 = rmc.a;
                        }
                        int i38 = i31 + 1;
                        if (iArr5.length < i38) {
                            iArr5 = Arrays.copyOf(iArr5, Math.max(i38, (iArr5.length * 3) / 2));
                        }
                        iArr5[i31] = max;
                        i31++;
                        i10 = (i10 - i37) - ceil2;
                        int i39 = i8 + 1;
                        if (iArr6.length < i39) {
                            iArr6 = Arrays.copyOf(iArr6, Math.max(i39, (iArr6.length * 3) / 2));
                        }
                        iArr6[i8] = i35;
                        i8++;
                        i4++;
                        i5 = i37 + ceil2;
                        max = 0;
                        k = min;
                        valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i32) : null;
                        i6 = i29;
                        i3 = i35;
                        i33 = 0;
                    }
                    arrayList = arrayList4;
                    i7 = i35;
                    i9 = i33;
                    lu6Var = b;
                    i2 = max;
                    i = i32;
                    valueOf2 = valueOf4;
                    R = j4;
                }
                ArrayList arrayList5 = arrayList;
                int i40 = i;
                size = arrayList5.size();
                ksk[] kskVarArr = new ksk[size];
                for (i11 = 0; i11 < size; i11++) {
                    kskVarArr[i11] = soiVar.b(i11);
                }
                int[] iArr7 = new int[i8];
                for (i12 = 0; i12 < i8; i12++) {
                    iArr7[i12] = 0;
                }
                int[] iArr8 = new int[i8];
                for (i13 = 0; i13 < i8; i13++) {
                    iArr8[i13] = 0;
                }
                i14 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = k;
                ksk[] kskVarArr2 = kskVarArr;
                while (i14 < i8) {
                    int i44 = iArr6[i14];
                    if (i14 < 0 || i14 >= i31) {
                        e7o.o("Index must be between 0 and size");
                        return null;
                    }
                    int i45 = iArr5[i14];
                    int j5 = ga6.j(a3);
                    int i46 = ga6.i(a3);
                    int i47 = i40;
                    int i48 = i31;
                    ksk[] kskVarArr3 = kskVarArr2;
                    long j6 = i47;
                    int i49 = i44 - i41;
                    int[] iArr9 = iArr7;
                    int[] iArr10 = new int[i49];
                    int i50 = i30;
                    int[] iArr11 = iArr8;
                    int i51 = i14;
                    int i52 = i8;
                    int i53 = i49;
                    int i54 = i41;
                    float f4 = f;
                    int i55 = i50;
                    int i56 = i55;
                    int i57 = i56;
                    while (i54 < i44) {
                        int i58 = i54;
                        ffh ffhVar7 = (ffh) arrayList5.get(i54);
                        float b3 = jnc.b(jnc.a(ffhVar7));
                        if (b3 > f) {
                            f4 += b3;
                            i56++;
                            iArr = iArr6;
                            iArr2 = iArr5;
                            i27 = i53;
                        } else {
                            int i59 = i46 - i57;
                            ksk kskVar = kskVarArr3[i58];
                            if (kskVar == null) {
                                iArr = iArr6;
                                int i60 = i46 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i59 < 0 ? i30 : i59;
                                iArr2 = iArr5;
                                int i61 = i30;
                                f3 = f4;
                                long a5 = ia6.a(i61, i60, i61, i45);
                                i27 = i53;
                                kskVar = ffhVar7.M(a5);
                            } else {
                                f3 = f4;
                                iArr = iArr6;
                                iArr2 = iArr5;
                                i27 = i53;
                            }
                            int a0 = kskVar.a0();
                            int Z = kskVar.Z();
                            iArr10[i58 - i41] = a0;
                            int i62 = i59 - a0;
                            if (i62 < 0) {
                                i62 = 0;
                            }
                            int min2 = Math.min(i47, i62);
                            i55 = Math.max(i55, Z);
                            kskVarArr3[i58] = kskVar;
                            f4 = f3;
                            i57 = a0 + min2 + i57;
                            i50 = min2;
                        }
                        i54 = i58 + 1;
                        i53 = i27;
                        iArr6 = iArr;
                        iArr5 = iArr2;
                        i30 = 0;
                    }
                    float f5 = f4;
                    int[] iArr12 = iArr6;
                    int[] iArr13 = iArr5;
                    int i63 = i53;
                    if (i56 == 0) {
                        i57 -= i50;
                        i20 = i44;
                        i18 = j5;
                        i17 = i47;
                        arrayList2 = arrayList5;
                        i19 = i63;
                        i21 = 0;
                        d = 0;
                    } else {
                        int i64 = i46 != Integer.MAX_VALUE ? i46 : i43;
                        long j7 = (i56 - 1) * j6;
                        i17 = i47;
                        int i65 = i45;
                        i18 = j5;
                        long j8 = (i64 - i57) - j7;
                        if (j8 < 0) {
                            j8 = 0;
                        }
                        float f6 = j8 / f5;
                        long j9 = j8;
                        int i66 = i55;
                        i19 = i63;
                        int i67 = i41;
                        while (true) {
                            f2 = f6;
                            str = "remainingToTarget ";
                            j2 = j8;
                            str2 = "fixedSpace ";
                            str3 = "weightChildrenCount ";
                            j3 = j7;
                            if (i67 >= i44) {
                                break;
                            }
                            int i68 = i67;
                            float b4 = jnc.b(jnc.a((ffh) arrayList5.get(i67)));
                            ArrayList arrayList6 = arrayList5;
                            float f7 = f2 * b4;
                            try {
                                j9 -= Math.round(f7);
                                i67 = i68 + 1;
                                f6 = f2;
                                j8 = j2;
                                j7 = j3;
                                arrayList5 = arrayList6;
                            } catch (IllegalArgumentException e) {
                                StringBuilder l = dfi.l("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i46, i43, "mainAxisMin ", "targetSpace ");
                                l.append(i64);
                                l.append("arrangementSpacingPx ");
                                l.append(j6);
                                l.append("weightChildrenCount ");
                                l.append(i56);
                                l.append("fixedSpace ");
                                l.append(i57);
                                ouj.C(l, "arrangementSpacingTotal ", j3, "remainingToTarget ");
                                l.append(j2);
                                l.append("totalWeight ");
                                l.append(f5);
                                l.append("weightUnitSpace ");
                                l.append(f2);
                                l.append("itemWeight ");
                                l.append(b4);
                                l.append("weightedSize ");
                                l.append(f7);
                                Throwable initCause = new IllegalArgumentException(l.toString()).initCause(e);
                                initCause.getClass();
                                throw initCause;
                            }
                        }
                        arrayList2 = arrayList5;
                        int i69 = i41;
                        i55 = i66;
                        int i70 = 0;
                        while (i69 < i44) {
                            if (kskVarArr3[i69] == null) {
                                i22 = i44;
                                ffh ffhVar8 = (ffh) arrayList2.get(i69);
                                i23 = i69;
                                float b5 = jnc.b(jnc.a(ffhVar8));
                                if (!(b5 > f)) {
                                    xq0.q("All weights <= 0 should have placeables");
                                    return null;
                                }
                                int signum = Long.signum(j9);
                                i24 = i56;
                                i25 = i57;
                                j9 -= signum;
                                float f8 = f2 * b5;
                                int max2 = Math.max(0, Math.round(f8) + signum);
                                str4 = str2;
                                String str7 = str3;
                                i26 = i65;
                                str6 = str;
                                try {
                                    ksk M4 = ffhVar8.M(qld.A(max2 != Integer.MAX_VALUE ? max2 : 0, max2, 0, i26));
                                    int a02 = M4.a0();
                                    int Z2 = M4.Z();
                                    iArr10[i23 - i41] = a02;
                                    i70 += a02;
                                    int max3 = Math.max(i55, Z2);
                                    kskVarArr3[i23] = M4;
                                    i55 = max3;
                                    str5 = str7;
                                } catch (IllegalArgumentException e2) {
                                    StringBuilder l2 = dfi.l("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i46, i43, "mainAxisMin ", "targetSpace ");
                                    l2.append(i64);
                                    l2.append("arrangementSpacingPx ");
                                    l2.append(j6);
                                    l2.append(str7);
                                    l2.append(i24);
                                    l2.append(str4);
                                    l2.append(i25);
                                    ouj.C(l2, "arrangementSpacingTotal ", j3, str6);
                                    l2.append(j2);
                                    l2.append("totalWeight ");
                                    l2.append(f5);
                                    l2.append("weightUnitSpace ");
                                    l2.append(f2);
                                    l2.append("weight ");
                                    l2.append(b5);
                                    l2.append("weightedSize ");
                                    l2.append(f8);
                                    l2.append("crossAxisDesiredSize nullremainderUnit ");
                                    l2.append(signum);
                                    l2.append("childMainAxisSize ");
                                    l2.append(max2);
                                    Throwable initCause2 = new IllegalArgumentException(l2.toString()).initCause(e2);
                                    initCause2.getClass();
                                    throw initCause2;
                                }
                            } else {
                                i22 = i44;
                                str4 = str2;
                                i23 = i69;
                                i24 = i56;
                                i25 = i57;
                                i26 = i65;
                                str5 = str3;
                                str6 = str;
                            }
                            f5 = f5;
                            str3 = str5;
                            str = str6;
                            i57 = i25;
                            str2 = str4;
                            i69 = i23 + 1;
                            i65 = i26;
                            i44 = i22;
                            i56 = i24;
                        }
                        i20 = i44;
                        i21 = 0;
                        d = yhn.d((int) (i70 + j3), 0, i46 - i57);
                    }
                    int i71 = i57 + d;
                    if (i71 < 0) {
                        i71 = i21;
                    }
                    int max4 = Math.max(i71, i43);
                    int max5 = Math.max(i55, Math.max(i18, i21 + i21));
                    int i72 = i19;
                    int[] iArr14 = new int[i72];
                    for (int i73 = i21; i73 < i72; i73++) {
                        iArr14[i73] = i21;
                    }
                    this.a.w(mfhVar, max4, iArr10, mfhVar.getLayoutDirection(), iArr14);
                    int i74 = i21;
                    lfh m0 = mfh.m0(mfhVar, max4, max5, new zmc(iArr9, i51, i41, i20, kskVarArr3, this, max5, mfhVar, i74, iArr14, 0));
                    int c = m0.c();
                    int a6 = m0.a();
                    iArr11[i51] = a6;
                    i42 += a6;
                    i43 = Math.max(i43, c);
                    eqiVar.d(m0);
                    i14 = i51 + 1;
                    i31 = i48;
                    i8 = i52;
                    iArr7 = iArr9;
                    i30 = i74;
                    iArr8 = iArr11;
                    kskVarArr2 = kskVarArr3;
                    i40 = i17;
                    iArr6 = iArr12;
                    iArr5 = iArr13;
                    i41 = i20;
                    arrayList5 = arrayList2;
                }
                i15 = i30;
                int[] iArr15 = iArr7;
                int[] iArr16 = iArr8;
                int i75 = i43;
                if ((eqiVar.c != 0 ? 1 : i15) == 0) {
                    i16 = i15;
                    i42 = i16;
                } else {
                    i16 = i75;
                }
                nx0 nx0Var = this.b;
                int d2 = yhn.d(((eqiVar.c - 1) * mfhVar.L(nx0Var.d)) + i42, ga6.j(r), ga6.h(r));
                nx0Var.a(mfhVar, d2, iArr16, iArr15);
                return mfh.m0(mfhVar, yhn.d(i16, ga6.k(r), ga6.i(r)), d2, new inc(1, eqiVar));
            }
            jnc.a(ffhVar5);
            ksk M5 = ffhVar5.M(R2);
            M5.a0();
            M5.Z();
            M5.a0();
            M5.Z();
        }
        if (ffhVar6 != null) {
        }
        it = list2.iterator();
        long r2 = y7g.r(j, bqfVar);
        it.getClass();
        eqiVar = new eqi(new lfh[16]);
        int i292 = ga6.i(r2);
        int k2 = ga6.k(r2);
        int h2 = ga6.h(r2);
        soi soiVar22 = vpe.a;
        soiVar = new soi();
        ArrayList arrayList32 = new ArrayList();
        int ceil3 = (int) Math.ceil(mfhVar.n0(this.c));
        int ceil22 = (int) Math.ceil(mfhVar.n0(this.e));
        long a32 = ia6.a(0, i292, 0, h2);
        arrayList = arrayList32;
        R = y7g.R(y7g.s(14, a32));
        int i302 = 0;
        xqnVar = new xqn();
        if (it.hasNext()) {
        }
        if (ffhVar2 == null) {
        }
        valueOf = qpeVar == null ? Integer.valueOf((int) (qpeVar.a >> 32)) : null;
        if (qpeVar == null) {
        }
        int[] iArr32 = new int[16];
        int[] iArr42 = new int[16];
        nmcVar = new nmc(this.f, r2, ceil3, ceil22);
        i = ceil3;
        lu6 b22 = nmcVar.b(it2.hasNext(), 0, qpe.a(i292, h2), qpeVar, 0, 0, 0, false, false);
        z = b22.b;
        if (z) {
            rmc rmcVar22 = rmc.a;
        }
        i2 = 0;
        int i312 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        it3 = it2;
        i6 = i292;
        ffhVar3 = ffhVar2;
        int[] iArr52 = iArr42;
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = h2;
        lu6Var = b22;
        int[] iArr62 = iArr32;
        while (!lu6Var.b) {
            valueOf.getClass();
            int intValue4 = valueOf.intValue();
            valueOf2.getClass();
            int intValue22 = valueOf2.intValue();
            int i322 = i;
            int i332 = i9 + intValue4;
            int max6 = Math.max(i2, intValue22);
            int i342 = i6 - intValue4;
            int i352 = i7 + 1;
            ArrayList arrayList42 = arrayList;
            arrayList42.add(ffhVar3);
            soiVar.h(i7, xqnVar.a);
            int i362 = i352 - i3;
            if (it3.hasNext()) {
            }
            xqnVar.a = null;
            if (ffhVar3 == null) {
            }
            Integer valueOf32 = qpeVar2 == null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i322) : null;
            if (qpeVar2 == null) {
            }
            boolean hasNext2 = it3.hasNext();
            long a42 = qpe.a(i342, i10);
            if (qpeVar2 != null) {
            }
            b = nmcVar.b(hasNext2, i362, a42, qpeVar3, i4, i5, max6, false, false);
            if (b.a) {
            }
            arrayList = arrayList42;
            i7 = i352;
            i9 = i332;
            lu6Var = b;
            i2 = max6;
            i = i322;
            valueOf2 = valueOf4;
            R = j4;
        }
        ArrayList arrayList52 = arrayList;
        int i402 = i;
        size = arrayList52.size();
        ksk[] kskVarArr4 = new ksk[size];
        while (i11 < size) {
        }
        int[] iArr72 = new int[i8];
        while (i12 < i8) {
        }
        int[] iArr82 = new int[i8];
        while (i13 < i8) {
        }
        i14 = 0;
        int i412 = 0;
        int i422 = 0;
        int i432 = k2;
        ksk[] kskVarArr22 = kskVarArr4;
        while (i14 < i8) {
        }
        i15 = i302;
        int[] iArr152 = iArr72;
        int[] iArr162 = iArr82;
        int i752 = i432;
        if ((eqiVar.c != 0 ? 1 : i15) == 0) {
        }
        nx0 nx0Var2 = this.b;
        int d22 = yhn.d(((eqiVar.c - 1) * mfhVar.L(nx0Var2.d)) + i422, ga6.j(r2), ga6.h(r2));
        nx0Var2.a(mfhVar, d22, iArr162, iArr152);
        return mfh.m0(mfhVar, yhn.d(i16, ga6.k(r2), ga6.i(r2)), d22, new inc(1, eqiVar));
    }

    @Override // defpackage.ggi
    public final int c(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        int i2 = 1;
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        int i3 = 2;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(0, i, 7);
        wmc wmcVar = this.f;
        wmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list5.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list5.size();
        int i6 = 0;
        while (i6 < size3) {
            ffh ffhVar3 = (ffh) list5.get(i6);
            int i7 = i3;
            int intValue = ((Number) this.i.invoke(ffhVar3, Integer.valueOf(i6), Integer.valueOf(i))).intValue();
            iArr[i6] = intValue;
            iArr2[i6] = ((Number) this.h.invoke(ffhVar3, Integer.valueOf(i6), Integer.valueOf(intValue))).intValue();
            i6++;
            i3 = i7;
        }
        int i8 = i3;
        if (Integer.MAX_VALUE < list5.size()) {
            rmc rmcVar = rmc.a;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            rmc rmcVar2 = rmc.a;
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int size4 = ((list5.size() - 1) * L) + xz0.S(iArr);
        if (size2 == 0) {
            wvs.n();
            return 0;
        }
        int i9 = iArr2[0];
        int i10 = size2 - 1;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = iArr2[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            wvs.n();
            return 0;
        }
        int i13 = iArr[0];
        int i14 = size - 1;
        if (1 <= i14) {
            while (true) {
                int i15 = iArr[i2];
                if (i13 < i15) {
                    i13 = i15;
                }
                if (i2 == i14) {
                    break;
                }
                i2++;
            }
        }
        int i16 = size4;
        while (i13 <= size4 && i9 != i) {
            int i17 = (i13 + size4) / 2;
            wmc wmcVar2 = wmcVar;
            long c = jnc.c(list5, new hnc(iArr, 0), new hnc(iArr2, i8), i17, L, L2, wmcVar2);
            int i18 = i13;
            i9 = (int) (c >> 32);
            int i19 = (int) (4294967295L & c);
            if (i9 > i || i19 < min) {
                i13 = i17 + 1;
                if (i13 > size4) {
                    return i13;
                }
            } else {
                if (i9 >= i) {
                    return i17;
                }
                size4 = i17 - 1;
                i13 = i18;
            }
            i16 = i17;
            wmcVar = wmcVar2;
            i8 = 2;
        }
        return i16;
    }

    @Override // defpackage.ggi
    public final int d(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(i, 0, 13);
        wmc wmcVar = this.f;
        wmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        return (int) (jnc.c(list5, this.i, this.h, i, L, L2, wmcVar) >> 32);
    }

    @Override // defpackage.ggi
    public final int e(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(i, 0, 13);
        wmc wmcVar = this.f;
        wmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        return (int) (jnc.c(list5, this.i, this.h, i, L, L2, wmcVar) >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enc)) {
            return false;
        }
        enc encVar = (enc) obj;
        return this.a.equals(encVar.a) && this.b.equals(encVar.b) && cma.a(this.c, encVar.c) && Intrinsics.d(this.d, encVar.d) && cma.a(this.e, encVar.e) && this.f.equals(encVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1d.a(Integer.MAX_VALUE, f1d.a(Integer.MAX_VALUE, eta.a((this.d.hashCode() + eta.a((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + cma.b(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + cma.b(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
