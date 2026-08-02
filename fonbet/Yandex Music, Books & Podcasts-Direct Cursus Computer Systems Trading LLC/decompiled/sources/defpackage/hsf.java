package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class hsf extends uif implements Function2 {
    public final /* synthetic */ tsf r;
    public final /* synthetic */ o0k s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ jqd u;
    public final /* synthetic */ ox0 v;
    public final /* synthetic */ mm6 w;
    public final /* synthetic */ uod x;
    public final /* synthetic */ wfl y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsf(tsf tsfVar, o0k o0kVar, p9f p9fVar, jqd jqdVar, ox0 ox0Var, mx0 mx0Var, mm6 mm6Var, uod uodVar, wfl wflVar) {
        super(2);
        this.r = tsfVar;
        this.s = o0kVar;
        this.t = p9fVar;
        this.u = jqdVar;
        this.v = ox0Var;
        this.w = mm6Var;
        this.x = uodVar;
        this.y = wflVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0633 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x068a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x069a A[LOOP:12: B:222:0x0698->B:223:0x069a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cc A[Catch: all -> 0x01ea, TryCatch #0 {all -> 0x01ea, blocks: (B:23:0x01bc, B:25:0x01cc, B:29:0x01e0, B:353:0x01ed), top: B:22:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02df  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        csf csfVar;
        int i2;
        x0 x0Var;
        jtc jtcVar;
        int length;
        int a;
        b2r G;
        int i3;
        Function1 function1;
        b2r Q;
        int g;
        int F;
        ukn uknVar;
        int d;
        int h;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int size;
        List list;
        int i8;
        int i9;
        int i10;
        List list2;
        float f;
        List list3;
        int size2;
        int i11;
        List list4;
        int f2;
        int i12;
        int i13;
        msf msfVar;
        boolean z2;
        int size3;
        int i14;
        msf msfVar2;
        utf utfVar;
        int i15;
        float f3;
        utf utfVar2;
        int i16;
        int i17;
        ksf ksfVar;
        boolean z3;
        int i18;
        List list5;
        gsf gsfVar;
        List list6;
        lsf lsfVar;
        gsf gsfVar2;
        int i19;
        ukn uknVar2;
        msf msfVar3;
        utf utfVar3 = (utf) obj;
        long j = ((ga6) obj2).a;
        tsf tsfVar = this.r;
        tsfVar.s.getValue();
        boolean z4 = tsfVar.b || utfVar3.b.F();
        bxj bxjVar = bxj.a;
        kg5.p(j, bxjVar);
        xof layoutDirection = utfVar3.b.getLayoutDirection();
        o0k o0kVar = this.s;
        int L = utfVar3.b.L(o0kVar.b(layoutDirection));
        int L2 = utfVar3.b.L(o0kVar.c(utfVar3.b.getLayoutDirection()));
        float d2 = o0kVar.d();
        dnr dnrVar = utfVar3.b;
        dnr dnrVar2 = utfVar3.b;
        int L3 = dnrVar.L(d2);
        int L4 = dnrVar.L(o0kVar.a()) + L3;
        int i20 = L2 + L;
        int i21 = L4 - L3;
        long i22 = ia6.i(j, -i20, -L4);
        csf csfVar2 = (csf) this.t.invoke();
        bsf bsfVar = csfVar2.b;
        x0 x0Var2 = csfVar2.c;
        ukn uknVar3 = bsfVar.k;
        jqd jqdVar = this.u;
        try {
            if (jqdVar.d != null) {
                i = L4;
                csfVar = csfVar2;
                if (ga6.c(jqdVar.b, i22) && jqdVar.c == dnrVar2.getDensity()) {
                    jtcVar = jqdVar.d;
                    jtcVar.getClass();
                    i2 = i;
                    x0Var = x0Var2;
                    jtc jtcVar2 = jtcVar;
                    length = ((int[]) jtcVar2.a).length;
                    if (length == uknVar3.f) {
                        uknVar3.f = length;
                        ArrayList arrayList = uknVar3.a;
                        arrayList.clear();
                        arrayList.add(new osf(0, 0));
                        uknVar3.b = 0;
                        uknVar3.c = 0;
                        uknVar3.d = 0;
                        uknVar3.e = -1;
                        ((ArrayList) uknVar3.h).clear();
                    }
                    ox0 ox0Var = this.v;
                    int L5 = dnrVar.L(ox0Var.o());
                    a = csfVar.a();
                    int h2 = ga6.h(j) - i2;
                    tsf tsfVar2 = this.r;
                    csf csfVar3 = csfVar;
                    gsf gsfVar3 = new gsf(csfVar3, utfVar3, L5, tsfVar2, L3, i21, (L << 32) | (L3 & 4294967295L));
                    z98 z98Var = new z98(jtcVar2, a, L5, gsfVar3, uknVar3);
                    int i23 = i2;
                    ukn uknVar4 = (ukn) z98Var.e;
                    sea seaVar = new sea(23, uknVar3, z98Var);
                    G = wyf.G();
                    List list7 = null;
                    if (G == null) {
                        i3 = i23;
                        function1 = G.e();
                    } else {
                        i3 = i23;
                        function1 = null;
                    }
                    Q = wyf.Q(G);
                    g = tsfVar2.g();
                    nsf nsfVar = tsfVar2.d;
                    F = i4w.F(g, csfVar3, nsfVar.e);
                    if (g == F) {
                        uknVar = uknVar4;
                        nsfVar.b.i(F);
                        nsfVar.f.a(g);
                    } else {
                        uknVar = uknVar4;
                    }
                    if (F >= a && a > 0) {
                        d = uknVar3.d(a - 1);
                        h = 0;
                        int i24 = d;
                        wyf.b0(G, Q, function1);
                        List q = wct.q(csfVar3, tsfVar.q, tsfVar.n);
                        float floatValue = (dnrVar.F() && z4) ? ((Number) ((vm0) tsfVar.v.a).b.getValue()).floatValue() : tsfVar.g;
                        b bVar = tsfVar.m;
                        boolean F2 = dnrVar.F();
                        ksf ksfVar2 = tsfVar.c;
                        aqi aqiVar = tsfVar.r;
                        int i25 = i24;
                        int i26 = h;
                        fsf fsfVar = new fsf(utfVar3, j, i20, i3, 0);
                        if (L3 < 0) {
                            vme.a("negative beforeContentPadding");
                        }
                        if (i21 < 0) {
                            vme.a("negative afterContentPadding");
                        }
                        x0 x0Var3 = x0Var;
                        mm6 mm6Var = this.w;
                        uod uodVar = this.x;
                        if (a > 0) {
                            int k = ga6.k(i22);
                            int j2 = ga6.j(i22);
                            bVar.d(0, k, j2, new ArrayList(), x0Var3, gsfVar3, true, F2, length, z4, 0, 0, mm6Var, uodVar);
                            if (!F2) {
                                long b = bVar.b();
                                if (!hqe.a(b, 0L)) {
                                    k = ia6.g((int) (b >> 32), i22);
                                    j2 = ia6.f((int) (b & 4294967295L), i22);
                                }
                            }
                            ksfVar = new ksf(null, 0, false, 0.0f, (lfh) fsfVar.invoke(Integer.valueOf(k), Integer.valueOf(j2), lhb.A0), 0.0f, false, mm6Var, utfVar3, length, seaVar, c5b.a, -L3, h2 + i21, 0, bxjVar, i21, L5);
                            z3 = false;
                        } else {
                            b bVar2 = bVar;
                            ukn uknVar5 = uknVar;
                            gsf gsfVar4 = gsfVar3;
                            int round = Math.round(floatValue);
                            int i27 = i26 - round;
                            if (i25 == 0 && i27 < 0) {
                                round += i27;
                                i27 = 0;
                            }
                            zx0 zx0Var = new zx0();
                            int i28 = -L3;
                            int i29 = i28 + (L5 < 0 ? L5 : 0);
                            int i30 = i27 + i29;
                            while (i30 < 0 && i25 > 0) {
                                b bVar3 = bVar2;
                                int i31 = i25 - 1;
                                fsf fsfVar2 = fsfVar;
                                msf h3 = z98Var.h(i31);
                                zx0Var.add(0, h3);
                                i30 += h3.g;
                                bVar2 = bVar3;
                                i25 = i31;
                                fsfVar = fsfVar2;
                            }
                            fsf fsfVar3 = fsfVar;
                            b bVar4 = bVar2;
                            if (i30 < i29) {
                                round -= i29 - i30;
                                i30 = i29;
                            }
                            int i32 = round;
                            int i33 = i30 - i29;
                            int i34 = h2 + i21;
                            int i35 = i34 < 0 ? 0 : i34;
                            int i36 = -i33;
                            int i37 = i33;
                            int i38 = i25;
                            int i39 = 0;
                            boolean z5 = false;
                            while (i39 < zx0Var.c) {
                                if (i36 >= i35) {
                                    zx0Var.a(i39);
                                    z5 = true;
                                } else {
                                    i38++;
                                    i36 += ((msf) zx0Var.get(i39)).g;
                                    i39++;
                                }
                            }
                            boolean z6 = z5;
                            int i40 = i38;
                            while (i40 < a && (i36 < i35 || i36 <= 0 || zx0Var.isEmpty())) {
                                z = z6;
                                msf h4 = z98Var.h(i40);
                                int i41 = i40;
                                int i42 = h4.g;
                                lsf[] lsfVarArr = h4.b;
                                int i43 = i35;
                                if (lsfVarArr.length == 0) {
                                    break;
                                }
                                i36 += i42;
                                if (i36 > i29 || ((lsf) xz0.K(lsfVarArr)).a == a - 1) {
                                    zx0Var.addLast(h4);
                                    z6 = z;
                                } else {
                                    i37 -= i42;
                                    z6 = true;
                                    i25 = i41 + 1;
                                }
                                i40 = i41 + 1;
                                i35 = i43;
                            }
                            z = z6;
                            if (i36 < h2) {
                                int i44 = h2 - i36;
                                int i45 = i36 + i44;
                                i5 = i37 - i44;
                                while (i5 < L3 && i25 > 0) {
                                    int i46 = i25 - 1;
                                    msf h5 = z98Var.h(i46);
                                    zx0Var.add(0, h5);
                                    i5 += h5.g;
                                    i25 = i46;
                                    i45 = i45;
                                }
                                int i47 = i45;
                                i4 = i44 + i32;
                                if (i5 < 0) {
                                    i4 += i5;
                                    i36 = i47 + i5;
                                    i5 = 0;
                                } else {
                                    i36 = i47;
                                }
                            } else {
                                i4 = i32;
                                i5 = i37;
                            }
                            float f4 = (Integer.signum(Math.round(floatValue)) != Integer.signum(i4) || Math.abs(Math.round(floatValue)) < Math.abs(i4)) ? floatValue : i4;
                            float f5 = floatValue - f4;
                            float f6 = 0.0f;
                            if (F2 && i4 > i32 && f5 <= 0.0f) {
                                f6 = (i4 - i32) + f5;
                            }
                            float f7 = f6;
                            if (i5 < 0) {
                                vme.a("negative initial offset");
                            }
                            int i48 = -i5;
                            msf msfVar4 = (msf) zx0Var.first();
                            lsf lsfVar2 = (lsf) xz0.z(msfVar4.b);
                            int i49 = lsfVar2 != null ? lsfVar2.a : 0;
                            msf msfVar5 = (msf) zx0Var.r();
                            if (msfVar5 != null) {
                                lsf[] lsfVarArr2 = msfVar5.b;
                                i6 = i5;
                                lsf lsfVar3 = lsfVarArr2.length == 0 ? null : lsfVarArr2[lsfVarArr2.length - 1];
                                if (lsfVar3 != null) {
                                    i7 = lsfVar3.a;
                                    List list8 = q;
                                    size = list8.size();
                                    list = null;
                                    i8 = 0;
                                    while (i8 < size) {
                                        int i50 = size;
                                        int intValue = ((Number) q.get(i8)).intValue();
                                        if (intValue < 0 || intValue >= i49) {
                                            gsfVar2 = gsfVar4;
                                            i19 = i8;
                                            uknVar2 = uknVar5;
                                            msfVar3 = msfVar4;
                                        } else {
                                            i19 = i8;
                                            uknVar2 = uknVar5;
                                            msfVar3 = msfVar4;
                                            int g2 = uknVar2.g(intValue, uknVar2.f);
                                            gsf gsfVar5 = gsfVar4;
                                            lsf b2 = gsfVar5.b(intValue, z98Var.a(0, g2), 0, g2, gsfVar4.c);
                                            gsfVar2 = gsfVar5;
                                            if (list == null) {
                                                list = new ArrayList();
                                            }
                                            List list9 = list;
                                            list9.add(b2);
                                            list = list9;
                                        }
                                        msfVar4 = msfVar3;
                                        uknVar5 = uknVar2;
                                        i8 = i19 + 1;
                                        gsfVar4 = gsfVar2;
                                        size = i50;
                                    }
                                    gsf gsfVar6 = gsfVar4;
                                    ukn uknVar6 = uknVar5;
                                    msf msfVar6 = msfVar4;
                                    if (list == null) {
                                        list = c5b.a;
                                    }
                                    List list10 = list;
                                    if (F2 && ksfVar2 != null) {
                                        list6 = ksfVar2.l;
                                        if (!list6.isEmpty()) {
                                            i9 = i49;
                                            for (int size4 = list6.size() - 1; -1 < size4; size4--) {
                                                if (((lsf) list6.get(size4)).a > i7 && (size4 == 0 || ((lsf) list6.get(size4 - 1)).a <= i7)) {
                                                    lsfVar = (lsf) list6.get(size4);
                                                    break;
                                                }
                                            }
                                            lsfVar = null;
                                            lsf lsfVar4 = (lsf) CollectionsKt.Y(list6);
                                            msf msfVar7 = (msf) CollectionsKt.Z(zx0Var);
                                            int i51 = msfVar7 != null ? msfVar7.a + 1 : 0;
                                            if (lsfVar != null) {
                                                int i52 = lsfVar.a;
                                                int i53 = i51;
                                                int min = Math.min(lsfVar4.a, a - 1);
                                                if (i52 <= min) {
                                                    i10 = i7;
                                                    list3 = null;
                                                    int i54 = i53;
                                                    while (true) {
                                                        if (list3 != null) {
                                                            f = f4;
                                                            int size5 = list3.size();
                                                            list2 = list10;
                                                            int i55 = 0;
                                                            while (i55 < size5) {
                                                                List list11 = list3;
                                                                lsf[] lsfVarArr3 = ((msf) list3.get(i55)).b;
                                                                int i56 = i55;
                                                                int length2 = lsfVarArr3.length;
                                                                int i57 = 0;
                                                                while (i57 < length2) {
                                                                    int i58 = i57;
                                                                    if (lsfVarArr3[i58].a == i52) {
                                                                        list3 = list11;
                                                                        break;
                                                                    }
                                                                    i57 = i58 + 1;
                                                                }
                                                                i55 = i56 + 1;
                                                                list3 = list11;
                                                            }
                                                        } else {
                                                            list2 = list10;
                                                            f = f4;
                                                        }
                                                        List list12 = list3;
                                                        list3 = list12 == null ? new ArrayList() : list12;
                                                        msf h6 = z98Var.h(i54);
                                                        i54++;
                                                        list3.add(h6);
                                                        if (i52 == min) {
                                                            break;
                                                        }
                                                        i52++;
                                                        f4 = f;
                                                        list10 = list2;
                                                    }
                                                    if (list3 == null) {
                                                        list3 = c5b.a;
                                                    }
                                                    size2 = list8.size();
                                                    i11 = 0;
                                                    while (i11 < size2) {
                                                        int intValue2 = ((Number) q.get(i11)).intValue();
                                                        if (i10 + 1 > intValue2 || intValue2 >= a) {
                                                            i18 = size2;
                                                            list5 = list3;
                                                        } else {
                                                            if (F2) {
                                                                int size6 = list3.size();
                                                                int i59 = 0;
                                                                while (i59 < size6) {
                                                                    i18 = size2;
                                                                    lsf[] lsfVarArr4 = ((msf) list3.get(i59)).b;
                                                                    list5 = list3;
                                                                    int length3 = lsfVarArr4.length;
                                                                    int i60 = 0;
                                                                    while (i60 < length3) {
                                                                        int i61 = i60;
                                                                        if (lsfVarArr4[i61].a != intValue2) {
                                                                            i60 = i61 + 1;
                                                                        }
                                                                    }
                                                                    i59++;
                                                                    list3 = list5;
                                                                    size2 = i18;
                                                                }
                                                            }
                                                            i18 = size2;
                                                            list5 = list3;
                                                            int g3 = uknVar6.g(intValue2, uknVar6.f);
                                                            gsfVar = gsfVar6;
                                                            lsf b3 = gsfVar.b(intValue2, z98Var.a(0, g3), 0, g3, gsfVar6.c);
                                                            if (list7 == null) {
                                                                list7 = new ArrayList();
                                                            }
                                                            List list13 = list7;
                                                            list13.add(b3);
                                                            list7 = list13;
                                                            i11++;
                                                            list3 = list5;
                                                            gsfVar6 = gsfVar;
                                                            size2 = i18;
                                                        }
                                                        gsfVar = gsfVar6;
                                                        i11++;
                                                        list3 = list5;
                                                        gsfVar6 = gsfVar;
                                                        size2 = i18;
                                                    }
                                                    list4 = list3;
                                                    gsf gsfVar7 = gsfVar6;
                                                    if (list7 == null) {
                                                        list7 = c5b.a;
                                                    }
                                                    List list14 = list7;
                                                    if (L3 <= 0 || L5 < 0) {
                                                        f2 = zx0Var.f();
                                                        msf msfVar8 = msfVar6;
                                                        int i62 = i6;
                                                        i12 = 0;
                                                        while (i12 < f2) {
                                                            int i63 = ((msf) zx0Var.get(i12)).g;
                                                            if (i62 == 0 || i63 > i62 || i12 == zx0Var.f() - 1) {
                                                                break;
                                                            }
                                                            i62 -= i63;
                                                            i12++;
                                                            msfVar8 = (msf) zx0Var.get(i12);
                                                        }
                                                        i13 = i62;
                                                        msfVar = msfVar8;
                                                    } else {
                                                        msfVar = msfVar6;
                                                        i13 = i6;
                                                    }
                                                    int i64 = ga6.i(i22);
                                                    int f8 = ia6.f(i36, i22);
                                                    List list15 = zx0Var;
                                                    if (!list4.isEmpty()) {
                                                        list15 = CollectionsKt.g0(zx0Var, list4);
                                                    }
                                                    z2 = i36 >= Math.min(f8, h2);
                                                    if (z2 && i48 != 0) {
                                                        vme.c("non-zero firstLineScrollOffset");
                                                    }
                                                    size3 = list15.size();
                                                    i14 = 0;
                                                    int i65 = 0;
                                                    while (i14 < size3) {
                                                        i65 += ((msf) list15.get(i14)).b.length;
                                                        i14++;
                                                        i36 = i36;
                                                    }
                                                    int i66 = i36;
                                                    ArrayList arrayList2 = new ArrayList(i65);
                                                    if (z2) {
                                                        msfVar2 = msfVar;
                                                        utfVar = utfVar3;
                                                        int size7 = list2.size() - 1;
                                                        if (size7 >= 0) {
                                                            int i67 = i48;
                                                            while (true) {
                                                                int i68 = size7 - 1;
                                                                List list16 = list2;
                                                                lsf lsfVar5 = (lsf) list16.get(size7);
                                                                i15 = i13;
                                                                i67 -= lsfVar5.o;
                                                                lsfVar5.a(i67, 0, i64, f8);
                                                                arrayList2.add(lsfVar5);
                                                                if (i68 < 0) {
                                                                    break;
                                                                }
                                                                size7 = i68;
                                                                list2 = list16;
                                                                i13 = i15;
                                                            }
                                                        } else {
                                                            i15 = i13;
                                                        }
                                                        int size8 = list15.size();
                                                        int i69 = i48;
                                                        int i70 = 0;
                                                        while (i70 < size8) {
                                                            msf msfVar9 = (msf) list15.get(i70);
                                                            lsf[] a2 = msfVar9.a(i69, i64, f8);
                                                            int i71 = size8;
                                                            int i72 = i69;
                                                            int i73 = 0;
                                                            for (int length4 = a2.length; i73 < length4; length4 = length4) {
                                                                arrayList2.add(a2[i73]);
                                                                i73++;
                                                            }
                                                            i69 = i72 + msfVar9.g;
                                                            i70++;
                                                            size8 = i71;
                                                        }
                                                        int size9 = list14.size();
                                                        for (int i74 = 0; i74 < size9; i74++) {
                                                            lsf lsfVar6 = (lsf) list14.get(i74);
                                                            lsfVar6.a(i69, 0, i64, f8);
                                                            arrayList2.add(lsfVar6);
                                                            i69 += lsfVar6.o;
                                                        }
                                                        f3 = f;
                                                    } else {
                                                        if (!list2.isEmpty() || !list14.isEmpty()) {
                                                            vme.a("no items");
                                                        }
                                                        int size10 = list15.size();
                                                        int[] iArr = new int[size10];
                                                        for (int i75 = 0; i75 < size10; i75++) {
                                                            iArr[i75] = ((msf) list15.get(i75)).f;
                                                        }
                                                        int[] iArr2 = new int[size10];
                                                        utfVar = utfVar3;
                                                        ox0Var.a(utfVar, f8, iArr, iArr2);
                                                        IntRange A = xz0.A(iArr2);
                                                        int i76 = A.a;
                                                        int i77 = A.b;
                                                        int i78 = A.c;
                                                        if ((i78 > 0 && i76 <= i77) || (i78 < 0 && i77 <= i76)) {
                                                            while (true) {
                                                                msfVar2 = msfVar;
                                                                lsf[] a3 = ((msf) list15.get(i76)).a(iArr2[i76], i64, f8);
                                                                int length5 = a3.length;
                                                                int i79 = 0;
                                                                while (i79 < length5) {
                                                                    int i80 = i79;
                                                                    arrayList2.add(a3[i80]);
                                                                    i79 = i80 + 1;
                                                                }
                                                                if (i76 == i77) {
                                                                    break;
                                                                }
                                                                i76 += i78;
                                                                msfVar = msfVar2;
                                                            }
                                                        } else {
                                                            msfVar2 = msfVar;
                                                        }
                                                        i15 = i13;
                                                        f3 = f;
                                                    }
                                                    int i81 = i15;
                                                    bVar4.d((int) f3, i64, f8, arrayList2, x0Var3, gsfVar7, true, F2, length, z4, i81, i66, mm6Var, uodVar);
                                                    if (F2) {
                                                        i16 = h2;
                                                        long b4 = bVar4.b();
                                                        utfVar2 = utfVar;
                                                        if (!hqe.a(b4, 0L)) {
                                                            i64 = ia6.g(Math.max(i64, (int) (b4 >> 32)), i22);
                                                            int f9 = ia6.f(Math.max(f8, (int) (b4 & 4294967295L)), i22);
                                                            if (f9 != f8) {
                                                                int size11 = arrayList2.size();
                                                                for (int i82 = 0; i82 < size11; i82++) {
                                                                    lsf lsfVar7 = (lsf) arrayList2.get(i82);
                                                                    lsfVar7.p = f9;
                                                                    lsfVar7.r = lsfVar7.f + f9;
                                                                }
                                                            }
                                                            i17 = f9;
                                                            int i83 = i64;
                                                            csfVar3.b.getClass();
                                                            List t = u2x.t(this.y, arrayList2, spe.a, L3, i83, i17, new sea(24, z98Var, gsfVar7));
                                                            int i84 = i10;
                                                            z3 = false;
                                                            ksfVar = new ksf(msfVar2, i81, i84 == a + (-1) || i66 > i16, f3, (lfh) fsfVar3.invoke(Integer.valueOf(i83), Integer.valueOf(i17), new jsf(aqiVar, arrayList2, t, F2, 0)), f7, z, mm6Var, utfVar2, length, seaVar, xv.Y(i9, i84, arrayList2, t), i28, i34, a, bxj.a, i21, L5);
                                                        }
                                                    } else {
                                                        utfVar2 = utfVar;
                                                        i16 = h2;
                                                    }
                                                    i17 = f8;
                                                    int i832 = i64;
                                                    csfVar3.b.getClass();
                                                    List t2 = u2x.t(this.y, arrayList2, spe.a, L3, i832, i17, new sea(24, z98Var, gsfVar7));
                                                    int i842 = i10;
                                                    if (i842 == a + (-1)) {
                                                    }
                                                    z3 = false;
                                                    ksfVar = new ksf(msfVar2, i81, i842 == a + (-1) || i66 > i16, f3, (lfh) fsfVar3.invoke(Integer.valueOf(i832), Integer.valueOf(i17), new jsf(aqiVar, arrayList2, t2, F2, 0)), f7, z, mm6Var, utfVar2, length, seaVar, xv.Y(i9, i842, arrayList2, t2), i28, i34, a, bxj.a, i21, L5);
                                                }
                                            }
                                            i10 = i7;
                                            list2 = list10;
                                            f = f4;
                                            list3 = null;
                                            if (list3 == null) {
                                            }
                                            size2 = list8.size();
                                            i11 = 0;
                                            while (i11 < size2) {
                                            }
                                            list4 = list3;
                                            gsf gsfVar72 = gsfVar6;
                                            if (list7 == null) {
                                            }
                                            List list142 = list7;
                                            if (L3 <= 0) {
                                            }
                                            f2 = zx0Var.f();
                                            msf msfVar82 = msfVar6;
                                            int i622 = i6;
                                            i12 = 0;
                                            while (i12 < f2) {
                                            }
                                            i13 = i622;
                                            msfVar = msfVar82;
                                            int i642 = ga6.i(i22);
                                            int f82 = ia6.f(i36, i22);
                                            List list152 = zx0Var;
                                            if (!list4.isEmpty()) {
                                            }
                                            if (i36 >= Math.min(f82, h2)) {
                                            }
                                            if (z2) {
                                                vme.c("non-zero firstLineScrollOffset");
                                            }
                                            size3 = list152.size();
                                            i14 = 0;
                                            int i652 = 0;
                                            while (i14 < size3) {
                                            }
                                            int i662 = i36;
                                            ArrayList arrayList22 = new ArrayList(i652);
                                            if (z2) {
                                            }
                                            int i812 = i15;
                                            bVar4.d((int) f3, i642, f82, arrayList22, x0Var3, gsfVar72, true, F2, length, z4, i812, i662, mm6Var, uodVar);
                                            if (F2) {
                                            }
                                            i17 = f82;
                                            int i8322 = i642;
                                            csfVar3.b.getClass();
                                            List t22 = u2x.t(this.y, arrayList22, spe.a, L3, i8322, i17, new sea(24, z98Var, gsfVar72));
                                            int i8422 = i10;
                                            if (i8422 == a + (-1)) {
                                            }
                                            z3 = false;
                                            ksfVar = new ksf(msfVar2, i812, i8422 == a + (-1) || i662 > i16, f3, (lfh) fsfVar3.invoke(Integer.valueOf(i8322), Integer.valueOf(i17), new jsf(aqiVar, arrayList22, t22, F2, 0)), f7, z, mm6Var, utfVar2, length, seaVar, xv.Y(i9, i8422, arrayList22, t22), i28, i34, a, bxj.a, i21, L5);
                                        }
                                    }
                                    i9 = i49;
                                    i10 = i7;
                                    list2 = list10;
                                    f = f4;
                                    list3 = null;
                                    if (list3 == null) {
                                    }
                                    size2 = list8.size();
                                    i11 = 0;
                                    while (i11 < size2) {
                                    }
                                    list4 = list3;
                                    gsf gsfVar722 = gsfVar6;
                                    if (list7 == null) {
                                    }
                                    List list1422 = list7;
                                    if (L3 <= 0) {
                                    }
                                    f2 = zx0Var.f();
                                    msf msfVar822 = msfVar6;
                                    int i6222 = i6;
                                    i12 = 0;
                                    while (i12 < f2) {
                                    }
                                    i13 = i6222;
                                    msfVar = msfVar822;
                                    int i6422 = ga6.i(i22);
                                    int f822 = ia6.f(i36, i22);
                                    List list1522 = zx0Var;
                                    if (!list4.isEmpty()) {
                                    }
                                    if (i36 >= Math.min(f822, h2)) {
                                    }
                                    if (z2) {
                                    }
                                    size3 = list1522.size();
                                    i14 = 0;
                                    int i6522 = 0;
                                    while (i14 < size3) {
                                    }
                                    int i6622 = i36;
                                    ArrayList arrayList222 = new ArrayList(i6522);
                                    if (z2) {
                                    }
                                    int i8122 = i15;
                                    bVar4.d((int) f3, i6422, f822, arrayList222, x0Var3, gsfVar722, true, F2, length, z4, i8122, i6622, mm6Var, uodVar);
                                    if (F2) {
                                    }
                                    i17 = f822;
                                    int i83222 = i6422;
                                    csfVar3.b.getClass();
                                    List t222 = u2x.t(this.y, arrayList222, spe.a, L3, i83222, i17, new sea(24, z98Var, gsfVar722));
                                    int i84222 = i10;
                                    if (i84222 == a + (-1)) {
                                    }
                                    z3 = false;
                                    ksfVar = new ksf(msfVar2, i8122, i84222 == a + (-1) || i6622 > i16, f3, (lfh) fsfVar3.invoke(Integer.valueOf(i83222), Integer.valueOf(i17), new jsf(aqiVar, arrayList222, t222, F2, 0)), f7, z, mm6Var, utfVar2, length, seaVar, xv.Y(i9, i84222, arrayList222, t222), i28, i34, a, bxj.a, i21, L5);
                                }
                            } else {
                                i6 = i5;
                            }
                            i7 = 0;
                            List list82 = q;
                            size = list82.size();
                            list = null;
                            i8 = 0;
                            while (i8 < size) {
                            }
                            gsf gsfVar62 = gsfVar4;
                            ukn uknVar62 = uknVar5;
                            msf msfVar62 = msfVar4;
                            if (list == null) {
                            }
                            List list102 = list;
                            if (F2) {
                                list6 = ksfVar2.l;
                                if (!list6.isEmpty()) {
                                }
                            }
                            i9 = i49;
                            i10 = i7;
                            list2 = list102;
                            f = f4;
                            list3 = null;
                            if (list3 == null) {
                            }
                            size2 = list82.size();
                            i11 = 0;
                            while (i11 < size2) {
                            }
                            list4 = list3;
                            gsf gsfVar7222 = gsfVar62;
                            if (list7 == null) {
                            }
                            List list14222 = list7;
                            if (L3 <= 0) {
                            }
                            f2 = zx0Var.f();
                            msf msfVar8222 = msfVar62;
                            int i62222 = i6;
                            i12 = 0;
                            while (i12 < f2) {
                            }
                            i13 = i62222;
                            msfVar = msfVar8222;
                            int i64222 = ga6.i(i22);
                            int f8222 = ia6.f(i36, i22);
                            List list15222 = zx0Var;
                            if (!list4.isEmpty()) {
                            }
                            if (i36 >= Math.min(f8222, h2)) {
                            }
                            if (z2) {
                            }
                            size3 = list15222.size();
                            i14 = 0;
                            int i65222 = 0;
                            while (i14 < size3) {
                            }
                            int i66222 = i36;
                            ArrayList arrayList2222 = new ArrayList(i65222);
                            if (z2) {
                            }
                            int i81222 = i15;
                            bVar4.d((int) f3, i64222, f8222, arrayList2222, x0Var3, gsfVar7222, true, F2, length, z4, i81222, i66222, mm6Var, uodVar);
                            if (F2) {
                            }
                            i17 = f8222;
                            int i832222 = i64222;
                            csfVar3.b.getClass();
                            List t2222 = u2x.t(this.y, arrayList2222, spe.a, L3, i832222, i17, new sea(24, z98Var, gsfVar7222));
                            int i842222 = i10;
                            if (i842222 == a + (-1)) {
                            }
                            z3 = false;
                            ksfVar = new ksf(msfVar2, i81222, i842222 == a + (-1) || i66222 > i16, f3, (lfh) fsfVar3.invoke(Integer.valueOf(i832222), Integer.valueOf(i17), new jsf(aqiVar, arrayList2222, t2222, F2, 0)), f7, z, mm6Var, utfVar2, length, seaVar, xv.Y(i9, i842222, arrayList2222, t2222), i28, i34, a, bxj.a, i21, L5);
                        }
                        tsfVar.f(ksfVar, dnrVar.F(), z3);
                        return ksfVar;
                    }
                    d = uknVar3.d(F);
                    h = nsfVar.c.h();
                    int i242 = d;
                    wyf.b0(G, Q, function1);
                    List q2 = wct.q(csfVar3, tsfVar.q, tsfVar.n);
                    float floatValue2 = (dnrVar.F() && z4) ? ((Number) ((vm0) tsfVar.v.a).b.getValue()).floatValue() : tsfVar.g;
                    b bVar5 = tsfVar.m;
                    boolean F22 = dnrVar.F();
                    ksf ksfVar22 = tsfVar.c;
                    aqi aqiVar2 = tsfVar.r;
                    int i252 = i242;
                    int i262 = h;
                    fsf fsfVar4 = new fsf(utfVar3, j, i20, i3, 0);
                    if (L3 < 0) {
                    }
                    if (i21 < 0) {
                    }
                    x0 x0Var32 = x0Var;
                    mm6 mm6Var2 = this.w;
                    uod uodVar2 = this.x;
                    if (a > 0) {
                    }
                    tsfVar.f(ksfVar, dnrVar.F(), z3);
                    return ksfVar;
                }
            } else {
                i = L4;
                csfVar = csfVar2;
            }
            g = tsfVar2.g();
            nsf nsfVar2 = tsfVar2.d;
            F = i4w.F(g, csfVar3, nsfVar2.e);
            if (g == F) {
            }
            if (F >= a) {
                d = uknVar3.d(a - 1);
                h = 0;
                int i2422 = d;
                wyf.b0(G, Q, function1);
                List q22 = wct.q(csfVar3, tsfVar.q, tsfVar.n);
                float floatValue22 = (dnrVar.F() && z4) ? ((Number) ((vm0) tsfVar.v.a).b.getValue()).floatValue() : tsfVar.g;
                b bVar52 = tsfVar.m;
                boolean F222 = dnrVar.F();
                ksf ksfVar222 = tsfVar.c;
                aqi aqiVar22 = tsfVar.r;
                int i2522 = i2422;
                int i2622 = h;
                fsf fsfVar42 = new fsf(utfVar3, j, i20, i3, 0);
                if (L3 < 0) {
                }
                if (i21 < 0) {
                }
                x0 x0Var322 = x0Var;
                mm6 mm6Var22 = this.w;
                uod uodVar22 = this.x;
                if (a > 0) {
                }
                tsfVar.f(ksfVar, dnrVar.F(), z3);
                return ksfVar;
            }
            d = uknVar3.d(F);
            h = nsfVar2.c.h();
            int i24222 = d;
            wyf.b0(G, Q, function1);
            List q222 = wct.q(csfVar3, tsfVar.q, tsfVar.n);
            float floatValue222 = (dnrVar.F() && z4) ? ((Number) ((vm0) tsfVar.v.a).b.getValue()).floatValue() : tsfVar.g;
            b bVar522 = tsfVar.m;
            boolean F2222 = dnrVar.F();
            ksf ksfVar2222 = tsfVar.c;
            aqi aqiVar222 = tsfVar.r;
            int i25222 = i24222;
            int i26222 = h;
            fsf fsfVar422 = new fsf(utfVar3, j, i20, i3, 0);
            if (L3 < 0) {
            }
            if (i21 < 0) {
            }
            x0 x0Var3222 = x0Var;
            mm6 mm6Var222 = this.w;
            uod uodVar222 = this.x;
            if (a > 0) {
            }
            tsfVar.f(ksfVar, dnrVar.F(), z3);
            return ksfVar;
        } catch (Throwable th) {
            wyf.b0(G, Q, function1);
            throw th;
        }
        jqdVar.b = i22;
        jqdVar.c = dnrVar2.getDensity();
        s30 s30Var = jqdVar.a;
        if (ga6.i(i22) == Integer.MAX_VALUE) {
            vme.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int i85 = ga6.i(i22);
        lpd lpdVar = (lpd) s30Var.s;
        mx0 mx0Var = (mx0) s30Var.t;
        i2 = i;
        int[] v0 = CollectionsKt.v0(lpdVar.a(utfVar3, i85, utfVar3.L(mx0Var.o())));
        int[] iArr3 = new int[v0.length];
        x0Var = x0Var2;
        mx0Var.w(utfVar3, i85, v0, xof.a, iArr3);
        jtcVar = new jtc(v0, iArr3);
        jqdVar.d = jtcVar;
        jtc jtcVar22 = jtcVar;
        length = ((int[]) jtcVar22.a).length;
        if (length == uknVar3.f) {
        }
        ox0 ox0Var2 = this.v;
        int L52 = dnrVar.L(ox0Var2.o());
        a = csfVar.a();
        int h22 = ga6.h(j) - i2;
        tsf tsfVar22 = this.r;
        csf csfVar32 = csfVar;
        gsf gsfVar32 = new gsf(csfVar32, utfVar3, L52, tsfVar22, L3, i21, (L << 32) | (L3 & 4294967295L));
        z98 z98Var2 = new z98(jtcVar22, a, L52, gsfVar32, uknVar3);
        int i232 = i2;
        ukn uknVar42 = (ukn) z98Var2.e;
        sea seaVar2 = new sea(23, uknVar3, z98Var2);
        G = wyf.G();
        List list72 = null;
        if (G == null) {
        }
        Q = wyf.Q(G);
    }
}
