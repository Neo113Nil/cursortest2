package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nyj implements kfh {
    public final Function1 a;
    public final boolean b;
    public final float c;
    public final o0k d;

    public nyj(Function1 function1, boolean z, float f, o0k o0kVar) {
        this.a = function1;
        this.b = z;
        this.c = f;
        this.d = o0kVar;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        return g(fxeVar, list, i, xce.y0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ksk] */
    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        lfh lfhVar;
        Object obj4;
        nyj nyjVar = this;
        o0k o0kVar = nyjVar.d;
        int L = mfhVar.L(o0kVar.a());
        long b = ga6.b(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (Intrinsics.d(a.a((ffh) obj), "Leading")) {
                break;
            }
            i++;
        }
        ffh ffhVar = (ffh) obj;
        ksk M = ffhVar != null ? ffhVar.M(b) : null;
        float f = cbs.a;
        int i2 = M != null ? M.a : 0;
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (Intrinsics.d(a.a((ffh) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        ffh ffhVar2 = (ffh) obj2;
        ksk M2 = ffhVar2 != null ? ffhVar2.M(ia6.i(b, -i2, 0)) : null;
        int i4 = i2 + (M2 != null ? M2.a : 0);
        int L2 = mfhVar.L(o0kVar.c(mfhVar.getLayoutDirection())) + mfhVar.L(o0kVar.b(mfhVar.getLayoutDirection()));
        int i5 = -i4;
        int i6 = -L;
        long i7 = ia6.i(b, fxf.K(i5 - L2, nyjVar.c, -L2), i6);
        int size3 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i8);
            if (Intrinsics.d(a.a((ffh) obj3), "Label")) {
                break;
            }
            i8++;
        }
        ffh ffhVar3 = (ffh) obj3;
        ksk M3 = ffhVar3 != null ? ffhVar3.M(i7) : null;
        nyjVar.a.invoke(new nmq(M3 != null ? a4g.i(M3.a, M3.b) : 0L));
        long j2 = j;
        long b2 = ga6.b(ia6.i(j2, i5, i6 - Math.max((M3 != null ? M3.b : 0) / 2, mfhVar.L(o0kVar.d()))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i9 = 0;
        while (i9 < size4) {
            ffh ffhVar4 = (ffh) list.get(i9);
            if (Intrinsics.d(a.a(ffhVar4), "TextField")) {
                ksk M4 = ffhVar4.M(b2);
                long b3 = ga6.b(b2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        lfhVar = null;
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i10);
                    lfhVar = null;
                    if (Intrinsics.d(a.a((ffh) obj4), "Hint")) {
                        break;
                    }
                    i10++;
                }
                ffh ffhVar5 = (ffh) obj4;
                ?? M5 = ffhVar5 != null ? ffhVar5.M(b3) : lfhVar;
                ksk kskVar = M2;
                int d = lyj.d(M != null ? M.a : 0, M2 != null ? M2.a : 0, M4.a, M3 != null ? M3.a : 0, M5 != 0 ? M5.a : 0, nyjVar.c, j2, mfhVar.getDensity(), nyjVar.d);
                int c = lyj.c(M != null ? M.b : 0, kskVar != null ? kskVar.b : 0, M4.b, M3 != null ? M3.b : 0, M5 != 0 ? M5.b : 0, nyjVar.c, j, mfhVar.getDensity(), nyjVar.d);
                int size6 = list.size();
                int i11 = 0;
                ksk kskVar2 = M5;
                while (i11 < size6) {
                    ffh ffhVar6 = (ffh) list.get(i11);
                    if (Intrinsics.d(a.a(ffhVar6), "border")) {
                        ksk kskVar3 = M4;
                        ksk kskVar4 = kskVar2;
                        int i12 = c;
                        return mfh.m0(mfhVar, d, i12, new myj(i12, d, M, kskVar, kskVar3, M3, kskVar4, ffhVar6.M(ia6.a(d != Integer.MAX_VALUE ? d : 0, d, c != Integer.MAX_VALUE ? c : 0, c)), nyjVar, mfhVar));
                    }
                    i11++;
                    c = c;
                    kskVar2 = kskVar2;
                    M4 = M4;
                    M = M;
                    nyjVar = this;
                }
                wvs.h("Collection contains no element matching the predicate.");
                return lfhVar;
            }
            i9++;
            nyjVar = this;
            j2 = j;
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.kfh
    public final int c(fxe fxeVar, List list, int i) {
        return g(fxeVar, list, i, xce.A0);
    }

    @Override // defpackage.kfh
    public final int d(fxe fxeVar, List list, int i) {
        return f(fxeVar, list, i, xce.x0);
    }

    @Override // defpackage.kfh
    public final int e(fxe fxeVar, List list, int i) {
        return f(fxeVar, list, i, xce.z0);
    }

    public final int f(fxe fxeVar, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int size = list.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (Intrinsics.d(cbs.c((ffh) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        ffh ffhVar = (ffh) obj2;
        if (ffhVar != null) {
            i2 = i == Integer.MAX_VALUE ? i : i - ffhVar.J(Integer.MAX_VALUE);
            i3 = ((Number) function2.invoke(ffhVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (Intrinsics.d(cbs.c((ffh) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        ffh ffhVar2 = (ffh) obj3;
        if (ffhVar2 != null) {
            int J = ffhVar2.J(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= J;
            }
            i4 = ((Number) function2.invoke(ffhVar2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (Intrinsics.d(cbs.c((ffh) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (ffh) obj4;
        int intValue = obj5 != null ? ((Number) function2.invoke(obj5, Integer.valueOf(fxf.K(i2, this.c, i)))).intValue() : 0;
        int size4 = list.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (Intrinsics.d(cbs.c((ffh) obj6), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (Intrinsics.d(cbs.c((ffh) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (ffh) obj;
                return lyj.c(i3, i4, intValue2, intValue, obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, this.c, ia6.b(0, 0, 15), fxeVar.getDensity(), this.d);
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
        return 0;
    }

    public final int g(fxe fxeVar, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (Intrinsics.d(cbs.c((ffh) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.d(cbs.c((ffh) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                ffh ffhVar = (ffh) obj2;
                int intValue2 = ffhVar != null ? ((Number) function2.invoke(ffhVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.d(cbs.c((ffh) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                ffh ffhVar2 = (ffh) obj3;
                int intValue3 = ffhVar2 != null ? ((Number) function2.invoke(ffhVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.d(cbs.c((ffh) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                ffh ffhVar3 = (ffh) obj4;
                int intValue4 = ffhVar3 != null ? ((Number) function2.invoke(ffhVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (Intrinsics.d(cbs.c((ffh) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                ffh ffhVar4 = (ffh) obj;
                return lyj.d(intValue4, intValue3, intValue, intValue2, ffhVar4 != null ? ((Number) function2.invoke(ffhVar4, Integer.valueOf(i))).intValue() : 0, this.c, ia6.b(0, 0, 15), fxeVar.getDensity(), this.d);
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
        return 0;
    }
}
