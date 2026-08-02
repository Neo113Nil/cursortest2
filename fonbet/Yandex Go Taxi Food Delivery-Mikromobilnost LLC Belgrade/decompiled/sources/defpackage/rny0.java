package defpackage;

import androidx.compose.material.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class rny0 implements z910 {
    public final boolean a;
    public final float b;
    public final j690 c;

    public rny0(boolean z, float f, j690 j690Var) {
        this.a = z;
        this.b = f;
        this.c = j690Var;
    }

    public static int c(int i, wls wlsVar, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (jl40.l(a.d((x910) obj5), "TextField")) {
                int intValue = ((Number) wlsVar.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (jl40.l(a.d((x910) obj2), "Label")) {
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
                    if (jl40.l(a.d((x910) obj3), "Trailing")) {
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
                    if (jl40.l(a.d((x910) obj4), "Leading")) {
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
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (jl40.l(a.d((x910) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                x910 x910Var4 = (x910) obj;
                return p8e.g(Math.max(intValue, Math.max(intValue2, x910Var4 != null ? ((Number) wlsVar.invoke(x910Var4, Integer.valueOf(i))).intValue() : 0)) + intValue4 + intValue3, p8e.b(0, 0, 0, 0, 15));
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    public final int a(yuw yuwVar, List list, int i, wls wlsVar) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (jl40.l(a.d((x910) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        x910 x910Var = (x910) obj2;
        if (x910Var != null) {
            int k0 = x910Var.k0(Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                i2 = i;
            } else {
                i2 = i - k0;
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            i3 = ((Number) wlsVar.invoke(x910Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (jl40.l(a.d((x910) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        x910 x910Var2 = (x910) obj3;
        if (x910Var2 != null) {
            int k02 = x910Var2.k0(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE && (i2 = i2 - k02) < 0) {
                i2 = 0;
            }
            i4 = ((Number) wlsVar.invoke(x910Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (jl40.l(a.d((x910) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (x910) obj4;
        int intValue = obj5 != null ? ((Number) wlsVar.invoke(obj5, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (jl40.l(a.d((x910) obj6), "TextField")) {
                int intValue2 = ((Number) wlsVar.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (jl40.l(a.d((x910) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (x910) obj;
                return lny0.d(intValue2, intValue > 0, intValue, i3, i4, obj8 != null ? ((Number) wlsVar.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, p8e.b(0, 0, 0, 0, 15), yuwVar.getDensity(), this.c);
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.layout.o, ca10] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.layout.o] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.layout.o] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // defpackage.z910
    public final aa10 b(final k kVar, List list, long j) {
        Object obj;
        aa10 aa10Var;
        Object obj2;
        List list2;
        int i;
        int i2;
        final ?? r9;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        final rny0 rny0Var = this;
        List list3 = list;
        j690 j690Var = rny0Var.c;
        int f0 = kVar.f0(j690Var.d());
        int f02 = kVar.f0(j690Var.a());
        final int f03 = kVar.f0(2.0f);
        long b = n8e.b(0, j, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i5);
            if (jl40.l(pj91.g((x910) obj), "Leading")) {
                break;
            }
            i5++;
        }
        x910 x910Var = (x910) obj;
        final o l0 = x910Var != null ? x910Var.l0(b) : null;
        int i6 = l0 != null ? l0.a : 0;
        int size2 = list4.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                aa10Var = null;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i7);
            aa10Var = null;
            if (jl40.l(pj91.g((x910) obj2), "Trailing")) {
                break;
            }
            i7++;
        }
        x910 x910Var2 = (x910) obj2;
        if (x910Var2 != null) {
            list2 = list4;
            i = i6;
            i2 = 0;
            r9 = x910Var2.l0(p8e.j(-i6, 0, b, 2));
        } else {
            list2 = list4;
            i = i6;
            i2 = 0;
            r9 = aa10Var;
        }
        int i8 = -f02;
        int i9 = -(i + (r9 != 0 ? r9.a : i2));
        long i10 = p8e.i(i9, i8, b);
        int size3 = list2.size();
        int i11 = i2;
        while (true) {
            if (i11 >= size3) {
                i3 = f02;
                obj3 = aa10Var;
                break;
            }
            obj3 = list3.get(i11);
            i3 = f02;
            if (jl40.l(pj91.g((x910) obj3), "Label")) {
                break;
            }
            i11++;
            f02 = i3;
        }
        x910 x910Var3 = (x910) obj3;
        final ?? l02 = x910Var3 != null ? x910Var3.l0(i10) : aa10Var;
        if (l02 != 0) {
            i4 = l02.u(androidx.compose.ui.layout.a.b);
            if (i4 == Integer.MIN_VALUE) {
                i4 = l02.b;
            }
        } else {
            i4 = 0;
        }
        final int max = Math.max(i4, f0);
        long i12 = p8e.i(i9, l02 != 0 ? (i8 - f03) - max : (-f0) - i3, n8e.b(0, j, 0, 0, 0, 11));
        int size4 = list2.size();
        int i13 = 0;
        while (i13 < size4) {
            x910 x910Var4 = (x910) list3.get(i13);
            final int i14 = f0;
            if (jl40.l(pj91.g(x910Var4), "TextField")) {
                final o l03 = x910Var4.l0(i12);
                long b2 = n8e.b(0, i12, 0, 0, 0, 14);
                int size5 = list3.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj4 = aa10Var;
                        break;
                    }
                    obj4 = list3.get(i15);
                    if (jl40.l(pj91.g((x910) obj4), "Hint")) {
                        break;
                    }
                    i15++;
                    list3 = list;
                }
                x910 x910Var5 = (x910) obj4;
                final ?? l04 = x910Var5 != null ? x910Var5.l0(b2) : aa10Var;
                final int g = p8e.g(Math.max(l03.a, Math.max(l02 != 0 ? l02.a : 0, l04 != 0 ? l04.a : 0)) + (l0 != null ? l0.a : 0) + (r9 != 0 ? r9.a : 0), j);
                final int d = lny0.d(l03.b, l02 != 0, max, l0 != null ? l0.b : 0, r9 != 0 ? r9.b : 0, l04 != 0 ? l04.b : 0, j, kVar.getDensity(), rny0Var.c);
                final int i16 = i4;
                return kVar.w(g, d, b.f(), new tls() { // from class: ony0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        int i17;
                        float f;
                        float f2;
                        rny0 rny0Var2 = rny0Var;
                        boolean z = rny0Var2.a;
                        o.a aVar = (o.a) obj5;
                        o oVar = o.this;
                        int i18 = g;
                        int i19 = d;
                        o oVar2 = l03;
                        o oVar3 = l04;
                        o oVar4 = l0;
                        o oVar5 = r9;
                        k kVar2 = kVar;
                        if (oVar != null) {
                            int i20 = i14 - i16;
                            if (i20 < 0) {
                                i20 = 0;
                            }
                            int i21 = max + f03;
                            float f3 = rny0Var2.b;
                            float density = kVar2.getDensity();
                            if (oVar4 != null) {
                                o.a.o(aVar, oVar4, 0, xvz.a(i19 - oVar4.b, 2.0f, 1.0f));
                            }
                            if (oVar5 != null) {
                                f2 = 2.0f;
                                o.a.o(aVar, oVar5, i18 - oVar5.a, xvz.a(i19 - oVar5.b, 2.0f, 1.0f));
                            } else {
                                f2 = 2.0f;
                            }
                            o.a.o(aVar, oVar, oVar4 != null ? oVar4.a : 0, (z ? xvz.a(i19 - oVar.b, f2, 1.0f) : m810.b(16.0f * density)) - m810.b((r1 - i20) * f3));
                            o.a.o(aVar, oVar2, oVar4 != null ? oVar4.a : 0, i21);
                            if (oVar3 != null) {
                                o.a.o(aVar, oVar3, oVar4 != null ? oVar4.a : 0, i21);
                            }
                        } else {
                            int b3 = m810.b(rny0Var2.c.d() * kVar2.getDensity());
                            if (oVar4 != null) {
                                f = 2.0f;
                                i17 = 0;
                                o.a.o(aVar, oVar4, 0, xvz.a(i19 - oVar4.b, 2.0f, 1.0f));
                            } else {
                                i17 = 0;
                                f = 2.0f;
                            }
                            if (oVar5 != null) {
                                o.a.o(aVar, oVar5, i18 - oVar5.a, xvz.a(i19 - oVar5.b, f, 1.0f));
                            }
                            o.a.o(aVar, oVar2, oVar4 != null ? oVar4.a : i17, z ? xvz.a(i19 - oVar2.b, f, 1.0f) : b3);
                            if (oVar3 != null) {
                                if (z) {
                                    b3 = xvz.a(i19 - oVar3.b, 2.0f, 1.0f);
                                }
                                o.a.o(aVar, oVar3, oVar4 != null ? oVar4.a : i17, b3);
                            }
                        }
                        return zy11.a;
                    }
                });
            }
            f0 = i14;
            i13++;
            rny0Var = this;
            list3 = list;
            i12 = i12;
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return aa10Var;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        return c(i, new pjv0(17), list);
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        return c(i, new pjv0(23), list);
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        return a(yuwVar, list, i, new pjv0(21));
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        return a(yuwVar, list, i, new pjv0(19));
    }
}
