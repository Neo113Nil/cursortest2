package defpackage;

import androidx.compose.material3.internal.h;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class qny0 implements z910 {
    public final boolean a;
    public final nny0 b;
    public final bny0 c;
    public final j690 d;
    public final float e;

    public qny0(boolean z, nny0 nny0Var, bny0 bny0Var, j690 j690Var, float f) {
        this.a = z;
        this.b = nny0Var;
        this.c = bny0Var;
        this.d = j690Var;
        this.e = f;
    }

    public static int d(int i, wls wlsVar, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (jl40.l(ycb1.c((x910) obj7), "TextField")) {
                int intValue = ((Number) wlsVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (jl40.l(ycb1.c((x910) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                x910 x910Var = (x910) obj2;
                int intValue2 = x910Var != null ? ((Number) wlsVar.invoke(x910Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (jl40.l(ycb1.c((x910) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                x910 x910Var2 = (x910) obj3;
                int intValue3 = x910Var2 != null ? ((Number) wlsVar.invoke(x910Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (jl40.l(ycb1.c((x910) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                x910 x910Var3 = (x910) obj4;
                int intValue4 = x910Var3 != null ? ((Number) wlsVar.invoke(x910Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (jl40.l(ycb1.c((x910) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                x910 x910Var4 = (x910) obj5;
                int intValue5 = x910Var4 != null ? ((Number) wlsVar.invoke(x910Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (jl40.l(ycb1.c((x910) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                x910 x910Var5 = (x910) obj6;
                int intValue6 = x910Var5 != null ? ((Number) wlsVar.invoke(x910Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (jl40.l(ycb1.c((x910) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                x910 x910Var6 = (x910) obj;
                int i9 = intValue4 + intValue5;
                return p8e.g(Math.max(intValue + i9, Math.max((x910Var6 != null ? ((Number) wlsVar.invoke(x910Var6, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, p8e.b(0, 0, 0, 0, 15));
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    public static final int h(qny0 qny0Var, int i, int i2, o oVar) {
        return qny0Var.a ? xvz.a(i - oVar.b, 2.0f, 1.0f) : i2;
    }

    public final int a(yuw yuwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        j690 j690Var = this.d;
        int f0 = yuwVar.f0(j690Var.a() + j690Var.d());
        int[] iArr = {i7, i5, i6, z ? 0 : cjb1.e(i2, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        int max = f0 + ((i2 <= 0 || z) ? 0 : Math.max(yuwVar.f0(this.e * 2.0f), cjb1.e(0, i2, cb30.a.a(f)))) + i;
        if (!z) {
            i2 = 0;
        }
        return p8e.f(Math.max(i3, Math.max(i4, max)) + i2 + i8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z910
    public final aa10 b(final k kVar, List list, long j) {
        Object obj;
        Object obj2;
        List list2;
        o oVar;
        o oVar2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        Ref$ObjectRef ref$ObjectRef;
        int i2;
        o oVar3;
        int i3;
        o oVar4;
        int i4;
        int i5;
        o oVar5;
        int i6;
        o oVar6;
        o oVar7;
        int i7;
        Ref$ObjectRef ref$ObjectRef2;
        o oVar8;
        int i8;
        List list3;
        o oVar9;
        float f;
        int i9;
        int i10;
        qny0 qny0Var;
        final o oVar10;
        o oVar11;
        int i11;
        o oVar12;
        boolean z;
        k kVar2;
        float a = this.c.a();
        j690 j690Var = this.d;
        int f0 = kVar.f0(j690Var.d());
        int f02 = kVar.f0(j690Var.a());
        long b = n8e.b(0, j, 0, 0, 0, 10);
        List list4 = list;
        int size = list4.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (jl40.l(pj91.g((x910) obj), "Leading")) {
                break;
            }
            i12++;
        }
        x910 x910Var = (x910) obj;
        o l0 = x910Var != null ? x910Var.l0(b) : null;
        int i13 = l0 != null ? l0.a : 0;
        int max = Math.max(0, l0 != null ? l0.b : 0);
        int size2 = list4.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (jl40.l(pj91.g((x910) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        x910 x910Var2 = (x910) obj2;
        if (x910Var2 != null) {
            list2 = list4;
            oVar = l0;
            oVar2 = x910Var2.l0(p8e.j(-i13, 0, b, 2));
        } else {
            list2 = list4;
            oVar = l0;
            oVar2 = null;
        }
        int i15 = i13 + (oVar2 != null ? oVar2.a : 0);
        int max2 = Math.max(max, oVar2 != null ? oVar2.b : 0);
        int size3 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i16);
            if (jl40.l(pj91.g((x910) obj3), "Prefix")) {
                break;
            }
            i16++;
        }
        x910 x910Var3 = (x910) obj3;
        o l02 = x910Var3 != null ? x910Var3.l0(p8e.j(-i15, 0, b, 2)) : null;
        int i17 = i15 + (l02 != null ? l02.a : 0);
        int max3 = Math.max(max2, l02 != null ? l02.b : 0);
        int size4 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i18);
            if (jl40.l(pj91.g((x910) obj4), "Suffix")) {
                break;
            }
            i18++;
        }
        x910 x910Var4 = (x910) obj4;
        o l03 = x910Var4 != null ? x910Var4.l0(p8e.j(-i17, 0, b, 2)) : null;
        int i19 = i17 + (l03 != null ? l03.a : 0);
        int max4 = Math.max(max3, l03 != null ? l03.b : 0);
        int size5 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i20);
            int i21 = size5;
            if (jl40.l(pj91.g((x910) obj5), "Label")) {
                break;
            }
            i20++;
            size5 = i21;
        }
        x910 x910Var5 = (x910) obj5;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        List list5 = list2;
        ref$ObjectRef3.element = x910Var5 != null ? x910Var5.l0(p8e.i(-i19, -f02, b)) : 0;
        int size6 = list5.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size6) {
                i = f02;
                obj6 = null;
                break;
            }
            obj6 = list.get(i22);
            i = f02;
            if (jl40.l(pj91.g((x910) obj6), "Supporting")) {
                break;
            }
            i22++;
            f02 = i;
        }
        x910 x910Var6 = (x910) obj6;
        int V = x910Var6 != null ? x910Var6.V(n8e.k(j)) : 0;
        o oVar13 = (o) ref$ObjectRef3.element;
        int i23 = (oVar13 != null ? oVar13.b : 0) + 0 + f0;
        long i24 = p8e.i(-i19, ((-i23) - i) - V, n8e.b(0, j, 0, 0, 0, 11));
        int size7 = list5.size();
        int i25 = 0;
        while (i25 < size7) {
            int i26 = i23;
            x910 x910Var7 = (x910) list.get(i25);
            int i27 = size7;
            int i28 = i25;
            if (jl40.l(pj91.g(x910Var7), "TextField")) {
                o l04 = x910Var7.l0(i24);
                long b2 = n8e.b(0, i24, 0, 0, 0, 14);
                List list6 = list;
                int size8 = list6.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i29);
                    int i30 = size8;
                    int i31 = i29;
                    if (jl40.l(pj91.g((x910) obj7), "Hint")) {
                        break;
                    }
                    i29 = i31 + 1;
                    size8 = i30;
                }
                x910 x910Var8 = (x910) obj7;
                o l05 = x910Var8 != null ? x910Var8.l0(b2) : null;
                int max5 = Math.max(max4, Math.max(l04.b, l05 != null ? l05.b : 0) + i26 + i);
                o oVar14 = oVar;
                int i32 = oVar != null ? oVar14.a : 0;
                int i33 = oVar2 != null ? oVar2.a : 0;
                int i34 = i32;
                int i35 = l02 != null ? l02.a : 0;
                int i36 = l03 != null ? l03.a : 0;
                int i37 = l04.a;
                o oVar15 = (o) ref$ObjectRef3.element;
                int i38 = i35 + i36;
                int g = p8e.g(Math.max(i37 + i38, Math.max((l05 != null ? l05.a : 0) + i38, oVar15 != null ? oVar15.a : 0)) + i34 + i33, j);
                o l06 = x910Var6 != null ? x910Var6.l0(n8e.b(0, p8e.j(0, -max5, b, 1), g, 0, 0, 9)) : null;
                int i39 = l06 != null ? l06.b : 0;
                int i40 = l04.b;
                o oVar16 = (o) ref$ObjectRef3.element;
                int i41 = oVar16 != null ? oVar16.b : 0;
                int i42 = oVar14 != null ? oVar14.b : 0;
                if (oVar2 != null) {
                    ref$ObjectRef = ref$ObjectRef3;
                    i2 = oVar2.b;
                } else {
                    ref$ObjectRef = ref$ObjectRef3;
                    i2 = 0;
                }
                if (l02 != null) {
                    oVar3 = l04;
                    i3 = l02.b;
                } else {
                    oVar3 = l04;
                    i3 = 0;
                }
                if (l03 != null) {
                    int i43 = l03.b;
                    oVar4 = l03;
                    i4 = i42;
                    i5 = i43;
                } else {
                    oVar4 = l03;
                    i4 = i42;
                    i5 = 0;
                }
                o oVar17 = l02;
                if (l05 != null) {
                    o oVar18 = l05;
                    i6 = l05.b;
                    oVar5 = oVar18;
                } else {
                    oVar5 = l05;
                    i6 = 0;
                }
                if (l06 != null) {
                    oVar7 = oVar14;
                    oVar6 = oVar5;
                    i7 = l06.b;
                    ref$ObjectRef2 = ref$ObjectRef;
                    oVar8 = oVar3;
                    i8 = f0;
                    list3 = list6;
                    f = a;
                    i9 = g;
                    i10 = 0;
                    oVar10 = l06;
                    oVar12 = oVar4;
                    oVar9 = oVar17;
                    z = false;
                    qny0Var = this;
                    kVar2 = kVar;
                    oVar11 = oVar2;
                    i11 = i41;
                } else {
                    oVar6 = oVar5;
                    oVar7 = oVar14;
                    i7 = 0;
                    ref$ObjectRef2 = ref$ObjectRef;
                    oVar8 = oVar3;
                    i8 = f0;
                    list3 = list6;
                    oVar9 = oVar17;
                    f = a;
                    i9 = g;
                    i10 = 0;
                    qny0Var = this;
                    oVar10 = l06;
                    oVar11 = oVar2;
                    i11 = i41;
                    oVar12 = oVar4;
                    z = false;
                    kVar2 = kVar;
                }
                final int a2 = qny0Var.a(kVar2, i40, i11, i4, i2, i3, i5, i6, i7, j, z, f);
                final int i44 = (a2 - i39) + 0;
                int size9 = list3.size();
                int i45 = i10;
                while (i45 < size9) {
                    x910 x910Var9 = (x910) list.get(i45);
                    if (jl40.l(pj91.g(x910Var9), "Container")) {
                        final o l07 = x910Var9.l0(p8e.a(i9 != Integer.MAX_VALUE ? i9 : i10, i9, i44 != Integer.MAX_VALUE ? i44 : i10, i44));
                        final int i46 = i9;
                        final boolean z2 = z;
                        final float f2 = f;
                        final o oVar19 = oVar11;
                        final o oVar20 = oVar9;
                        final o oVar21 = oVar12;
                        final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                        final o oVar22 = oVar8;
                        final o oVar23 = oVar7;
                        final o oVar24 = oVar6;
                        final int i47 = i8;
                        return kVar.w(i46, a2, b.f(), new tls() { // from class: pny0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
                            /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
                            /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
                            /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
                            @Override // defpackage.tls
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj8) {
                                int i48;
                                int i49;
                                o oVar25;
                                int f03;
                                int i50;
                                int i51;
                                int i52;
                                o.a aVar = (o.a) obj8;
                                Ref$ObjectRef ref$ObjectRef5 = Ref$ObjectRef.this;
                                T t = ref$ObjectRef5.element;
                                qny0 qny0Var2 = this;
                                k kVar3 = kVar;
                                int i53 = i46;
                                int i54 = a2;
                                o oVar26 = oVar22;
                                o oVar27 = oVar24;
                                o oVar28 = oVar23;
                                o oVar29 = oVar19;
                                o oVar30 = oVar20;
                                o oVar31 = oVar21;
                                o oVar32 = l07;
                                o oVar33 = oVar10;
                                if (t != 0) {
                                    boolean z3 = z2;
                                    int i55 = i47;
                                    if (z3) {
                                        i48 = i55;
                                        i49 = i54;
                                        oVar25 = oVar31;
                                        f03 = 0;
                                    } else {
                                        i48 = i55;
                                        if (qny0Var2.a) {
                                            i49 = i54;
                                            oVar25 = oVar31;
                                            f03 = xvz.a(i44 - ((o) t).b, 2.0f, 1.0f);
                                        } else {
                                            i49 = i54;
                                            oVar25 = oVar31;
                                            f03 = kVar3.f0(qny0Var2.e) + i48;
                                        }
                                    }
                                    int i56 = z3 ? 0 : i48;
                                    o oVar34 = (o) ref$ObjectRef5.element;
                                    int i57 = i48 + (z3 ? 0 : oVar34.b);
                                    LayoutDirection layoutDirection = kVar3.getLayoutDirection();
                                    nny0 nny0Var = qny0Var2.b;
                                    int i58 = z3 ? oVar34.b : 0;
                                    aVar.g(oVar32, 0, i58, 0.0f);
                                    int i59 = (i49 - (oVar33 != null ? oVar33.b : 0)) - (z3 ? oVar34.b : 0);
                                    if (oVar28 != null) {
                                        i50 = i58;
                                        o.a.o(aVar, oVar28, 0, Math.round(((i59 - oVar28.b) / 2.0f) * 1.0f) + i58);
                                    } else {
                                        i50 = i58;
                                    }
                                    float f3 = f2;
                                    int e = cjb1.e(f03, i56, f3);
                                    if (z3) {
                                        aVar.g(oVar34, h.e(nny0Var).a(oVar34.a, i53, layoutDirection), e, 0.0f);
                                        i52 = i53;
                                    } else if (layoutDirection == LayoutDirection.Ltr) {
                                        if (oVar28 != null) {
                                            i51 = oVar28.a;
                                            i52 = i53;
                                            aVar.g(oVar34, cjb1.e(h.d(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, h.e(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, f3), e, 0.0f);
                                        }
                                        i51 = 0;
                                        i52 = i53;
                                        aVar.g(oVar34, cjb1.e(h.d(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, h.e(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, f3), e, 0.0f);
                                    } else {
                                        if (oVar29 != null) {
                                            i51 = oVar29.a;
                                            i52 = i53;
                                            aVar.g(oVar34, cjb1.e(h.d(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, h.e(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, f3), e, 0.0f);
                                        }
                                        i51 = 0;
                                        i52 = i53;
                                        aVar.g(oVar34, cjb1.e(h.d(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, h.e(nny0Var).a(oVar34.a, (i52 - (oVar28 == null ? oVar28.a : 0)) - (oVar29 == null ? oVar29.a : 0), layoutDirection) + i51, f3), e, 0.0f);
                                    }
                                    if (oVar30 != null) {
                                        o.a.o(aVar, oVar30, oVar28 != null ? oVar28.a : 0, i50 + i57);
                                    }
                                    int i60 = (oVar28 != null ? oVar28.a : 0) + (oVar30 != null ? oVar30.a : 0);
                                    int i61 = i50 + i57;
                                    o.a.o(aVar, oVar26, i60, i61);
                                    if (oVar27 != null) {
                                        o.a.o(aVar, oVar27, i60, i61);
                                    }
                                    if (oVar25 != null) {
                                        o oVar35 = oVar25;
                                        o.a.o(aVar, oVar35, (i52 - (oVar29 != null ? oVar29.a : 0)) - oVar35.a, i61);
                                    }
                                    if (oVar29 != null) {
                                        o.a.o(aVar, oVar29, i52 - oVar29.a, Math.round(((i59 - oVar29.b) / 2.0f) * 1.0f) + i50);
                                    }
                                    if (oVar33 != null) {
                                        o.a.o(aVar, oVar33, 0, i50 + i59);
                                    }
                                } else {
                                    float density = kVar3.getDensity();
                                    o.a.m(aVar, oVar32, 0L);
                                    int i62 = i54 - (oVar33 != null ? oVar33.b : 0);
                                    int b3 = m810.b(qny0Var2.d.d() * density);
                                    if (oVar28 != null) {
                                        o.a.o(aVar, oVar28, 0, xvz.a(i62 - oVar28.b, 2.0f, 1.0f));
                                    }
                                    if (oVar30 != null) {
                                        o.a.o(aVar, oVar30, oVar28 != null ? oVar28.a : 0, qny0.h(qny0Var2, i62, b3, oVar30));
                                    }
                                    int i63 = (oVar28 != null ? oVar28.a : 0) + (oVar30 != null ? oVar30.a : 0);
                                    o.a.o(aVar, oVar26, i63, qny0.h(qny0Var2, i62, b3, oVar26));
                                    if (oVar27 != null) {
                                        o.a.o(aVar, oVar27, i63, qny0.h(qny0Var2, i62, b3, oVar27));
                                    }
                                    if (oVar31 != null) {
                                        o.a.o(aVar, oVar31, (i53 - (oVar29 != null ? oVar29.a : 0)) - oVar31.a, qny0.h(qny0Var2, i62, b3, oVar31));
                                    }
                                    if (oVar29 != null) {
                                        o.a.o(aVar, oVar29, i53 - oVar29.a, xvz.a(i62 - oVar29.b, 2.0f, 1.0f));
                                    }
                                    if (oVar33 != null) {
                                        o.a.o(aVar, oVar33, 0, i62);
                                    }
                                }
                                return zy11.a;
                            }
                        });
                    }
                    i45++;
                    oVar11 = oVar11;
                    z = z;
                    oVar6 = oVar6;
                    oVar9 = oVar9;
                    oVar8 = oVar8;
                }
                rty.b("Collection contains no element matching the predicate.");
                ny61.A();
                return null;
            }
            oVar2 = oVar2;
            size7 = i27;
            l03 = l03;
            i23 = i26;
            i25 = i28 + 1;
            l02 = l02;
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return null;
    }

    public final int c(yuw yuwVar, List list, int i, wls wlsVar) {
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (jl40.l(ycb1.c((x910) obj), "Leading")) {
                break;
            }
            i8++;
        }
        x910 x910Var = (x910) obj;
        if (x910Var != null) {
            i2 = i;
            i3 = ycb1.d(i2, x910Var.k0(Integer.MAX_VALUE));
            i4 = ((Number) wlsVar.invoke(x910Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = i2;
            i4 = 0;
        }
        int size2 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (jl40.l(ycb1.c((x910) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        x910 x910Var2 = (x910) obj2;
        if (x910Var2 != null) {
            i3 = ycb1.d(i3, x910Var2.k0(Integer.MAX_VALUE));
            i5 = ((Number) wlsVar.invoke(x910Var2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (jl40.l(ycb1.c((x910) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (x910) obj3;
        int intValue = obj8 != null ? ((Number) wlsVar.invoke(obj8, Integer.valueOf(i3))).intValue() : 0;
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (jl40.l(ycb1.c((x910) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        x910 x910Var3 = (x910) obj4;
        if (x910Var3 != null) {
            int intValue2 = ((Number) wlsVar.invoke(x910Var3, Integer.valueOf(i3))).intValue();
            i3 = ycb1.d(i3, x910Var3.k0(Integer.MAX_VALUE));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (jl40.l(ycb1.c((x910) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        x910 x910Var4 = (x910) obj5;
        if (x910Var4 != null) {
            int intValue3 = ((Number) wlsVar.invoke(x910Var4, Integer.valueOf(i3))).intValue();
            i3 = ycb1.d(i3, x910Var4.k0(Integer.MAX_VALUE));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list2.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (jl40.l(ycb1.c((x910) obj9), "TextField")) {
                int intValue4 = ((Number) wlsVar.invoke(obj9, Integer.valueOf(i3))).intValue();
                int size7 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (jl40.l(ycb1.c((x910) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (x910) obj6;
                int intValue5 = obj10 != null ? ((Number) wlsVar.invoke(obj10, Integer.valueOf(i3))).intValue() : 0;
                int size8 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i15);
                    if (jl40.l(ycb1.c((x910) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i15++;
                }
                Object obj12 = (x910) obj7;
                return a(yuwVar, intValue4, intValue, i4, i5, i6, i7, intValue5, obj12 != null ? ((Number) wlsVar.invoke(obj12, Integer.valueOf(i2))).intValue() : 0, p8e.b(0, 0, 0, 0, 15), false, this.c.a());
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        return d(i, new pjv0(18), list);
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        return d(i, new pjv0(16), list);
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        return c(yuwVar, list, i, new pjv0(22));
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        return c(yuwVar, list, i, new pjv0(20));
    }
}
