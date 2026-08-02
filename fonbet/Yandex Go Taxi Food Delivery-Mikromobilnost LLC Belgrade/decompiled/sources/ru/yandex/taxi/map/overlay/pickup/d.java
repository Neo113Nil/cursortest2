package ru.yandex.taxi.map.overlay.pickup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.pin.repository.f;
import com.yandex.go.pin.repository.o;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a0h0;
import defpackage.ah00;
import defpackage.cqb0;
import defpackage.erx;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.gmb0;
import defpackage.hbm;
import defpackage.hmb0;
import defpackage.i4b0;
import defpackage.ji70;
import defpackage.jl40;
import defpackage.lp00;
import defpackage.lqx;
import defpackage.m7x0;
import defpackage.muw;
import defpackage.ouw;
import defpackage.pxy;
import defpackage.pzt0;
import defpackage.qa0;
import defpackage.qke;
import defpackage.qxy;
import defpackage.r8;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzy0;
import defpackage.u8b1;
import defpackage.wnb0;
import defpackage.wpb0;
import defpackage.wqb0;
import defpackage.xm00;
import defpackage.xtb1;
import defpackage.yvf0;
import defpackage.zg21;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;
import ru.yandex.taxi.preorder.source.pickup.PickupPoint$PointType;

/* loaded from: classes6.dex */
public final class d extends r8 {
    public final erx A;
    public final hmb0 B;
    public final hbm C;
    public final ru.yandex.taxi.map_common.map.utils.a D;
    public final ouw E;
    public final ru.yandex.taxi.map.overlay.pickup.intersections.b F;
    public final ru.yandex.taxi.map_common.map.process.b G;
    public final yvf0 H;
    public final cqb0 I;
    public final o J;
    public final tzy0 K;
    public final ji70 L;
    public final HashMap M;
    public final wqb0 N;
    public final wqb0 O;
    public final wqb0 P;
    public final wqb0 Q;
    public ImageProvider R;
    public String S;
    public qxy T;
    public pzt0 U;
    public final Context c;
    public final tse w;
    public final lqx x;
    public final xm00 y;
    public final lp00 z;

    public d(ah00 ah00Var, Context context, tse tseVar, lqx lqxVar, xm00 xm00Var, lp00 lp00Var, erx erxVar, hmb0 hmb0Var, hbm hbmVar, ru.yandex.taxi.map_common.map.utils.a aVar, ouw ouwVar, ru.yandex.taxi.map.overlay.pickup.intersections.b bVar, ru.yandex.taxi.map_common.map.process.b bVar2, yvf0 yvf0Var, cqb0 cqb0Var, o oVar) {
        super(5, ah00Var);
        this.c = context;
        this.w = tseVar;
        this.x = lqxVar;
        this.y = xm00Var;
        this.z = lp00Var;
        this.A = erxVar;
        this.B = hmb0Var;
        this.C = hbmVar;
        this.D = aVar;
        this.E = ouwVar;
        this.F = bVar;
        this.G = bVar2;
        this.H = yvf0Var;
        this.I = cqb0Var;
        this.J = oVar;
        this.K = new tzy0(300, new i4b0(14, this));
        this.L = new ji70(2, this);
        this.M = new HashMap();
        this.N = new wqb0(this, 1);
        this.O = new wqb0(this, 2);
        this.P = new wqb0(this, 3);
        this.Q = new wqb0(this, 4);
        this.R = ImageProvider.fromBitmap(u8b1.h(a0h0.route_selected_src_point, context));
        this.S = "default_tag";
        this.T = hmb0Var.a();
        cqb0Var.c = new wqb0(this, 0);
    }

    public final void Hg() {
        this.E.c();
        cqb0 cqb0Var = this.I;
        ouw ouwVar = cqb0Var.a;
        int i = 1;
        if (!cqb0Var.e) {
            lp00 lp00Var = cqb0Var.b;
            wqb0 wqb0Var = cqb0Var.c;
            if (wqb0Var != null) {
                ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
                aVar.a(Participant.PICKUP_POINT_BUBBLES_COLLECTION, wqb0Var);
                muw muwVar = cqb0Var.d;
                if (muwVar != null) {
                    aVar.a(Participant.CLARIFY_POINT_BUBBLE, muwVar);
                }
                ouwVar.a();
                cqb0Var.e = true;
            }
        }
        ouwVar.c();
        this.G.a(MapComputationsProcessor$ExecuteOn.MAIN, new wnb0(i, this));
    }

    public final void Ig() {
        HashMap hashMap = this.M;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
        hashMap.clear();
    }

