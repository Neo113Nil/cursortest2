package defpackage;

import androidx.compose.foundation.layout.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class lx6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ hz2 d;
    public final /* synthetic */ wn5 e;

    public /* synthetic */ lx6(wn5 wn5Var, hz2 hz2Var, wn5 wn5Var2, wn5 wn5Var3) {
        this.b = wn5Var;
        this.d = hz2Var;
        this.c = wn5Var2;
        this.e = wn5Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                yci d = d.d(vci.a, 1.0f);
                oq5 oq5Var2 = (oq5) hq5Var;
                wn5 wn5Var = this.b;
                boolean f = oq5Var2.f(wn5Var);
                hz2 hz2Var = this.d;
                boolean f2 = f | oq5Var2.f(hz2Var);
                wn5 wn5Var2 = this.c;
                boolean f3 = f2 | oq5Var2.f(wn5Var2);
                wn5 wn5Var3 = this.e;
                boolean f4 = f3 | oq5Var2.f(wn5Var3);
                Object K = oq5Var2.K();
                if (f4 || K == gq5.a) {
                    K = new lx6(wn5Var, wn5Var2, hz2Var, wn5Var3);
                    oq5Var2.k0(K);
                }
                u2x.p(d, (Function2) K, oq5Var2, 6, 0);
                return Unit.a;
            default:
                final dnr dnrVar = (dnr) obj;
                final ga6 ga6Var = (ga6) obj2;
                dnrVar.getClass();
                final int i = ga6.i(ga6Var.a);
                List i2 = dnrVar.i("Tabs", this.b);
                int size = i2.size();
                final int i3 = i / size;
                final ArrayList arrayList = new ArrayList(i2.size());
                int size2 = i2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(((ffh) i2.get(i4)).M(ga6.b(ga6Var.a, i3, i3, 0, 0, 12)));
                }
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i5 = ((ksk) obj3).b;
                    int i6 = 1;
                    int size3 = arrayList.size() - 1;
                    if (1 <= size3) {
                        while (true) {
                            Object obj4 = arrayList.get(i6);
                            int i7 = ((ksk) obj4).b;
                            if (i5 < i7) {
                                obj3 = obj4;
                                i5 = i7;
                            }
                            if (i6 != size3) {
                                i6++;
                            }
                        }
                    }
                }
                ksk kskVar = (ksk) obj3;
                final int i8 = kskVar != null ? kskVar.b : 0;
                final ArrayList arrayList2 = new ArrayList(size);
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList2.add(new o1s(dnrVar.c0(i3) * i9, dnrVar.c0(i3)));
                }
                final wn5 wn5Var4 = this.c;
                final hz2 hz2Var2 = this.d;
                final wn5 wn5Var5 = this.e;
                return mfh.m0(dnrVar, i, i8, new Function1() { // from class: nx6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i10;
                        jsk jskVar = (jsk) obj5;
                        jskVar.getClass();
                        ArrayList arrayList3 = arrayList;
                        int size4 = arrayList3.size();
                        int i11 = 0;
                        while (true) {
                            i10 = i8;
                            if (i11 >= size4) {
                                break;
                            }
                            ksk kskVar2 = (ksk) arrayList3.get(i11);
                            jsk.g(jskVar, kskVar2, i3 * i11, hz2Var2.a(kskVar2.b, i10));
                            i11++;
                        }
                        dnr dnrVar2 = dnrVar;
                        List i12 = dnrVar2.i("Divider", wn5Var4);
                        int size5 = i12.size();
                        for (int i13 = 0; i13 < size5; i13++) {
                            ksk M = ((ffh) i12.get(i13)).M(ga6.b(ga6Var.a, 0, 0, 0, 0, 11));
                            jsk.g(jskVar, M, 0, i10 - M.b);
                        }
                        List i14 = dnrVar2.i("Indicator", new wn5(new kw5(11, wn5Var5, arrayList2), 919433464, true));
                        int size6 = i14.size();
                        for (int i15 = 0; i15 < size6; i15++) {
                            ffh ffhVar = (ffh) i14.get(i15);
                            int i16 = i;
                            if (!((i16 >= 0) & (i10 >= 0))) {
                                ume.a("width and height must be >= 0");
                            }
                            jsk.g(jskVar, ffhVar.M(ia6.h(i16, i16, i10, i10)), 0, 0);
                        }
                        return Unit.a;
                    }
                });
        }
    }

    public /* synthetic */ lx6(wn5 wn5Var, wn5 wn5Var2, hz2 hz2Var, wn5 wn5Var3) {
        this.b = wn5Var;
        this.c = wn5Var2;
        this.d = hz2Var;
        this.e = wn5Var3;
    }
}
