package defpackage;

import androidx.compose.ui.layout.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b34 implements kfh {
    public final /* synthetic */ l54 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;

    public b34(l54 l54Var, float f, float f2, Function0 function0, Function0 function02, float f3, float f4, boolean z, boolean z2, float f5) {
        this.a = l54Var;
        this.b = f;
        this.c = f2;
        this.d = function0;
        this.e = function02;
        this.f = f3;
        this.g = f4;
        this.h = z;
        this.i = z2;
        this.j = f5;
    }

    public static final float f(boolean z, boolean z2, float f, float f2, float f3, int i, ksk kskVar) {
        if (!z && !z2) {
            return 1.0f;
        }
        return 1.0f - ((Math.abs(f - ((kskVar.a / 2.0f) + i)) / f2) * f3);
    }

    @Override // defpackage.kfh
    public final lfh b(final mfh mfhVar, List list, long j) {
        List list2;
        Object obj;
        ksk kskVar;
        Object obj2;
        b34 b34Var = this;
        mfhVar.getClass();
        list.getClass();
        float offset = b34Var.a.a.getOffset();
        final int h = ga6.h(j) - mfhVar.L(b34Var.b);
        float f = b34Var.c;
        float abs = Math.abs(offset / f);
        float floatValue = ((Number) b34Var.d.invoke()).floatValue();
        float floatValue2 = ((Number) b34Var.e.invoke()).floatValue() - floatValue;
        float f2 = (floatValue2 * abs) + floatValue;
        float e = su4.e(1, abs, floatValue2, floatValue);
        int L = mfhVar.L(b34Var.f);
        long a = ia6.a(L, L, ga6.j(j), h);
        int i = (int) (ga6.i(a) * f2);
        int h2 = (int) (ga6.h(a) * f2);
        if (!((i >= 0) & (h2 >= 0))) {
            ume.a("width and height must be >= 0");
        }
        long h3 = ia6.h(i, i, h2, h2);
        int i2 = (int) (ga6.i(a) * e);
        int h4 = (int) (ga6.h(a) * e);
        if (!((i2 >= 0) & (h4 >= 0))) {
            ume.a("width and height must be >= 0");
        }
        long h5 = ia6.h(i2, i2, h4, h4);
        List<ffh> list3 = list;
        for (ffh ffhVar : list3) {
            if (a.a(ffhVar) == d44.b) {
                final ksk M = ffhVar.M(h5);
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list2 = list3;
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    list2 = list3;
                    if (a.a((ffh) obj) == d44.a) {
                        break;
                    }
                    list3 = list2;
                }
                ffh ffhVar2 = (ffh) obj;
                ksk M2 = ffhVar2 != null ? ffhVar2.M(h3) : null;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        kskVar = M2;
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    kskVar = M2;
                    if (a.a((ffh) obj2) == d44.c) {
                        break;
                    }
                    M2 = kskVar;
                }
                ffh ffhVar3 = (ffh) obj2;
                ksk M3 = ffhVar3 != null ? ffhVar3.M(h3) : null;
                float f3 = (i2 + i) / 2;
                float f4 = b34Var.g;
                final int i3 = ((ga6.i(j) - M.a) / 2) + ((int) fxf.J(offset, 0.0f, f, 0.0f, mfhVar.n0(f4) + f3));
                final int i4 = (h - M.b) / 2;
                final float i5 = ga6.i(j) / 2;
                final float n0 = mfhVar.n0(f4) + (ga6.i(h3) / 2) + (ga6.i(h5) / 2);
                int i6 = ga6.i(j);
                int h6 = ga6.h(j);
                final float f5 = b34Var.g;
                final ksk kskVar2 = M3;
                final boolean z = b34Var.h;
                final boolean z2 = b34Var.i;
                final float f6 = b34Var.j;
                final ksk kskVar3 = kskVar;
                return mfh.m0(mfhVar, i6, h6, new Function1() { // from class: z24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final float f7;
                        final float f8;
                        final float f9;
                        final float f10;
                        final float f11;
                        final float f12;
                        final boolean z3;
                        final boolean z4;
                        jsk jskVar = (jsk) obj3;
                        jskVar.getClass();
                        mfh mfhVar2 = mfhVar;
                        float f13 = f5;
                        int L2 = mfhVar2.L(f13);
                        final int i7 = i3;
                        int i8 = i7 - L2;
                        final ksk kskVar4 = kskVar3;
                        final int i9 = i8 - (kskVar4 != null ? kskVar4.a : 0);
                        int i10 = h;
                        final boolean z5 = z;
                        final boolean z6 = z2;
                        float f14 = i5;
                        float f15 = n0;
                        float f16 = f6;
                        if (kskVar4 != null) {
                            final int i11 = 0;
                            f7 = f14;
                            f8 = f15;
                            f9 = f16;
                            jsk.l(jskVar, kskVar4, i9, (i10 - kskVar4.b) / 2, new Function1() { // from class: a34
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i12 = i11;
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    switch (i12) {
                                        case 0:
                                            zcoVar.a(b34.f(z5, z6, f7, f8, f9, i9, kskVar4));
                                            break;
                                        case 1:
                                            zcoVar.a(b34.f(z5, z6, f7, f8, f9, i9, kskVar4));
                                            break;
                                        default:
                                            zcoVar.a(b34.f(z5, z6, f7, f8, f9, i9, kskVar4));
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, 4);
                        } else {
                            f7 = f14;
                            f8 = f15;
                            f9 = f16;
                        }
                        int L3 = mfhVar2.L(f13) + i7;
                        final ksk kskVar5 = M;
                        final int i12 = kskVar5.a + L3;
                        final ksk kskVar6 = kskVar2;
                        if (kskVar6 != null) {
                            final int i13 = 1;
                            f10 = f7;
                            f11 = f8;
                            f12 = f9;
                            z3 = z5;
                            z4 = z6;
                            jsk.l(jskVar, kskVar6, i12, (i10 - kskVar6.b) / 2, new Function1() { // from class: a34
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i122 = i13;
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    switch (i122) {
                                        case 0:
                                            zcoVar.a(b34.f(z3, z4, f10, f11, f12, i12, kskVar6));
                                            break;
                                        case 1:
                                            zcoVar.a(b34.f(z3, z4, f10, f11, f12, i12, kskVar6));
                                            break;
                                        default:
                                            zcoVar.a(b34.f(z3, z4, f10, f11, f12, i12, kskVar6));
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, 4);
                        } else {
                            f10 = f7;
                            f11 = f8;
                            f12 = f9;
                            z3 = z5;
                            z4 = z6;
                        }
                        final boolean z7 = z3;
                        final int i14 = 2;
                        final boolean z8 = z4;
                        final float f17 = f10;
                        final float f18 = f11;
                        final float f19 = f12;
                        jsk.l(jskVar, kskVar5, i7, i4, new Function1() { // from class: a34
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i122 = i14;
                                zco zcoVar = (zco) obj4;
                                zcoVar.getClass();
                                switch (i122) {
                                    case 0:
                                        zcoVar.a(b34.f(z7, z8, f17, f18, f19, i7, kskVar5));
                                        break;
                                    case 1:
                                        zcoVar.a(b34.f(z7, z8, f17, f18, f19, i7, kskVar5));
                                        break;
                                    default:
                                        zcoVar.a(b34.f(z7, z8, f17, f18, f19, i7, kskVar5));
                                        break;
                                }
                                return Unit.a;
                            }
                        }, 4);
                        return Unit.a;
                    }
                });
            }
            b34Var = this;
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }
}