    public final void Jg(wpb0 wpb0Var) {
        Object obj;
        HashMap hashMap = this.M;
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((a) ((Map.Entry) obj).getValue()).m) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        String str = entry == null ? null : ((wpb0) entry.getKey()).a;
        if (jl40.l(wpb0Var.a, str)) {
            return;
        }
        if (str != null) {
            Mg();
        }
        a aVar = (a) hashMap.get(wpb0Var);
        if (aVar != null) {
            pzt0 pzt0Var = aVar.o;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            aVar.o = tje.N(aVar.g, null, null, new PickupPointMapObject$highlight$$inlined$safeCollectIn$1(new rol0(new PickupPointMapObject$highlightPointAnimation$1(2, null)), null, aVar), 3);
            qke.E(this.c, HapticController$Effect.TICK, false, 8);
        }
    }

    public final boolean Kg() {
        return !this.M.isEmpty();
    }

    public final boolean Lg(wpb0 wpb0Var) {
        HashMap hashMap = this.M;
        a aVar = (a) hashMap.get(wpb0Var);
        boolean z = false;
        for (a aVar2 : hashMap.values()) {
            if (jl40.l(aVar, aVar2)) {
                if (aVar2.j.b) {
                    if (!aVar2.n) {
                        aVar2.n = true;
                        aVar2.f();
                    }
                    if (wpb0Var != null && wpb0Var.c == PickupPoint$PointType.FAVORITES) {
                        return false;
                    }
                    z = true;
                } else {
                    continue;
                }
            } else if (aVar2.n) {
                aVar2.n = false;
                aVar2.f();
            }
        }
        return z;
    }

    public final void Mg() {
        for (a aVar : this.M.values()) {
            if (aVar.m) {
                pzt0 pzt0Var = aVar.o;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                aVar.o = tje.N(aVar.g, null, null, new PickupPointMapObject$removeHighlight$$inlined$safeCollectIn$1(new rol0(new PickupPointMapObject$highlightPointAnimation$1(2, null)), null, aVar), 3);
            }
        }
    }

    public final void Ng(wpb0 wpb0Var) {
        for (Map.Entry entry : this.M.entrySet()) {
            wpb0 wpb0Var2 = (wpb0) entry.getKey();
            a aVar = (a) entry.getValue();
            if (wpb0Var == null || !wpb0Var.equals(wpb0Var2)) {
                aVar.getClass();
            } else {
                boolean z = aVar.j.b;
            }
        }
    }

    public final void Og(Drawable drawable) {
        this.R = ImageProvider.fromBitmap(u8b1.g(drawable));
        for (a aVar : this.M.values()) {
            aVar.e = this.R;
            if (aVar.n) {
                aVar.f();
            }
        }
    }

    public final void Pg(gmb0 gmb0Var) {
        boolean z;
        List<wpb0> b = gmb0Var.b();
        List list = b;
        if (list == null || list.isEmpty()) {
            Ig();
            return;
        }
        boolean e = xtb1.e(this.S, gmb0Var.d());
        hmb0 hmb0Var = this.B;
        if (e) {
            this.S = gmb0Var.d();
            Supplier a = gmb0Var.a();
            this.T = a != null ? a instanceof qxy ? (qxy) a : new pxy(a) : hmb0Var.a();
            z = true;
        } else {
            z = false;
        }
        HashMap hashMap = this.M;
        HashSet hashSet = new HashSet(hashMap.keySet());
        b.forEach(new qa0(19, hashSet));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) hashMap.remove((wpb0) it.next());
            if (aVar != null) {
                aVar.c();
            }
        }
        for (wpb0 wpb0Var : b) {
            a aVar2 = (a) hashMap.remove(wpb0Var);
            if (aVar2 == null) {
                String str = wpb0Var.e;
                if (str == null) {
                    str = "";
                }
                aVar2 = new a(this.y, this.D, wpb0Var, str.length() != 0 ? hmb0Var.b(new zg21(hmb0Var.c, ((m7x0) hmb0Var.b).a(str), hmb0Var.a())) : hmb0Var.b(this.T), this.R, this.x, this.w, (ru.yandex.taxi.layers.presentation.pickup.b) this.H.get());
            } else {
                aVar2.c = wpb0Var;
                Point F = ru.yandex.taxi.map.utils.a.F(wpb0Var.b);
                tje.N(aVar2.g, null, null, new PickupPointMapObject$update$1(aVar2, F, null), 3);
                aVar2.h.a(wpb0Var.h, F, aVar2.n);
                aVar2.j.o(F);
                aVar2.i.o(F);
                f4c0 f4c0Var = aVar2.l;
                if (f4c0Var != null) {
                    f4c0Var.o(F);
                }
                if (z) {
                    aVar2.f();
                }
            }
            hashMap.put(wpb0Var, aVar2);
        }
        this.A.b(hashMap);
        Hg();
    }

    public final void pause() {
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((gh00) ((ah00) this.b)).u(this.L);
        this.E.b();
        Participant participant = Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) this.z;
        aVar.j(participant);
        aVar.j(Participant.PICKUP_POINT_LAST_LABEL);
        aVar.j(Participant.PICKUP_POINT_LABELS_COLLECTION);
        aVar.j(Participant.PICKUP_POINT_DOTS_COLLECTION);
        Participant participant2 = Participant.PICKUP_POINT_BUBBLES_COLLECTION;
        aVar.j(participant2);
        cqb0 cqb0Var = this.I;
        cqb0Var.a.b();
        ru.yandex.taxi.map_common.map.intersection.a aVar2 = (ru.yandex.taxi.map_common.map.intersection.a) cqb0Var.b;
        aVar2.j(participant2);
        aVar2.j(Participant.CLARIFY_POINT_BUBBLE);
        cqb0Var.e = false;
    }

    public final void resume() {
        Participant participant = Participant.PICKUP_POINT_DOTS_COLLECTION;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) this.z;
        aVar.a(participant, this.N);
        aVar.a(Participant.PICKUP_POINT_LABELS_COLLECTION, this.O);
        aVar.a(Participant.PICKUP_POINT_LAST_LABEL, this.P);
        aVar.a(Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION, this.Q);
        this.E.a();
        ((gh00) ((ah00) this.b)).e(this.L);
        o oVar = this.J;
        this.U = tje.N(this.w, null, null, new PickupPointsOverlay$resume$$inlined$safeCollectIn$1(e.t(new c(new f(((ru.yandex.taxi.styling.f) oVar.c).d(new com.yandex.go.pin.repository.d(oVar.c()))))), null, this), 3);
    }
}
