package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fnc implements ggi {
    public final nx0 a;
    public final nx0 b;
    public final float c;
    public final xv d;
    public final float e;
    public final xmc f;
    public final pyc g;
    public final pyc h;
    public final pyc i;

    public fnc(nx0 nx0Var, nx0 nx0Var2, float f, xv xvVar, float f2, xmc xmcVar) {
        xvVar.getClass();
        this.a = nx0Var;
        this.b = nx0Var2;
        this.c = f;
        this.d = xvVar;
        this.e = f2;
        this.f = xmcVar;
        this.g = new ep5(10);
        this.h = new ep5(11);
        this.i = new ep5(13);
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
    /* JADX WARN: Removed duplicated region for block: B:103:0x0352 A[LOOP:1: B:102:0x0350->B:103:0x0352, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0361 A[LOOP:2: B:106:0x035f->B:107:0x0361, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c A[LOOP:3: B:110:0x036a->B:111:0x036c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ggi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, long j) {
        int i;
        Iterator it;
        eqi eqiVar;
        soi soiVar;
        ArrayList arrayList;
        long a0;
        xqn xqnVar;
        ffh ffhVar;
        ffh ffhVar2;
        Iterator it2;
        qpe qpeVar;
        Integer valueOf;
        Integer valueOf2;
        nmc nmcVar;
        int i2;
        lu6 c;
        boolean z;
        int i3;
        int i4;
        int i5;
        Iterator it3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int size;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f;
        long j2;
        String str;
        String str2;
        long j3;
        int i20;
        ArrayList arrayList2;
        int i21;
        int i22;
        int d;
        int i23;
        ArrayList arrayList3;
        String str3;
        int i24;
        int i25;
        int i26;
        String str4;
        float f2;
        int i27;
        int[] iArr;
        float f3;
        int[] iArr2;
        int i28;
        long j4;
        qpe qpeVar2;
        qpe qpeVar3;
        lu6 c2;
        Integer num;
        long a;
        long a2;
        mfhVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return mfh.m0(mfhVar, 0, 0, new cnc(3));
        }
        if (ga6.h(j) == 0) {
            smc smcVar = smc.a;
        }
        List list2 = (List) CollectionsKt.Q(list);
        if (list2.isEmpty()) {
            return mfh.m0(mfhVar, 0, 0, new cnc(4));
        }
        List list3 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar3 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar4 = list4 != null ? (ffh) CollectionsKt.firstOrNull(list4) : null;
        list2.size();
        cqf cqfVar = cqf.a;
        long a02 = f8g.a0(f8g.o(10, f8g.m(j, cqfVar)));
        if (ffhVar3 != null) {
            if (knc.b(knc.a(ffhVar3)) != 0.0f) {
                i = 1;
                ffhVar3.z(ffhVar3.G(Integer.MAX_VALUE));
                if (ffhVar4 != null) {
                    if (knc.b(knc.a(ffhVar4)) == 0.0f) {
                        knc.a(ffhVar4);
                        ksk M = ffhVar4.M(a02);
                        M.a0();
                        M.Z();
                        M.a0();
                        M.Z();
                    } else {
                        ffhVar4.z(ffhVar4.G(Integer.MAX_VALUE));
                    }
                }
                it = list2.iterator();
                long m = f8g.m(j, cqfVar);
                it.getClass();
                eqiVar = new eqi(new lfh[16]);
                int i29 = ga6.i(m);
                int k = ga6.k(m);
                int h = ga6.h(m);
                soi soiVar2 = vpe.a;
                soiVar = new soi();
                ArrayList arrayList4 = new ArrayList();
                int ceil = (int) Math.ceil(mfhVar.n0(this.c));
                int ceil2 = (int) Math.ceil(mfhVar.n0(this.e));
                long a3 = ia6.a(0, i29, 0, h);
                arrayList = arrayList4;
                a0 = f8g.a0(f8g.o(14, a3));
                int i30 = 0;
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
                    if (knc.b(knc.a(ffhVar2)) == 0.0f) {
                        knc.a(ffhVar2);
                        ksk M2 = ffhVar2.M(a0);
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
                nmcVar = new nmc(this.f, m, ceil, ceil2);
                i2 = ceil;
                c = nmcVar.c(it2.hasNext(), 0, qpe.a(i29, h), qpeVar, 0, 0, 0, false, false);
                z = c.b;
                if (z && z) {
                    smc smcVar2 = smc.a;
                }
                int i31 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                it3 = it2;
                i6 = i29;
                int[] iArr5 = iArr3;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = h;
                while (!c.b && ffhVar2 != null) {
                    valueOf.getClass();
                    int intValue = valueOf.intValue();
                    valueOf2.getClass();
                    int i32 = i2;
                    int i33 = i3 + intValue;
                    int max = Math.max(i7, valueOf2.intValue());
                    int i34 = i6 - intValue;
                    int i35 = i8 + 1;
                    ArrayList arrayList5 = arrayList;
                    arrayList5.add(ffhVar2);
                    soiVar.h(i8, xqnVar.a);
                    int i36 = i35 - i10;
                    if (it3.hasNext()) {
                        try {
                            ffhVar2 = (ffh) it3.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                        xqnVar.a = null;
                        if (ffhVar2 != null) {
                            if (knc.b(knc.a(ffhVar2)) == 0.0f) {
                                knc.a(ffhVar2);
                                ksk M3 = ffhVar2.M(a0);
                                xqnVar.a = M3;
                                j4 = a0;
                                a = qpe.a(M3.a0(), M3.Z());
                            } else {
                                j4 = a0;
                                int G2 = ffhVar2.G(Integer.MAX_VALUE);
                                a = qpe.a(G2, ffhVar2.z(G2));
                            }
                            qpeVar2 = new qpe(a);
                        } else {
                            j4 = a0;
                            qpeVar2 = null;
                        }
                        Integer valueOf3 = qpeVar2 != null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i32) : null;
                        valueOf2 = qpeVar2 != null ? Integer.valueOf((int) (qpeVar2.a & 4294967295L)) : null;
                        boolean hasNext = it3.hasNext();
                        long a4 = qpe.a(i34, i11);
                        if (qpeVar2 == null) {
                            qpeVar3 = null;
                        } else {
                            valueOf3.getClass();
                            int intValue2 = valueOf3.intValue();
                            valueOf2.getClass();
                            qpeVar3 = new qpe(qpe.a(intValue2, valueOf2.intValue()));
                        }
                        c2 = nmcVar.c(hasNext, i36, a4, qpeVar3, i4, i5, max, false, false);
                        if (c2.a) {
                            int min = Math.min(Math.max(k, i33), i29);
                            int i37 = i5 + max;
                            if (c2.b) {
                                smc smcVar3 = smc.a;
                            }
                            int i38 = i31 + 1;
                            if (iArr4.length < i38) {
                                iArr4 = Arrays.copyOf(iArr4, Math.max(i38, (iArr4.length * 3) / 2));
                            }
                            iArr4[i31] = max;
                            i31++;
                            i11 = (h - i37) - ceil2;
                            int i39 = i9 + 1;
                            if (iArr5.length < i39) {
                                iArr5 = Arrays.copyOf(iArr5, Math.max(i39, (iArr5.length * 3) / 2));
                            }
                            iArr5[i9] = i35;
                            i9++;
                            i4++;
                            i5 = i37 + ceil2;
                            k = min;
                            num = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i32) : null;
                            i33 = 0;
                            max = 0;
                            i6 = i29;
                            i10 = i35;
                        } else {
                            i6 = i34;
                            num = valueOf3;
                        }
                        valueOf = num;
                        c = c2;
                        i8 = i35;
                        i3 = i33;
                        i2 = i32;
                        arrayList = arrayList5;
                        i7 = max;
                        a0 = j4;
                    }
                    ffhVar2 = null;
                    xqnVar.a = null;
                    if (ffhVar2 != null) {
                    }
                    Integer valueOf32 = qpeVar2 != null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i32) : null;
                    if (qpeVar2 != null) {
                    }
                    boolean hasNext2 = it3.hasNext();
                    long a42 = qpe.a(i34, i11);
                    if (qpeVar2 == null) {
                    }
                    c2 = nmcVar.c(hasNext2, i36, a42, qpeVar3, i4, i5, max, false, false);
                    if (c2.a) {
                    }
                    valueOf = num;
                    c = c2;
                    i8 = i35;
                    i3 = i33;
                    i2 = i32;
                    arrayList = arrayList5;
                    i7 = max;
                    a0 = j4;
                }
                ArrayList arrayList6 = arrayList;
                int i40 = i2;
                size = arrayList6.size();
                ksk[] kskVarArr = new ksk[size];
                for (i12 = 0; i12 < size; i12++) {
                    kskVarArr[i12] = soiVar.b(i12);
                }
                int[] iArr6 = new int[i9];
                for (i13 = 0; i13 < i9; i13++) {
                    iArr6[i13] = 0;
                }
                int[] iArr7 = new int[i9];
                for (i14 = 0; i14 < i9; i14++) {
                    iArr7[i14] = 0;
                }
                i15 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = k;
                ksk[] kskVarArr2 = kskVarArr;
                while (i15 < i9) {
                    int i44 = iArr5[i15];
                    if (i15 < 0 || i15 >= i31) {
                        e7o.o("Index must be between 0 and size");
                        return null;
                    }
                    int i45 = iArr4[i15];
                    int j5 = ga6.j(a3);
                    int i46 = ga6.i(a3);
                    int i47 = i31;
                    ksk[] kskVarArr3 = kskVarArr2;
                    long j6 = i40;
                    int[] iArr8 = iArr4;
                    int i48 = i44 - i41;
                    int[] iArr9 = iArr6;
                    int[] iArr10 = new int[i48];
                    int i49 = i30;
                    int i50 = i15;
                    int i51 = i41;
                    int i52 = i9;
                    float f4 = 0.0f;
                    int i53 = i49;
                    int i54 = i53;
                    int i55 = i54;
                    while (i51 < i44) {
                        int i56 = i51;
                        ffh ffhVar5 = (ffh) arrayList6.get(i51);
                        float b = knc.b(knc.a(ffhVar5));
                        if (b > 0.0f) {
                            f4 += b;
                            i54++;
                            iArr = iArr7;
                            iArr2 = iArr5;
                            i28 = i40;
                        } else {
                            int i57 = i46 - i55;
                            ksk kskVar = kskVarArr3[i56];
                            if (kskVar == null) {
                                iArr2 = iArr5;
                                int i58 = i46 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i57 < 0 ? i30 : i57;
                                iArr = iArr7;
                                int i59 = i30;
                                f3 = f4;
                                long a5 = ia6.a(i59, i58, i59, i45);
                                i28 = i40;
                                kskVar = ffhVar5.M(a5);
                            } else {
                                iArr = iArr7;
                                f3 = f4;
                                iArr2 = iArr5;
                                i28 = i40;
                            }
                            int a03 = kskVar.a0();
                            int Z = kskVar.Z();
                            iArr10[i56 - i51] = a03;
                            int i60 = i57 - a03;
                            if (i60 < 0) {
                                i60 = 0;
                            }
                            int min2 = Math.min(i28, i60);
                            i53 = Math.max(i53, Z);
                            kskVarArr3[i56] = kskVar;
                            f4 = f3;
                            i55 = a03 + min2 + i55;
                            i49 = min2;
                        }
                        i51 = i56 + 1;
                        i40 = i28;
                        iArr5 = iArr2;
                        iArr7 = iArr;
                        i30 = 0;
                    }
                    int[] iArr11 = iArr7;
                    float f5 = f4;
                    int[] iArr12 = iArr5;
                    int i61 = i40;
                    if (i54 == 0) {
                        i20 = i44;
                        i19 = i48;
                        arrayList2 = arrayList6;
                        i18 = j5;
                        i21 = i55 - i49;
                        i40 = i61;
                        d = 0;
                        i22 = 0;
                    } else {
                        int i62 = i46 != Integer.MAX_VALUE ? i46 : i43;
                        long j7 = (i54 - 1) * j6;
                        int i63 = i53;
                        int i64 = i45;
                        i18 = j5;
                        long j8 = (i62 - i55) - j7;
                        if (j8 < 0) {
                            j8 = 0;
                        }
                        float f6 = j8 / f5;
                        i19 = i48;
                        long j9 = j8;
                        i40 = i61;
                        int i65 = i51;
                        while (true) {
                            f = f6;
                            j2 = j8;
                            str = "fixedSpace ";
                            str2 = "weightChildrenCount ";
                            j3 = j7;
                            if (i65 >= i44) {
                                break;
                            }
                            float b2 = knc.b(knc.a((ffh) arrayList6.get(i65)));
                            int i66 = i65;
                            float f7 = f * b2;
                            try {
                                j9 -= Math.round(f7);
                                i65 = i66 + 1;
                                f6 = f;
                                j8 = j2;
                                j7 = j3;
                            } catch (IllegalArgumentException e) {
                                StringBuilder l = dfi.l("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i46, i43, "mainAxisMin ", "targetSpace ");
                                l.append(i62);
                                l.append("arrangementSpacingPx ");
                                l.append(j6);
                                l.append("weightChildrenCount ");
                                l.append(i54);
                                l.append("fixedSpace ");
                                l.append(i55);
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
                        int i67 = i63;
                        int i68 = i51;
                        int i69 = 0;
                        while (i68 < i44) {
                            if (kskVarArr3[i68] == null) {
                                i23 = i44;
                                ffh ffhVar6 = (ffh) arrayList6.get(i68);
                                arrayList3 = arrayList6;
                                float b3 = knc.b(knc.a(ffhVar6));
                                if ((b3 > 0.0f ? i : 0) == 0) {
                                    xq0.q("All weights <= 0 should have placeables");
                                    return null;
                                }
                                i25 = i68;
                                int signum = Long.signum(j9);
                                str3 = str;
                                j9 -= signum;
                                float f8 = f * b3;
                                int max2 = Math.max(0, Math.round(f8) + signum);
                                if (max2 != Integer.MAX_VALUE) {
                                    int i70 = i64;
                                    f2 = f8;
                                    i26 = i70;
                                    i27 = max2;
                                } else {
                                    int i71 = i64;
                                    f2 = f8;
                                    i26 = i71;
                                    i27 = 0;
                                }
                                String str5 = str2;
                                i24 = i55;
                                try {
                                    ksk M4 = ffhVar6.M(qld.A(i27, max2, 0, i26));
                                    int a04 = M4.a0();
                                    int Z2 = M4.Z();
                                    iArr10[i25 - i51] = a04;
                                    i69 += a04;
                                    int max3 = Math.max(i67, Z2);
                                    kskVarArr3[i25] = M4;
                                    i67 = max3;
                                    str4 = str5;
                                } catch (IllegalArgumentException e2) {
                                    StringBuilder l2 = dfi.l("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i46, i43, "mainAxisMin ", "targetSpace ");
                                    l2.append(i62);
                                    l2.append("arrangementSpacingPx ");
                                    l2.append(j6);
                                    l2.append(str5);
                                    l2.append(i54);
                                    l2.append(str3);
                                    l2.append(i24);
                                    ouj.C(l2, "arrangementSpacingTotal ", j3, "remainingToTarget ");
                                    l2.append(j2);
                                    l2.append("totalWeight ");
                                    l2.append(f5);
                                    l2.append("weightUnitSpace ");
                                    l2.append(f);
                                    l2.append("weight ");
                                    l2.append(b3);
                                    l2.append("weightedSize ");
                                    l2.append(f2);
                                    l2.append("crossAxisDesiredSize nullremainderUnit ");
                                    l2.append(signum);
                                    l2.append("childMainAxisSize ");
                                    l2.append(max2);
                                    Throwable initCause2 = new IllegalArgumentException(l2.toString()).initCause(e2);
                                    initCause2.getClass();
                                    throw initCause2;
                                }
                            } else {
                                i23 = i44;
                                arrayList3 = arrayList6;
                                str3 = str;
                                i24 = i55;
                                i25 = i68;
                                i26 = i64;
                                str4 = str2;
                            }
                            i64 = i26;
                            f5 = f5;
                            str2 = str4;
                            i55 = i24;
                            arrayList6 = arrayList3;
                            str = str3;
                            i68 = i25 + 1;
                            i44 = i23;
                        }
                        i20 = i44;
                        arrayList2 = arrayList6;
                        i21 = i55;
                        i22 = 0;
                        d = yhn.d((int) (i69 + j3), 0, i46 - i21);
                        i53 = i67;
                    }
                    int i72 = i21 + d;
                    if (i72 < 0) {
                        i72 = i22;
                    }
                    int max4 = Math.max(i72, i43);
                    int max5 = Math.max(i53, Math.max(i18, i22 + i22));
                    int i73 = i19;
                    int[] iArr13 = new int[i73];
                    for (int i74 = i22; i74 < i73; i74++) {
                        iArr13[i74] = i22;
                    }
                    this.a.w(mfhVar, max4, iArr10, mfhVar.getLayoutDirection(), iArr13);
                    int i75 = i43;
                    int i76 = i22;
                    lfh m0 = mfh.m0(mfhVar, max4, max5, new zmc(iArr9, i50, i51, i20, kskVarArr3, this, max5, mfhVar, i76, iArr13, 1));
                    int c3 = m0.c();
                    int a6 = m0.a();
                    iArr11[i50] = a6;
                    i42 += a6;
                    i43 = Math.max(i75, c3);
                    eqiVar.d(m0);
                    i15 = i50 + 1;
                    iArr6 = iArr9;
                    i31 = i47;
                    i30 = i76;
                    kskVarArr2 = kskVarArr3;
                    iArr4 = iArr8;
                    i9 = i52;
                    iArr5 = iArr12;
                    iArr7 = iArr11;
                    i41 = i20;
                    arrayList6 = arrayList2;
                }
                i16 = i30;
                int[] iArr14 = iArr6;
                int i77 = i43;
                int[] iArr15 = iArr7;
                if ((eqiVar.c != 0 ? i : i16) == 0) {
                    i17 = i16;
                } else {
                    i17 = i77;
                    i16 = i42;
                }
                nx0 nx0Var = this.b;
                int d2 = yhn.d(((eqiVar.c - 1) * mfhVar.L(nx0Var.d)) + i16, ga6.j(m), ga6.h(m));
                nx0Var.a(mfhVar, d2, iArr15, iArr14);
                return mfh.m0(mfhVar, yhn.d(i17, ga6.k(m), ga6.i(m)), d2, new inc(2, eqiVar));
            }
            knc.a(ffhVar3);
            ksk M5 = ffhVar3.M(a02);
            M5.a0();
            M5.Z();
            M5.a0();
            M5.Z();
        }
        i = 1;
        if (ffhVar4 != null) {
        }
        it = list2.iterator();
        long m2 = f8g.m(j, cqfVar);
        it.getClass();
        eqiVar = new eqi(new lfh[16]);
        int i292 = ga6.i(m2);
        int k2 = ga6.k(m2);
        int h2 = ga6.h(m2);
        soi soiVar22 = vpe.a;
        soiVar = new soi();
        ArrayList arrayList42 = new ArrayList();
        int ceil3 = (int) Math.ceil(mfhVar.n0(this.c));
        int ceil22 = (int) Math.ceil(mfhVar.n0(this.e));
        long a32 = ia6.a(0, i292, 0, h2);
        arrayList = arrayList42;
        a0 = f8g.a0(f8g.o(14, a32));
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
        nmcVar = new nmc(this.f, m2, ceil3, ceil22);
        i2 = ceil3;
        c = nmcVar.c(it2.hasNext(), 0, qpe.a(i292, h2), qpeVar, 0, 0, 0, false, false);
        z = c.b;
        if (z) {
            smc smcVar22 = smc.a;
        }
        int i312 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        it3 = it2;
        i6 = i292;
        int[] iArr52 = iArr32;
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = 0;
        i11 = h2;
        while (!c.b) {
            valueOf.getClass();
            int intValue3 = valueOf.intValue();
            valueOf2.getClass();
            int i322 = i2;
            int i332 = i3 + intValue3;
            int max6 = Math.max(i7, valueOf2.intValue());
            int i342 = i6 - intValue3;
            int i352 = i8 + 1;
            ArrayList arrayList52 = arrayList;
            arrayList52.add(ffhVar2);
            soiVar.h(i8, xqnVar.a);
            int i362 = i352 - i10;
            if (it3.hasNext()) {
            }
            ffhVar2 = null;
            xqnVar.a = null;
            if (ffhVar2 != null) {
            }
            Integer valueOf322 = qpeVar2 != null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + i322) : null;
            if (qpeVar2 != null) {
            }
            boolean hasNext22 = it3.hasNext();
            long a422 = qpe.a(i342, i11);
            if (qpeVar2 == null) {
            }
            c2 = nmcVar.c(hasNext22, i362, a422, qpeVar3, i4, i5, max6, false, false);
            if (c2.a) {
            }
            valueOf = num;
            c = c2;
            i8 = i352;
            i3 = i332;
            i2 = i322;
            arrayList = arrayList52;
            i7 = max6;
            a0 = j4;
        }
        ArrayList arrayList62 = arrayList;
        int i402 = i2;
        size = arrayList62.size();
        ksk[] kskVarArr4 = new ksk[size];
        while (i12 < size) {
        }
        int[] iArr62 = new int[i9];
        while (i13 < i9) {
        }
        int[] iArr72 = new int[i9];
        while (i14 < i9) {
        }
        i15 = 0;
        int i412 = 0;
        int i422 = 0;
        int i432 = k2;
        ksk[] kskVarArr22 = kskVarArr4;
        while (i15 < i9) {
        }
        i16 = i302;
        int[] iArr142 = iArr62;
        int i772 = i432;
        int[] iArr152 = iArr72;
        if ((eqiVar.c != 0 ? i : i16) == 0) {
        }
        nx0 nx0Var2 = this.b;
        int d22 = yhn.d(((eqiVar.c - 1) * mfhVar.L(nx0Var2.d)) + i16, ga6.j(m2), ga6.h(m2));
        nx0Var2.a(mfhVar, d22, iArr152, iArr142);
        return mfh.m0(mfhVar, yhn.d(i17, ga6.k(m2), ga6.i(m2)), d22, new inc(2, eqiVar));
    }

    @Override // defpackage.ggi
    public final int c(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        char c = 2;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(0, i, 7);
        xmc xmcVar = this.f;
        xmcVar.a(ffhVar, ffhVar2, b);
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
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = 0;
        }
        int size2 = list5.size();
        int[] iArr2 = new int[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            iArr2[i3] = 0;
        }
        int size3 = list5.size();
        int i4 = 0;
        while (i4 < size3) {
            ffh ffhVar3 = (ffh) list5.get(i4);
            char c2 = c;
            int intValue = ((Number) this.i.invoke(ffhVar3, Integer.valueOf(i4), Integer.valueOf(i))).intValue();
            iArr[i4] = intValue;
            iArr2[i4] = ((Number) this.h.invoke(ffhVar3, Integer.valueOf(i4), Integer.valueOf(intValue))).intValue();
            i4++;
            c = c2;
        }
        if (Integer.MAX_VALUE < list5.size()) {
            smc smcVar = smc.a;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            smc smcVar2 = smc.a;
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int size4 = ((list5.size() - 1) * L) + xz0.S(iArr);
        if (size2 == 0) {
            wvs.n();
            return 0;
        }
        int i5 = iArr2[0];
        int i6 = size2 - 1;
        if (1 <= i6) {
            int i7 = 1;
            while (true) {
                int i8 = iArr2[i7];
                if (i5 < i8) {
                    i5 = i8;
                }
                if (i7 == i6) {
                    break;
                }
                i7++;
            }
        }
        if (size == 0) {
            wvs.n();
            return 0;
        }
        int i9 = iArr[0];
        int i10 = size - 1;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = iArr[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        int i13 = size4;
        while (i9 <= size4 && i5 != i) {
            int i14 = (i9 + size4) / 2;
            xmc xmcVar2 = xmcVar;
            long c3 = knc.c(list5, new hnc(iArr, 1), new hnc(iArr2, 3), i14, L, L2, xmcVar2);
            i5 = (int) (c3 >> 32);
            int i15 = (int) (c3 & 4294967295L);
            if (i5 > i || i15 < min) {
                i9 = i14 + 1;
                if (i9 > size4) {
                    return i9;
                }
            } else {
                if (i5 >= i) {
                    return i14;
                }
                size4 = i14 - 1;
            }
            i13 = i14;
            xmcVar = xmcVar2;
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
        xmc xmcVar = this.f;
        xmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        return (int) (knc.c(list5, this.i, this.h, i, L, L2, xmcVar) >> 32);
    }

    @Override // defpackage.ggi
    public final int e(fxe fxeVar, List list, int i) {
        fxeVar.getClass();
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        ffh ffhVar2 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        long b = ia6.b(i, 0, 13);
        xmc xmcVar = this.f;
        xmcVar.a(ffhVar, ffhVar2, b);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        int L = fxeVar.L(this.c);
        int L2 = fxeVar.L(this.e);
        list5.getClass();
        return (int) (knc.c(list5, this.i, this.h, i, L, L2, xmcVar) >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnc)) {
            return false;
        }
        fnc fncVar = (fnc) obj;
        return this.a.equals(fncVar.a) && this.b.equals(fncVar.b) && cma.a(this.c, fncVar.c) && Intrinsics.d(this.d, fncVar.d) && cma.a(this.e, fncVar.e) && this.f.equals(fncVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1d.a(Integer.MAX_VALUE, f1d.a(Integer.MAX_VALUE, eta.a((this.d.hashCode() + eta.a((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + cma.b(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + cma.b(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
