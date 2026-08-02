package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.common.coroutine.a;
import com.yandex.passport.common.ui.lang.b;
import com.yandex.passport.internal.flags.experiments.h;
import com.yandex.passport.internal.sloth.e;
import com.yandex.passport.internal.sloth.g;
import com.yandex.passport.internal.sloth.i;
import com.yandex.passport.internal.sloth.j;
import com.yandex.passport.internal.sloth.k;
import com.yandex.passport.internal.sloth.o;
import com.yandex.passport.internal.sloth.p;
import com.yandex.passport.internal.sloth.w;
import com.yandex.passport.internal.sloth.z;
import com.yandex.passport.internal.ui.common.c;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.d2;
import com.yandex.passport.sloth.ui.dependencies.d;
import com.yandex.passport.sloth.ui.dependencies.n;
import com.yandex.passport.sloth.ui.l;
import com.yandex.passport.sloth.ui.l0;
import com.yandex.passport.sloth.ui.s0;

/* loaded from: classes4.dex */
public final class kdk implements rzm {
    public final /* synthetic */ int a;
    public final szm b;
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
    public final rzm m;

    public kdk(kjn kjnVar, toe toeVar, toe toeVar2, toe toeVar3, toe toeVar4, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, toe toeVar5, toe toeVar6, rzm rzmVar5, rzm rzmVar6) {
        this.a = 0;
        this.b = toeVar;
        this.c = toeVar2;
        this.d = toeVar3;
        this.m = toeVar4;
        this.e = rzmVar;
        this.f = rzmVar2;
        this.g = rzmVar3;
        this.h = rzmVar4;
        this.i = toeVar5;
        this.j = toeVar6;
        this.k = rzmVar5;
        this.l = rzmVar6;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                jdk jdkVar = (jdk) this.b.get();
                jeq jeqVar = (jeq) this.c.get();
                ehk ehkVar = (ehk) this.d.get();
                xwj xwjVar = (xwj) ((toe) this.m).a;
                t28 t28Var = (t28) this.e.get();
                l9i l9iVar = (l9i) this.f.get();
                tbk tbkVar = (tbk) this.g.get();
                ti4 ti4Var = (ti4) this.h.get();
                g0c g0cVar = (g0c) this.i.get();
                x60 x60Var = (x60) this.j.get();
                hos hosVar = (hos) this.k.get();
                pxf pxfVar = (pxf) this.l.get();
                jdkVar.getClass();
                jeqVar.getClass();
                ehkVar.getClass();
                t28Var.getClass();
                l9iVar.getClass();
                tbkVar.getClass();
                ti4Var.getClass();
                g0cVar.getClass();
                x60Var.getClass();
                hosVar.getClass();
                pxfVar.getClass();
                return new j03(wxf.Q(jdkVar), jeqVar, nif.d(new dhk(ehkVar.a, xwjVar != null ? xwjVar.a : null)), t28Var, l9iVar, tbkVar, g0cVar, x60Var, hosVar, ti4Var, new c13(pxfVar, 1));
            case 1:
                return new k((Context) ((rzm) this.b).get(), (a) ((rzm) this.c).get(), (i) ((rzm) this.d).get(), (w) ((rzm) this.e).get(), (j) ((rzm) this.f).get(), (com.yandex.passport.internal.flags.i) ((rzm) this.g).get(), (o) ((rzm) this.h).get(), (b) ((rzm) this.i).get(), (z) ((rzm) this.j).get(), (p) ((rzm) this.k).get(), (g) ((h) this.l).get(), (e) this.m.get());
            default:
                return new b0((Activity) ((rzm) this.b).get(), (s0) ((rzm) this.c).get(), new l0(), (com.yandex.passport.sloth.ui.string.b) ((rzm) this.d).get(), (d2) ((rzm) this.e).get(), (d) ((n) this.f).get(), (com.yandex.passport.internal.flags.experiments.p) ((c) this.g).get(), new com.yandex.passport.data.network.token.i(26), (b1) ((rzm) this.h).get(), (l) ((n) this.i).get(), (com.yandex.passport.common.common.a) ((n) this.j).get(), (com.yandex.passport.sloth.ui.dependencies.p) ((n) this.k).get(), (agv) ((n) this.l).get(), (com.yandex.passport.sloth.dependencies.i) ((n) this.m).get());
        }
    }

    public /* synthetic */ kdk(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, rzm rzmVar10, rzm rzmVar11, rzm rzmVar12, int i) {
        this.a = i;
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
