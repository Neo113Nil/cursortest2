package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.aoi;
import defpackage.bvf0;
import defpackage.bys0;
import defpackage.c9x0;
import defpackage.cxm;
import defpackage.cys0;
import defpackage.czh;
import defpackage.fcj0;
import defpackage.gp7;
import defpackage.h3y;
import defpackage.hp7;
import defpackage.ht10;
import defpackage.i5m;
import defpackage.izh;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.jse;
import defpackage.l7s0;
import defpackage.ldc;
import defpackage.lu5;
import defpackage.lvn;
import defpackage.mvn;
import defpackage.mys0;
import defpackage.nys0;
import defpackage.o33;
import defpackage.o5s;
import defpackage.p6s;
import defpackage.pys0;
import defpackage.qcp0;
import defpackage.qgn0;
import defpackage.qhw0;
import defpackage.st2;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ts11;
import defpackage.u1n;
import defpackage.u33;
import defpackage.uys0;
import defpackage.vys0;
import defpackage.w511;
import defpackage.wor0;
import defpackage.x230;
import defpackage.x670;
import defpackage.y2s0;
import defpackage.y670;
import defpackage.y9g;
import defpackage.ywf;
import defpackage.z8n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.logistics.childrouter.api.Animation;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.OpeningSource;

/* loaded from: classes5.dex */
public final class j {
    public final st2 a;
    public final h3y b;
    public final o5s c;
    public final p6s d;
    public final ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c e;
    public final x230 f;
    public final u1n g;
    public final m h;
    public final b i;
    public qhw0 j;
    public qhw0 k;
    public String l;

    public j(st2 st2Var, h3y h3yVar, o5s o5sVar, p6s p6sVar, ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c cVar, x230 x230Var, u1n u1nVar, m mVar, b bVar) {
        this.a = st2Var;
        this.b = h3yVar;
        this.c = o5sVar;
        this.d = p6sVar;
        this.e = cVar;
        this.f = x230Var;
        this.g = u1nVar;
        this.h = mVar;
        this.i = bVar;
    }

    public static final void a(j jVar, uys0 uys0Var, c9x0 c9x0Var) {
        jVar.getClass();
        h hVar = new h(jVar, c9x0Var, new x670(jVar, 0), uys0Var);
        jVar.e.e(new gp7(uys0Var.a, uys0Var.b), hVar);
    }

    public static final boolean b(j jVar, vys0 vys0Var, c9x0 c9x0Var) {
        Object obj;
        j6s b = jVar.d.b();
        Map map = b != null ? b.a : null;
        Object obj2 = map != null ? map.get(vys0Var.d) : null;
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        boolean z = false;
        if (number == null) {
            return false;
        }
        Iterator it = vys0Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u33) obj).a == number.intValue()) {
                break;
            }
        }
        u33 u33Var = (u33) obj;
        ht10 ht10Var = new ht10(jVar, vys0Var, z, 20);
        y670 y670Var = new y670(jVar, c9x0Var, new x670(jVar, 1));
        FormattedText formattedText = vys0Var.a;
        String str = vys0Var.b;
        o33 o33Var = u33Var != null ? new o33(u33Var.b, u33Var.c, u33Var.d) : null;
        ArrayList<u33> arrayList = vys0Var.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (u33 u33Var2 : arrayList) {
            arrayList2.add(new o33(u33Var2.b, u33Var2.c, u33Var2.d));
        }
        jVar.e.e(new hp7(formattedText, str, o33Var, arrayList2, ht10Var), y670Var);
        return true;
    }

    public final void c(c9x0 c9x0Var) {
        Pair pair;
        OpeningSource openingSource = c9x0Var.g;
        ldc ldcVar = c9x0Var.h;
        OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$1 openOverCameraModalViewInteractor$openCameraScreenWithModalView$1 = new OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$1(0, this, j.class, "cancelScope", "cancelScope()V", 0);
        ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c cVar = this.e;
        cVar.d();
        l7s0 l7s0Var = new l7s0(ldcVar);
        int i = 3;
        if (cVar.g == null) {
            nys0 nys0Var = (nys0) cVar.b.get();
            cVar.g = nys0Var;
            if (nys0Var != null) {
                int i2 = 25;
                lu5 lu5Var = new lu5(i2, openOverCameraModalViewInteractor$openCameraScreenWithModalView$1, cVar);
                czh create = nys0Var.a.create();
                nys0Var.c = create;
                wor0 wor0Var = nys0Var.b;
                l7s0 l7s0Var2 = new l7s0(l7s0Var);
                fcj0 fcj0Var = (fcj0) wor0Var.a;
                fcj0Var.getClass();
                y9g y9gVar = new y9g(fcj0Var, 2);
                y9g y9gVar2 = new y9g(fcj0Var, 1);
                bys0 bys0Var = (bys0) i5m.b(new cys0((Object) y9gVar, i5m.b(new z8n0(y9gVar2, new y2s0(new y9g(fcj0Var, i), new y9g(fcj0Var, 0), y9gVar2, 5), new y9g(fcj0Var, 4), new ywf(16, l7s0Var2), 29)), 0)).get();
                qcp0 qcp0Var = bys0Var.a;
                pys0 pys0Var = bys0Var.b;
                lvn lvnVar = new lvn();
                mvn mvnVar = new mvn();
                qcp0Var.getClass();
                aoi aoiVar = new aoi(pys0Var, lvnVar, mvnVar);
                int i3 = mys0.a[openingSource.ordinal()];
                if (i3 == 1) {
                    pair = new Pair(Animation.NONE, Animation.SIDE_SLIDE);
                } else if (i3 != 2) {
                    w511.b();
                    return;
                } else {
                    Animation animation = Animation.COMMON;
                    pair = new Pair(animation, animation);
                }
                czh.a(create, new izh(new cxm(aoiVar), null, ScreenMode.FULLSCREEN_MODE, new ts11(false, true, null, (Animation) pair.getFirst(), (Animation) pair.getSecond(), 43), new qgn0(i2, lu5Var), null, 7414));
            }
        }
        qhw0 qhw0Var = this.j;
        if (qhw0Var != null) {
            qhw0Var.a(null);
        }
        this.j = jl40.a();
        qhw0 qhw0Var2 = this.k;
        if (qhw0Var2 != null) {
            qhw0Var2.a(null);
        }
        this.k = jl40.a();
        jse jseVar = this.a.a;
        qhw0 qhw0Var3 = this.j;
        if (qhw0Var3 == null) {
            qhw0Var3 = jl40.a();
        }
        tje.N(bvf0.a(jseVar.plus(qhw0Var3)), null, null, new OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2(this, c9x0Var, null), 3);
    }
}
