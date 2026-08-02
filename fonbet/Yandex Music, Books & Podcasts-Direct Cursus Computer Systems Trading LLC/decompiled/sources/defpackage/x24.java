package defpackage;

import androidx.compose.ui.layout.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class x24 implements kfh {
    public final /* synthetic */ m54 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public x24(m54 m54Var, Function0 function0, Function0 function02, float f, float f2, float f3) {
        this.a = m54Var;
        this.b = function0;
        this.c = function02;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    @Override // defpackage.kfh
    public final lfh b(final mfh mfhVar, List list, final long j) {
        Object obj;
        Object obj2;
        mfhVar.getClass();
        list.getClass();
        float floatValue = ((Number) this.a.a.e.getValue()).floatValue();
        Function0 function0 = this.b;
        float floatValue2 = ((Number) function0.invoke()).floatValue();
        Function0 function02 = this.c;
        float floatValue3 = ((Number) function02.invoke()).floatValue() - ((Number) function0.invoke()).floatValue();
        float f = this.d;
        float f2 = floatValue / f;
        float abs = (Math.abs(f2) * floatValue3) + floatValue2;
        float abs2 = ((1 - Math.abs(f2)) * (((Number) function02.invoke()).floatValue() - ((Number) function0.invoke()).floatValue())) + ((Number) function0.invoke()).floatValue();
        float f3 = 2;
        int i = (int) (ga6.i(j) - (mfhVar.n0(this.e) * f3));
        long b = ga6.b(j, i, i, 0, 0, 12);
        int i2 = (int) (ga6.i(b) * abs);
        int h = (int) (ga6.h(b) * abs);
        if (!((i2 >= 0) & (h >= 0))) {
            ume.a("width and height must be >= 0");
        }
        boolean z = 2;
        long h2 = ia6.h(i2, i2, h, h);
        int i3 = (int) (ga6.i(b) * abs2);
        int h3 = (int) (ga6.h(b) * abs2);
        if (!((h3 >= 0) & (i3 >= 0))) {
            ume.a("width and height must be >= 0");
        }
        long h4 = ia6.h(i3, i3, h3, h3);
        List<ffh> list2 = list;
        for (ffh ffhVar : list2) {
            boolean z2 = z;
            if (a.a(ffhVar) == whm.b) {
                final ksk M = ffhVar.M(h4);
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (a.a((ffh) obj) == whm.a) {
                        break;
                    }
                }
                ffh ffhVar2 = (ffh) obj;
                ksk M2 = ffhVar2 != null ? ffhVar2.M(h2) : null;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (a.a((ffh) obj2) == whm.c) {
                        break;
                    }
                }
                ffh ffhVar3 = (ffh) obj2;
                ksk M3 = ffhVar3 != null ? ffhVar3.M(h2) : null;
                final int i4 = ((ga6.i(j) - M.a) / 2) + ((int) fxf.J(floatValue, 0.0f, f, 0.0f, mfhVar.n0(this.f) + ((i3 + i2) / f3)));
                final int h5 = (ga6.h(j) - M.b) / 2;
                int i5 = ga6.i(j);
                int h6 = ga6.h(j);
                final float f4 = this.f;
                final ksk kskVar = M2;
                final ksk kskVar2 = M3;
                return mfh.m0(mfhVar, i5, h6, new Function1() { // from class: w24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        jsk jskVar = (jsk) obj3;
                        jskVar.getClass();
                        ksk kskVar3 = ksk.this;
                        int i6 = i4;
                        mfh mfhVar2 = mfhVar;
                        float f5 = f4;
                        long j2 = j;
                        if (kskVar3 != null) {
                            jskVar.d(kskVar3, (i6 - mfhVar2.L(f5)) - kskVar3.a, (ga6.h(j2) - kskVar3.b) / 2, 0.0f);
                        }
                        ksk kskVar4 = kskVar2;
                        ksk kskVar5 = M;
                        if (kskVar4 != null) {
                            jskVar.d(kskVar4, mfhVar2.L(f5) + i6 + kskVar5.a, (ga6.h(j2) - kskVar4.b) / 2, 0.0f);
                        }
                        jskVar.d(kskVar5, i6, h5, 0.0f);
                        return Unit.a;
                    }
                });
            }
            z = z2;
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }
}
