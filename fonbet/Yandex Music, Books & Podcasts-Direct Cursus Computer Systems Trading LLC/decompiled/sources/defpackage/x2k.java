package defpackage;

import androidx.compose.foundation.layout.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class x2k extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ z1r B;
    public final /* synthetic */ mm6 C;
    public final /* synthetic */ o3k r;
    public final /* synthetic */ bxj s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ float u;
    public final /* synthetic */ d2k v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ hz2 y;
    public final /* synthetic */ gz2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2k(o3k o3kVar, bxj bxjVar, o0k o0kVar, float f, d2k d2kVar, p9f p9fVar, Function0 function0, hz2 hz2Var, gz2 gz2Var, int i, z1r z1rVar, mm6 mm6Var) {
        super(2);
        this.r = o3kVar;
        this.s = bxjVar;
        this.t = o0kVar;
        this.u = f;
        this.v = d2kVar;
        this.w = p9fVar;
        this.x = function0;
        this.y = hz2Var;
        this.z = gz2Var;
        this.A = i;
        this.B = z1rVar;
        this.C = mm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v46, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v77, types: [c5b] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hz2 hz2Var;
        zx0 zx0Var;
        gz2 gz2Var;
        int i;
        int i2;
        hz2 hz2Var2;
        zx0 zx0Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        utf utfVar;
        int i7;
        int i8;
        int i9;
        zx0 zx0Var3;
        utf utfVar2;
        int i10;
        bxj bxjVar;
        int i11;
        int i12;
        int i13;
        int i14;
        long j2;
        ArrayList arrayList;
        int i15;
        dnr dnrVar;
        boolean z;
        nfh nfhVar;
        zx0 zx0Var4;
        ArrayList arrayList2;
        List list;
        ArrayList arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        List list2;
        int i16;
        int i17;
        int i18;
        z1r z1rVar;
        int i19;
        Object obj3;
        ArrayList arrayList6;
        int i20;
        bxj bxjVar2;
        y2k y2kVar;
        zx0 zx0Var5;
        int i21;
        int max;
        zx0 zx0Var6;
        x2k x2kVar = this;
        utf utfVar3 = (utf) obj;
        long j3 = ((ga6) obj2).a;
        o3k o3kVar = x2kVar.r;
        o3kVar.E.getValue();
        bxj bxjVar3 = bxj.a;
        bxj bxjVar4 = x2kVar.s;
        boolean z2 = bxjVar4 == bxjVar3;
        kg5.p(j3, z2 ? bxjVar3 : bxj.b);
        o0k o0kVar = x2kVar.t;
        int L = z2 ? utfVar3.b.L(o0kVar.b(utfVar3.b.getLayoutDirection())) : utfVar3.b.L(a.f(o0kVar, utfVar3.b.getLayoutDirection()));
        int L2 = z2 ? utfVar3.b.L(o0kVar.c(utfVar3.b.getLayoutDirection())) : utfVar3.b.L(a.e(o0kVar, utfVar3.b.getLayoutDirection()));
        float d = o0kVar.d();
        dnr dnrVar2 = utfVar3.b;
        int L3 = dnrVar2.L(d);
        int L4 = dnrVar2.L(o0kVar.a()) + L3;
        int i22 = L + L2;
        int i23 = z2 ? L4 : i22;
        if (z2) {
            L2 = L3;
        } else if (!z2) {
            L2 = L;
        }
        int i24 = i23 - L2;
        boolean z3 = z2;
        long i25 = ia6.i(j3, -i22, -L4);
        o3kVar.q = utfVar3;
        int L5 = dnrVar2.L(x2kVar.u);
        int h = z3 ? ga6.h(j3) - L4 : ga6.i(j3) - i22;
        long j4 = (L << 32) | (L3 & 4294967295L);
        int i26 = x2kVar.v.i(utfVar3, h, L5);
        int i27 = i26 < 0 ? 0 : i26;
        o3kVar.B = ia6.b(bxjVar4 == bxjVar3 ? ga6.i(i25) : i27, bxjVar4 != bxjVar3 ? ga6.h(i25) : i27, 5);
        v2k v2kVar = (v2k) x2kVar.w.invoke();
        int i28 = h + L2 + i24;
        z1r z1rVar2 = x2kVar.B;
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            int j5 = o3kVar.j();
            evj evjVar = o3kVar.d;
            int F = i4w.F(j5, v2kVar, evjVar.e);
            if (j5 != F) {
                ((u6k) evjVar.d).i(F);
                ((xtf) evjVar.f).a(j5);
            }
            o3kVar.j();
            float k = o3kVar.k();
            o3kVar.n();
            int i29 = i27 + L5;
            int b = eeh.b(z1rVar2.a(i28, i27, L2, i24) - (k * i29));
            wyf.b0(G, Q, e);
            List q = wct.q(v2kVar, o3kVar.C, o3kVar.x);
            int intValue = ((Number) x2kVar.x.invoke()).intValue();
            aqi aqiVar = o3kVar.D;
            int i30 = L2;
            v2k v2kVar2 = v2kVar;
            int i31 = intValue;
            utf utfVar4 = utfVar3;
            int i32 = i28;
            int i33 = L5;
            fsf fsfVar = new fsf(utfVar4, j3, i22, L4, 2);
            if (i30 < 0) {
                vme.a("negative beforeContentPadding");
            }
            if (i24 < 0) {
                vme.a("negative afterContentPadding");
            }
            int i34 = i29 < 0 ? 0 : i29;
            int i35 = x2kVar.A;
            z1r z1rVar3 = x2kVar.B;
            mm6 mm6Var = x2kVar.C;
            if (i31 <= 0) {
                y2kVar = new y2k(c5b.a, i27, i33, i24, bxjVar4, -i30, h + i24, i35, z1rVar3, (lfh) fsfVar.invoke(Integer.valueOf(ga6.k(i25)), Integer.valueOf(ga6.j(i25)), kzj.A), mm6Var);
                dnrVar = dnrVar2;
            } else {
                int i36 = i24;
                bxj bxjVar5 = bxjVar4;
                int i37 = i27;
                long b2 = ia6.b(bxjVar5 == bxjVar3 ? ga6.i(i25) : i37, bxjVar5 != bxjVar3 ? ga6.h(i25) : i37, 5);
                while (F > 0 && b > 0) {
                    F--;
                    b -= i34;
                }
                int i38 = b * (-1);
                if (F >= i31) {
                    F = i31 - 1;
                    i38 = 0;
                }
                zx0 zx0Var7 = new zx0();
                int i39 = -i30;
                int i40 = i39 + (i33 < 0 ? i33 : 0);
                int i41 = i38 + i40;
                int i42 = 0;
                while (true) {
                    hz2Var = x2kVar.y;
                    zx0Var = zx0Var7;
                    gz2Var = x2kVar.z;
                    i = i40;
                    if (i41 >= 0 || F <= 0) {
                        break;
                    }
                    int i43 = F - 1;
                    fsf fsfVar2 = fsfVar;
                    utf utfVar5 = utfVar4;
                    int i44 = i37;
                    int i45 = i33;
                    int i46 = i34;
                    long j6 = j4;
                    long j7 = b2;
                    bxj bxjVar6 = bxjVar5;
                    v2k v2kVar3 = v2kVar2;
                    nfh F2 = swf.F(utfVar5, i43, j7, v2kVar3, j6, bxjVar6, gz2Var, hz2Var, dnrVar2.getLayoutDirection(), false, i44);
                    zx0Var.add(0, F2);
                    i42 = Math.max(i42, F2.j);
                    i41 += i46;
                    x2kVar = this;
                    zx0Var7 = zx0Var;
                    F = i43;
                    i32 = i32;
                    i31 = i31;
                    i40 = i;
                    utfVar4 = utfVar5;
                    v2kVar2 = v2kVar3;
                    bxjVar5 = bxjVar6;
                    i37 = i44;
                    i39 = i39;
                    fsfVar = fsfVar2;
                    i34 = i46;
                    i36 = i36;
                    i33 = i45;
                    j4 = j6;
                    b2 = j7;
                }
                fsf fsfVar3 = fsfVar;
                utf utfVar6 = utfVar4;
                int i47 = i39;
                int i48 = i37;
                int i49 = i33;
                int i50 = i31;
                int i51 = i34;
                zx0 zx0Var8 = zx0Var;
                long j8 = j4;
                int i52 = i36;
                long j9 = b2;
                bxj bxjVar7 = bxjVar5;
                v2k v2kVar4 = v2kVar2;
                int i53 = i32;
                int i54 = i41;
                int i55 = i42;
                if (i54 < i) {
                    i54 = i;
                }
                int i56 = i54 - i;
                int i57 = h + i52;
                int i58 = i57 < 0 ? 0 : i57;
                utf utfVar7 = utfVar6;
                int i59 = -i56;
                hz2 hz2Var3 = hz2Var;
                long j10 = j9;
                int i60 = F;
                int i61 = 0;
                boolean z4 = false;
                while (i61 < zx0Var8.c) {
                    if (i59 >= i58) {
                        zx0Var8.a(i61);
                        z4 = true;
                    } else {
                        i60++;
                        i59 += i51;
                        i61++;
                    }
                }
                int i62 = i59;
                int i63 = i50;
                int i64 = i56;
                boolean z5 = z4;
                int i65 = i60;
                int i66 = F;
                while (true) {
                    if (i65 >= i63) {
                        int i67 = i62;
                        i2 = i55;
                        hz2Var2 = hz2Var3;
                        zx0Var2 = zx0Var8;
                        i3 = i63;
                        i4 = i65;
                        i5 = i67;
                        i6 = i48;
                        j = j10;
                        utfVar = utfVar7;
                        i7 = h;
                        break;
                    }
                    if (i62 >= i58 && i62 > 0 && !zx0Var8.isEmpty()) {
                        hz2 hz2Var4 = hz2Var3;
                        zx0Var2 = zx0Var8;
                        i3 = i63;
                        i4 = i65;
                        i5 = i62;
                        i2 = i55;
                        hz2Var2 = hz2Var4;
                        i6 = i48;
                        i7 = h;
                        j = j10;
                        utfVar = utfVar7;
                        break;
                    }
                    int i68 = i48;
                    int i69 = i58;
                    int i70 = i62;
                    long j11 = j10;
                    int i71 = i55;
                    hz2 hz2Var5 = hz2Var3;
                    zx0 zx0Var9 = zx0Var8;
                    int i72 = i63;
                    utf utfVar8 = utfVar7;
                    nfh F3 = swf.F(utfVar8, i65, j11, v2kVar4, j8, bxjVar7, gz2Var, hz2Var5, dnrVar2.getLayoutDirection(), false, i68);
                    int i73 = i65;
                    int i74 = i72 - 1;
                    int i75 = i70 + (i73 == i74 ? i68 : i51);
                    if (i75 > i || i73 == i74) {
                        max = Math.max(i71, F3.j);
                        zx0Var6 = zx0Var9;
                        zx0Var6.addLast(F3);
                    } else {
                        i64 -= i51;
                        z5 = true;
                        i66 = i73 + 1;
                        max = i71;
                        zx0Var6 = zx0Var9;
                    }
                    i63 = i72;
                    zx0Var8 = zx0Var6;
                    i62 = i75;
                    i65 = i73 + 1;
                    hz2Var3 = hz2Var5;
                    i55 = max;
                    i48 = i68;
                    i58 = i69;
                    utfVar7 = utfVar8;
                    j10 = j11;
                }
                if (i5 < i7) {
                    int i76 = i7 - i5;
                    int i77 = i5 + i76;
                    int i78 = i2;
                    int i79 = i64 - i76;
                    int i80 = i30;
                    while (i79 < i80 && i66 > 0) {
                        i66--;
                        int i81 = i80;
                        int i82 = i7;
                        int i83 = i79;
                        zx0 zx0Var10 = zx0Var2;
                        nfh F4 = swf.F(utfVar, i66, j, v2kVar4, j8, bxjVar7, gz2Var, hz2Var2, dnrVar2.getLayoutDirection(), false, i6);
                        zx0Var10.add(0, F4);
                        int max2 = Math.max(i78, F4.j);
                        i79 = i83 + i51;
                        bxjVar7 = bxjVar7;
                        zx0Var2 = zx0Var10;
                        i80 = i81;
                        i4 = i4;
                        i78 = max2;
                        i7 = i82;
                    }
                    i8 = i7;
                    i9 = i4;
                    int i84 = i78;
                    i10 = i80;
                    int i85 = i79;
                    zx0Var3 = zx0Var2;
                    utfVar2 = utfVar;
                    bxjVar = bxjVar7;
                    if (i85 < 0) {
                        i5 = i77 + i85;
                        i12 = i84;
                        i11 = 0;
                    } else {
                        i12 = i84;
                        i11 = i85;
                        i5 = i77;
                    }
                } else {
                    i8 = i7;
                    i9 = i4;
                    int i86 = i2;
                    zx0Var3 = zx0Var2;
                    utfVar2 = utfVar;
                    i10 = i30;
                    bxjVar = bxjVar7;
                    i11 = i64;
                    i12 = i86;
                }
                if (i11 < 0) {
                    vme.a("invalid currentFirstPageScrollOffset");
                }
                int i87 = -i11;
                nfh nfhVar2 = (nfh) zx0Var3.first();
                if (i10 > 0 || i49 < 0) {
                    int f = zx0Var3.f();
                    nfh nfhVar3 = nfhVar2;
                    int i88 = 0;
                    while (i88 < f && i11 != 0) {
                        int i89 = f;
                        i14 = i51;
                        if (i14 > i11) {
                            i13 = i11;
                            break;
                        }
                        i13 = i11;
                        if (i88 == zx0Var3.f() - 1) {
                            break;
                        }
                        i11 = i13 - i14;
                        i88++;
                        nfhVar3 = (nfh) zx0Var3.get(i88);
                        i51 = i14;
                        f = i89;
                    }
                    i13 = i11;
                    i14 = i51;
                    nfhVar2 = nfhVar3;
                    i11 = i13;
                } else {
                    i14 = i51;
                }
                utf utfVar9 = utfVar2;
                int i90 = i14;
                int i91 = i11;
                bxj bxjVar8 = bxjVar;
                zx0 zx0Var11 = zx0Var3;
                nfh nfhVar4 = nfhVar2;
                int i92 = i6;
                int i93 = i5;
                w2k w2kVar = new w2k(utfVar9, j, v2kVar4, j8, bxjVar8, gz2Var, hz2Var2, i92, 1);
                int max3 = Math.max(0, i66 - i35);
                int i94 = i66 - 1;
                if (max3 <= i94) {
                    ArrayList arrayList7 = null;
                    while (true) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        j2 = j;
                        arrayList = arrayList7;
                        arrayList.add(w2kVar.invoke(Integer.valueOf(i94)));
                        if (i94 == max3) {
                            break;
                        }
                        i94--;
                        arrayList7 = arrayList;
                        j = j2;
                    }
                } else {
                    j2 = j;
                    arrayList = null;
                }
                List list3 = q;
                List list4 = list3;
                int size = list4.size();
                ArrayList arrayList8 = arrayList;
                int i95 = 0;
                while (i95 < size) {
                    List list5 = list3;
                    int intValue2 = ((Number) list3.get(i95)).intValue();
                    if (intValue2 < max3) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        i21 = i95;
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add(w2kVar.invoke(Integer.valueOf(intValue2)));
                        arrayList8 = arrayList9;
                    } else {
                        i21 = i95;
                    }
                    i95 = i21 + 1;
                    list3 = list5;
                }
                List list6 = list3;
                List list7 = arrayList8 == null ? c5b.a : arrayList8;
                int size2 = list7.size();
                int i96 = i12;
                for (int i97 = 0; i97 < size2; i97++) {
                    i96 = Math.max(i96, ((nfh) list7.get(i97)).j);
                }
                int i98 = ((nfh) zx0Var11.last()).a;
                List list8 = list7;
                long j12 = j2;
                int i99 = i96;
                w2k w2kVar2 = new w2k(utfVar9, j12, v2kVar4, j8, bxjVar8, gz2Var, hz2Var2, i92, 0);
                int min = Math.min(i98 + i35, i3 - 1);
                int i100 = i98 + 1;
                List list9 = null;
                if (i100 <= min) {
                    while (true) {
                        if (list9 == null) {
                            list9 = new ArrayList();
                        }
                        list9.add(w2kVar2.invoke(Integer.valueOf(i100)));
                        if (i100 == min) {
                            break;
                        }
                        i100++;
                    }
                }
                int size3 = list4.size();
                for (int i101 = 0; i101 < size3; i101++) {
                    int intValue3 = ((Number) list6.get(i101)).intValue();
                    if (min + 1 <= intValue3 && intValue3 < i3) {
                        if (list9 == null) {
                            list9 = new ArrayList();
                        }
                        list9.add(w2kVar2.invoke(Integer.valueOf(intValue3)));
                    }
                }
                if (list9 == null) {
                    list9 = c5b.a;
                }
                int size4 = list9.size();
                int i102 = i99;
                for (int i103 = 0; i103 < size4; i103++) {
                    i102 = Math.max(i102, ((nfh) list9.get(i103)).j);
                }
                boolean z6 = Intrinsics.d(nfhVar4, zx0Var11.first()) && list8.isEmpty() && list9.isEmpty();
                bxj bxjVar9 = bxj.a;
                int g = ia6.g(bxjVar8 == bxjVar9 ? i102 : i93, i25);
                if (bxjVar8 == bxjVar9) {
                    i102 = i93;
                }
                int f2 = ia6.f(i102, i25);
                int i104 = bxjVar8 == bxjVar9 ? f2 : g;
                int i105 = i8;
                boolean z7 = i93 < Math.min(i104, i105);
                if (!z7 || i87 == 0) {
                    i15 = i87;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i15 = i87;
                    sb.append(i15);
                    vme.c(sb.toString());
                }
                ArrayList arrayList10 = new ArrayList(list9.size() + list8.size() + zx0Var11.f());
                if (z7) {
                    if (!list8.isEmpty() || !list9.isEmpty()) {
                        vme.a("No extra pages");
                    }
                    int f3 = zx0Var11.f();
                    int[] iArr = new int[f3];
                    for (int i106 = 0; i106 < f3; i106++) {
                        iArr[i106] = i92;
                    }
                    int[] iArr2 = new int[f3];
                    z = z6;
                    nfhVar = nfhVar4;
                    nx0 nx0Var = new nx0(dnrVar2.c0(i49), false, null);
                    if (bxjVar8 == bxj.a) {
                        nx0Var.a(utfVar9, i104, iArr, iArr2);
                        arrayList2 = arrayList10;
                        dnrVar = dnrVar2;
                    } else {
                        arrayList2 = arrayList10;
                        dnrVar = dnrVar2;
                        nx0Var.w(utfVar9, i104, iArr, xof.a, iArr2);
                    }
                    IntRange A = xz0.A(iArr2);
                    int i107 = A.a;
                    int i108 = A.b;
                    int i109 = A.c;
                    if ((i109 <= 0 || i107 > i108) && (i109 >= 0 || i108 > i107)) {
                        zx0Var4 = zx0Var11;
                    } else {
                        while (true) {
                            int i110 = iArr2[i107];
                            zx0Var5 = zx0Var11;
                            nfh nfhVar5 = (nfh) zx0Var5.get(i107);
                            nfhVar5.b(i110, g, f2);
                            arrayList2.add(nfhVar5);
                            if (i107 == i108) {
                                break;
                            }
                            i107 += i109;
                            zx0Var11 = zx0Var5;
                        }
                        zx0Var4 = zx0Var5;
                    }
                    list = list8;
                } else {
                    dnrVar = dnrVar2;
                    z = z6;
                    nfhVar = nfhVar4;
                    zx0Var4 = zx0Var11;
                    arrayList2 = arrayList10;
                    int size5 = list8.size();
                    int i111 = i15;
                    for (int i112 = 0; i112 < size5; i112++) {
                        nfh nfhVar6 = (nfh) list8.get(i112);
                        i111 -= i29;
                        nfhVar6.b(i111, g, f2);
                        arrayList2.add(nfhVar6);
                    }
                    list = list8;
                    int f4 = zx0Var4.f();
                    for (int i113 = 0; i113 < f4; i113++) {
                        nfh nfhVar7 = (nfh) zx0Var4.get(i113);
                        nfhVar7.b(i15, g, f2);
                        arrayList2.add(nfhVar7);
                        i15 += i29;
                    }
                    int size6 = list9.size();
                    for (int i114 = 0; i114 < size6; i114++) {
                        nfh nfhVar8 = (nfh) list9.get(i114);
                        nfhVar8.b(i15, g, f2);
                        arrayList2.add(nfhVar8);
                        i15 += i29;
                    }
                }
                if (z) {
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = new ArrayList(arrayList2.size());
                    int size7 = arrayList2.size();
                    int i115 = 0;
                    while (i115 < size7) {
                        Object obj4 = arrayList2.get(i115);
                        nfh nfhVar9 = (nfh) obj4;
                        zx0 zx0Var12 = zx0Var4;
                        int i116 = size7;
                        if (nfhVar9.a >= ((nfh) zx0Var12.first()).a && nfhVar9.a <= ((nfh) zx0Var12.last()).a) {
                            arrayList3.add(obj4);
                        }
                        i115++;
                        size7 = i116;
                        zx0Var4 = zx0Var12;
                    }
                }
                zx0 zx0Var13 = zx0Var4;
                if (list.isEmpty()) {
                    arrayList4 = c5b.a;
                } else {
                    arrayList4 = new ArrayList(arrayList2.size());
                    int size8 = arrayList2.size();
                    for (int i117 = 0; i117 < size8; i117++) {
                        Object obj5 = arrayList2.get(i117);
                        if (((nfh) obj5).a < ((nfh) zx0Var13.first()).a) {
                            arrayList4.add(obj5);
                        }
                    }
                }
                if (list9.isEmpty()) {
                    arrayList5 = c5b.a;
                } else {
                    arrayList5 = new ArrayList(arrayList2.size());
                    int size9 = arrayList2.size();
                    for (int i118 = 0; i118 < size9; i118++) {
                        Object obj6 = arrayList2.get(i118);
                        if (((nfh) obj6).a > ((nfh) zx0Var13.last()).a) {
                            arrayList5.add(obj6);
                        }
                    }
                }
                List list10 = arrayList5;
                if (arrayList3.isEmpty()) {
                    list2 = arrayList4;
                    i20 = g;
                    bxjVar2 = bxjVar8;
                    i16 = i53;
                    i17 = i52;
                    i18 = i10;
                    z1rVar = z1rVar3;
                    i19 = i90;
                    obj3 = null;
                    arrayList6 = arrayList3;
                } else {
                    list2 = arrayList4;
                    i16 = i53;
                    i17 = i52;
                    i18 = i10;
                    z1rVar = z1rVar3;
                    i19 = i90;
                    obj3 = arrayList3.get(0);
                    float f5 = -Math.abs(((nfh) r5).l - z1rVar.a(i16, i19, i18, i17));
                    int size10 = arrayList3.size() - 1;
                    if (1 <= size10) {
                        int i119 = 1;
                        float f6 = f5;
                        i20 = g;
                        while (true) {
                            Object obj7 = arrayList3.get(i119);
                            arrayList6 = arrayList3;
                            bxjVar2 = bxjVar8;
                            float f7 = -Math.abs(((nfh) obj7).l - z1rVar.a(i16, i19, i18, i17));
                            if (Float.compare(f6, f7) < 0) {
                                f6 = f7;
                                obj3 = obj7;
                            }
                            if (i119 == size10) {
                                break;
                            }
                            i119++;
                            arrayList3 = arrayList6;
                            bxjVar8 = bxjVar2;
                        }
                    } else {
                        arrayList6 = arrayList3;
                        i20 = g;
                        bxjVar2 = bxjVar8;
                    }
                }
                nfh nfhVar10 = (nfh) obj3;
                y2kVar = new y2k(arrayList6, i92, i49, i17, bxjVar2, i47, i57, i35, nfhVar, nfhVar10, i19 == 0 ? 0.0f : yhn.c((z1rVar.a(i16, i92, i18, i17) - (nfhVar10 != null ? nfhVar10.l : 0)) / i19, -0.5f, 0.5f), i91, i9 < i3 || i93 > i105, z1rVar, (lfh) fsfVar3.invoke(Integer.valueOf(i20), Integer.valueOf(f2), new afg(14, aqiVar, arrayList2)), z5, list2, list10, mm6Var);
            }
            y2k y2kVar2 = y2kVar;
            o3kVar.h(y2kVar2, dnrVar.F(), false);
            return y2kVar2;
        } catch (Throwable th) {
            wyf.b0(G, Q, e);
            throw th;
        }
    }
}
