package defpackage;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class vp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ vp(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float d;
        Pair pair;
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.k(f);
                zcoVar.n(f);
                zcoVar.d(1);
                break;
            case 1:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.y(f);
                break;
            case 2:
                zco zcoVar3 = (zco) obj;
                zcoVar3.getClass();
                zcoVar3.x(zcoVar3.q.getDensity() * f);
                break;
            case 3:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                int i2 = d85.o;
                long z = mvt.z(f, 0.75f, 0.55f, 0.0f, 24);
                long e = jpaVar.e();
                float f2 = 4;
                float n0 = jpaVar.n0(f2);
                float n02 = jpaVar.n0(f2);
                jpa.u(jpaVar, z, e, (Float.floatToRawIntBits(n0) << 32) | (Float.floatToRawIntBits(n02) & 4294967295L), 242);
                break;
            case 4:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                float n03 = opfVar.n0(f);
                long j = d85.b;
                d85 d85Var = new d85(j);
                long j2 = d85.m;
                jpa.A0(opfVar, y9w.F(u75.h(d85Var, new d85(j2)), 0.0f, n03, 10), 0L, 0L, 0.0f, null, null, 8, 62);
                jpa.A0(opfVar, y9w.F(u75.h(new d85(j2), new d85(j)), nmq.d(opfVar.a.e()) - n03, 0.0f, 12), 0L, 0L, 0.0f, null, null, 8, 62);
                break;
            case 5:
                zco zcoVar4 = (zco) obj;
                zcoVar4.getClass();
                zcoVar4.k(f);
                zcoVar4.n(f);
                break;
            case 6:
                zco zcoVar5 = (zco) obj;
                zcoVar5.getClass();
                zcoVar5.j(-f);
                zcoVar5.v(v5g.g(0.5f, 0.0f));
                break;
            case 7:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                ou3 ou3Var = opfVar2.a;
                float b = nmq.b(ou3Var.e()) * f;
                mu3 s = ou3Var.b.s();
                gh0 p = hld.p();
                p.a.setAntiAlias(false);
                Pair[] x = dag.x();
                ArrayList arrayList = new ArrayList(13);
                for (int i3 = 0; i3 < 13; i3++) {
                    arrayList.add(new d85(((d85) x[i3].b).a));
                }
                Pair[] x2 = dag.x();
                ArrayList arrayList2 = new ArrayList(13);
                for (int i4 = 0; i4 < 13; i4++) {
                    arrayList2.add(Float.valueOf(((Number) x2[i4].a).floatValue()));
                }
                float f3 = 2;
                p.h(w1g.b(swf.i(nmq.d(ou3Var.e()) / f3, nmq.b(ou3Var.e()) - b), swf.i(nmq.d(ou3Var.e()) / f3, nmq.b(ou3Var.e())), arrayList, arrayList2, 0));
                s.t(0.0f, nmq.b(ou3Var.e()) - b, nmq.d(ou3Var.e()), nmq.b(ou3Var.e()), p);
                opfVar2.a();
                break;
            default:
                opf opfVar3 = (opf) obj;
                opfVar3.getClass();
                opfVar3.a();
                float n04 = opfVar3.n0(f);
                ou3 ou3Var2 = opfVar3.a;
                long i5 = a4g.i(n04, nmq.b(ou3Var2.e()));
                int ordinal = opfVar3.getLayoutDirection().ordinal();
                if (ordinal == 0) {
                    d = nmq.d(ou3Var2.e()) - n04;
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    d = 0.0f;
                }
                long i6 = swf.i(d, 0.0f);
                int ordinal2 = opfVar3.getLayoutDirection().ordinal();
                if (ordinal2 == 0) {
                    pair = new Pair(Float.valueOf(nmq.d(ou3Var2.e()) - nmq.d(i5)), Float.valueOf(nmq.d(ou3Var2.e()) - (nmq.d(i5) * 0.75f)));
                } else if (ordinal2 != 1) {
                    b6e.s();
                    break;
                } else {
                    pair = new Pair(Float.valueOf(nmq.d(i5)), Float.valueOf(nmq.d(i5) * 0.75f));
                }
                jpa.A0(opfVar3, y9w.F(u75.h(new d85(c3x.f(0)), new d85(c3x.h(4278190080L))), ((Number) pair.a).floatValue(), ((Number) pair.b).floatValue(), 8), i6, i5, 0.0f, null, null, 8, 56);
                break;
        }
        return Unit.a;
    }
}
