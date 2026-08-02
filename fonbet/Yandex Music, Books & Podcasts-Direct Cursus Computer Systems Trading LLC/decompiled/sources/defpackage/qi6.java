package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qi6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ syc c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wn5 g;
    public final /* synthetic */ int h;

    public /* synthetic */ qi6(float f, wn5 wn5Var, wn5 wn5Var2, rxo rxoVar, int i, boolean z, pyc pycVar) {
        this.a = 2;
        this.b = f;
        this.g = wn5Var;
        this.c = wn5Var2;
        this.d = rxoVar;
        this.h = i;
        this.e = z;
        this.f = pycVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                kg5.j(this.b, (Function0) this.c, (yci) this.d, this.e, (uoi) this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                fj6.e(this.b, (Function0) this.c, (yci) this.d, this.e, (uoi) this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                return Unit.a;
            default:
                final wn5 wn5Var = (wn5) this.c;
                final rxo rxoVar = (rxo) this.d;
                final pyc pycVar = (pyc) this.f;
                final dnr dnrVar = (dnr) obj;
                final ga6 ga6Var = (ga6) obj2;
                dnrVar.getClass();
                int L = dnrVar.L(vxo.a);
                final int L2 = dnrVar.L(this.b);
                long b = ga6.b(ga6Var.a, L, 0, 0, 0, 14);
                List i = dnrVar.i(s1s.a, this.g);
                final ArrayList arrayList = new ArrayList(v75.o(i, 10));
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ffh) it.next()).M(b));
                }
                final vqn vqnVar = new vqn();
                vqnVar.a = L2 * 2;
                final vqn vqnVar2 = new vqn();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ksk kskVar = (ksk) it2.next();
                    vqnVar.a += kskVar.a;
                    vqnVar2.a = Math.max(vqnVar2.a, kskVar.b);
                }
                int i2 = vqnVar.a;
                int i3 = vqnVar2.a;
                final int i4 = this.h;
                final boolean z = this.e;
                return mfh.m0(dnrVar, i2, i3, new Function1() { // from class: uxo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        dnr dnrVar2;
                        vqn vqnVar3;
                        vqn vqnVar4;
                        jsk jskVar = (jsk) obj3;
                        jskVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        int i5 = L2;
                        int i6 = i5;
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            dnrVar2 = dnrVar;
                            if (!hasNext) {
                                break;
                            }
                            ksk kskVar2 = (ksk) it3.next();
                            jsk.g(jskVar, kskVar2, i6, 0);
                            arrayList2.add(new p1s(dnrVar2.c0(i6), dnrVar2.c0(kskVar2.a)));
                            i6 += kskVar2.a;
                        }
                        Iterator it4 = dnrVar2.i(s1s.b, wn5Var).iterator();
                        while (true) {
                            boolean hasNext2 = it4.hasNext();
                            vqnVar3 = vqnVar;
                            vqnVar4 = vqnVar2;
                            if (!hasNext2) {
                                break;
                            }
                            ffh ffhVar = (ffh) it4.next();
                            long j = ga6Var.a;
                            int i7 = vqnVar3.a;
                            ksk M = ffhVar.M(ga6.b(j, i7, i7, 0, 0, 8));
                            jsk.g(jskVar, M, 0, vqnVar4.a - M.b);
                        }
                        boolean z2 = true;
                        for (ffh ffhVar2 : dnrVar2.i(s1s.c, new wn5(new hon(7, pycVar, arrayList2), -1588455265, true))) {
                            int i8 = vqnVar3.a;
                            int i9 = vqnVar4.a;
                            if (!((i8 >= 0) & (i9 >= 0))) {
                                ume.a("width and height must be >= 0");
                            }
                            jsk.g(jskVar, ffhVar2.M(ia6.h(i8, i8, i9, i9)), 0, 0);
                        }
                        rxo rxoVar2 = rxoVar;
                        two twoVar = rxoVar2.a;
                        Integer num = rxoVar2.c;
                        int i10 = i4;
                        if (num == null || num.intValue() != i10) {
                            rxoVar2.c = Integer.valueOf(i10);
                            p1s p1sVar = (p1s) CollectionsKt.S(arrayList2, i10);
                            if (p1sVar != null) {
                                float f = p1sVar.b;
                                float f2 = p1sVar.a;
                                p1s p1sVar2 = (p1s) CollectionsKt.Y(arrayList2);
                                int L3 = dnrVar2.L(p1sVar2.a + p1sVar2.b) + i5;
                                u6k u6kVar = twoVar.d;
                                u6k u6kVar2 = twoVar.a;
                                int h = L3 - u6kVar.h();
                                float c0 = dnrVar2.c0(h);
                                if (!z && Float.compare(f2 + f, c0) <= 0 && u6kVar2.h() <= 0) {
                                    z2 = false;
                                }
                                int L4 = dnrVar2.L(f2) - ((h / 2) - (dnrVar2.L(f) / 2));
                                int i11 = L3 - h;
                                if (i11 < 0) {
                                    i11 = 0;
                                }
                                int d = yhn.d(L4, 0, i11);
                                if (u6kVar2.h() != d && z2) {
                                    x97.y(rxoVar2.b, null, null, new dv0(rxoVar2, d, null, 6), 3);
                                }
                            }
                        }
                        return Unit.a;
                    }
                });
        }
    }

    public /* synthetic */ qi6(float f, Function0 function0, yci yciVar, boolean z, uoi uoiVar, wn5 wn5Var, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = function0;
        this.d = yciVar;
        this.e = z;
        this.f = uoiVar;
        this.g = wn5Var;
        this.h = i;
    }
}
