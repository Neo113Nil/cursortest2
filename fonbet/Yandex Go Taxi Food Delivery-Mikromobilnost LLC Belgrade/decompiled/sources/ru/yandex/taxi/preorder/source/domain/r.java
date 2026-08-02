package ru.yandex.taxi.preorder.source.domain;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.mapkit.geometry.Point;
import defpackage.a60;
import defpackage.agt0;
import defpackage.ah00;
import defpackage.c8s0;
import defpackage.d82;
import defpackage.djt0;
import defpackage.dqe0;
import defpackage.drb0;
import defpackage.ejt0;
import defpackage.emb0;
import defpackage.gh00;
import defpackage.git0;
import defpackage.gmb0;
import defpackage.i130;
import defpackage.jst;
import defpackage.ndt0;
import defpackage.ng9;
import defpackage.nh9;
import defpackage.p9s0;
import defpackage.p9t0;
import defpackage.pv0;
import defpackage.qdt0;
import defpackage.qy41;
import defpackage.rft0;
import defpackage.ry41;
import defpackage.sit;
import defpackage.svw;
import defpackage.tb1;
import defpackage.tit0;
import defpackage.unr0;
import defpackage.uud0;
import defpackage.v770;
import defpackage.wpb0;
import defpackage.x5s0;
import defpackage.y8s0;
import defpackage.ypb0;
import defpackage.zzs;
import java.util.Iterator;
import java.util.function.Consumer;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.common_models.net.map_object.p0;
import ru.yandex.taxi.common_models.net.map_object.r0;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;
import ru.yandex.taxi.preorder.source.pickup.PickupPointAnalytics$PointType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class r implements svw {
    public final djt0 A;
    public wpb0 C;
    public wpb0 D;
    public boolean F;
    public ndt0 G;
    public final Lifecycle a;
    public final git0 b;
    public final Context c;
    public final ru.yandex.taxi.preorder.source.pickup.a d;
    public final ru.yandex.taxi.map.overlay.pickup.d e;
    public final ypb0 f;
    public final drb0 g;
    public final com.yandex.go.pin.api.a h;
    public final ah00 i;
    public final dqe0 j;
    public final i130 k;
    public final tit0 l;
    public final com.yandex.go.navigation.screen.c m;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e n;
    public final agt0 o;
    public final AddressResolveRepository p;
    public final ng9 q;
    public final y8s0 r;
    public final p9s0 s;
    public final qy41 t;
    public final nh9 u;
    public final rft0 v;
    public final c8s0 w;
    public final tb1 x;
    public final ru.yandex.taxi.address.clarification.impl.repo.a y;
    public final sit z;
    public final qdt0 B = new qdt0(this);
    public boolean E = true;

    public r(Lifecycle lifecycle, git0 git0Var, Context context, ru.yandex.taxi.preorder.source.pickup.a aVar, ru.yandex.taxi.map.overlay.pickup.d dVar, ypb0 ypb0Var, drb0 drb0Var, com.yandex.go.pin.api.a aVar2, ah00 ah00Var, dqe0 dqe0Var, i130 i130Var, tit0 tit0Var, com.yandex.go.navigation.screen.c cVar, ru.yandex.taxi.preorder.source.mode.interactor.e eVar, agt0 agt0Var, AddressResolveRepository addressResolveRepository, ng9 ng9Var, y8s0 y8s0Var, p9s0 p9s0Var, qy41 qy41Var, nh9 nh9Var, rft0 rft0Var, c8s0 c8s0Var, tb1 tb1Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar3, sit sitVar, djt0 djt0Var) {
        this.a = lifecycle;
        this.b = git0Var;
        this.c = context;
        this.d = aVar;
        this.e = dVar;
        this.f = ypb0Var;
        this.g = drb0Var;
        this.h = aVar2;
        this.i = ah00Var;
        this.j = dqe0Var;
        this.k = i130Var;
        this.l = tit0Var;
        this.m = cVar;
        this.n = eVar;
        this.o = agt0Var;
        this.p = addressResolveRepository;
        this.q = ng9Var;
        this.r = y8s0Var;
        this.s = p9s0Var;
        this.t = qy41Var;
        this.u = nh9Var;
        this.v = rft0Var;
        this.w = c8s0Var;
        this.x = tb1Var;
        this.y = aVar3;
        this.z = sitVar;
        this.A = djt0Var;
    }

    public static final void a(r rVar, gmb0 gmb0Var) {
        rVar.l.e = gmb0Var;
        if (!rVar.c()) {
            rVar.e.Ig();
            rVar.h(gmb0Var);
        } else {
            if (rVar.F) {
                rVar.F = false;
                return;
            }
            rVar.h(gmb0Var);
        }
        rVar.F = false;
    }

    public final void b(CameraAnimationUpdateType cameraAnimationUpdateType) {
        unr0.C(new Object[]{cameraAnimationUpdateType}, 1, "pickup: cameraAnimationUpdated %s", jst.e);
        if (cameraAnimationUpdateType == CameraAnimationUpdateType.ANIMATE_TO_PICKUP_POINT || cameraAnimationUpdateType == CameraAnimationUpdateType.ANIMATE_TAP_ON_PICKUP_POINT) {
            this.E = true;
        }
        g();
    }

    public final boolean c() {
        Float f;
        float j = ((gh00) this.i).j();
        ClarifyPointsScreenStrategyConfigurationExperiment.PointConfigurationDto pointConfigurationDto = ((com.yandex.go.pickuppoints.impl.l) this.g).a;
        return ((j > ((pointConfigurationDto == null || (f = pointConfigurationDto.a) == null) ? 13.0f : f.floatValue()) ? 1 : (j == ((pointConfigurationDto == null || (f = pointConfigurationDto.a) == null) ? 13.0f : f.floatValue()) ? 0 : -1)) >= 0) && (this.n.a.a().p() || ((Boolean) kotlinx.coroutines.flow.e.d(this.y.f).a.getValue()).booleanValue() || ((Boolean) this.w.a.b()).booleanValue());
    }

    public final void d(wpb0 wpb0Var) {
        uud0 b;
        if (wpb0Var == null || (b = wpb0Var.b(this.d.c())) == null) {
            return;
        }
        e(wpb0Var.a, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str, uud0 uud0Var) {
        int i;
        ru.yandex.taxi.common_models.net.map_object.o c = uud0Var.c();
        Object obj = null;
        if (c != null) {
            this.u.b(c, null);
        }
        Iterator it = uud0Var.a.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            z zVar = (z) next;
            if (zVar != null ? zVar instanceof p0 : true) {
                obj = next;
                break;
            }
        }
        p0 p0Var = (p0) obj;
        if (p0Var != null) {
            this.r.e(str, p0Var);
        }
        d0 d = uud0Var.d();
        Screen b = this.m.b();
        SelectionOrigin selectionOrigin = SelectionOrigin.USER;
        Runnable d82Var = new d82(1);
        Consumer x5s0Var = new x5s0(i, this);
        if (b != Screen.SUMMARY && b != Screen.ROUTE_SELECTOR) {
            i = 0;
        }
        this.q.a(d, selectionOrigin, d82Var, x5s0Var, i);
        r0 e = uud0Var.e();
        if (e != null) {
            String str2 = e.a;
            p9s0 p9s0Var = this.s;
            p9s0Var.getClass();
            if (str2.length() > 0) {
                ((a60) p9s0Var.a).c(str2, v770.e);
            }
        }
    }

    public final boolean f() {
        return c() && !this.d.o.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        Object[] objArr;
        if (!((ry41) this.t).f() && this.b.a.w.a(Lifecycle.State.STARTED)) {
            p9t0 p9t0Var = new p9t0(1 == true ? 1 : 0, this);
            ru.yandex.taxi.preorder.source.pickup.a aVar = this.d;
            gmb0 c = aVar.o.c();
            c.getClass();
            aVar.o = new emb0(c, p9t0Var);
            boolean f = f();
            AddressResolveRepository addressResolveRepository = this.p;
            ru.yandex.taxi.map.overlay.pickup.d dVar = this.e;
            if (!f) {
                dVar.Ig();
                addressResolveRepository.a(false);
                return;
            }
            String str = aVar.j;
            gh00 gh00Var = (gh00) this.i;
            wpb0 j = j(gh00Var.e.b(), false);
            dVar.Ng(j);
            if (!"drag".equals(str)) {
                gmb0 gmb0Var = aVar.o;
                View a = ((ejt0) this.A).a();
                if (a != null) {
                    Runnable runnable = this.G;
                    if (runnable != null) {
                        a.removeCallbacks(runnable);
                    }
                    ndt0 ndt0Var = new ndt0(this, gmb0Var);
                    this.G = ndt0Var;
                    a.post(ndt0Var);
                }
            }
            if (j == null || !((Boolean) this.z.a.invoke()).booleanValue() || (j.equals(this.C) && this.E)) {
                dVar.Mg();
            } else {
                dVar.Jg(j);
            }
            zzs b = gh00Var.e.b();
            if (j != null) {
                zzs zzsVar = j.b;
                gh00Var.getClass();
                if (gh00Var.f(new Point(b.a, b.b), ru.yandex.taxi.map.utils.a.F(zzsVar)) < 1.0d) {
                    objArr = true;
                    wpb0 wpb0Var = objArr == false ? j : null;
                    addressResolveRepository.a(wpb0Var == null && dVar.Lg(wpb0Var));
                    if (j != null || !objArr == true || str == null || j.equals(this.D)) {
                        return;
                    }
                    int hashCode = str.hashCode();
                    if (hashCode != -607398952) {
                        if (hashCode != 114595) {
                            if (hashCode != 3091764 || !str.equals("drag")) {
                                return;
                            }
                        } else if (!str.equals("tap")) {
                            return;
                        }
                    } else if (!str.equals("label_tap")) {
                        return;
                    }
                    this.f.a(j, PickupPointAnalytics$PointType.SOURCE, str);
                    this.D = j;
                    return;
                }
            }
            objArr = false;
            if (objArr == false) {
            }
            addressResolveRepository.a(wpb0Var == null && dVar.Lg(wpb0Var));
            if (j != null) {
            }
        }
    }

    public final void h(gmb0 gmb0Var) {
        jst.e.getClass();
        ru.yandex.taxi.preorder.source.pickup.a aVar = this.d;
        aVar.g(gmb0Var);
        tit0 tit0Var = this.l;
        if (tit0Var.c()) {
            aVar.f(tit0Var.a(), gmb0Var.b());
        }
        g();
    }

    public final void i(pv0 pv0Var) {
        if (((ry41) this.t).f()) {
            return;
        }
        jst.e.getClass();
        ru.yandex.taxi.lifecycle.c.b(this.b.a, CoroutineStart.DEFAULT, new SourcePickupPointInteractor$processPickupPoints$1(this, pv0Var, null));
    }

    public final wpb0 j(zzs zzsVar, boolean z) {
        if (zzsVar == null || !f()) {
            return null;
        }
        return this.d.h(this.i, zzsVar, z);
    }
}
