package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class zuf extends uif implements Function2 {
    public final /* synthetic */ wfl A;
    public final /* synthetic */ gz2 B;
    public final /* synthetic */ hz2 C;
    public final /* synthetic */ fvf r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ ox0 w;
    public final /* synthetic */ mx0 x;
    public final /* synthetic */ mm6 y;
    public final /* synthetic */ uod z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuf(fvf fvfVar, boolean z, o0k o0kVar, boolean z2, p9f p9fVar, ox0 ox0Var, mx0 mx0Var, mm6 mm6Var, uod uodVar, wfl wflVar, gz2 gz2Var, hz2 hz2Var) {
        super(2);
        this.r = fvfVar;
        this.s = z;
        this.t = o0kVar;
        this.u = z2;
        this.v = p9fVar;
        this.w = ox0Var;
        this.x = mx0Var;
        this.y = mm6Var;
        this.z = uodVar;
        this.A = wflVar;
        this.B = gz2Var;
        this.C = hz2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0482 A[LOOP:5: B:150:0x0482->B:156:0x04a7, LOOP_START, PHI: r10 r52
      0x0482: PHI (r10v39 int) = (r10v10 int), (r10v43 int) binds: [B:149:0x0480, B:156:0x04a7] A[DONT_GENERATE, DONT_INLINE]
      0x0482: PHI (r52v13 java.util.ArrayList) = (r52v1 java.util.ArrayList), (r52v14 java.util.ArrayList) binds: [B:149:0x0480, B:156:0x04a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04bd A[LOOP:6: B:162:0x04bb->B:163:0x04bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0688 A[LOOP:15: B:265:0x0686->B:266:0x0688, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0424  */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [kotlin.ranges.a] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float o;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        cvf cvfVar;
        float f;
        int f2;
        int i9;
        int i10;
        cvf cvfVar2;
        int max;
        int i11;
        float f3;
        ArrayList arrayList;
        int size;
        List list;
        int size2;
        int i12;
        int min;
        int i13;
        float f4;
        int i14;
        ArrayList arrayList2;
        List list2;
        int i15;
        List list3;
        int size3;
        int i16;
        int size4;
        int i17;
        boolean z;
        boolean z2;
        int i18;
        ArrayList arrayList3;
        long j;
        int i19;
        int i20;
        utf utfVar;
        float f5;
        cvf cvfVar3;
        yuf yufVar;
        int i21;
        roi roiVar;
        Integer valueOf;
        Integer valueOf2;
        bvf bvfVar;
        int i22;
        List list4;
        cvf cvfVar4;
        float f6;
        cvf cvfVar5;
        cvf cvfVar6;
        int i23;
        Object obj3;
        int i24;
        int min2;
        cvf cvfVar7;
        Object obj4;
        utf utfVar2 = (utf) obj;
        long j2 = ((ga6) obj2).a;
        fvf fvfVar = this.r;
        fvfVar.r.getValue();
        boolean z3 = fvfVar.b || utfVar2.b.F();
        boolean z4 = this.s;
        kg5.p(j2, z4 ? bxj.a : bxj.b);
        o0k o0kVar = this.t;
        int L = z4 ? utfVar2.b.L(o0kVar.b(utfVar2.b.getLayoutDirection())) : utfVar2.b.L(a.f(o0kVar, utfVar2.b.getLayoutDirection()));
        int L2 = z4 ? utfVar2.b.L(o0kVar.c(utfVar2.b.getLayoutDirection())) : utfVar2.b.L(a.e(o0kVar, utfVar2.b.getLayoutDirection()));
        float d = o0kVar.d();
        dnr dnrVar = utfVar2.b;
        int L3 = dnrVar.L(d);
        int L4 = dnrVar.L(o0kVar.a());
        int i25 = L3 + L4;
        int i26 = L + L2;
        int i27 = z4 ? i25 : i26;
        boolean z5 = this.u;
        int i28 = (!z4 || z5) ? (z4 && z5) ? L4 : (z4 || z5) ? L2 : L : L3;
        int i29 = i27 - i28;
        long i30 = ia6.i(j2, -i26, -i25);
        wuf wufVar = (wuf) this.v.invoke();
        atf atfVar = wufVar.c;
        x0 x0Var = wufVar.d;
        int i31 = ga6.i(i30);
        int h = ga6.h(i30);
        atfVar.a.i(i31);
        atfVar.b.i(h);
        mx0 mx0Var = this.x;
        ox0 ox0Var = this.w;
        if (z4) {
            if (ox0Var == null) {
                vme.b("null verticalArrangement when isVertical == true");
                rj7.f();
                return null;
            }
            o = ox0Var.o();
        } else {
            if (mx0Var == null) {
                vme.b("null horizontalAlignment when isVertical == false");
                rj7.f();
                return null;
            }
            o = mx0Var.o();
        }
        int L5 = dnrVar.L(o);
        int a = wufVar.a();
        int h2 = z4 ? ga6.h(j2) - i25 : ga6.i(j2) - i26;
        boolean z6 = this.u;
        if (z6 && h2 <= 0) {
            if (!z4) {
                L += h2;
            }
            if (z4) {
                L3 += h2;
            }
        }
        int i32 = h2;
        int i33 = i28;
        yuf yufVar2 = new yuf(i30, this.s, wufVar, utfVar2, a, L5, this.B, this.C, z6, i33, i29, (L << 32) | (L3 & 4294967295L), this.r);
        wuf wufVar2 = wufVar;
        long j3 = i30;
        long j4 = yufVar2.f;
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            int h3 = fvfVar.h();
            nsf nsfVar = fvfVar.d;
            int F = i4w.F(h3, wufVar2, nsfVar.e);
            if (h3 != F) {
                nsfVar.b.i(F);
                nsfVar.f.a(h3);
            }
            int i34 = fvfVar.i();
            wyf.b0(G, Q, e);
            List q = wct.q(wufVar2, fvfVar.q, fvfVar.n);
            float floatValue = (dnrVar.F() || !z3) ? fvfVar.g : ((Number) ((vm0) fvfVar.v.a).b.getValue()).floatValue();
            b bVar = fvfVar.m;
            boolean F2 = dnrVar.F();
            bvf bvfVar2 = fvfVar.c;
            aqi aqiVar = fvfVar.u;
            fsf fsfVar = new fsf(utfVar2, j2, i26, i25, 1);
            if (i33 < 0) {
                vme.a("invalid beforeContentPadding");
            }
            if (i29 < 0) {
                vme.a("invalid afterContentPadding");
            }
            boolean z7 = this.s;
            boolean z8 = this.u;
            mm6 mm6Var = this.y;
            uod uodVar = this.z;
            if (a <= 0) {
                int k = ga6.k(j3);
                int j5 = ga6.j(j3);
                bVar.d(0, k, j5, new ArrayList(), x0Var, yufVar2, z7, F2, 1, z3, 0, 0, mm6Var, uodVar);
                if (!F2) {
                    long b = bVar.b();
                    if (!hqe.a(b, 0L)) {
                        k = ia6.g((int) (b >> 32), j3);
                        j5 = ia6.f((int) (b & 4294967295L), j3);
                    }
                }
                bvfVar = new bvf(null, 0, false, 0.0f, (lfh) fsfVar.invoke(Integer.valueOf(k), Integer.valueOf(j5), vsf.u), 0.0f, false, mm6Var, utfVar2, yufVar2.f, c5b.a, -i33, i32 + i29, 0, z8, z7 ? bxj.a : bxj.b, i29, L5);
            } else {
                if (F >= a) {
                    i = a - 1;
                    i2 = 0;
                } else {
                    i = F;
                    i2 = i34;
                }
                int round = Math.round(floatValue);
                int i35 = i2 - round;
                if (i == 0 && i35 < 0) {
                    round += i35;
                    i35 = 0;
                }
                zx0 zx0Var = new zx0();
                int i36 = -i33;
                int i37 = (L5 < 0 ? L5 : 0) + i36;
                int i38 = i35 + i37;
                int i39 = 0;
                while (i38 < 0 && i > 0) {
                    int i40 = i - 1;
                    wuf wufVar3 = wufVar2;
                    cvf g = yufVar2.g(i40, j4);
                    zx0Var.add(0, g);
                    i39 = Math.max(i39, g.s);
                    i38 += g.r;
                    round = round;
                    i = i40;
                    wufVar2 = wufVar3;
                    fsfVar = fsfVar;
                }
                int i41 = round;
                fsf fsfVar2 = fsfVar;
                wuf wufVar4 = wufVar2;
                if (i38 < i37) {
                    i3 = i41 - (i37 - i38);
                    i38 = i37;
                } else {
                    i3 = i41;
                }
                int i42 = i38 - i37;
                int i43 = i32 + i29;
                int i44 = i39;
                int i45 = i43 < 0 ? 0 : i43;
                int i46 = i;
                int i47 = -i42;
                int i48 = i46;
                int i49 = 0;
                boolean z9 = false;
                while (i49 < zx0Var.c) {
                    if (i47 >= i45) {
                        zx0Var.a(i49);
                        z9 = true;
                    } else {
                        i48++;
                        i47 += ((cvf) zx0Var.get(i49)).r;
                        i49++;
                    }
                }
                int i50 = i44;
                int i51 = i42;
                boolean z10 = z9;
                int i52 = i48;
                while (i52 < a && (i47 < i45 || i47 <= 0 || zx0Var.isEmpty())) {
                    int i53 = i45;
                    cvf g2 = yufVar2.g(i52, j4);
                    long j6 = j3;
                    int i54 = g2.r;
                    i47 += i54;
                    if (i47 > i37 || i52 == a - 1) {
                        i50 = Math.max(i50, g2.s);
                        zx0Var.addLast(g2);
                    } else {
                        i46 = i52 + 1;
                        i51 -= i54;
                        z10 = true;
                    }
                    i52++;
                    i45 = i53;
                    j3 = j6;
                }
                long j7 = j3;
                if (i47 < i32) {
                    int i55 = i32 - i47;
                    int i56 = i47 + i55;
                    int i57 = i51 - i55;
                    while (i57 < i33 && i46 > 0) {
                        int i58 = i46 - 1;
                        int i59 = i55;
                        cvf g3 = yufVar2.g(i58, j4);
                        zx0Var.add(0, g3);
                        i50 = Math.max(i50, g3.s);
                        i57 += g3.r;
                        i46 = i58;
                        i55 = i59;
                        i56 = i56;
                    }
                    int i60 = i56;
                    i5 = i3 + i55;
                    if (i57 < 0) {
                        i5 += i57;
                        i4 = i60 + i57;
                        i7 = i46;
                        i6 = 0;
                        int i61 = i50;
                        int i62 = i52;
                        float f7 = (Integer.signum(Math.round(floatValue)) == Integer.signum(i5) || Math.abs(Math.round(floatValue)) < Math.abs(i5)) ? floatValue : i5;
                        float f8 = floatValue - f7;
                        float f9 = (F2 || i5 <= i3 || f8 > 0.0f) ? 0.0f : (i5 - i3) + f8;
                        if (i6 < 0) {
                            vme.a("negative currentFirstItemScrollOffset");
                        }
                        i8 = -i6;
                        cvfVar = (cvf) zx0Var.first();
                        if (i33 <= 0 || L5 < 0) {
                            f = 0.0f;
                            f2 = zx0Var.f();
                            cvf cvfVar8 = cvfVar;
                            i9 = i8;
                            i10 = 0;
                            while (i10 < f2) {
                                int i63 = f2;
                                int i64 = ((cvf) zx0Var.get(i10)).r;
                                if (i6 == 0 || i64 > i6 || i10 == zx0Var.f() - 1) {
                                    break;
                                }
                                i6 -= i64;
                                i10++;
                                cvfVar8 = (cvf) zx0Var.get(i10);
                                f2 = i63;
                            }
                            cvfVar2 = cvfVar8;
                        } else {
                            i9 = i8;
                            cvfVar2 = cvfVar;
                            f = 0.0f;
                        }
                        int i65 = i6;
                        max = Math.max(0, i7);
                        i11 = i7 - 1;
                        if (max > i11) {
                            arrayList = null;
                            while (true) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                f3 = f7;
                                arrayList.add(yufVar2.g(i11, j4));
                                if (i11 == max) {
                                    break;
                                }
                                i11--;
                                f7 = f3;
                            }
                        } else {
                            f3 = f7;
                            arrayList = null;
                        }
                        List list5 = q;
                        ArrayList arrayList4 = arrayList;
                        size = list5.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i66 = size - 1;
                                int intValue = ((Number) q.get(size)).intValue();
                                if (intValue < max) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    arrayList5.add(yufVar2.g(intValue, j4));
                                    arrayList4 = arrayList5;
                                }
                                if (i66 < 0) {
                                    break;
                                }
                                size = i66;
                            }
                        }
                        list = arrayList4;
                        if (list == null) {
                            list = c5b.a;
                        }
                        int i67 = i61;
                        i12 = 0;
                        for (size2 = list.size(); i12 < size2; size2 = size2) {
                            i67 = Math.max(i67, ((cvf) list.get(i12)).s);
                            i12++;
                        }
                        int i68 = a - 1;
                        min = Math.min(((cvf) CollectionsKt.Y(zx0Var)).a, i68);
                        int i69 = i67;
                        i13 = ((cvf) CollectionsKt.Y(zx0Var)).a + 1;
                        if (i13 > min) {
                            ArrayList arrayList6 = null;
                            while (true) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                f4 = f9;
                                arrayList2 = arrayList6;
                                i14 = i33;
                                arrayList2.add(yufVar2.g(i13, j4));
                                if (i13 == min) {
                                    break;
                                }
                                i13++;
                                i33 = i14;
                                arrayList6 = arrayList2;
                                f9 = f4;
                            }
                        } else {
                            f4 = f9;
                            i14 = i33;
                            arrayList2 = null;
                        }
                        if (F2 && bvfVar2 != null) {
                            list4 = bvfVar2.k;
                            if (!list4.isEmpty()) {
                                ArrayList arrayList7 = arrayList2;
                                for (int size5 = list4.size() - 1; -1 < size5; size5--) {
                                    if (((cvf) list4.get(size5)).a > min && (size5 == 0 || ((cvf) list4.get(size5 - 1)).a <= min)) {
                                        cvfVar4 = (cvf) list4.get(size5);
                                        break;
                                    }
                                }
                                cvfVar4 = null;
                                cvf cvfVar9 = (cvf) CollectionsKt.Y(list4);
                                if (cvfVar4 != null && (i24 = cvfVar4.a) <= (min2 = Math.min(cvfVar9.a, i68))) {
                                    int i70 = i24;
                                    list3 = arrayList7;
                                    while (true) {
                                        list2 = list;
                                        if (list3 != null) {
                                            int size6 = list3.size();
                                            i15 = i4;
                                            int i71 = 0;
                                            while (true) {
                                                if (i71 >= size6) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = list3.get(i71);
                                                int i72 = size6;
                                                if (((cvf) obj4).a == i70) {
                                                    break;
                                                }
                                                i71++;
                                                size6 = i72;
                                            }
                                            cvfVar7 = (cvf) obj4;
                                        } else {
                                            i15 = i4;
                                            cvfVar7 = null;
                                        }
                                        if (cvfVar7 == null) {
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                            }
                                            list3.add(yufVar2.g(i70, j4));
                                        }
                                        if (i70 == min2) {
                                            break;
                                        }
                                        i70++;
                                        list = list2;
                                        i4 = i15;
                                    }
                                } else {
                                    list2 = list;
                                    i15 = i4;
                                    list3 = arrayList7;
                                }
                                float f10 = ((bvfVar2.m - cvfVar9.p) - cvfVar9.q) - f3;
                                if (f10 > f) {
                                    int i73 = cvfVar9.a + 1;
                                    int i74 = 0;
                                    while (i73 < a && i74 < f10) {
                                        if (i73 <= min) {
                                            int f11 = zx0Var.f();
                                            int i75 = 0;
                                            while (true) {
                                                if (i75 >= f11) {
                                                    f6 = f10;
                                                    obj3 = null;
                                                    break;
                                                }
                                                obj3 = zx0Var.get(i75);
                                                f6 = f10;
                                                if (((cvf) obj3).a == i73) {
                                                    break;
                                                }
                                                i75++;
                                                f10 = f6;
                                            }
                                            cvfVar5 = (cvf) obj3;
                                        } else {
                                            f6 = f10;
                                            if (list3 != null) {
                                                int size7 = list3.size();
                                                int i76 = 0;
                                                while (true) {
                                                    if (i76 >= size7) {
                                                        cvfVar6 = 0;
                                                        break;
                                                    }
                                                    cvfVar6 = list3.get(i76);
                                                    if (((cvf) cvfVar6).a == i73) {
                                                        break;
                                                    }
                                                    i76++;
                                                }
                                                cvfVar5 = cvfVar6;
                                            } else {
                                                cvfVar5 = null;
                                            }
                                        }
                                        if (cvfVar5 != null) {
                                            i73++;
                                            i23 = cvfVar5.r;
                                        } else {
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                            }
                                            list3.add(yufVar2.g(i73, j4));
                                            i73++;
                                            i23 = ((cvf) CollectionsKt.Y(list3)).r;
                                        }
                                        i74 += i23;
                                        f10 = f6;
                                    }
                                }
                                if (list3 != null && ((cvf) CollectionsKt.Y(list3)).a > min) {
                                    min = ((cvf) CollectionsKt.Y(list3)).a;
                                }
                                size3 = list5.size();
                                for (i16 = 0; i16 < size3; i16++) {
                                    int intValue2 = ((Number) q.get(i16)).intValue();
                                    if (intValue2 > min) {
                                        if (list3 == null) {
                                            list3 = new ArrayList();
                                        }
                                        list3.add(yufVar2.g(intValue2, j4));
                                    }
                                }
                                if (list3 == null) {
                                    list3 = c5b.a;
                                }
                                size4 = list3.size();
                                int i77 = i69;
                                for (i17 = 0; i17 < size4; i17++) {
                                    i77 = Math.max(i77, ((cvf) list3.get(i17)).s);
                                }
                                boolean z11 = !Intrinsics.d(cvfVar2, zx0Var.first()) && list2.isEmpty() && list3.isEmpty();
                                int g4 = ia6.g(z7 ? i77 : i15, j7);
                                if (z7) {
                                    i77 = i15;
                                }
                                int f12 = ia6.f(i77, j7);
                                int i78 = z7 ? f12 : g4;
                                int i79 = i15;
                                z = i79 < Math.min(i78, i32);
                                if (z && i9 != 0) {
                                    vme.c("non-zero itemsScrollOffset");
                                }
                                ArrayList arrayList8 = new ArrayList(list3.size() + list2.size() + zx0Var.f());
                                if (z) {
                                    if (!list2.isEmpty() || !list3.isEmpty()) {
                                        vme.a("no extra items");
                                    }
                                    int f13 = zx0Var.f();
                                    int[] iArr = new int[f13];
                                    for (int i80 = 0; i80 < f13; i80++) {
                                        iArr[i80] = ((cvf) zx0Var.get(!z8 ? i80 : (f13 - i80) - 1)).q;
                                    }
                                    int[] iArr2 = new int[f13];
                                    if (!z7) {
                                        z2 = z11;
                                        if (mx0Var == null) {
                                            vme.b("null horizontalArrangement when isVertical == false");
                                            rj7.f();
                                            return null;
                                        }
                                        i18 = i32;
                                        cvfVar3 = cvfVar2;
                                        arrayList3 = arrayList8;
                                        j = j7;
                                        i19 = i79;
                                        f5 = f3;
                                        utfVar = utfVar2;
                                        i20 = i62;
                                        yufVar = yufVar2;
                                        mx0Var.w(utfVar, i78, iArr, xof.a, iArr2);
                                    } else {
                                        if (ox0Var == null) {
                                            vme.b("null verticalArrangement when isVertical == true");
                                            rj7.f();
                                            return null;
                                        }
                                        z2 = z11;
                                        ox0Var.a(utfVar2, i78, iArr, iArr2);
                                        i18 = i32;
                                        cvfVar3 = cvfVar2;
                                        arrayList3 = arrayList8;
                                        j = j7;
                                        i19 = i79;
                                        f5 = f3;
                                        utfVar = utfVar2;
                                        i20 = i62;
                                        yufVar = yufVar2;
                                    }
                                    IntRange A = xz0.A(iArr2);
                                    IntRange intRange = A;
                                    if (z8) {
                                        intRange = yhn.k(A);
                                    }
                                    int i81 = intRange.a;
                                    int i82 = intRange.b;
                                    int i83 = intRange.c;
                                    if ((i83 > 0 && i81 <= i82) || (i83 < 0 && i82 <= i81)) {
                                        while (true) {
                                            int i84 = iArr2[i81];
                                            cvf cvfVar10 = (cvf) zx0Var.get(!z8 ? i81 : (f13 - i81) - 1);
                                            if (z8) {
                                                i22 = i83;
                                                i84 = (i78 - i84) - cvfVar10.q;
                                            } else {
                                                i22 = i83;
                                            }
                                            cvfVar10.m(i84, g4, f12);
                                            arrayList3.add(cvfVar10);
                                            if (i81 == i82) {
                                                break;
                                            }
                                            i81 += i22;
                                            i83 = i22;
                                        }
                                    }
                                } else {
                                    z2 = z11;
                                    i18 = i32;
                                    arrayList3 = arrayList8;
                                    j = j7;
                                    i19 = i79;
                                    i20 = i62;
                                    utfVar = utfVar2;
                                    f5 = f3;
                                    cvfVar3 = cvfVar2;
                                    yufVar = yufVar2;
                                    int size8 = list2.size();
                                    int i85 = i9;
                                    for (int i86 = 0; i86 < size8; i86++) {
                                        cvf cvfVar11 = (cvf) list2.get(i86);
                                        i85 -= cvfVar11.r;
                                        cvfVar11.m(i85, g4, f12);
                                        arrayList3.add(cvfVar11);
                                    }
                                    int f14 = zx0Var.f();
                                    int i87 = i9;
                                    for (int i88 = 0; i88 < f14; i88++) {
                                        cvf cvfVar12 = (cvf) zx0Var.get(i88);
                                        cvfVar12.m(i87, g4, f12);
                                        arrayList3.add(cvfVar12);
                                        i87 += cvfVar12.r;
                                    }
                                    int size9 = list3.size();
                                    for (int i89 = 0; i89 < size9; i89++) {
                                        cvf cvfVar13 = (cvf) list3.get(i89);
                                        cvfVar13.m(i87, g4, f12);
                                        arrayList3.add(cvfVar13);
                                        i87 += cvfVar13.r;
                                    }
                                }
                                ArrayList arrayList9 = arrayList3;
                                yuf yufVar3 = yufVar;
                                int i90 = i19;
                                bVar.d((int) f5, g4, f12, arrayList9, x0Var, yufVar3, z7, F2, 1, z3, i65, i90, mm6Var, uodVar);
                                if (!F2) {
                                    long b2 = bVar.b();
                                    if (!hqe.a(b2, 0L)) {
                                        int i91 = z7 ? f12 : g4;
                                        long j8 = j;
                                        g4 = ia6.g(Math.max(g4, (int) (b2 >> 32)), j8);
                                        int f15 = ia6.f(Math.max(f12, (int) (b2 & 4294967295L)), j8);
                                        int i92 = z7 ? f15 : g4;
                                        if (i92 != i91) {
                                            int size10 = arrayList9.size();
                                            for (int i93 = 0; i93 < size10; i93++) {
                                                cvf cvfVar14 = (cvf) arrayList9.get(i93);
                                                cvfVar14.u = i92;
                                                cvfVar14.w = cvfVar14.i + i92;
                                            }
                                        }
                                        i21 = f15;
                                        int i94 = g4;
                                        roiVar = wufVar4.b.l;
                                        if (roiVar == null) {
                                            roiVar = spe.a;
                                        }
                                        List t = u2x.t(this.A, arrayList9, roiVar, i14, i94, i21, new kma(26, yufVar3));
                                        if (z2) {
                                            cvf cvfVar15 = (cvf) (zx0Var.isEmpty() ? null : zx0Var.b[zx0Var.a]);
                                            if (cvfVar15 != null) {
                                                valueOf = Integer.valueOf(cvfVar15.a);
                                                if (z2) {
                                                }
                                            }
                                            valueOf = null;
                                            if (z2) {
                                            }
                                        } else {
                                            cvf cvfVar16 = (cvf) CollectionsKt.firstOrNull(arrayList9);
                                            if (cvfVar16 != null) {
                                                valueOf = Integer.valueOf(cvfVar16.a);
                                                if (z2) {
                                                    cvf cvfVar17 = (cvf) zx0Var.r();
                                                    if (cvfVar17 != null) {
                                                        valueOf2 = Integer.valueOf(cvfVar17.a);
                                                        bvfVar = new bvf(cvfVar3, i65, i20 >= a || i90 > i18, f5, (lfh) fsfVar2.invoke(Integer.valueOf(i94), Integer.valueOf(i21), new jsf(aqiVar, arrayList9, t, F2, 1)), f4, z10, mm6Var, utfVar, yufVar3.f, xv.Y(valueOf == null ? valueOf.intValue() : 0, valueOf2 == null ? valueOf2.intValue() : 0, arrayList9, t), i36, i43, a, z8, !z7 ? bxj.a : bxj.b, i29, L5);
                                                    }
                                                    valueOf2 = null;
                                                    bvfVar = new bvf(cvfVar3, i65, i20 >= a || i90 > i18, f5, (lfh) fsfVar2.invoke(Integer.valueOf(i94), Integer.valueOf(i21), new jsf(aqiVar, arrayList9, t, F2, 1)), f4, z10, mm6Var, utfVar, yufVar3.f, xv.Y(valueOf == null ? valueOf.intValue() : 0, valueOf2 == null ? valueOf2.intValue() : 0, arrayList9, t), i36, i43, a, z8, !z7 ? bxj.a : bxj.b, i29, L5);
                                                } else {
                                                    cvf cvfVar18 = (cvf) CollectionsKt.Z(arrayList9);
                                                    if (cvfVar18 != null) {
                                                        valueOf2 = Integer.valueOf(cvfVar18.a);
                                                        bvfVar = new bvf(cvfVar3, i65, i20 >= a || i90 > i18, f5, (lfh) fsfVar2.invoke(Integer.valueOf(i94), Integer.valueOf(i21), new jsf(aqiVar, arrayList9, t, F2, 1)), f4, z10, mm6Var, utfVar, yufVar3.f, xv.Y(valueOf == null ? valueOf.intValue() : 0, valueOf2 == null ? valueOf2.intValue() : 0, arrayList9, t), i36, i43, a, z8, !z7 ? bxj.a : bxj.b, i29, L5);
                                                    }
                                                    valueOf2 = null;
                                                    bvfVar = new bvf(cvfVar3, i65, i20 >= a || i90 > i18, f5, (lfh) fsfVar2.invoke(Integer.valueOf(i94), Integer.valueOf(i21), new jsf(aqiVar, arrayList9, t, F2, 1)), f4, z10, mm6Var, utfVar, yufVar3.f, xv.Y(valueOf == null ? valueOf.intValue() : 0, valueOf2 == null ? valueOf2.intValue() : 0, arrayList9, t), i36, i43, a, z8, !z7 ? bxj.a : bxj.b, i29, L5);
                                                }
                                            }
                                            valueOf = null;
                                            if (z2) {
                                            }
                                        }
                                    }
                                }
                                i21 = f12;
                                int i942 = g4;
                                roiVar = wufVar4.b.l;
                                if (roiVar == null) {
                                }
                                List t2 = u2x.t(this.A, arrayList9, roiVar, i14, i942, i21, new kma(26, yufVar3));
                                if (z2) {
                                }
                            }
                        }
                        list2 = list;
                        i15 = i4;
                        list3 = arrayList2;
                        if (list3 != null) {
                            min = ((cvf) CollectionsKt.Y(list3)).a;
                        }
                        size3 = list5.size();
                        while (i16 < size3) {
                        }
                        if (list3 == null) {
                        }
                        size4 = list3.size();
                        int i772 = i69;
                        while (i17 < size4) {
                        }
                        if (Intrinsics.d(cvfVar2, zx0Var.first())) {
                        }
                        int g42 = ia6.g(z7 ? i772 : i15, j7);
                        if (z7) {
                        }
                        int f122 = ia6.f(i772, j7);
                        if (z7) {
                        }
                        int i792 = i15;
                        if (i792 < Math.min(i78, i32)) {
                        }
                        if (z) {
                            vme.c("non-zero itemsScrollOffset");
                        }
                        ArrayList arrayList82 = new ArrayList(list3.size() + list2.size() + zx0Var.f());
                        if (z) {
                        }
                        ArrayList arrayList92 = arrayList3;
                        yuf yufVar32 = yufVar;
                        int i902 = i19;
                        bVar.d((int) f5, g42, f122, arrayList92, x0Var, yufVar32, z7, F2, 1, z3, i65, i902, mm6Var, uodVar);
                        if (!F2) {
                        }
                        i21 = f122;
                        int i9422 = g42;
                        roiVar = wufVar4.b.l;
                        if (roiVar == null) {
                        }
                        List t22 = u2x.t(this.A, arrayList92, roiVar, i14, i9422, i21, new kma(26, yufVar32));
                        if (z2) {
                        }
                    } else {
                        i6 = i57;
                        i4 = i60;
                    }
                } else {
                    i4 = i47;
                    i5 = i3;
                    i6 = i51;
                }
                i7 = i46;
                int i612 = i50;
                int i622 = i52;
                if (Integer.signum(Math.round(floatValue)) == Integer.signum(i5)) {
                }
                float f82 = floatValue - f7;
                if (F2) {
                }
                if (i6 < 0) {
                }
                i8 = -i6;
                cvfVar = (cvf) zx0Var.first();
                if (i33 <= 0) {
                }
                f = 0.0f;
                f2 = zx0Var.f();
                cvf cvfVar82 = cvfVar;
                i9 = i8;
                i10 = 0;
                while (i10 < f2) {
                }
                cvfVar2 = cvfVar82;
                int i652 = i6;
                max = Math.max(0, i7);
                i11 = i7 - 1;
                if (max > i11) {
                }
                List list52 = q;
                ArrayList arrayList42 = arrayList;
                size = list52.size() - 1;
                if (size >= 0) {
                }
                list = arrayList42;
                if (list == null) {
                }
                int i672 = i612;
                i12 = 0;
                while (i12 < size2) {
                }
                int i682 = a - 1;
                min = Math.min(((cvf) CollectionsKt.Y(zx0Var)).a, i682);
                int i692 = i672;
                i13 = ((cvf) CollectionsKt.Y(zx0Var)).a + 1;
                if (i13 > min) {
                }
                if (F2) {
                    list4 = bvfVar2.k;
                    if (!list4.isEmpty()) {
                    }
                }
                list2 = list;
                i15 = i4;
                list3 = arrayList2;
                if (list3 != null) {
                }
                size3 = list52.size();
                while (i16 < size3) {
                }
                if (list3 == null) {
                }
                size4 = list3.size();
                int i7722 = i692;
                while (i17 < size4) {
                }
                if (Intrinsics.d(cvfVar2, zx0Var.first())) {
                }
                int g422 = ia6.g(z7 ? i7722 : i15, j7);
                if (z7) {
                }
                int f1222 = ia6.f(i7722, j7);
                if (z7) {
                }
                int i7922 = i15;
                if (i7922 < Math.min(i78, i32)) {
                }
                if (z) {
                }
                ArrayList arrayList822 = new ArrayList(list3.size() + list2.size() + zx0Var.f());
                if (z) {
                }
                ArrayList arrayList922 = arrayList3;
                yuf yufVar322 = yufVar;
                int i9022 = i19;
                bVar.d((int) f5, g422, f1222, arrayList922, x0Var, yufVar322, z7, F2, 1, z3, i652, i9022, mm6Var, uodVar);
                if (!F2) {
                }
                i21 = f1222;
                int i94222 = g422;
                roiVar = wufVar4.b.l;
                if (roiVar == null) {
                }
                List t222 = u2x.t(this.A, arrayList922, roiVar, i14, i94222, i21, new kma(26, yufVar322));
                if (z2) {
                }
            }
            fvfVar.g(bvfVar, dnrVar.F(), false);
            return bvfVar;
        } catch (Throwable th) {
            wyf.b0(G, Q, e);
            throw th;
        }
    }
}
