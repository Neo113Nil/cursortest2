package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class gnc implements ggi, fho {
    public final mx0 a;
    public final ox0 b;
    public final float c;
    public final hu6 d;
    public final float e;
    public final int f;
    public final ymc g;

    public gnc(mx0 mx0Var, ox0 ox0Var, float f, hu6 hu6Var, float f2, int i, ymc ymcVar) {
        this.a = mx0Var;
        this.b = ox0Var;
        this.c = f;
        this.d = hu6Var;
        this.e = f2;
        this.f = i;
        this.g = ymcVar;
    }

    public static int k(List list, int i, int i2, int i3, int i4, ymc ymcVar) {
        boolean z;
        long a = qpe.a(0, 0);
        if (!list.isEmpty()) {
            int i5 = Integer.MAX_VALUE;
            omc omcVar = new omc(i4, ymcVar, ia6.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            ffh ffhVar = (ffh) CollectionsKt.S(list, 0);
            int z2 = ffhVar != null ? ffhVar.z(i) : 0;
            int G = ffhVar != null ? ffhVar.G(z2) : 0;
            int i6 = 0;
            if (omcVar.b(list.size() > 1, 0, qpe.a(i, Integer.MAX_VALUE), ffhVar == null ? null : new qpe(qpe.a(G, z2)), 0, 0, 0, false, false).b) {
                ymcVar.getClass();
                tmc tmcVar = tmc.a;
                a = a;
            } else {
                int size = list.size();
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    int i13 = i7 - G;
                    int i14 = i10 + 1;
                    int max = Math.max(i9, z2);
                    ffh ffhVar2 = (ffh) CollectionsKt.S(list, i14);
                    z2 = ffhVar2 != null ? ffhVar2.z(i) : 0;
                    int G2 = ffhVar2 != null ? ffhVar2.G(z2) + i2 : 0;
                    if (i10 + 2 < list.size()) {
                        i10 = i14;
                        z = true;
                    } else {
                        i10 = i14;
                        z = false;
                    }
                    int i15 = i10 - i12;
                    int i16 = i8;
                    int i17 = G2;
                    lu6 b = omcVar.b(z, i15, qpe.a(i13, i5), ffhVar2 == null ? null : new qpe(qpe.a(G2, z2)), i16, i6, max, false, false);
                    if (b.a) {
                        int i18 = max + i3 + i6;
                        omcVar.a(b, ffhVar2 != null, i16, i18, i13, i15);
                        int i19 = i17 - i2;
                        i8 = i16 + 1;
                        if (b.b) {
                            i11 = i10;
                            i6 = i18;
                            break;
                        }
                        i7 = i;
                        i12 = i10;
                        G = i19;
                        i6 = i18;
                        i9 = 0;
                    } else {
                        G = i17;
                        i7 = i13;
                        i8 = i16;
                        i9 = max;
                    }
                    i11 = i10;
                    i5 = Integer.MAX_VALUE;
                }
                a = qpe.a(i6 - i3, i11);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.ggi
    public final int a(fxe fxeVar, List list, int i) {
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        this.g.a(ffhVar, list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null, ia6.b(0, i, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        int L = fxeVar.L(this.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int J = ((ffh) list4.get(i2)).J(i) + L;
            int i6 = i2 + 1;
            if (i6 - i4 == this.f || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + J) - L);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += J;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    @Override // defpackage.ggi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, long j) {
        ffh ffhVar;
        ffh ffhVar2;
        eqi eqiVar;
        ffh ffhVar3;
        qpe qpeVar;
        lu6 lu6Var;
        int i;
        ArrayList arrayList;
        int i2;
        qpe qpeVar2;
        int i3;
        qpe qpeVar3;
        lu6 b;
        int i4;
        Integer num;
        gnc gncVar = this;
        if (gncVar.f != 0 && !list.isEmpty()) {
            int h = ga6.h(j);
            ymc ymcVar = gncVar.g;
            if (h != 0) {
                List list2 = (List) CollectionsKt.Q(list);
                if (list2.isEmpty()) {
                    return mfh.m0(mfhVar, 0, 0, lhb.B);
                }
                List list3 = (List) CollectionsKt.S(list, 1);
                ffh ffhVar4 = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
                List list4 = (List) CollectionsKt.S(list, 2);
                ffh ffhVar5 = list4 != null ? (ffh) CollectionsKt.firstOrNull(list4) : null;
                list2.size();
                ymcVar.getClass();
                dqf dqfVar = dqf.a;
                long T = o8g.T(o8g.o(10, o8g.n(j, dqfVar)));
                if (ffhVar4 != null) {
                    vq2.H(ffhVar4, gncVar, T, new umc(ymcVar, gncVar, 0));
                }
                if (ffhVar5 != null) {
                    vq2.H(ffhVar5, gncVar, T, new umc(ymcVar, gncVar, 1));
                }
                Iterator it = list2.iterator();
                long n = o8g.n(j, dqfVar);
                eqi eqiVar2 = new eqi(new lfh[16]);
                int i5 = ga6.i(n);
                int k = ga6.k(n);
                int h2 = ga6.h(n);
                soi soiVar = vpe.a;
                soi soiVar2 = new soi();
                ArrayList arrayList2 = new ArrayList();
                int ceil = (int) Math.ceil(mfhVar.n0(gncVar.c));
                int ceil2 = (int) Math.ceil(mfhVar.n0(gncVar.e));
                long a = ia6.a(0, i5, 0, h2);
                soi soiVar3 = soiVar2;
                long T2 = o8g.T(o8g.o(14, a));
                xqn xqnVar = new xqn();
                if (it.hasNext()) {
                    try {
                        ffhVar = (ffh) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        ffhVar = null;
                    }
                    ffhVar2 = ffhVar;
                } else {
                    ffhVar2 = null;
                }
                if (ffhVar2 != null) {
                    eqiVar = eqiVar2;
                    ffhVar3 = ffhVar2;
                    qpeVar = new qpe(vq2.H(ffhVar2, gncVar, T2, new ne0(xqnVar, 3)));
                } else {
                    eqiVar = eqiVar2;
                    ffhVar3 = ffhVar2;
                    qpeVar = null;
                }
                Integer valueOf = qpeVar != null ? Integer.valueOf((int) (qpeVar.a >> 32)) : null;
                Integer valueOf2 = qpeVar != null ? Integer.valueOf((int) (qpeVar.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                int i6 = gncVar.f;
                ymc ymcVar2 = gncVar.g;
                omc omcVar = new omc(i6, ymcVar2, n, ceil, ceil2);
                qpe qpeVar4 = qpeVar;
                lu6 b2 = omcVar.b(it.hasNext(), 0, qpe.a(i5, h2), qpeVar4, 0, 0, 0, false, false);
                if (b2.b) {
                    lu6Var = b2;
                    omcVar.a(lu6Var, qpeVar4 != null, -1, 0, i5, 0);
                } else {
                    lu6Var = b2;
                }
                Integer num2 = valueOf2;
                int[] iArr3 = iArr2;
                int i7 = i5;
                ffh ffhVar6 = ffhVar3;
                Integer num3 = valueOf;
                int[] iArr4 = iArr;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = k;
                int i15 = h2;
                lu6 lu6Var2 = lu6Var;
                int i16 = 0;
                int i17 = 0;
                while (!lu6Var2.b && ffhVar6 != null) {
                    num3.getClass();
                    int intValue = num3.intValue();
                    num2.getClass();
                    int intValue2 = num2.intValue();
                    int i18 = i10;
                    int i19 = i11 + intValue;
                    int max = Math.max(i8, intValue2);
                    int i20 = i7 - intValue;
                    int i21 = i16 + 1;
                    ymcVar2.getClass();
                    arrayList2.add(ffhVar6);
                    soi soiVar4 = soiVar3;
                    soiVar4.h(i16, xqnVar.a);
                    int i22 = i21 - i17;
                    if (it.hasNext()) {
                        try {
                            ffhVar6 = (ffh) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                        xqnVar.a = null;
                        if (ffhVar6 == null) {
                            arrayList = arrayList2;
                            i2 = i15;
                            qpeVar2 = new qpe(vq2.H(ffhVar6, gncVar, T2, new ne0(xqnVar, 2)));
                        } else {
                            arrayList = arrayList2;
                            i2 = i15;
                            qpeVar2 = null;
                        }
                        Integer valueOf3 = qpeVar2 == null ? Integer.valueOf(((int) (qpeVar2.a >> 32)) + ceil) : null;
                        long j2 = T2;
                        Integer valueOf4 = qpeVar2 == null ? Integer.valueOf((int) (qpeVar2.a & 4294967295L)) : null;
                        boolean hasNext = it.hasNext();
                        int i23 = i2;
                        long a2 = qpe.a(i20, i23);
                        if (qpeVar2 != null) {
                            i3 = i20;
                            qpeVar3 = null;
                        } else {
                            valueOf3.getClass();
                            int intValue3 = valueOf3.intValue();
                            valueOf4.getClass();
                            i3 = i20;
                            qpeVar3 = new qpe(qpe.a(intValue3, valueOf4.intValue()));
                        }
                        b = omcVar.b(hasNext, i22, a2, qpeVar3, i12, i13, max, false, false);
                        if (b.a) {
                            i4 = i14;
                            i15 = i23;
                            num = valueOf3;
                            i11 = i19;
                            i10 = i18;
                            i7 = i3;
                        } else {
                            i4 = Math.min(Math.max(i14, i19), i5);
                            int i24 = i13 + max;
                            omc omcVar2 = omcVar;
                            omcVar2.a(b, qpeVar2 != null, i12, i24, i3, i22);
                            omcVar = omcVar2;
                            b = b;
                            int i25 = i18 + 1;
                            if (iArr3.length < i25) {
                                iArr3 = Arrays.copyOf(iArr3, Math.max(i25, (iArr3.length * 3) / 2));
                            }
                            iArr3[i18] = max;
                            i10 = i18 + 1;
                            i15 = (h2 - i24) - ceil2;
                            int i26 = i9 + 1;
                            if (iArr4.length < i26) {
                                iArr4 = Arrays.copyOf(iArr4, Math.max(i26, (iArr4.length * 3) / 2));
                            }
                            iArr4[i9] = i21;
                            i9++;
                            num = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                            i12++;
                            i13 = i24 + ceil2;
                            i17 = i21;
                            i7 = i5;
                            i11 = 0;
                            max = 0;
                        }
                        arrayList2 = arrayList;
                        i16 = i21;
                        num3 = num;
                        soiVar3 = soiVar4;
                        num2 = valueOf4;
                        i8 = max;
                        T2 = j2;
                        i14 = i4;
                        lu6Var2 = b;
                        gncVar = this;
                    }
                    ffhVar6 = null;
                    xqnVar.a = null;
                    if (ffhVar6 == null) {
                    }
                    if (qpeVar2 == null) {
                    }
                    long j22 = T2;
                    if (qpeVar2 == null) {
                    }
                    boolean hasNext2 = it.hasNext();
                    int i232 = i2;
                    long a22 = qpe.a(i20, i232);
                    if (qpeVar2 != null) {
                    }
                    b = omcVar.b(hasNext2, i22, a22, qpeVar3, i12, i13, max, false, false);
                    if (b.a) {
                    }
                    arrayList2 = arrayList;
                    i16 = i21;
                    num3 = num;
                    soiVar3 = soiVar4;
                    num2 = valueOf4;
                    i8 = max;
                    T2 = j22;
                    i14 = i4;
                    lu6Var2 = b;
                    gncVar = this;
                }
                soi soiVar5 = soiVar3;
                ArrayList arrayList3 = arrayList2;
                int i27 = i10;
                int size = arrayList3.size();
                ksk[] kskVarArr = new ksk[size];
                for (int i28 = 0; i28 < size; i28++) {
                    kskVarArr[i28] = soiVar5.b(i28);
                }
                int[] iArr5 = new int[i9];
                int[] iArr6 = new int[i9];
                int i29 = i14;
                int[] iArr7 = iArr3;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i31 < i9) {
                    int i33 = iArr4[i31];
                    if (i31 < 0 || i31 >= (i = i27)) {
                        e7o.o("Index must be between 0 and size");
                        return null;
                    }
                    int[] iArr8 = iArr7;
                    int[] iArr9 = iArr4;
                    i27 = i;
                    lfh x = w1g.x(this, i29, ga6.j(a), ga6.i(a), iArr7[i31], ceil, mfhVar, arrayList3, kskVarArr, i30, i33, iArr5, i31);
                    int c = x.c();
                    int a3 = x.a();
                    iArr6[i31] = a3;
                    i32 += a3;
                    i29 = Math.max(i29, c);
                    eqiVar.d(x);
                    i31++;
                    i30 = i33;
                    iArr7 = iArr8;
                    iArr4 = iArr9;
                    i9 = i9;
                }
                eqi eqiVar3 = eqiVar;
                if (eqiVar3.c == 0) {
                    i29 = 0;
                    i32 = 0;
                }
                ox0 ox0Var = this.b;
                int L = ((eqiVar3.c - 1) * mfhVar.L(ox0Var.o())) + i32;
                int j3 = ga6.j(n);
                int h3 = ga6.h(n);
                if (L < j3) {
                    L = j3;
                }
                if (L <= h3) {
                    h3 = L;
                }
                ox0Var.a(mfhVar, h3, iArr6, iArr5);
                int k2 = ga6.k(n);
                int i34 = ga6.i(n);
                if (i29 < k2) {
                    i29 = k2;
                }
                if (i29 <= i34) {
                    i34 = i29;
                }
                return mfh.m0(mfhVar, i34, h3, new pmc(0, eqiVar3));
            }
            ymcVar.getClass();
            tmc tmcVar = tmc.a;
            tmc tmcVar2 = tmc.a;
        }
        return mfh.m0(mfhVar, 0, 0, lhb.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ggi
    public final int c(fxe fxeVar, List list, int i) {
        int[] iArr;
        int i2;
        List list2;
        int i3;
        int[] iArr2;
        int i4;
        long a;
        int i5;
        int i6;
        int i7;
        qpe qpeVar;
        int i8;
        gnc gncVar = this;
        List list3 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.S(list, 2);
        int i9 = 0;
        gncVar.g.a(ffhVar, list4 != null ? (ffh) CollectionsKt.firstOrNull(list4) : null, ia6.b(0, i, 7));
        List list5 = (List) CollectionsKt.firstOrNull(list);
        if (list5 == null) {
            list5 = c5b.a;
        }
        int L = fxeVar.L(gncVar.c);
        int L2 = fxeVar.L(gncVar.e);
        long a2 = qpe.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr3 = new int[size];
        int size2 = list5.size();
        int[] iArr4 = new int[size2];
        List list6 = list5;
        int size3 = list6.size();
        for (int i10 = 0; i10 < size3; i10++) {
            ffh ffhVar2 = (ffh) list5.get(i10);
            int G = ffhVar2.G(i);
            iArr3[i10] = G;
            iArr4[i10] = ffhVar2.z(G);
        }
        int size4 = list5.size();
        ymc ymcVar = gncVar.g;
        int i11 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE < size4) {
            ymcVar.getClass();
            tmc tmcVar = tmc.a;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            ymcVar.getClass();
            tmc tmcVar2 = tmc.a;
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int size5 = ((list5.size() - 1) * L) + xz0.S(iArr3);
        if (size2 == 0) {
            wvs.n();
            return 0;
        }
        int i12 = iArr4[0];
        ype it = new IntRange(1, size2 - 1, 1).iterator();
        while (it.c) {
            int i13 = iArr4[it.nextInt()];
            if (i12 < i13) {
                i12 = i13;
            }
        }
        if (size == 0) {
            wvs.n();
            return 0;
        }
        int i14 = iArr3[0];
        ype it2 = new IntRange(1, size - 1, 1).iterator();
        while (it2.c) {
            int i15 = iArr3[it2.nextInt()];
            if (i14 < i15) {
                i14 = i15;
            }
        }
        int i16 = size5;
        while (i14 <= i16 && i12 != i) {
            int i17 = (i14 + i16) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                iArr2 = iArr3;
                a = a2;
                i2 = i9;
                i3 = i17;
                iArr = iArr4;
            } else {
                int i18 = i11;
                long a3 = ia6.a(i9, i17, i9, i18);
                int i19 = i17;
                iArr = iArr4;
                omc omcVar = new omc(gncVar.f, ymcVar, a3, L, L2);
                ffh ffhVar3 = (ffh) CollectionsKt.S(list5, i9);
                int i20 = ffhVar3 != null ? iArr[i9] : i9;
                int i21 = ffhVar3 != null ? iArr3[i9] : i9;
                i2 = i9;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                if (omcVar.b(list5.size() > 1 ? 1 : i2, 0, qpe.a(i19, i18), ffhVar3 == null ? null : new qpe(qpe.a(i21, i20)), 0, 0, 0, false, false).b) {
                    ymcVar.getClass();
                    tmc tmcVar3 = tmc.a;
                    list2 = list5;
                    i3 = i19;
                    iArr2 = iArr3;
                    a = a2;
                } else {
                    int size6 = list6.size();
                    int i25 = i19;
                    int i26 = i2;
                    int i27 = i26;
                    int i28 = i27;
                    while (true) {
                        int i29 = i24;
                        if (i26 >= size6) {
                            list2 = list5;
                            i3 = i19;
                            iArr2 = iArr3;
                            i4 = i28;
                            break;
                        }
                        i25 -= i21;
                        i4 = i26 + 1;
                        i24 = Math.max(i29, i20);
                        ffh ffhVar4 = (ffh) CollectionsKt.S(list5, i4);
                        int i30 = ffhVar4 != null ? iArr[i4] : i2;
                        if (ffhVar4 != null) {
                            i5 = i26;
                            i6 = iArr3[i4] + L;
                        } else {
                            i5 = i26;
                            i6 = i2;
                        }
                        list2 = list5;
                        i3 = i19;
                        boolean z = i5 + 2 < list2.size() ? 1 : i2;
                        int i31 = i4 - i27;
                        long a4 = qpe.a(i25, Integer.MAX_VALUE);
                        if (ffhVar4 == null) {
                            i7 = i6;
                            iArr2 = iArr3;
                            qpeVar = null;
                        } else {
                            iArr2 = iArr3;
                            i7 = i6;
                            qpeVar = new qpe(qpe.a(i6, i30));
                        }
                        lu6 b = omcVar.b(z, i31, a4, qpeVar, i22, i23, i24, false, false);
                        if (b.a) {
                            int i32 = i24 + L2 + i23;
                            int i33 = i22;
                            omcVar.a(b, ffhVar4 != null ? 1 : i2, i33, i32, i25, i31);
                            i8 = i7 - L;
                            i22 = i33 + 1;
                            if (b.b) {
                                i23 = i32;
                                break;
                            }
                            i27 = i4;
                            i23 = i32;
                            i24 = i2;
                            i25 = i3;
                        } else {
                            i8 = i7;
                        }
                        iArr3 = iArr2;
                        i26 = i4;
                        i28 = i26;
                        i20 = i30;
                        list5 = list2;
                        i21 = i8;
                        i19 = i3;
                    }
                    a = qpe.a(i23 - L2, i4);
                }
            }
            i12 = (int) (a >> 32);
            int i34 = (int) (a & 4294967295L);
            if (i12 > i || i34 < min) {
                i14 = i3 + 1;
                if (i14 > i16) {
                    return i14;
                }
            } else {
                if (i12 >= i) {
                    return i3;
                }
                i16 = i3 - 1;
            }
            gncVar = this;
            iArr3 = iArr2;
            iArr4 = iArr;
            i9 = i2;
            size5 = i3;
            i11 = Integer.MAX_VALUE;
            list5 = list2;
        }
        return size5;
    }

    @Override // defpackage.ggi
    public final int d(fxe fxeVar, List list, int i) {
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        this.g.a(ffhVar, list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null, ia6.b(i, 0, 13));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        return k(list4, i, fxeVar.L(this.c), fxeVar.L(this.e), this.f, this.g);
    }

    @Override // defpackage.ggi
    public final int e(fxe fxeVar, List list, int i) {
        List list2 = (List) CollectionsKt.S(list, 1);
        ffh ffhVar = list2 != null ? (ffh) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.S(list, 2);
        this.g.a(ffhVar, list3 != null ? (ffh) CollectionsKt.firstOrNull(list3) : null, ia6.b(i, 0, 13));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = c5b.a;
        }
        return k(list4, i, fxeVar.L(this.c), fxeVar.L(this.e), this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnc)) {
            return false;
        }
        gnc gncVar = (gnc) obj;
        return this.a.equals(gncVar.a) && this.b.equals(gncVar.b) && cma.a(this.c, gncVar.c) && this.d.equals(gncVar.d) && cma.a(this.e, gncVar.e) && this.f == gncVar.f && Intrinsics.d(this.g, gncVar.g);
    }

    @Override // defpackage.fho
    public final void f(int i, int[] iArr, int[] iArr2, mfh mfhVar) {
        this.a.w(mfhVar, i, iArr, mfhVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.fho
    public final lfh g(ksk[] kskVarArr, mfh mfhVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return mfh.m0(mfhVar, i2, i3, new anc(iArr2, i4, i5, i6, kskVarArr, this, i3, xof.a, i, iArr));
    }

    @Override // defpackage.fho
    public final int h(ksk kskVar) {
        return kskVar.Z();
    }

    public final int hashCode() {
        return this.g.hashCode() + f1d.a(Integer.MAX_VALUE, f1d.a(this.f, eta.a((this.d.hashCode() + eta.a((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    @Override // defpackage.fho
    public final int i(ksk kskVar) {
        return kskVar.a0();
    }

    @Override // defpackage.fho
    public final long j(int i, int i2, int i3, boolean z) {
        nho nhoVar = lho.a;
        return !z ? ia6.a(i, i2, 0, i3) : qld.A(i, i2, 0, i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.a);
        sb.append(", verticalArrangement=");
        sb.append(this.b);
        sb.append(", mainAxisSpacing=");
        vz1.z(this.c, ", crossAxisAlignment=", sb);
        sb.append(this.d);
        sb.append(", crossAxisArrangementSpacing=");
        vz1.z(this.e, ", maxItemsInMainAxis=", sb);
        sb.append(this.f);
        sb.append(", maxLines=2147483647, overflow=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
