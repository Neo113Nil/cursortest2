package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dnc implements ggi {
    public final nx0 a;
    public final nx0 b;
    public final float c;
    public final zsd d;
    public final float e;
    public final vmc f;
    public final pyc g;
    public final pyc h;
    public final pyc i;

    public dnc(nx0 nx0Var, nx0 nx0Var2, float f, zsd zsdVar, float f2, vmc vmcVar) {
        zsdVar.getClass();
        this.a = nx0Var;
        this.b = nx0Var2;
        this.c = f;
        this.d = zsdVar;
        this.e = f2;
        this.f = vmcVar;
        this.g = new ep5(14);
        this.h = new ep5(16);
        this.i = new ep5(18);
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
    /* JADX WARN: Removed duplicated region for block: B:103:0x0355 A[LOOP:1: B:102:0x0353->B:103:0x0355, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0364 A[LOOP:2: B:106:0x0362->B:107:0x0364, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036f A[LOOP:3: B:110:0x036d->B:111:0x036f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ggi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, long j) {
        Iterator it;
        eqi eqiVar;
        soi soiVar;
        ArrayList arrayList;
        long O;
        xqn xqnVar;
        ffh ffhVar;
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
        lu6 lu6Var;
        int i7;
        int i8;
        int i9;
        int i10;
        ffh ffhVar3;
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
        float f;
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
        long j4;
        String str4;
        String str5;
        int i23;
        String str6;
        float f2;
        float f3;
        int[] iArr;
        int[] iArr2;
        int i24;
        ffh ffhVar4;
        long j5;
        qpe qpeVar2;
        int i25;
        qpe qpeVar3;
        lu6 a;
        long a2;
        long a3;
        mfhVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return mfh.m0(mfhVar, 0, 0, new cnc(0));
        }
        if (ga6.h(j) == 0) {
            qmc qmcVar = qmc.a;
        }
        List list2 = (List) CollectionsKt.Q(list);
        if (list2.isEmpty()) {
            return mfh.m0(mfhVar, 0, 0, new cnc(2));
        }
        List list3 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar5 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar6 = list4 != null ? (ffh) CollectionsKt.firstOrNull(list4) : null;
        list2.size();
        aqf aqfVar = aqf.a;
        long O2 = v7g.O(v7g.r(10, v7g.q(j, aqfVar)));
        if (ffhVar5 != null) {
            if (lnc.b(lnc.a(ffhVar5)) != 0.0f) {
                ffhVar5.z(ffhVar5.G(Integer.MAX_VALUE));
                if (ffhVar6 != null) {
                    if (lnc.b(lnc.a(ffhVar6)) == 0.0f) {
                        lnc.a(ffhVar6);
                        ksk M = ffhVar6.M(O2);
                        M.a0();
                        M.Z();
                        M.a0();
                        M.Z();
                    } else {
                        ffhVar6.z(ffhVar6.G(Integer.MAX_VALUE));
                    }
                }
                it = list2.iterator();
                long q = v7g.q(j, aqfVar);
                it.getClass();
                eqiVar = new eqi(new lfh[16]);
                int i26 = ga6.i(q);
                int k = ga6.k(q);
                int h = ga6.h(q);
                soi soiVar2 = vpe.a;
                soiVar = new soi();
                ArrayList arrayList3 = new ArrayList();
                int ceil = (int) Math.ceil(mfhVar.n0(this.c));
                int ceil2 = (int) Math.ceil(mfhVar.n0(this.e));
                long a4 = ia6.a(0, i26, 0, h);
                arrayList = arrayList3;
                O = v7g.O(v7g.r(14, a4));
                int i27 = 0;
                xqnVar = new xqn();
                if (it.hasNext()) {
                    ffhVar2 = null;
                } else {
                    try {
                        ffhVar = (ffh) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        ffhVar = null;
                    }
                    ffhVar2 = ffhVar;
                }
                if (ffhVar2 == null) {
                    if (lnc.b(lnc.a(ffhVar2)) == 0.0f) {
                        lnc.a(ffhVar2);
                        ksk M2 = ffhVar2.M(O);
                        xqnVar.a = M2;
                        a3 = qpe.a(M2.a0(), M2.Z());
                    } else {
                        int G = ffhVar2.G(Integer.MAX_VALUE);
                        a3 = qpe.a(G, ffhVar2.z(G));
                    }
                    it2 = it;
                    qpeVar = new qpe(a3);
                } else {
                    it2 = it;
                    qpeVar = null;
                }
                valueOf = qpeVar == null ? Integer.valueOf((int) (qpeVar.a >> 32)) : null;
                valueOf2 = qpeVar == null ? Integer.valueOf((int) (qpeVar.a & 4294967295L)) : null;
                int[] iArr3 = new int[16];
                int[] iArr4 = new int[16];
                nmcVar = new nmc(this.f, q, ceil, ceil2);
                i = ceil;
                lu6 a5 = nmcVar.a(it2.hasNext(), 0, qpe.a(i26, h), qpeVar, 0, 0, 0, false, false);
                z = a5.b;
                if (z && z) {
                    qmc qmcVar2 = qmc.a;
                }
                i2 = 0;
                int i28 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                it3 = it2;
                i6 = i26;
                lu6Var = a5;
                int[] iArr5 = iArr4;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = h;
                ffhVar3 = ffhVar2;
                int[] iArr6 = iArr3;
                while (!lu6Var.b && ffhVar3 != null) {
                    valueOf.getClass();
                    int intValue = valueOf.intValue();
                    valueOf2.getClass();
                    int intValue2 = valueOf2.intValue();
                    int i29 = i;
                    int i30 = i9 + intValue;
                    int max = Math.max(i2, intValue2);
                    int i31 = i6 - intValue;
                    int i32 = i7 + 1;
                    ArrayList arrayList4 = arrayList;
                    arrayList4.add(ffhVar3);
                    soiVar.h(i7, xqnVar.a);
                    int i33 = i32 - i3;
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
                        if (lnc.b(lnc.a(ffhVar3)) == 0.0f) {
                            lnc.a(ffhVar3);
                            ksk M3 = ffhVar3.M(O);
                            xqnVar.a = M3;
                            j5 = O;
                            a2 = qpe.a(M3.a0(), M3.Z());
                        } else {
                            j5 = O;
                            int G2 = ffhVar3.G(Integer.MAX_VALUE);
                            a2 = qpe.a(G2, ffhVar3.z(G2));
                        }
                        qpeVar2 = new qpe(a2);
                    } else {
                        j5 = O;
                        qpeVar2 = null;
                    }
                    Integer valueOf3 = qpeVar2 == null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i29) : null;
                    Integer valueOf4 = qpeVar2 == null ? Integer.valueOf((int) (qpeVar2.a & 4294967295L)) : null;
                    boolean hasNext = it3.hasNext();
                    long a6 = qpe.a(i31, i10);
                    if (qpeVar2 != null) {
                        i25 = i31;
                        qpeVar3 = null;
                    } else {
                        valueOf3.getClass();
                        int intValue3 = valueOf3.intValue();
                        valueOf4.getClass();
                        i25 = i31;
                        qpeVar3 = new qpe(qpe.a(intValue3, valueOf4.intValue()));
                    }
                    a = nmcVar.a(hasNext, i33, a6, qpeVar3, i4, i5, max, false, false);
                    if (a.a) {
                        i6 = i25;
                        valueOf = valueOf3;
                    } else {
                        int min = Math.min(Math.max(k, i30), i26);
                        int i34 = i5 + max;
                        if (a.b) {
                            qmc qmcVar3 = qmc.a;
                        }
                        int i35 = i28 + 1;
                        if (iArr5.length < i35) {
                            iArr5 = Arrays.copyOf(iArr5, Math.max(i35, (iArr5.length * 3) / 2));
                        }
                        iArr5[i28] = max;
                        i28++;
                        i10 = (i10 - i34) - ceil2;
                        int i36 = i8 + 1;
                        if (iArr6.length < i36) {
                            iArr6 = Arrays.copyOf(iArr6, Math.max(i36, (iArr6.length * 3) / 2));
                        }
                        iArr6[i8] = i32;
                        i8++;
                        i4++;
                        i5 = i34 + ceil2;
                        max = 0;
                        k = min;
                        valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i29) : null;
                        i6 = i26;
                        i3 = i32;
                        i30 = 0;
                    }
                    arrayList = arrayList4;
                    i7 = i32;
                    i9 = i30;
                    lu6Var = a;
                    i2 = max;
                    i = i29;
                    valueOf2 = valueOf4;
                    O = j5;
                }
                ArrayList arrayList5 = arrayList;
                int i37 = i;
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
                int i38 = 0;
                int i39 = 0;
                int i40 = k;
                ksk[] kskVarArr2 = kskVarArr;
                while (i14 < i8) {
                    int i41 = iArr6[i14];
                    if (i14 < 0 || i14 >= i28) {
                        e7o.o("Index must be between 0 and size");
                        return null;
                    }
                    int i42 = iArr5[i14];
                    int j6 = ga6.j(a4);
                    int i43 = ga6.i(a4);
                    int i44 = i37;
                    int[] iArr9 = iArr7;
                    ksk[] kskVarArr3 = kskVarArr2;
                    long j7 = i44;
                    int i45 = i41 - i38;
                    int i46 = i14;
                    int[] iArr10 = new int[i45];
                    int i47 = i27;
                    int i48 = i28;
                    int[] iArr11 = iArr8;
                    int i49 = i8;
                    int i50 = i45;
                    float f4 = 0.0f;
                    int i51 = i38;
                    int i52 = i47;
                    int i53 = i52;
                    int i54 = i53;
                    while (i51 < i41) {
                        int i55 = i51;
                        ffh ffhVar7 = (ffh) arrayList5.get(i51);
                        float b = lnc.b(lnc.a(ffhVar7));
                        if (b > 0.0f) {
                            f4 += b;
                            i53++;
                            iArr = iArr6;
                            iArr2 = iArr5;
                            i24 = i50;
                        } else {
                            int i56 = i43 - i54;
                            ksk kskVar = kskVarArr3[i55];
                            if (kskVar == null) {
                                iArr = iArr6;
                                int i57 = i43 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i56 < 0 ? i27 : i56;
                                iArr2 = iArr5;
                                int i58 = i27;
                                f3 = f4;
                                long a7 = ia6.a(i58, i57, i58, i42);
                                i24 = i50;
                                kskVar = ffhVar7.M(a7);
                            } else {
                                f3 = f4;
                                iArr = iArr6;
                                iArr2 = iArr5;
                                i24 = i50;
                            }
                            int a0 = kskVar.a0();
                            int Z = kskVar.Z();
                            iArr10[i55 - i38] = a0;
                            int i59 = i56 - a0;
                            if (i59 < 0) {
                                i59 = 0;
                            }
                            int min2 = Math.min(i44, i59);
                            i52 = Math.max(i52, Z);
                            kskVarArr3[i55] = kskVar;
                            f4 = f3;
                            i54 = a0 + min2 + i54;
                            i47 = min2;
                        }
                        i51 = i55 + 1;
                        i50 = i24;
                        iArr6 = iArr;
                        iArr5 = iArr2;
                        i27 = 0;
                    }
                    float f5 = f4;
                    int[] iArr12 = iArr6;
                    int[] iArr13 = iArr5;
                    int i60 = i50;
                    if (i53 != 0) {
                        int i61 = i43 != Integer.MAX_VALUE ? i43 : i40;
                        long j8 = (i53 - 1) * j7;
                        int i62 = i52;
                        int i63 = i42;
                        i17 = j6;
                        long j9 = (i61 - i54) - j8;
                        if (j9 < 0) {
                            j9 = 0;
                        }
                        i18 = i44;
                        float f6 = j9 / f5;
                        long j10 = j9;
                        i19 = i60;
                        int i64 = i38;
                        while (true) {
                            f = f6;
                            str = "remainingToTarget ";
                            j2 = j9;
                            str2 = "fixedSpace ";
                            str3 = "weightChildrenCount ";
                            j3 = j8;
                            if (i64 >= i41) {
                                break;
                            }
                            ArrayList arrayList6 = arrayList5;
                            float b2 = lnc.b(lnc.a((ffh) arrayList5.get(i64)));
                            int i65 = i41;
                            float f7 = f * b2;
                            try {
                                j10 -= Math.round(f7);
                                i64++;
                                f6 = f;
                                j9 = j2;
                                j8 = j3;
                                i41 = i65;
                                arrayList5 = arrayList6;
                            } catch (IllegalArgumentException e) {
                                StringBuilder l = dfi.l("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i43, i40, "mainAxisMin ", "targetSpace ");
                                l.append(i61);
                                l.append("arrangementSpacingPx ");
                                l.append(j7);
                                l.append("weightChildrenCount ");
                                l.append(i53);
                                l.append("fixedSpace ");
                                l.append(i54);
                                ouj.C(l, "arrangementSpacingTotal ", j3, "remainingToTarget ");
                                l.append(j2);
                                l.append("totalWeight ");
                                l.append(f5);
                                l.append("weightUnitSpace ");
                                l.append(f);
                                l.append("itemWeight ");
                                l.append(b2);
                                l.append("weightedSize ");
                                l.append(f7);
                                Throwable initCause = new IllegalArgumentException(l.toString()).initCause(e);
                                initCause.getClass();
                                throw initCause;
                            }
                        }
                        int i66 = i41;
                        arrayList2 = arrayList5;
                        int i67 = i38;
                        i52 = i62;
                        int i68 = 0;
                        while (true) {
                            long j11 = j3;
                            int i69 = i66;
                            if (i67 >= i69) {
                                i20 = i69;
                                i21 = 0;
                                d = yhn.d((int) (i68 + j11), 0, i43 - i54);
                                break;
                            }
                            if (kskVarArr3[i67] == null) {
                                i66 = i69;
                                i22 = i67;
                                ffh ffhVar8 = (ffh) arrayList2.get(i67);
                                float b3 = lnc.b(lnc.a(ffhVar8));
                                if (!(b3 > 0.0f)) {
                                    xq0.q("All weights <= 0 should have placeables");
                                    return null;
                                }
                                int signum = Long.signum(j10);
                                String str7 = str2;
                                String str8 = str3;
                                j10 -= signum;
                                float f8 = f * b3;
                                int max2 = Math.max(0, Math.round(f8) + signum);
                                long j12 = j7;
                                i23 = i63;
                                str6 = str;
                                try {
                                    ksk M4 = ffhVar8.M(qld.A(max2 != Integer.MAX_VALUE ? max2 : 0, max2, 0, i23));
                                    int a02 = M4.a0();
                                    int Z2 = M4.Z();
                                    iArr10[i22 - i38] = a02;
                                    i68 += a02;
                                    i52 = Math.max(i52, Z2);
                                    kskVarArr3[i22] = M4;
                                    str5 = str7;
                                    str4 = str8;
                                    j4 = j12;
                                    f2 = f5;
                                    j3 = j11;
                                } catch (IllegalArgumentException e2) {
                                    StringBuilder l2 = dfi.l("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i43, i40, "mainAxisMin ", "targetSpace ");
                                    l2.append(i61);
                                    l2.append("arrangementSpacingPx ");
                                    l2.append(j12);
                                    l2.append(str8);
                                    l2.append(i53);
                                    l2.append(str7);
                                    l2.append(i54);
                                    ouj.C(l2, "arrangementSpacingTotal ", j11, str6);
                                    l2.append(j2);
                                    l2.append("totalWeight ");
                                    l2.append(f5);
                                    l2.append("weightUnitSpace ");
                                    l2.append(f);
                                    l2.append("weight ");
                                    l2.append(b3);
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
                                i22 = i67;
                                i66 = i69;
                                j4 = j7;
                                str4 = str3;
                                str5 = str2;
                                i23 = i63;
                                str6 = str;
                                j3 = j11;
                                f2 = f5;
                            }
                            f5 = f2;
                            i67 = i22 + 1;
                            str = str6;
                            i63 = i23;
                            str2 = str5;
                            str3 = str4;
                            j7 = j4;
                        }
                    } else {
                        i54 -= i47;
                        i20 = i41;
                        i17 = j6;
                        i18 = i44;
                        arrayList2 = arrayList5;
                        i19 = i60;
                        i21 = 0;
                        d = 0;
                    }
                    int i70 = i54 + d;
                    if (i70 < 0) {
                        i70 = i21;
                    }
                    int max3 = Math.max(i70, i40);
                    int max4 = Math.max(i52, Math.max(i17, i21 + i21));
                    int i71 = i19;
                    int[] iArr14 = new int[i71];
                    for (int i72 = i21; i72 < i71; i72++) {
                        iArr14[i72] = i21;
                    }
                    this.a.w(mfhVar, max3, iArr10, mfhVar.getLayoutDirection(), iArr14);
                    int i73 = i21;
                    lfh m0 = mfh.m0(mfhVar, max3, max4, new zmc(iArr9, i46, i38, i20, kskVarArr3, this, max4, mfhVar, i73, iArr14, 2));
                    int c = m0.c();
                    int a8 = m0.a();
                    iArr11[i46] = a8;
                    i39 += a8;
                    i40 = Math.max(i40, c);
                    eqiVar.d(m0);
                    i28 = i48;
                    i8 = i49;
                    iArr7 = iArr9;
                    i14 = i46 + 1;
                    i27 = i73;
                    iArr8 = iArr11;
                    kskVarArr2 = kskVarArr3;
                    iArr6 = iArr12;
                    iArr5 = iArr13;
                    i37 = i18;
                    i38 = i20;
                    arrayList5 = arrayList2;
                }
                i15 = i27;
                int[] iArr15 = iArr7;
                int[] iArr16 = iArr8;
                int i74 = i40;
                if ((eqiVar.c != 0 ? 1 : i15) == 0) {
                    i16 = i15;
                    i39 = i16;
                } else {
                    i16 = i74;
                }
                nx0 nx0Var = this.b;
                int d2 = yhn.d(((eqiVar.c - 1) * mfhVar.L(nx0Var.d)) + i39, ga6.j(q), ga6.h(q));
                nx0Var.a(mfhVar, d2, iArr16, iArr15);
                return mfh.m0(mfhVar, yhn.d(i16, ga6.k(q), ga6.i(q)), d2, new inc(0, eqiVar));
            }
            lnc.a(ffhVar5);
            ksk M5 = ffhVar5.M(O2);
            M5.a0();
            M5.Z();
            M5.a0();
            M5.Z();
        }
        if (ffhVar6 != null) {
        }
        it = list2.iterator();
        long q2 = v7g.q(j, aqfVar);
        it.getClass();
        eqiVar = new eqi(new lfh[16]);
        int i262 = ga6.i(q2);
        int k2 = ga6.k(q2);
        int h2 = ga6.h(q2);
        soi soiVar22 = vpe.a;
        soiVar = new soi();
        ArrayList arrayList32 = new ArrayList();
        int ceil3 = (int) Math.ceil(mfhVar.n0(this.c));
        int ceil22 = (int) Math.ceil(mfhVar.n0(this.e));
        long a42 = ia6.a(0, i262, 0, h2);
        arrayList = arrayList32;
        O = v7g.O(v7g.r(14, a42));
        int i272 = 0;
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
        nmcVar = new nmc(this.f, q2, ceil3, ceil22);
        i = ceil3;
        lu6 a52 = nmcVar.a(it2.hasNext(), 0, qpe.a(i262, h2), qpeVar, 0, 0, 0, false, false);
        z = a52.b;
        if (z) {
            qmc qmcVar22 = qmc.a;
        }
        i2 = 0;
        int i282 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        it3 = it2;
        i6 = i262;
        lu6Var = a52;
        int[] iArr52 = iArr42;
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = h2;
        ffhVar3 = ffhVar2;
        int[] iArr62 = iArr32;
        while (!lu6Var.b) {
            valueOf.getClass();
            int intValue4 = valueOf.intValue();
            valueOf2.getClass();
            int intValue22 = valueOf2.intValue();
            int i292 = i;
            int i302 = i9 + intValue4;
            int max5 = Math.max(i2, intValue22);
            int i312 = i6 - intValue4;
            int i322 = i7 + 1;
            ArrayList arrayList42 = arrayList;
            arrayList42.add(ffhVar3);
            soiVar.h(i7, xqnVar.a);
            int i332 = i322 - i3;
            if (it3.hasNext()) {
            }
            xqnVar.a = null;
            if (ffhVar3 == null) {
            }
            Integer valueOf32 = qpeVar2 == null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i292) : null;
            if (qpeVar2 == null) {
            }
            boolean hasNext2 = it3.hasNext();
            long a62 = qpe.a(i312, i10);
            if (qpeVar2 != null) {
            }
            a = nmcVar.a(hasNext2, i332, a62, qpeVar3, i4, i5, max5, false, false);
            if (a.a) {
            }
            arrayList = arrayList42;
            i7 = i322;
            i9 = i302;
            lu6Var = a;
            i2 = max5;
            i = i292;
            valueOf2 = valueOf4;
            O = j5;
        }
        ArrayList arrayList52 = arrayList;
        int i372 = i;
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
        int i382 = 0;
        int i392 = 0;
        int i402 = k2;
        ksk[] kskVarArr22 = kskVarArr4;
        while (i14 < i8) {
        }
        i15 = i272;
        int[] iArr152 = iArr72;
        int[] iArr162 = iArr82;
        int i742 = i402;
        if ((eqiVar.c != 0 ? 1 : i15) == 0) {
        }
        nx0 nx0Var2 = this.b;
        int d22 = yhn.d(((eqiVar.c - 1) * mfhVar.L(nx0Var2.d)) + i392, ga6.j(q2), ga6.h(q2));
        nx0Var2.a(mfhVar, d22, iArr162, iArr152);
        return mfh.m0(mfhVar, yhn.d(i16, ga6.k(q2), ga6.i(q2)), d22, new inc(0, eqiVar));
    }

    @Override // defpackage.ggi
    public final int c(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        int i2 = 1;
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        char c = 2;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(0, i, 7);
        vmc vmcVar = this.f;
        vmcVar.a(ffhVar, ffhVar2, b);
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
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = 0;
        }
        int size2 = list5.size();
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            iArr2[i4] = 0;
        }
        int size3 = list5.size();
        int i5 = 0;
        while (i5 < size3) {
            ffh ffhVar3 = (ffh) list5.get(i5);
            char c2 = c;
            int intValue = ((Number) this.i.invoke(ffhVar3, Integer.valueOf(i5), Integer.valueOf(i))).intValue();
            iArr[i5] = intValue;
            iArr2[i5] = ((Number) this.h.invoke(ffhVar3, Integer.valueOf(i5), Integer.valueOf(intValue))).intValue();
            i5++;
            c = c2;
        }
        if (Integer.MAX_VALUE < list5.size()) {
            qmc qmcVar = qmc.a;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            qmc qmcVar2 = qmc.a;
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int size4 = ((list5.size() - 1) * L) + xz0.S(iArr);
        if (size2 == 0) {
            wvs.n();
            return 0;
        }
        int i6 = iArr2[0];
        int i7 = size2 - 1;
        if (1 <= i7) {
            int i8 = 1;
            while (true) {
                int i9 = iArr2[i8];
                if (i6 < i9) {
                    i6 = i9;
                }
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        if (size == 0) {
            wvs.n();
            return 0;
        }
        int i10 = iArr[0];
        int i11 = size - 1;
        if (1 <= i11) {
            while (true) {
                int i12 = iArr[i2];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i2 == i11) {
                    break;
                }
                i2++;
            }
        }
        int i13 = size4;
        while (i10 <= size4 && i6 != i) {
            int i14 = (i10 + size4) / 2;
            vmc vmcVar2 = vmcVar;
            long c3 = lnc.c(list5, new hnc(iArr, 4), new hnc(iArr2, 5), i14, L, L2, vmcVar2);
            i6 = (int) (c3 >> 32);
            int i15 = (int) (c3 & 4294967295L);
            if (i6 > i || i15 < min) {
                i10 = i14 + 1;
                if (i10 > size4) {
                    return i10;
                }
            } else {
                if (i6 >= i) {
                    return i14;
                }
                size4 = i14 - 1;
            }
            i13 = i14;
            vmcVar = vmcVar2;
        }
        return i13;
    }

    @Override // defpackage.ggi
    public final int d(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(i, 0, 13);
        vmc vmcVar = this.f;
        vmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        return (int) (lnc.c(list5, this.i, this.h, i, L, L2, vmcVar) >> 32);
    }

    @Override // defpackage.ggi
    public final int e(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(i, 0, 13);
        vmc vmcVar = this.f;
        vmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        return (int) (lnc.c(list5, this.i, this.h, i, L, L2, vmcVar) >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnc)) {
            return false;
        }
        dnc dncVar = (dnc) obj;
        return this.a.equals(dncVar.a) && this.b.equals(dncVar.b) && cma.a(this.c, dncVar.c) && Intrinsics.d(this.d, dncVar.d) && cma.a(this.e, dncVar.e) && this.f.equals(dncVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1d.a(Integer.MAX_VALUE, f1d.a(Integer.MAX_VALUE, eta.a((this.d.hashCode() + eta.a((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + cma.b(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + cma.b(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
