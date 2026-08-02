package defpackage;

import com.yandex.passport.data.network.s7;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.core.accounts.k;
import com.yandex.passport.internal.core.announcing.b;
import com.yandex.passport.internal.database.d;
import com.yandex.passport.internal.di.module.p;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.c;
import com.yandex.passport.internal.report.reporters.c1;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.report.reporters.r;
import com.yandex.passport.internal.sloth.performers.a;
import com.yandex.passport.internal.sloth.performers.e;
import com.yandex.passport.internal.sloth.performers.f;
import com.yandex.passport.internal.sloth.performers.g;
import com.yandex.passport.internal.sloth.performers.h;
import com.yandex.passport.internal.sloth.performers.j;
import com.yandex.passport.internal.sloth.performers.l;
import com.yandex.passport.internal.sloth.performers.n;
import com.yandex.passport.internal.sloth.performers.q;
import com.yandex.passport.internal.sloth.z;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.m;
import com.yandex.passport.sloth.url.v;
import com.yandex.passport.sloth.z0;

/* loaded from: classes4.dex */
public final class d13 implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;
    public final szm g;
    public final szm h;
    public final szm i;
    public final szm j;
    public final szm k;
    public final szm l;
    public final szm m;
    public final rzm n;

    public d13(l48 l48Var, toe toeVar, toe toeVar2, toe toeVar3, toe toeVar4, toe toeVar5, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, toe toeVar6, toe toeVar7, rzm rzmVar6) {
        this.a = 0;
        this.b = toeVar;
        this.c = toeVar2;
        this.d = toeVar3;
        this.e = toeVar4;
        this.f = toeVar5;
        this.g = rzmVar;
        this.h = rzmVar2;
        this.i = rzmVar3;
        this.j = rzmVar4;
        this.k = rzmVar5;
        this.l = toeVar6;
        this.n = toeVar7;
        this.m = rzmVar6;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                jdk jdkVar = (jdk) ((szm) this.b).get();
                pyh pyhVar = (pyh) this.c.get();
                String str = (String) this.d.get();
                int intValue = ((Integer) this.e.get()).intValue();
                boolean booleanValue = ((Boolean) this.f.get()).booleanValue();
                ti4 ti4Var = (ti4) this.g.get();
                qk7 qk7Var = (qk7) this.h.get();
                hos hosVar = (hos) this.i.get();
                l9i l9iVar = (l9i) this.j.get();
                t28 t28Var = (t28) this.k.get();
                g0c g0cVar = (g0c) this.l.get();
                x60 x60Var = (x60) ((toe) this.n).a;
                pxf pxfVar = (pxf) this.m.get();
                jdkVar.getClass();
                pyhVar.getClass();
                ti4Var.getClass();
                qk7Var.getClass();
                hosVar.getClass();
                l9iVar.getClass();
                t28Var.getClass();
                g0cVar.getClass();
                x60Var.getClass();
                pxfVar.getClass();
                return new t23(wxf.Q(jdkVar), new yx3(pyhVar.a), new ozw(25, (byte) 0), qk7Var, hosVar, l9iVar, t28Var, str, intValue, booleanValue, g0cVar, x60Var, ti4Var, new c13(pxfVar, 0));
            case 1:
                p pVar = (p) this.b;
                k kVar = (k) ((rzm) this.c).get();
                b bVar = (b) ((rzm) this.d).get();
                o0 o0Var = (o0) ((rzm) this.e).get();
                a2 a2Var = (a2) ((rzm) this.f).get();
                c1 c1Var = (c1) ((rzm) this.g).get();
                f1 f1Var = (f1) ((rzm) this.h).get();
                c cVar = (c) ((rzm) this.i).get();
                x xVar = (x) ((rzm) this.j).get();
                d dVar = (d) ((rzm) this.k).get();
                r rVar = (r) ((rzm) this.l).get();
                com.yandex.passport.internal.account.b bVar2 = (com.yandex.passport.internal.account.b) ((rzm) this.m).get();
                com.yandex.passport.internal.network.mappers.d dVar2 = (com.yandex.passport.internal.network.mappers.d) this.n.get();
                pVar.getClass();
                kVar.getClass();
                bVar.getClass();
                o0Var.getClass();
                a2Var.getClass();
                c1Var.getClass();
                f1Var.getClass();
                cVar.getClass();
                xVar.getClass();
                dVar.getClass();
                rVar.getClass();
                bVar2.getClass();
                dVar2.getClass();
                return new i(kVar, bVar, o0Var, c1Var, f1Var, cVar, xVar, dVar, rVar, a2Var, bVar2, dVar2);
            case 2:
                return new h((com.yandex.passport.internal.sloth.performers.b) ((rzm) this.b).get(), (com.yandex.passport.internal.sloth.performers.d) ((rzm) this.c).get(), (e) ((rzm) this.d).get(), (f) ((rzm) this.e).get(), (a) ((rzm) this.f).get(), (g) ((rzm) this.g).get(), (j) ((rzm) this.h).get(), (com.yandex.passport.internal.sloth.performers.k) ((rzm) this.i).get(), (l) ((rzm) this.j).get(), (n) ((rzm) this.k).get(), (com.yandex.passport.internal.sloth.performers.p) ((h1) this.l).get(), (com.yandex.passport.internal.sloth.performers.p) ((h1) this.m).get(), (q) ((s7) this.n).get());
            default:
                return new v((m) ((toe) this.n).a, (com.yandex.passport.sloth.dependencies.i) ((rzm) this.b).get(), (com.yandex.passport.common.ui.lang.b) ((rzm) this.c).get(), (z) ((rzm) this.d).get(), (com.yandex.passport.internal.sloth.j) ((rzm) this.e).get(), (com.yandex.passport.sloth.v) ((rzm) this.f).get(), (z0) ((rzm) this.g).get(), (com.yandex.passport.internal.sloth.g) ((rzm) this.h).get(), (com.yandex.passport.internal.sloth.e) ((rzm) this.i).get(), (com.yandex.passport.sloth.f) ((rzm) this.j).get(), (com.yandex.passport.sloth.dependencies.d) ((rzm) this.k).get(), (com.yandex.passport.sloth.url.x) ((rzm) this.l).get(), (a1) ((rzm) this.m).get());
        }
    }

    public /* synthetic */ d13(Object obj, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, rzm rzmVar11, rzm rzmVar12, int i) {
        this.a = i;
        this.b = obj;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
        this.h = rzmVar6;
        this.i = rzmVar7;
        this.j = rzmVar8;
        this.k = rzmVar9;
        this.l = rzmVar10;
        this.m = rzmVar11;
        this.n = rzmVar12;
    }

    public d13(toe toeVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, rzm rzmVar11, rzm rzmVar12) {
        this.a = 3;
        this.n = toeVar;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
        this.h = rzmVar7;
        this.i = rzmVar8;
        this.j = rzmVar9;
        this.k = rzmVar10;
        this.l = rzmVar11;
        this.m = rzmVar12;
    }
}
