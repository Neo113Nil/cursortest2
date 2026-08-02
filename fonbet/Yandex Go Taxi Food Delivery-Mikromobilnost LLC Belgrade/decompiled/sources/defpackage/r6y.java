package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class r6y implements s5y {
    public final /* synthetic */ b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j690 c;
    public final /* synthetic */ sls d;
    public final /* synthetic */ k43 e;
    public final /* synthetic */ h43 f;
    public final /* synthetic */ tse g;
    public final /* synthetic */ l0u h;
    public final /* synthetic */ r100 i;
    public final /* synthetic */ it1 j;
    public final /* synthetic */ to5 k;

    public r6y(b bVar, boolean z, j690 j690Var, hgx hgxVar, k43 k43Var, h43 h43Var, tse tseVar, l0u l0uVar, r100 r100Var, it1 it1Var, to5 to5Var) {
        this.a = bVar;
        this.b = z;
        this.c = j690Var;
        this.d = hgxVar;
        this.e = k43Var;
        this.f = h43Var;
        this.g = tseVar;
        this.h = l0uVar;
        this.i = r100Var;
        this.j = it1Var;
        this.k = to5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x077f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x076e  */
    @Override // defpackage.s5y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aa10 a(t5y t5yVar, long j) {
        float b;
        int i;
        b bVar;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        float f2;
        t6y t6yVar;
        int i10;
        int i11;
        List list;
        int i12;
        float f3;
        ArrayList arrayList;
        int i13;
        t6y t6yVar2;
        o6y o6yVar;
        int i14;
        ArrayList arrayList2;
        int i15;
        int i16;
        int i17;
        c cVar;
        q6y q6yVar;
        float f4;
        boolean z;
        boolean z2;
        Integer valueOf;
        Integer valueOf2;
        int i18;
        int i19;
        s6y s6yVar;
        tyu0 tyu0Var;
        int[] iArr;
        int i20;
        tyu0 tyu0Var2 = t5yVar.b;
        b bVar2 = this.a;
        bVar2.t.getValue();
        int i21 = 1;
        boolean z3 = bVar2.b || tyu0Var2.d0();
        boolean z4 = this.b;
        alb1.a(j, z4 ? Orientation.Vertical : Orientation.Horizontal);
        j690 j690Var = this.c;
        int f0 = z4 ? tyu0Var2.f0(j690Var.b(tyu0Var2.getLayoutDirection())) : tyu0Var2.f0(an91.f(j690Var, tyu0Var2.getLayoutDirection()));
        int f02 = z4 ? tyu0Var2.f0(j690Var.c(tyu0Var2.getLayoutDirection())) : tyu0Var2.f0(an91.e(j690Var, tyu0Var2.getLayoutDirection()));
        int f03 = tyu0Var2.f0(j690Var.d());
        int f04 = tyu0Var2.f0(j690Var.a()) + f03;
        int i22 = f0 + f02;
        int i23 = z4 ? f04 : i22;
        int i24 = z4 ? f03 : !z4 ? f0 : f02;
        int i25 = i23 - i24;
        long i26 = p8e.i(-i22, -f04, j);
        o6y o6yVar2 = (o6y) this.d.invoke();
        u4y u4yVar = o6yVar2.c;
        int i27 = n8e.i(i26);
        int h = n8e.h(i26);
        u4yVar.a.setIntValue(i27);
        u4yVar.b.setIntValue(h);
        h43 h43Var = this.f;
        k43 k43Var = this.e;
        if (z4) {
            if (k43Var == null) {
                throw nzs.g("null verticalArrangement when isVertical == true");
            }
            b = k43Var.b();
        } else {
            if (h43Var == null) {
                throw nzs.g("null horizontalAlignment when isVertical == false");
            }
            b = h43Var.b();
        }
        int f05 = tyu0Var2.f0(b);
        int itemCount = o6yVar2.getItemCount();
        int h2 = z4 ? n8e.h(j) - f04 : n8e.i(j) - i22;
        long j3 = (f0 << 32) | (f03 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i28 = h2;
        int i29 = i24;
        q6y q6yVar2 = new q6y(i26, this.b, o6yVar2, t5yVar, itemCount, f05, this.j, this.k, i29, i25, j3, this.a);
        int i30 = itemCount;
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            int h3 = bVar2.h();
            x6y x6yVar = bVar2.e;
            int b2 = idb1.b(h3, o6yVar2, x6yVar.d);
            if (h3 != b2) {
                i = f05;
                x6yVar.a.setIntValue(b2);
                x6yVar.e.a(h3);
            } else {
                i = f05;
            }
            int i31 = bVar2.i();
            tje.W(D, O, e);
            List b3 = edb1.b(o6yVar2, bVar2.s, bVar2.p);
            float floatValue = (tyu0Var2.d0() || !z3) ? bVar2.h : ((Number) bVar2.x.b.b.getValue()).floatValue();
            c cVar2 = bVar2.o;
            boolean d0 = tyu0Var2.d0();
            oz40 oz40Var = bVar2.w;
            boolean z5 = bVar2.i;
            if (i29 < 0) {
                lxv.a("invalid beforeContentPadding");
            }
            if (i25 < 0) {
                lxv.a("invalid afterContentPadding");
            }
            o6y o6yVar3 = q6yVar2.b;
            int i32 = i31;
            boolean z6 = this.b;
            tse tseVar = this.g;
            l0u l0uVar = this.h;
            EmptyList emptyList = EmptyList.a;
            if (i30 <= 0) {
                int k = n8e.k(i26);
                int j4 = n8e.j(i26);
                cVar2.d(0, k, j4, new ArrayList(), o6yVar3.d, q6yVar2, z6, d0, 1, z3, 0, 0, tseVar, l0uVar);
                if (!d0) {
                    long b4 = cVar2.b();
                    if (!k6w.a(b4, 0L)) {
                        k = p8e.g((int) (b4 >> 32), i26);
                        j4 = p8e.f((int) (b4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), i26);
                    }
                }
                tyu0Var = tyu0Var2;
                bVar = bVar2;
                s6yVar = new s6y(null, 0, false, 0.0f, tyu0Var2.w(p8e.g(k + i22, j), p8e.f(j4 + f04, j), kotlin.collections.b.f(), new p0u(5)), 0.0f, false, tseVar, t5yVar, q6yVar2.d, emptyList, -i29, i28 + i25, 0, z6 ? Orientation.Vertical : Orientation.Horizontal, i25, i);
            } else {
                bVar = bVar2;
                if (b2 >= i30) {
                    b2 = i30 - 1;
                    i32 = 0;
                }
                int round = Math.round(floatValue);
                int i33 = i32 - round;
                if (b2 == 0 && i33 < 0) {
                    round += i33;
                    i33 = 0;
                }
                x43 x43Var = new x43();
                int i34 = -i29;
                float f5 = floatValue;
                int i35 = i34 + (i < 0 ? i : 0);
                int i36 = i33 + i35;
                int i37 = b2;
                int i38 = 0;
                while (true) {
                    j2 = q6yVar2.d;
                    if (i36 >= 0 || i37 <= 0) {
                        break;
                    }
                    oz40 oz40Var2 = oz40Var;
                    int i39 = i37 - 1;
                    t6y c = q6yVar2.c(i39, j2);
                    x43Var.add(0, c);
                    i38 = Math.max(i38, c.r);
                    i36 += c.q;
                    i37 = i39;
                    oz40Var = oz40Var2;
                }
                oz40 oz40Var3 = oz40Var;
                if (i36 < i35) {
                    round -= i35 - i36;
                    i36 = i35;
                }
                int i40 = round;
                int i41 = i36 - i35;
                int i42 = i28 + i25;
                int i43 = i42 >= 0 ? i42 : 0;
                int i44 = i38;
                int i45 = i41;
                int i46 = -i41;
                int i47 = i37;
                int i48 = 0;
                boolean z7 = false;
                while (i48 < x43Var.size()) {
                    if (i46 >= i43) {
                        x43Var.remove(i48);
                        z7 = true;
                    } else {
                        i47++;
                        i46 += ((t6y) x43Var.get(i48)).q;
                        i48++;
                    }
                }
                int i49 = i44;
                int i50 = i47;
                boolean z8 = z7;
                while (i50 < i30 && (i46 < i43 || i46 <= 0 || x43Var.isEmpty())) {
                    int i51 = i43;
                    t6y c2 = q6yVar2.c(i50, j2);
                    int i52 = i30;
                    int i53 = c2.q;
                    i46 += i53;
                    if (i46 <= i35) {
                        i20 = i35;
                        if (i50 != i52 - 1) {
                            i45 -= i53;
                            i37 = i50 + 1;
                            z8 = true;
                            i50++;
                            i43 = i51;
                            i35 = i20;
                            i30 = i52;
                        }
                    } else {
                        i20 = i35;
                    }
                    int max = Math.max(i49, c2.r);
                    x43Var.addLast(c2);
                    i49 = max;
                    i50++;
                    i43 = i51;
                    i35 = i20;
                    i30 = i52;
                }
                int i54 = i30;
                if (i46 < i28) {
                    int i55 = i28 - i46;
                    int i56 = i46 + i55;
                    i3 = i49;
                    int i57 = i45 - i55;
                    while (i57 < i29 && i37 > 0) {
                        int i58 = i37 - 1;
                        int i59 = i55;
                        t6y c3 = q6yVar2.c(i58, j2);
                        x43Var.add(0, c3);
                        i3 = Math.max(i3, c3.r);
                        i57 += c3.q;
                        i37 = i58;
                        i55 = i59;
                        i56 = i56;
                    }
                    int i60 = i55;
                    int i61 = i56;
                    i2 = i40;
                    int i62 = i2 + i60;
                    if (i57 < 0) {
                        int i63 = i62 + i57;
                        i6 = i61 + i57;
                        i4 = i37;
                        i5 = i63;
                        i7 = 0;
                    } else {
                        i7 = i57;
                        i4 = i37;
                        i6 = i61;
                        i5 = i62;
                    }
                } else {
                    i2 = i40;
                    i3 = i49;
                    i4 = i37;
                    i5 = i2;
                    i6 = i46;
                    i7 = i45;
                }
                int i64 = i3;
                if (Integer.signum(Math.round(f5)) != Integer.signum(i5) || Math.abs(Math.round(f5)) < Math.abs(i5)) {
                    i8 = i5;
                    f = f5;
                } else {
                    i8 = i5;
                    f = i8;
                }
                float f6 = f5 - f;
                float f7 = 0.0f;
                if (d0 && i8 > i2 && f6 <= 0.0f) {
                    f7 = (i8 - i2) + f6;
                }
                float f8 = f7;
                if (i7 < 0) {
                    lxv.a("negative currentFirstItemScrollOffset");
                }
                int i65 = -i7;
                t6y t6yVar3 = (t6y) x43Var.first();
                if (i29 > 0 || i < 0) {
                    i9 = i65;
                    int size = x43Var.size();
                    f2 = f8;
                    int i66 = i7;
                    int i67 = 0;
                    while (i67 < size) {
                        int i68 = size;
                        int i69 = ((t6y) x43Var.get(i67)).q;
                        if (i66 == 0 || i69 > i66 || i67 == scc.f(x43Var)) {
                            break;
                        }
                        i66 -= i69;
                        i67++;
                        t6yVar3 = (t6y) x43Var.get(i67);
                        size = i68;
                    }
                    t6yVar = t6yVar3;
                    i10 = i66;
                } else {
                    i9 = i65;
                    f2 = f8;
                    t6yVar = t6yVar3;
                    i10 = i7;
                }
                int max2 = Math.max(0, i4);
                int i70 = i4 - 1;
                if (max2 <= i70) {
                    List list2 = null;
                    while (true) {
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        i11 = i50;
                        list = list2;
                        list.add(q6yVar2.c(i70, j2));
                        if (i70 == max2) {
                            break;
                        }
                        i70--;
                        list2 = list;
                        i50 = i11;
                    }
                } else {
                    i11 = i50;
                    list = null;
                }
                List list3 = b3;
                int size2 = list3.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i71 = size2 - 1;
                        int intValue = ((Number) b3.get(size2)).intValue();
                        if (intValue < max2) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(q6yVar2.c(intValue, j2));
                        }
                        if (i71 < 0) {
                            break;
                        }
                        size2 = i71;
                    }
                }
                if (list == null) {
                    list = emptyList;
                }
                List list4 = list;
                int size3 = list4.size();
                int i72 = i64;
                for (int i73 = 0; i73 < size3; i73++) {
                    i72 = Math.max(i72, ((t6y) list.get(i73)).r);
                }
                int min = Math.min(((t6y) a.Z(x43Var)).a, i54 - 1);
                int i74 = ((t6y) a.Z(x43Var)).a + 1;
                if (i74 <= min) {
                    ArrayList arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i12 = i72;
                        f3 = f;
                        arrayList = arrayList3;
                        arrayList.add(q6yVar2.c(i74, j2));
                        if (i74 == min) {
                            break;
                        }
                        i74++;
                        arrayList3 = arrayList;
                        i72 = i12;
                        f = f3;
                    }
                } else {
                    i12 = i72;
                    f3 = f;
                    arrayList = null;
                }
                if (arrayList != null && ((t6y) a.Z(arrayList)).a > min) {
                    min = ((t6y) a.Z(arrayList)).a;
                }
                int size4 = list3.size();
                List list5 = arrayList;
                int i75 = 0;
                while (i75 < size4) {
                    List list6 = b3;
                    int intValue2 = ((Number) b3.get(i75)).intValue();
                    if (intValue2 > min) {
                        if (list5 == null) {
                            list5 = new ArrayList();
                        }
                        list5.add(q6yVar2.c(intValue2, j2));
                    }
                    i75++;
                    b3 = list6;
                }
                if (list5 == null) {
                    list5 = emptyList;
                }
                List list7 = list5;
                int size5 = list7.size();
                int i76 = i12;
                for (int i77 = 0; i77 < size5; i77++) {
                    i76 = Math.max(i76, ((t6y) list5.get(i77)).r);
                }
                boolean z9 = jl40.l(t6yVar, x43Var.first()) && list.isEmpty() && list5.isEmpty();
                int g = p8e.g(z6 ? i76 : i6, i26);
                if (z6) {
                    i76 = i6;
                }
                int f9 = p8e.f(i76, i26);
                int i78 = z6 ? f9 : g;
                boolean z10 = i6 < Math.min(i78, i28);
                if (z10 && i9 != 0) {
                    lxv.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList4 = new ArrayList(list5.size() + list.size() + x43Var.size());
                if (z10) {
                    if (!list.isEmpty() || !list5.isEmpty()) {
                        lxv.a("no extra items");
                    }
                    int size6 = x43Var.size();
                    t6y t6yVar4 = t6yVar;
                    int[] iArr2 = new int[size6];
                    for (int i79 = 0; i79 < size6; i79++) {
                        iArr2[i79] = ((t6y) x43Var.get(i79)).p;
                    }
                    int[] iArr3 = new int[size6];
                    if (z6) {
                        if (k43Var == null) {
                            throw nzs.g("null verticalArrangement when isVertical == true");
                        }
                        k43Var.m(t5yVar, i78, iArr2, iArr3);
                        i13 = i28;
                        t6yVar2 = t6yVar4;
                        i14 = 0;
                        iArr = iArr3;
                    } else {
                        if (h43Var == null) {
                            throw nzs.g("null horizontalArrangement when isVertical == false");
                        }
                        i13 = i28;
                        t6yVar2 = t6yVar4;
                        i14 = 0;
                        iArr = iArr3;
                        h43Var.u(t5yVar, i78, iArr2, LayoutDirection.Ltr, iArr);
                    }
                    d6w E = j73.E(iArr);
                    int i80 = E.b;
                    int i81 = E.c;
                    if ((i81 > 0 && i80 >= 0) || (i81 < 0 && i80 <= 0)) {
                        int i82 = i14;
                        while (true) {
                            int i83 = iArr[i82];
                            t6y t6yVar5 = (t6y) x43Var.get(i82);
                            t6yVar5.n(i83, g, f9);
                            arrayList4.add(t6yVar5);
                            if (i82 == i80) {
                                break;
                            }
                            i82 += i81;
                        }
                    }
                    o6yVar = o6yVar3;
                } else {
                    i13 = i28;
                    t6yVar2 = t6yVar;
                    o6yVar = o6yVar3;
                    i14 = 0;
                    int i84 = i9;
                    int i85 = 0;
                    for (int size7 = list4.size(); i85 < size7; size7 = size7) {
                        t6y t6yVar6 = (t6y) list.get(i85);
                        i84 -= t6yVar6.q;
                        t6yVar6.n(i84, g, f9);
                        arrayList4.add(t6yVar6);
                        i85++;
                    }
                    int size8 = x43Var.size();
                    int i86 = i9;
                    for (int i87 = 0; i87 < size8; i87++) {
                        t6y t6yVar7 = (t6y) x43Var.get(i87);
                        t6yVar7.n(i86, g, f9);
                        arrayList4.add(t6yVar7);
                        i86 += t6yVar7.q;
                    }
                    int size9 = list7.size();
                    for (int i88 = 0; i88 < size9; i88++) {
                        t6y t6yVar8 = (t6y) list5.get(i88);
                        t6yVar8.n(i86, g, f9);
                        arrayList4.add(t6yVar8);
                        i86 += t6yVar8.q;
                    }
                }
                if (z5) {
                    arrayList2 = arrayList4;
                    i15 = i6;
                    i16 = f9;
                    i17 = i10;
                    cVar = cVar2;
                    q6yVar = q6yVar2;
                    f4 = f3;
                } else {
                    f4 = f3;
                    int i89 = i6;
                    i17 = i10;
                    cVar = cVar2;
                    cVar.d((int) f4, g, f9, arrayList4, o6yVar.d, q6yVar2, z6, d0, 1, z3, i17, i89, tseVar, l0uVar);
                    i16 = f9;
                    arrayList2 = arrayList4;
                    q6yVar = q6yVar2;
                    i15 = i89;
                }
                float f10 = f4;
                if (d0) {
                    z = z6;
                    z2 = z9;
                } else {
                    long b5 = cVar.b();
                    z = z6;
                    z2 = z9;
                    if (!k6w.a(b5, 0L)) {
                        int i90 = z ? i16 : g;
                        g = p8e.g(Math.max(g, (int) (b5 >> 32)), i26);
                        i16 = p8e.f(Math.max(i16, (int) (b5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), i26);
                        int i91 = z ? i16 : g;
                        if (i91 != i90) {
                            int size10 = arrayList2.size();
                            for (int i92 = i14; i92 < size10; i92++) {
                                t6y t6yVar9 = (t6y) arrayList2.get(i92);
                                t6yVar9.t = i91;
                                t6yVar9.v = t6yVar9.h + i91;
                            }
                        }
                    }
                }
                int i93 = i16;
                int i94 = g;
                t6y t6yVar10 = (t6y) x43Var.f();
                int i95 = t6yVar10 != null ? t6yVar10.a : i14;
                t6y t6yVar11 = (t6y) x43Var.h();
                int i96 = t6yVar11 != null ? t6yVar11.a : i14;
                o6yVar.b.getClass();
                ArrayList arrayList5 = arrayList2;
                List e2 = mdb1.e(this.i, i95, i96, arrayList5, v5w.a, i29, i94, i93, new ptw(10, q6yVar));
                if (z2) {
                    t6y t6yVar12 = (t6y) a.R(arrayList5);
                    if (t6yVar12 != null) {
                        valueOf = Integer.valueOf(t6yVar12.a);
                        if (z2) {
                            t6y t6yVar13 = (t6y) x43Var.h();
                            if (t6yVar13 != null) {
                                valueOf2 = Integer.valueOf(t6yVar13.a);
                                i18 = i54;
                                i19 = i11;
                            }
                            i18 = i54;
                            i19 = i11;
                            valueOf2 = null;
                        } else {
                            t6y t6yVar14 = (t6y) a.b0(arrayList5);
                            if (t6yVar14 != null) {
                                valueOf2 = Integer.valueOf(t6yVar14.a);
                                i18 = i54;
                                i19 = i11;
                            }
                            i18 = i54;
                            i19 = i11;
                            valueOf2 = null;
                        }
                        if (i19 >= i18 && i15 <= i13) {
                            i21 = i14;
                        }
                        tyu0Var = tyu0Var2;
                        s6yVar = new s6y(t6yVar2, i17, i21, f10, tyu0Var2.w(p8e.g(i94 + i22, j), p8e.f(i93 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var3, arrayList5, e2, d0, 1)), f2, z8, tseVar, t5yVar, q6yVar.d, wj91.d(valueOf == null ? valueOf.intValue() : i14, valueOf2 == null ? valueOf2.intValue() : i14, arrayList5, e2), i34, i42, i18, !z ? Orientation.Vertical : Orientation.Horizontal, i25, i);
                    }
                    valueOf = null;
                    if (z2) {
                    }
                    if (i19 >= i18) {
                        i21 = i14;
                    }
                    tyu0Var = tyu0Var2;
                    s6yVar = new s6y(t6yVar2, i17, i21, f10, tyu0Var2.w(p8e.g(i94 + i22, j), p8e.f(i93 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var3, arrayList5, e2, d0, 1)), f2, z8, tseVar, t5yVar, q6yVar.d, wj91.d(valueOf == null ? valueOf.intValue() : i14, valueOf2 == null ? valueOf2.intValue() : i14, arrayList5, e2), i34, i42, i18, !z ? Orientation.Vertical : Orientation.Horizontal, i25, i);
                } else {
                    t6y t6yVar15 = (t6y) x43Var.f();
                    if (t6yVar15 != null) {
                        valueOf = Integer.valueOf(t6yVar15.a);
                        if (z2) {
                        }
                        if (i19 >= i18) {
                        }
                        tyu0Var = tyu0Var2;
                        s6yVar = new s6y(t6yVar2, i17, i21, f10, tyu0Var2.w(p8e.g(i94 + i22, j), p8e.f(i93 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var3, arrayList5, e2, d0, 1)), f2, z8, tseVar, t5yVar, q6yVar.d, wj91.d(valueOf == null ? valueOf.intValue() : i14, valueOf2 == null ? valueOf2.intValue() : i14, arrayList5, e2), i34, i42, i18, !z ? Orientation.Vertical : Orientation.Horizontal, i25, i);
                    }
                    valueOf = null;
                    if (z2) {
                    }
                    if (i19 >= i18) {
                    }
                    tyu0Var = tyu0Var2;
                    s6yVar = new s6y(t6yVar2, i17, i21, f10, tyu0Var2.w(p8e.g(i94 + i22, j), p8e.f(i93 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var3, arrayList5, e2, d0, 1)), f2, z8, tseVar, t5yVar, q6yVar.d, wj91.d(valueOf == null ? valueOf.intValue() : i14, valueOf2 == null ? valueOf2.intValue() : i14, arrayList5, e2), i34, i42, i18, !z ? Orientation.Vertical : Orientation.Horizontal, i25, i);
                }
            }
            b bVar3 = bVar;
            bVar3.g(s6yVar, tyu0Var.d0(), false);
            vdh vdhVar = bVar3.a;
            return s6yVar;
        } catch (Throwable th) {
            tje.W(D, O, e);
            throw th;
        }
    }
}
