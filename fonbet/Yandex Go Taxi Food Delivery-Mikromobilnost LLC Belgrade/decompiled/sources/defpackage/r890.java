package defpackage;

import android.os.Trace;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.d;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class r890 implements s5y {
    public final /* synthetic */ d a;
    public final /* synthetic */ Orientation b;
    public final /* synthetic */ j690 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ u790 e;
    public final /* synthetic */ sls f;
    public final /* synthetic */ sls g;
    public final /* synthetic */ to5 h;
    public final /* synthetic */ k1t0 i;
    public final /* synthetic */ tse j;

    public r890(d dVar, Orientation orientation, j690 j690Var, float f, u790 u790Var, hgx hgxVar, sls slsVar, to5 to5Var, k1t0 k1t0Var, tse tseVar) {
        this.a = dVar;
        this.b = orientation;
        this.c = j690Var;
        this.d = f;
        this.e = u790Var;
        this.f = hgxVar;
        this.g = slsVar;
        this.h = to5Var;
        this.i = k1t0Var;
        this.j = tseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // defpackage.s5y
    public final aa10 a(t5y t5yVar, long j) {
        d dVar;
        int i;
        to5 to5Var;
        d dVar2;
        int i2;
        to5 to5Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        da10 da10Var;
        int i17;
        int i18;
        int i19;
        x43 x43Var;
        int i20;
        int i21;
        long j2;
        int i22;
        ArrayList arrayList;
        int i23;
        ArrayList arrayList2;
        int i24;
        int i25;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i26;
        int i27;
        int i28;
        tyu0 tyu0Var;
        x43 x43Var2;
        Orientation orientation;
        da10 da10Var2;
        int i29;
        int i30;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Object obj;
        ArrayList arrayList8;
        int i31;
        k1t0 k1t0Var;
        int i32;
        int i33;
        ArrayList arrayList9;
        int i34;
        s890 s890Var;
        t5y t5yVar2;
        int[] iArr;
        int i35;
        int i36;
        Orientation orientation2;
        List list;
        to5 to5Var3;
        long j3;
        int i37;
        List list2;
        int i38;
        int i39;
        r890 r890Var = this;
        tyu0 tyu0Var2 = t5yVar.b;
        d dVar3 = r890Var.a;
        dVar3.B.getValue();
        Orientation orientation3 = Orientation.Vertical;
        Orientation orientation4 = r890Var.b;
        boolean z = orientation4 == orientation3;
        alb1.a(j, z ? orientation3 : Orientation.Horizontal);
        j690 j690Var = r890Var.c;
        int f0 = z ? tyu0Var2.f0(j690Var.b(tyu0Var2.getLayoutDirection())) : tyu0Var2.f0(an91.f(j690Var, tyu0Var2.getLayoutDirection()));
        int f02 = z ? tyu0Var2.f0(j690Var.c(tyu0Var2.getLayoutDirection())) : tyu0Var2.f0(an91.e(j690Var, tyu0Var2.getLayoutDirection()));
        int f03 = tyu0Var2.f0(j690Var.d());
        int f04 = tyu0Var2.f0(j690Var.a()) + f03;
        int i40 = f0 + f02;
        int i41 = z ? f04 : i40;
        if (z) {
            f02 = f03;
        } else if (!z) {
            f02 = f0;
        }
        int i42 = i41 - f02;
        boolean z2 = z;
        long i43 = p8e.i(-i40, -f04, j);
        dVar3.n = t5yVar;
        int f05 = tyu0Var2.f0(r890Var.d);
        long j4 = i43;
        int h = z2 ? n8e.h(j) - f04 : n8e.i(j) - i40;
        long j5 = (f0 << 32) | (f03 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int a = r890Var.e.a(t5yVar, h);
        int i44 = a < 0 ? 0 : a;
        p8e.b(0, orientation4 == orientation3 ? n8e.i(j4) : i44, 0, orientation4 != orientation3 ? n8e.h(j4) : i44, 5);
        p890 p890Var = (p890) r890Var.f.invoke();
        int i45 = h + f02 + i42;
        k1t0 k1t0Var2 = r890Var.i;
        i2t0 D = tje.D();
        long j6 = j5;
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            int k = dVar3.k();
            tyu0 tyu0Var3 = tyu0Var2;
            no6 no6Var = dVar3.d;
            int b = idb1.b(k, p890Var, no6Var.x);
            if (k != b) {
                ((yx40) no6Var.c).setIntValue(b);
                ((w5y) no6Var.y).a(k);
            }
            dVar3.k();
            float l = dVar3.l();
            dVar3.o();
            int i46 = i44 + f05;
            int b2 = m810.b(k1t0Var2.c(i45, i44, f02, i42) - (l * i46));
            tje.W(D, O, e);
            List b3 = edb1.b(p890Var, dVar3.z, dVar3.v);
            wx40 a2 = y5w.a();
            int intValue = ((Number) r890Var.g.invoke()).intValue();
            oz40 oz40Var = dVar3.A;
            if (f02 < 0) {
                lxv.a("negative beforeContentPadding");
            }
            if (i42 < 0) {
                lxv.a("negative afterContentPadding");
            }
            int i47 = i46 < 0 ? 0 : i46;
            int i48 = intValue < 0 ? intValue : 0;
            Orientation orientation5 = r890Var.b;
            if (orientation5 == orientation3) {
                dVar = dVar3;
                i = n8e.i(j4);
            } else {
                dVar = dVar3;
                i = i44;
            }
            p890 p890Var2 = p890Var;
            long b4 = p8e.b(0, i, 0, orientation5 != orientation3 ? n8e.h(j4) : i44, 5);
            int i49 = i47;
            k1t0 k1t0Var3 = r890Var.i;
            tse tseVar = r890Var.j;
            if (intValue <= 0) {
                s890Var = new s890(i44, f05, i42, orientation5, -f02, h + i42, i48, k1t0Var3, tyu0Var3.w(p8e.g(n8e.k(j4) + i40, j), p8e.f(n8e.j(j4) + f04, j), b.f(), new p0u(5)), tseVar, t5yVar, b4);
                t5yVar2 = t5yVar;
                dVar2 = dVar;
            } else {
                long j7 = b4;
                Orientation orientation6 = orientation5;
                int i50 = f05;
                int i51 = 0;
                while (b > 0 && b2 > 0) {
                    b--;
                    b2 -= i49;
                }
                int i52 = b2 * (-1);
                if (b >= intValue) {
                    b = intValue - 1;
                    i52 = 0;
                }
                x43 x43Var3 = new x43();
                int i53 = b;
                int i54 = -f02;
                int i55 = i54 + (i50 < 0 ? i50 : 0);
                int i56 = i53;
                int i57 = i52 + i55;
                int i58 = 0;
                while (true) {
                    to5Var = r890Var.h;
                    if (i57 >= 0 || i56 <= 0) {
                        break;
                    }
                    i56--;
                    int i59 = i45;
                    int i60 = i58;
                    long j8 = j6;
                    Orientation orientation7 = orientation6;
                    int i61 = i55;
                    int i62 = i51;
                    p890 p890Var3 = p890Var2;
                    da10 a3 = q890.a(t5yVar, i56, j7, p890Var3, j8, orientation7, to5Var, tyu0Var3.getLayoutDirection(), i44, a2);
                    x43Var3.add(i62, a3);
                    i57 += i49;
                    p890Var2 = p890Var3;
                    j6 = j8;
                    j7 = j7;
                    b3 = b3;
                    i50 = i50;
                    i45 = i59;
                    i48 = i48;
                    i58 = Math.max(i60, a3.h);
                    orientation6 = orientation7;
                    i44 = i44;
                    i51 = i62;
                    intValue = intValue;
                    i55 = i61;
                    f02 = f02;
                    j4 = j4;
                    r890Var = this;
                }
                int i63 = i50;
                int i64 = i45;
                int i65 = i48;
                int i66 = i58;
                int i67 = f02;
                int i68 = i44;
                long j9 = j4;
                dVar2 = dVar;
                int i69 = intValue;
                long j10 = j7;
                Orientation orientation8 = orientation6;
                int i70 = i55;
                int i71 = i51;
                p890 p890Var4 = p890Var2;
                long j11 = j6;
                List list3 = b3;
                x43 x43Var4 = x43Var3;
                if (i57 < i70) {
                    i57 = i70;
                }
                int i72 = i57 - i70;
                int i73 = h + i42;
                int i74 = i73 < 0 ? i71 : i73;
                int i75 = -i72;
                int i76 = i66;
                int i77 = i71;
                int i78 = i56;
                while (i71 < x43Var4.size()) {
                    if (i75 >= i74) {
                        x43Var4.remove(i71);
                        i77 = 1;
                    } else {
                        i78++;
                        i75 += i49;
                        i71++;
                    }
                }
                int i79 = i75;
                long j12 = j10;
                int i80 = i69;
                Orientation orientation9 = orientation8;
                List list4 = list3;
                ?? r16 = i77;
                int i81 = i78;
                while (true) {
                    if (i81 >= i80) {
                        i2 = i79;
                        to5Var2 = to5Var;
                        i3 = i72;
                        i4 = i76;
                        i5 = i80;
                        i6 = i81;
                        i7 = h;
                        break;
                    }
                    if (i79 >= i74 && i79 > 0 && !x43Var4.isEmpty()) {
                        i2 = i79;
                        to5Var2 = to5Var;
                        i3 = i72;
                        i7 = h;
                        i4 = i76;
                        i5 = i80;
                        i6 = i81;
                        break;
                    }
                    to5 to5Var4 = to5Var;
                    int i82 = i74;
                    int i83 = i79;
                    int i84 = i72;
                    int i85 = i76;
                    long j13 = j12;
                    int i86 = i80;
                    da10 a4 = q890.a(t5yVar, i81, j13, p890Var4, j11, orientation9, to5Var4, tyu0Var3.getLayoutDirection(), i68, a2);
                    int i87 = i81;
                    int i88 = i86 - 1;
                    j12 = j13;
                    int i89 = i83 + (i87 == i88 ? i68 : i49);
                    if (i89 > i70 || i87 == i88) {
                        int max = Math.max(i85, a4.h);
                        x43Var4.addLast(a4);
                        i72 = i84;
                        i76 = max;
                    } else {
                        i56 = i87 + 1;
                        i76 = i85;
                        r16 = 1;
                        i72 = i84 - i49;
                    }
                    i81 = i87 + 1;
                    to5Var = to5Var4;
                    i80 = i86;
                    i79 = i89;
                    i74 = i82;
                    r16 = r16;
                }
                if (i2 < i7) {
                    int i90 = i7 - i2;
                    int i91 = i2 + i90;
                    int i92 = i4;
                    int i93 = i3 - i90;
                    while (true) {
                        i39 = i67;
                        if (i93 >= i39 || i56 <= 0) {
                            break;
                        }
                        i56--;
                        i67 = i39;
                        da10 a5 = q890.a(t5yVar, i56, j12, p890Var4, j11, orientation9, to5Var2, tyu0Var3.getLayoutDirection(), i68, a2);
                        x43Var4.add(0, a5);
                        i92 = Math.max(i92, a5.h);
                        i93 += i49;
                        i6 = i6;
                    }
                    i8 = i6;
                    i67 = i39;
                    int i94 = i93;
                    int i95 = i92;
                    if (i94 < 0) {
                        i10 = i95;
                        i11 = i91 + i94;
                        i9 = 0;
                    } else {
                        i10 = i95;
                        i11 = i91;
                        i9 = i94;
                    }
                } else {
                    i8 = i6;
                    i9 = i3;
                    i10 = i4;
                    i11 = i2;
                }
                if (i9 < 0) {
                    lxv.a("invalid currentFirstPageScrollOffset");
                }
                int i96 = -i9;
                da10 da10Var3 = (da10) x43Var4.first();
                if (i67 > 0 || i63 < 0) {
                    int size = x43Var4.size();
                    int i97 = 0;
                    while (i97 < size && i9 != 0) {
                        i13 = i11;
                        i14 = i49;
                        i12 = i9;
                        if (i14 > i9 || i97 == scc.f(x43Var4)) {
                            break;
                        }
                        i9 = i12 - i14;
                        i97++;
                        da10Var3 = (da10) x43Var4.get(i97);
                        i49 = i14;
                        i11 = i13;
                    }
                    i12 = i9;
                    i13 = i11;
                    i14 = i49;
                    i15 = i12;
                } else {
                    i15 = i9;
                    i13 = i11;
                    i14 = i49;
                }
                da10 da10Var4 = da10Var3;
                int max2 = Math.max(0, i56 - i65);
                int i98 = 1;
                int i99 = i56 - 1;
                if (max2 <= i99) {
                    ArrayList arrayList10 = null;
                    while (true) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        i16 = i96;
                        int i100 = i99;
                        i18 = i5;
                        i19 = i14;
                        x43Var = x43Var4;
                        da10Var = da10Var4;
                        i20 = i65;
                        i21 = i98;
                        arrayList = arrayList10;
                        i17 = i7;
                        j2 = j12;
                        i22 = max2;
                        arrayList.add(q890.a(t5yVar, i100, j2, p890Var4, j11, orientation9, to5Var2, tyu0Var3.getLayoutDirection(), i68, a2));
                        if (i100 == i22) {
                            break;
                        }
                        int i101 = i100 - 1;
                        i96 = i16;
                        j12 = j2;
                        i98 = i21;
                        arrayList10 = arrayList;
                        i65 = i20;
                        da10Var4 = da10Var;
                        i5 = i18;
                        i14 = i19;
                        x43Var4 = x43Var;
                        i99 = i101;
                        max2 = i22;
                        i7 = i17;
                    }
                } else {
                    i16 = i96;
                    da10Var = da10Var4;
                    i17 = i7;
                    i18 = i5;
                    i19 = i14;
                    x43Var = x43Var4;
                    i20 = i65;
                    i21 = 1;
                    j2 = j12;
                    i22 = max2;
                    arrayList = null;
                }
                List list5 = list4;
                int size2 = list5.size();
                ArrayList arrayList11 = arrayList;
                int i102 = 0;
                while (i102 < size2) {
                    List list6 = list4;
                    int i103 = i21;
                    int intValue2 = ((Number) list6.get(i102)).intValue();
                    if (intValue2 < i22) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        i38 = i22;
                        ArrayList arrayList12 = arrayList11;
                        list2 = list6;
                        i37 = size2;
                        arrayList12.add(q890.a(t5yVar, intValue2, j2, p890Var4, j11, orientation9, to5Var2, tyu0Var3.getLayoutDirection(), i68, a2));
                        arrayList11 = arrayList12;
                    } else {
                        i37 = size2;
                        list2 = list6;
                        i38 = i22;
                    }
                    i102++;
                    size2 = i37;
                    i22 = i38;
                    list4 = list2;
                    i21 = i103;
                }
                int i104 = i21;
                List list7 = list4;
                ?? r12 = EmptyList.a;
                ArrayList arrayList13 = arrayList11 == null ? r12 : arrayList11;
                ArrayList arrayList14 = arrayList13;
                int i105 = i10;
                int i106 = 0;
                for (int size3 = arrayList14.size(); i106 < size3; size3 = size3) {
                    i105 = Math.max(i105, ((da10) arrayList13.get(i106)).h);
                    i106++;
                }
                int i107 = ((da10) x43Var.last()).a;
                int min = Math.min(i20, (i18 - i107) - 1) + i107;
                int i108 = i107 + 1;
                if (i108 <= min) {
                    ArrayList arrayList15 = null;
                    while (true) {
                        if (arrayList15 == null) {
                            arrayList15 = new ArrayList();
                        }
                        arrayList2 = r12;
                        arrayList3 = arrayList15;
                        i23 = i105;
                        i24 = i20;
                        i25 = min;
                        int i109 = i108;
                        arrayList3.add(q890.a(t5yVar, i109, j2, p890Var4, j11, orientation9, to5Var2, tyu0Var3.getLayoutDirection(), i68, a2));
                        if (i109 == i25) {
                            break;
                        }
                        i108 = i109 + 1;
                        min = i25;
                        i105 = i23;
                        i20 = i24;
                        arrayList15 = arrayList3;
                        r12 = arrayList2;
                    }
                } else {
                    i23 = i105;
                    arrayList2 = r12;
                    i24 = i20;
                    i25 = min;
                    arrayList3 = null;
                }
                int size4 = list5.size();
                ArrayList arrayList16 = arrayList3;
                int i110 = 0;
                while (i110 < size4) {
                    int intValue3 = ((Number) list7.get(i110)).intValue();
                    int i111 = size4;
                    if (i25 + 1 <= intValue3) {
                        int i112 = i18;
                        if (intValue3 < i112) {
                            if (arrayList16 == null) {
                                arrayList16 = new ArrayList();
                            }
                            List list8 = list7;
                            ArrayList arrayList17 = arrayList16;
                            list = list8;
                            i35 = i110;
                            i36 = i112;
                            da10 a6 = q890.a(t5yVar, intValue3, j2, p890Var4, j11, orientation9, to5Var2, tyu0Var3.getLayoutDirection(), i68, a2);
                            orientation2 = orientation9;
                            long j14 = j2;
                            to5Var3 = to5Var2;
                            j3 = j14;
                            arrayList17.add(a6);
                            arrayList16 = arrayList17;
                            list7 = list;
                            size4 = i111;
                            i18 = i36;
                            i110 = i35 + 1;
                            to5Var2 = to5Var3;
                            j2 = j3;
                            orientation9 = orientation2;
                        } else {
                            i35 = i110;
                            i36 = i112;
                            orientation2 = orientation9;
                            list = list7;
                        }
                    } else {
                        i35 = i110;
                        i36 = i18;
                        orientation2 = orientation9;
                        list = list7;
                    }
                    long j15 = j2;
                    to5Var3 = to5Var2;
                    j3 = j15;
                    list7 = list;
                    size4 = i111;
                    i18 = i36;
                    i110 = i35 + 1;
                    to5Var2 = to5Var3;
                    j2 = j3;
                    orientation9 = orientation2;
                }
                Orientation orientation10 = orientation9;
                int i113 = i18;
                long j16 = j2;
                ArrayList arrayList18 = arrayList16 == null ? arrayList2 : arrayList16;
                ArrayList arrayList19 = arrayList18;
                int size5 = arrayList19.size();
                int i114 = i23;
                for (int i115 = 0; i115 < size5; i115++) {
                    i114 = Math.max(i114, ((da10) arrayList18.get(i115)).h);
                }
                da10 da10Var5 = da10Var;
                int i116 = (jl40.l(da10Var5, x43Var.first()) && arrayList13.isEmpty() && arrayList18.isEmpty()) ? i104 : 0;
                Orientation orientation11 = Orientation.Vertical;
                int g = p8e.g(orientation10 == orientation11 ? i114 : i13, j9);
                if (orientation10 == orientation11) {
                    i114 = i13;
                }
                int f = p8e.f(i114, j9);
                int i117 = orientation10 == orientation11 ? f : g;
                int i118 = i17;
                int i119 = i13;
                int i120 = i119 < Math.min(i117, i118) ? i104 : 0;
                if (i120 == 0 || i16 == 0) {
                    arrayList4 = arrayList19;
                    i26 = i16;
                } else {
                    arrayList4 = arrayList19;
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i26 = i16;
                    sb.append(i26);
                    lxv.c(sb.toString());
                }
                int i121 = i26;
                ArrayList arrayList20 = new ArrayList(arrayList18.size() + arrayList13.size() + x43Var.size());
                if (i120 != 0) {
                    if (!arrayList13.isEmpty() || !arrayList18.isEmpty()) {
                        lxv.a("No extra pages");
                    }
                    int size6 = x43Var.size();
                    int[] iArr2 = new int[size6];
                    for (int i122 = 0; i122 < size6; i122++) {
                        iArr2[i122] = i68;
                    }
                    int[] iArr3 = new int[size6];
                    da10Var2 = da10Var5;
                    i28 = i63;
                    i27 = i116;
                    i43 i43Var = new i43(tyu0Var3.H(i63), false, null);
                    if (orientation10 == Orientation.Vertical) {
                        i43Var.m(t5yVar, i117, iArr2, iArr3);
                        iArr = iArr3;
                        tyu0Var = tyu0Var3;
                        i29 = i118;
                        orientation = orientation10;
                        i30 = f;
                    } else {
                        iArr = iArr3;
                        tyu0Var = tyu0Var3;
                        i29 = i118;
                        orientation = orientation10;
                        i30 = f;
                        i43Var.u(t5yVar, i117, iArr2, LayoutDirection.Ltr, iArr);
                    }
                    d6w E = j73.E(iArr);
                    int i123 = E.b;
                    int i124 = E.c;
                    if ((i124 > 0 && i123 >= 0) || (i124 < 0 && i123 <= 0)) {
                        int i125 = 0;
                        while (true) {
                            int i126 = iArr[i125];
                            x43Var2 = x43Var;
                            int i127 = i124;
                            da10 da10Var6 = (da10) x43Var2.get(i125);
                            da10Var6.b(i126, g, i30);
                            arrayList20.add(da10Var6);
                            if (i125 == i123) {
                                break;
                            }
                            i125 += i127;
                            x43Var = x43Var2;
                            i124 = i127;
                        }
                    } else {
                        x43Var2 = x43Var;
                    }
                } else {
                    i27 = i116;
                    i28 = i63;
                    tyu0Var = tyu0Var3;
                    x43Var2 = x43Var;
                    orientation = orientation10;
                    da10Var2 = da10Var5;
                    i29 = i118;
                    i30 = f;
                    int size7 = arrayList14.size();
                    int i128 = i121;
                    for (int i129 = 0; i129 < size7; i129++) {
                        da10 da10Var7 = (da10) arrayList13.get(i129);
                        i128 -= i46;
                        da10Var7.b(i128, g, i30);
                        arrayList20.add(da10Var7);
                    }
                    int size8 = x43Var2.size();
                    int i130 = i121;
                    for (int i131 = 0; i131 < size8; i131++) {
                        da10 da10Var8 = (da10) x43Var2.get(i131);
                        da10Var8.b(i130, g, i30);
                        arrayList20.add(da10Var8);
                        i130 += i46;
                    }
                    int size9 = arrayList4.size();
                    for (int i132 = 0; i132 < size9; i132++) {
                        da10 da10Var9 = (da10) arrayList18.get(i132);
                        da10Var9.b(i130, g, i30);
                        arrayList20.add(da10Var9);
                        i130 += i46;
                    }
                }
                if (i27 != 0) {
                    arrayList5 = arrayList20;
                } else {
                    ArrayList arrayList21 = new ArrayList(arrayList20.size());
                    int size10 = arrayList20.size();
                    int i133 = 0;
                    while (i133 < size10) {
                        Object obj2 = arrayList20.get(i133);
                        da10 da10Var10 = (da10) obj2;
                        int i134 = size10;
                        x43 x43Var5 = x43Var2;
                        if (da10Var10.a >= ((da10) x43Var2.first()).a && da10Var10.a <= ((da10) x43Var5.last()).a) {
                            arrayList21.add(obj2);
                        }
                        i133++;
                        size10 = i134;
                        x43Var2 = x43Var5;
                    }
                    arrayList5 = arrayList21;
                }
                x43 x43Var6 = x43Var2;
                if (arrayList13.isEmpty()) {
                    arrayList6 = arrayList2;
                } else {
                    arrayList6 = new ArrayList(arrayList20.size());
                    int size11 = arrayList20.size();
                    for (int i135 = 0; i135 < size11; i135++) {
                        Object obj3 = arrayList20.get(i135);
                        if (((da10) obj3).a < ((da10) x43Var6.first()).a) {
                            arrayList6.add(obj3);
                        }
                    }
                }
                if (arrayList18.isEmpty()) {
                    arrayList7 = arrayList2;
                } else {
                    ArrayList arrayList22 = new ArrayList(arrayList20.size());
                    int size12 = arrayList20.size();
                    for (int i136 = 0; i136 < size12; i136++) {
                        Object obj4 = arrayList20.get(i136);
                        if (((da10) obj4).a > ((da10) x43Var6.last()).a) {
                            arrayList22.add(obj4);
                        }
                    }
                    arrayList7 = arrayList22;
                }
                if (arrayList5.isEmpty()) {
                    arrayList8 = arrayList6;
                    arrayList9 = arrayList5;
                    i34 = i30;
                    i31 = i42;
                    k1t0Var = k1t0Var3;
                    i32 = i67;
                    i33 = i64;
                    obj = null;
                } else {
                    obj = arrayList5.get(0);
                    arrayList8 = arrayList6;
                    i31 = i42;
                    k1t0Var = k1t0Var3;
                    i32 = i67;
                    i33 = i64;
                    float f2 = -Math.abs(((da10) obj).j - k1t0Var.c(i33, i68, i32, i31));
                    int f3 = scc.f(arrayList5);
                    int i137 = i104;
                    if (i137 <= f3) {
                        Object obj5 = obj;
                        float f4 = f2;
                        while (true) {
                            Object obj6 = arrayList5.get(i137);
                            arrayList9 = arrayList5;
                            i34 = i30;
                            float f5 = -Math.abs(((da10) obj6).j - k1t0Var.c(i33, i68, i32, i31));
                            if (Float.compare(f4, f5) < 0) {
                                f4 = f5;
                                obj5 = obj6;
                            }
                            if (i137 == f3) {
                                break;
                            }
                            i137++;
                            arrayList5 = arrayList9;
                            i30 = i34;
                        }
                        obj = obj5;
                    } else {
                        arrayList9 = arrayList5;
                        i34 = i30;
                    }
                }
                da10 da10Var11 = (da10) obj;
                float c = i19 == 0 ? 0.0f : y6i0.c((k1t0Var.c(i33, i68, i32, i31) - (da10Var11 != null ? da10Var11.j : 0)) / i19, -0.5f, 0.5f);
                aa10 w = tyu0Var.w(p8e.g(g + i40, j), p8e.f(i34 + f04, j), b.f(), new zl50(25, oz40Var, arrayList20));
                tyu0Var3 = tyu0Var;
                int i138 = i31;
                s890Var = new s890(arrayList9, i68, i28, i138, orientation, i54, i73, i24, da10Var2, da10Var11, c, i15, i8 < i113 || i119 > i29, k1t0Var, w, r16, arrayList8, arrayList7, tseVar, t5yVar, j16);
                t5yVar2 = t5yVar;
            }
            d dVar4 = dVar2;
            dVar4.h(s890Var, tyu0Var3.d0(), false);
            h890 h890Var = dVar4.u;
            List list9 = s890Var.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (h890Var.b() && !list9.isEmpty()) {
                    int i139 = ((da10) ((c790) a.P(list9))).a;
                    int i140 = ((da10) ((c790) a.Z(list9))).a;
                    for (int i141 = h890Var.h; i141 < i139; i141++) {
                        t5yVar2.a(i141);
                    }
                    int i142 = i140 + 1;
                    int i143 = h890Var.i;
                    if (i142 <= i143) {
                        while (true) {
                            t5yVar2.a(i142);
                            if (i142 == i143) {
                                break;
                            }
                            i142++;
                        }
                    }
                }
                return s890Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            tje.W(D, O, e);
            throw th;
        }
    }
}
