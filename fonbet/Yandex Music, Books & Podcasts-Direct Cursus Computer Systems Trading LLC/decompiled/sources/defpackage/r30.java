package defpackage;

import androidx.compose.ui.layout.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r30 implements kfh {
    public static final r30 b = new r30(0);
    public static final r30 c = new r30(1);
    public static final r30 d = new r30(2);
    public static final r30 e = new r30(3);
    public static final r30 f = new r30(4);
    public static final r30 g = new r30(5);
    public static final r30 h = new r30(6);
    public static final r30 i = new r30(7);
    public static final r30 j = new r30(8);
    public static final r30 k = new r30(9);
    public static final r30 l = new r30(10);
    public static final r30 m = new r30(11);
    public static final r30 n = new r30(12);
    public static final r30 o = new r30(13);
    public final /* synthetic */ int a;

    public /* synthetic */ r30(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a9  */
    @Override // defpackage.kfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, final long j2) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        int s0;
        int i4;
        Pair pair;
        int L;
        int max;
        switch (this.a) {
            case 0:
                int size = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        obj = list.get(i5);
                        if (!Intrinsics.d(a.a((ffh) obj), "title")) {
                            i5++;
                        }
                    } else {
                        obj = null;
                    }
                }
                ffh ffhVar = (ffh) obj;
                ksk M = ffhVar != null ? ffhVar.M(ga6.b(j2, 0, 0, 0, 0, 11)) : null;
                int size2 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        obj2 = list.get(i6);
                        if (!Intrinsics.d(a.a((ffh) obj2), "text")) {
                            i6++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ffh ffhVar2 = (ffh) obj2;
                ksk M2 = ffhVar2 != null ? ffhVar2.M(ga6.b(j2, 0, 0, 0, 0, 11)) : null;
                int max2 = Math.max(M != null ? M.a : 0, M2 != null ? M2.a : 0);
                if (M != null) {
                    int Y = M.Y(j40.a);
                    Integer valueOf = Y == Integer.MIN_VALUE ? null : Integer.valueOf(Y);
                    if (valueOf != null) {
                        i2 = valueOf.intValue();
                        if (M != null) {
                            int Y2 = M.Y(j40.b);
                            Integer valueOf2 = Y2 == Integer.MIN_VALUE ? null : Integer.valueOf(Y2);
                            if (valueOf2 != null) {
                                i3 = valueOf2.intValue();
                                s0 = mfhVar.s0(z30.c) - i2;
                                if (M2 != null) {
                                    int Y3 = M2.Y(j40.a);
                                    Integer valueOf3 = Y3 != Integer.MIN_VALUE ? Integer.valueOf(Y3) : null;
                                    if (valueOf3 != null) {
                                        i4 = valueOf3.intValue();
                                        int s02 = M != null ? mfhVar.s0(z30.e) : mfhVar.s0(z30.d);
                                        int i7 = M == null ? M.b + s0 : 0;
                                        int i8 = M != null ? s02 - i4 : (i3 == 0 ? i7 - i4 : (s0 + i3) - i4) + s02;
                                        if (M2 != null) {
                                            int i9 = M2.b;
                                            r2 = i3 == 0 ? (i9 + s02) - i4 : ((i9 + s02) - i4) - ((M != null ? M.b : 0) - i3);
                                        }
                                        return mfh.m0(mfhVar, max2, i7 + r2, new q30(M, s0, M2, i8));
                                    }
                                }
                                i4 = 0;
                                if (M != null) {
                                }
                                if (M == null) {
                                }
                                if (M != null) {
                                }
                                if (M2 != null) {
                                }
                                return mfh.m0(mfhVar, max2, i7 + r2, new q30(M, s0, M2, i8));
                            }
                        }
                        i3 = 0;
                        s0 = mfhVar.s0(z30.c) - i2;
                        if (M2 != null) {
                        }
                        i4 = 0;
                        if (M != null) {
                        }
                        if (M == null) {
                        }
                        if (M != null) {
                        }
                        if (M2 != null) {
                        }
                        return mfh.m0(mfhVar, max2, i7 + r2, new q30(M, s0, M2, i8));
                    }
                }
                i2 = 0;
                if (M != null) {
                }
                i3 = 0;
                s0 = mfhVar.s0(z30.c) - i2;
                if (M2 != null) {
                }
                i4 = 0;
                if (M != null) {
                }
                if (M == null) {
                }
                if (M != null) {
                }
                if (M2 != null) {
                }
                return mfh.m0(mfhVar, max2, i7 + r2, new q30(M, s0, M2, i8));
            case 1:
                ArrayList arrayList = new ArrayList(list.size());
                int size3 = list.size();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    ksk M3 = ((ffh) list.get(i12)).M(j2);
                    i10 = Math.max(i10, M3.a);
                    i11 = Math.max(i11, M3.b);
                    arrayList.add(M3);
                }
                if (list.isEmpty()) {
                    i10 = ga6.k(j2);
                    i11 = ga6.j(j2);
                }
                return mfh.m0(mfhVar, i10, i11, new vv(arrayList, 2));
            case 2:
                int size4 = list.size();
                if (size4 == 0) {
                    return mfh.m0(mfhVar, 0, 0, d5.H);
                }
                if (size4 == 1) {
                    ksk M4 = ((ffh) list.get(0)).M(j2);
                    return mfh.m0(mfhVar, M4.a, M4.b, new ai0(M4, 0));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size5 = list.size();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < size5; i15++) {
                    ksk M5 = ((ffh) list.get(i15)).M(j2);
                    i13 = Math.max(i13, M5.a);
                    i14 = Math.max(i14, M5.b);
                    arrayList2.add(M5);
                }
                return mfh.m0(mfhVar, i13, i14, new vv(arrayList2, 3));
            case 3:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size6 = list.size();
                for (int i16 = 0; i16 < size6; i16++) {
                    arrayList3.add(((ffh) list.get(i16)).M(j2));
                }
                return mfh.m0(mfhVar, ga6.i(j2), ga6.h(j2), new vv(arrayList3, 5));
            case 4:
                return mfh.m0(mfhVar, ga6.k(j2), ga6.j(j2), rq1.t);
            case 5:
                return mfh.m0(mfhVar, ga6.k(j2), ga6.j(j2), rq1.v0);
            case 6:
                mfhVar.getClass();
                list.getClass();
                if (list.size() != 2) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                final int a = eeh.a(ga6.h(j2) / 1.25d);
                final int i17 = a / 4;
                long b2 = ia6.b(a, a, 5);
                List list2 = list;
                final ArrayList arrayList4 = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((ffh) it.next()).M(b2));
                }
                return mfh.m0(mfhVar, ga6.i(j2), ga6.h(j2), new Function1() { // from class: qg6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        jsk jskVar = (jsk) obj3;
                        jskVar.getClass();
                        int i18 = ga6.i(j2) - a;
                        Iterator it2 = arrayList4.iterator();
                        int i19 = 0;
                        while (it2.hasNext()) {
                            jskVar.d((ksk) it2.next(), i18, i19, 0.0f);
                            int i20 = i17;
                            i18 -= i20;
                            i19 += i20;
                        }
                        return Unit.a;
                    }
                });
            case 7:
                return mfh.m0(mfhVar, ga6.i(j2), ga6.h(j2), jx9.K);
            case 8:
                return mfh.m0(mfhVar, ga6.k(j2), ga6.j(j2), lhb.Y);
            case 9:
                ArrayList arrayList5 = new ArrayList(list.size());
                int size7 = list.size();
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < size7; i20++) {
                    ksk M6 = ((ffh) list.get(i20)).M(j2);
                    i18 = Math.max(i18, M6.a);
                    i19 = Math.max(i19, M6.b);
                    arrayList5.add(M6);
                }
                return mfh.m0(mfhVar, i18, i19, new wyl(arrayList5, 4));
            case 10:
                ArrayList arrayList6 = new ArrayList(list.size());
                int size8 = list.size();
                boolean z = false;
                int i21 = Integer.MIN_VALUE;
                int i22 = Integer.MIN_VALUE;
                int i23 = 0;
                for (int i24 = 0; i24 < size8; i24++) {
                    ksk M7 = ((ffh) list.get(i24)).M(j2);
                    arrayList6.add(M7);
                    v2e v2eVar = j40.a;
                    if (M7.Y(v2eVar) != Integer.MIN_VALUE && (i21 == Integer.MIN_VALUE || M7.Y(v2eVar) < i21)) {
                        i21 = M7.Y(v2eVar);
                    }
                    v2e v2eVar2 = j40.b;
                    if (M7.Y(v2eVar2) != Integer.MIN_VALUE && (i22 == Integer.MIN_VALUE || M7.Y(v2eVar2) > i22)) {
                        i22 = M7.Y(v2eVar2);
                    }
                    i23 = Math.max(i23, M7.b);
                }
                if (i21 != Integer.MIN_VALUE && i22 != Integer.MIN_VALUE) {
                    z = true;
                }
                int max3 = Math.max(mfhVar.L((i21 == i22 || !z) ? l1r.f : l1r.g), i23);
                return mfh.m0(mfhVar, ga6.i(j2), max3, new wk8(arrayList6, max3, 5));
            case 11:
                return mfh.m0(mfhVar, ga6.g(j2) ? ga6.i(j2) : 0, ga6.f(j2) ? ga6.h(j2) : 0, dpo.Y);
            case 12:
                return mfh.m0(mfhVar, ga6.k(j2), ga6.j(j2), dpo.x0);
            case 13:
                mfhVar.getClass();
                list.getClass();
                if (list.size() == 1) {
                    pair = new Pair(((ffh) CollectionsKt.Q(list)).M(j2), null);
                } else {
                    ksk M8 = ((ffh) CollectionsKt.Y(list)).M(j2);
                    pair = new Pair(((ffh) CollectionsKt.Q(list)).M(ga6.b(j2, 0, ga6.i(j2) - M8.a, 0, 0, 12)), M8);
                }
                ksk kskVar = (ksk) pair.a;
                ksk kskVar2 = (ksk) pair.b;
                return mfh.m0(mfhVar, (kskVar2 != null ? kskVar2.a : 0) + kskVar.a, Math.max(kskVar.b, kskVar2 != null ? kskVar2.b : 0), new rt5(kskVar, kskVar2, kskVar.Y(j40.a), mfhVar, 2));
            default:
                int size9 = list.size();
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    if (i26 < size9) {
                        ffh ffhVar3 = (ffh) list.get(i26);
                        if (Intrinsics.d(a.a(ffhVar3), Constants.KEY_ACTION)) {
                            ksk M9 = ffhVar3.M(j2);
                            int i27 = (ga6.i(j2) - M9.a) - mfhVar.L(l1r.e);
                            int k2 = ga6.k(j2);
                            int i28 = i27 < k2 ? k2 : i27;
                            int size10 = list.size();
                            for (int i29 = 0; i29 < size10; i29++) {
                                ffh ffhVar4 = (ffh) list.get(i29);
                                if (Intrinsics.d(a.a(ffhVar4), "text")) {
                                    ksk M10 = ffhVar4.M(ga6.b(j2, 0, i28, 0, 0, 9));
                                    v2e v2eVar3 = j40.a;
                                    int Y4 = M10.Y(v2eVar3);
                                    int Y5 = M10.Y(j40.b);
                                    boolean z2 = true;
                                    boolean z3 = (Y4 == Integer.MIN_VALUE || Y5 == Integer.MIN_VALUE) ? false : true;
                                    if (Y4 != Y5 && z3) {
                                        z2 = false;
                                    }
                                    int i30 = ga6.i(j2) - M9.a;
                                    if (z2) {
                                        max = Math.max(mfhVar.L(l1r.f), M9.b);
                                        L = (max - M10.b) / 2;
                                        int Y6 = M9.Y(v2eVar3);
                                        if (Y6 != Integer.MIN_VALUE) {
                                            i25 = (Y4 + L) - Y6;
                                        }
                                    } else {
                                        L = mfhVar.L(l1r.a) - Y4;
                                        max = Math.max(mfhVar.L(l1r.g), M10.b + L);
                                        i25 = (max - M9.b) / 2;
                                    }
                                    return mfh.m0(mfhVar, ga6.i(j2), max, new j1r(M10, L, M9, i30, i25));
                                }
                            }
                            wvs.h("Collection contains no element matching the predicate.");
                        } else {
                            i26++;
                        }
                    } else {
                        wvs.h("Collection contains no element matching the predicate.");
                    }
                }
                return null;
        }
    }
}
