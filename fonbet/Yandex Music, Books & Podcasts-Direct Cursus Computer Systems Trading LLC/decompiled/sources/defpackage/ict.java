package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ict implements kfh {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ox0 c;
    public final /* synthetic */ int d;

    public ict(Function0 function0, Function1 function1, ox0 ox0Var, int i) {
        float f = kct.a;
        x2i x2iVar = qx0.a;
        this.a = function0;
        this.b = function1;
        this.c = ox0Var;
        this.d = i;
    }

    @Override // defpackage.kfh
    public final lfh b(final mfh mfhVar, List list, final long j) {
        int i;
        mfhVar.getClass();
        list.getClass();
        int size = list.size();
        final int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ffh ffhVar = (ffh) list.get(i3);
            if (a.a(ffhVar) == fps.a) {
                final ksk M = ffhVar.M(ga6.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ffh ffhVar2 = (ffh) list.get(i4);
                    if (a.a(ffhVar2) == fps.c) {
                        final ksk M2 = ffhVar2.M(ga6.b(j, 0, 0, 0, 0, 14));
                        if (ga6.i(j) == Integer.MAX_VALUE) {
                            i = ga6.i(j);
                        } else {
                            i = (ga6.i(j) - M.a) - Math.max(mfhVar.L(kct.c), M2.a);
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            ffh ffhVar3 = (ffh) list.get(i6);
                            if (a.a(ffhVar3) == fps.b) {
                                final ksk M3 = ffhVar3.M(ga6.b(j, 0, i5, 0, 0, 12));
                                v2e v2eVar = j40.b;
                                final int Y = M3.Y(v2eVar) != Integer.MIN_VALUE ? M3.Y(v2eVar) : 0;
                                float floatValue = ((Number) this.a.invoke()).floatValue();
                                int b = Float.isNaN(floatValue) ? 0 : eeh.b(floatValue);
                                final int max = Math.max(mfhVar.L(kct.a), M3.b);
                                if (ga6.h(j) == Integer.MAX_VALUE) {
                                    i2 = max;
                                } else {
                                    int i7 = b + max;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                Function1 function1 = this.b;
                                if (function1 != null) {
                                    function1.invoke(new cma(mfhVar.c0(i2)));
                                }
                                int i8 = ga6.i(j);
                                x2i x2iVar = qx0.a;
                                final ox0 ox0Var = this.c;
                                final int i9 = this.d;
                                return mfh.m0(mfhVar, i8, i2, new Function1() { // from class: hct
                                    {
                                        x2i x2iVar2 = qx0.a;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int max2;
                                        int i10;
                                        x2i x2iVar2 = qx0.a;
                                        jsk jskVar = (jsk) obj;
                                        jskVar.getClass();
                                        ksk kskVar = M;
                                        int i11 = kskVar.b;
                                        int i12 = i2;
                                        int i13 = 0;
                                        jsk.g(jskVar, kskVar, 0, (i12 - i11) / 2);
                                        lx0 lx0Var = qx0.e;
                                        boolean equals = x2iVar2.equals(lx0Var);
                                        ksk kskVar2 = M3;
                                        long j2 = j;
                                        ksk kskVar3 = M2;
                                        if (equals) {
                                            int i14 = ga6.i(j2);
                                            int i15 = kskVar2.a;
                                            max2 = (i14 - i15) / 2;
                                            int i16 = kskVar.a;
                                            if (max2 < i16) {
                                                i10 = i16 - max2;
                                            } else if (i15 + max2 > ga6.i(j2) - kskVar3.a) {
                                                i10 = (ga6.i(j2) - kskVar3.a) - (kskVar2.a + max2);
                                            }
                                            max2 += i10;
                                        } else if (x2iVar2.equals(qx0.b)) {
                                            max2 = (ga6.i(j2) - kskVar2.a) - kskVar3.a;
                                        } else {
                                            max2 = Math.max(mfhVar.L(kct.c), kskVar.a);
                                        }
                                        ox0 ox0Var2 = ox0Var;
                                        if (Intrinsics.d(ox0Var2, lx0Var)) {
                                            i13 = (i12 - kskVar2.b) / 2;
                                        } else if (Intrinsics.d(ox0Var2, qx0.d)) {
                                            int i17 = kskVar2.b;
                                            int i18 = i9;
                                            if (i18 == 0) {
                                                i13 = i12 - i17;
                                            } else {
                                                int i19 = i18 - (i17 - Y);
                                                int i20 = i19 + i17;
                                                int i21 = max;
                                                if (i20 > i21) {
                                                    i19 -= i20 - i21;
                                                }
                                                i13 = (i12 - i17) - Math.max(0, i19);
                                            }
                                        }
                                        jsk.g(jskVar, kskVar2, max2, i13);
                                        jsk.g(jskVar, kskVar3, ga6.i(j2) - kskVar3.a, (i12 - kskVar3.b) / 2);
                                        return Unit.a;
                                    }
                                });
                            }
                        }
                        wvs.h("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
                wvs.h("Collection contains no element matching the predicate.");
                return null;
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }
}
