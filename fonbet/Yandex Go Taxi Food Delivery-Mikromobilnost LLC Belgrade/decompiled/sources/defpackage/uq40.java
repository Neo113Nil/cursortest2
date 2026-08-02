package defpackage;

import android.content.Context;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import com.yandex.go.zone.model.Zone;
import java.util.HashMap;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class uq40 {
    public final biv0 A;
    public final i130 B;
    public final uet0 C;
    public final net0 D;
    public final zit0 E;
    public final kip F;
    public boolean H;
    public MultiexitModalView I;
    public l9 K;
    public final a a;
    public final ah00 b;
    public final f600 c;
    public final dqe0 d;
    public final as21 e;
    public final rjt0 f;
    public final a3v g;
    public final mhf h;
    public final n050 i;
    public final yit0 j;
    public final c k;
    public final f0l0 l;
    public final il40 m;
    public final tit0 n;
    public final nq40 o;
    public final c9l0 p;
    public final qx60 q;
    public final b r;
    public final n5v0 s;
    public final e t;
    public final agt0 u;
    public final h3y v;
    public final v w;
    public final zqz0 x;
    public final evr y;
    public final r z;
    public final ktg G = new ktg();
    public g18 J = g18.u1;

    public uq40(a aVar, ah00 ah00Var, f600 f600Var, dqe0 dqe0Var, as21 as21Var, rjt0 rjt0Var, a3v a3vVar, mhf mhfVar, n050 n050Var, yit0 yit0Var, c cVar, f0l0 f0l0Var, il40 il40Var, tit0 tit0Var, nq40 nq40Var, c9l0 c9l0Var, qx60 qx60Var, b bVar, n5v0 n5v0Var, e eVar, agt0 agt0Var, h3y h3yVar, v vVar, zqz0 zqz0Var, evr evrVar, r rVar, biv0 biv0Var, i130 i130Var, uet0 uet0Var, net0 net0Var, zit0 zit0Var, kip kipVar) {
        this.a = aVar;
        this.b = ah00Var;
        this.c = f600Var;
        this.d = dqe0Var;
        this.e = as21Var;
        this.f = rjt0Var;
        this.g = a3vVar;
        this.h = mhfVar;
        this.i = n050Var;
        this.j = yit0Var;
        this.k = cVar;
        this.l = f0l0Var;
        this.m = il40Var;
        this.n = tit0Var;
        this.o = nq40Var;
        this.p = c9l0Var;
        this.q = qx60Var;
        this.r = bVar;
        this.s = n5v0Var;
        this.t = eVar;
        this.u = agt0Var;
        this.v = h3yVar;
        this.w = vVar;
        this.x = zqz0Var;
        this.y = evrVar;
        this.z = rVar;
        this.A = biv0Var;
        this.B = i130Var;
        this.C = uet0Var;
        this.D = net0Var;
        this.E = zit0Var;
        this.F = kipVar;
    }

    public static final void a(uq40 uq40Var, ModalViewOrigin modalViewOrigin) {
        tit0 tit0Var = uq40Var.n;
        jr40 jr40Var = tit0Var.p;
        wq40 wq40Var = tit0Var.q;
        if (jr40Var != null && wq40Var != null) {
            hde0 hde0Var = uq40Var.f.l;
            String str = wq40Var.a;
            String str2 = jr40Var.b;
            String str3 = wq40Var.b;
            hde0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("pointId", str);
            hashMap.put("choiceName", str2);
            hde0Var.a.a("PositionChoicesDone", hashMap, 2, tse0.r("choicePointName", hashMap, str3));
        }
        tit0Var.m = false;
        uq40Var.c(modalViewOrigin);
    }

    public final void b() {
        this.B.a().o(new qq40(this, 0));
        this.I = null;
    }

    public final void c(ModalViewOrigin modalViewOrigin) {
        b();
        boolean b = this.p.b();
        if (!b && (modalViewOrigin == ModalViewOrigin.SUMMARY || this.H)) {
            this.j.c(bov0.e);
        } else if (!b) {
            jpv0 b2 = this.A.b();
            b2.getClass();
            if ((b2 instanceof fpv0) && ((Boolean) this.F.a.b()).booleanValue()) {
                this.C.a();
            }
        }
        this.H = false;
    }

    public final boolean d() {
        return this.I != null;
    }

    public final void e(jr40 jr40Var, wq40 wq40Var, boolean z) {
        if (z) {
            this.a.j = "multiexit_select";
        }
        PlainAddress plainAddress = wq40Var.c;
        Zone c = this.d.c();
        this.r.m(new ZoneAddress(plainAddress, c), null);
        String c2 = plainAddress.c2();
        if (c2 != null) {
            wit0 wit0Var = (wit0) this.s;
            wit0Var.a(true);
            atd0 atd0Var = wit0Var.b;
            RoutePointType routePointType = RoutePointType.POINT_A;
            v5v0 v5v0Var = ((i) atd0Var).e.a;
            v5v0Var.a.put(routePointType.getType(), c2);
        }
        v vVar = this.w;
        if (c != null) {
            vVar.e.a(c, null);
        } else {
            vVar.getClass();
        }
        tit0 tit0Var = this.n;
        wq40 wq40Var2 = tit0Var.q;
        jr40 jr40Var2 = tit0Var.p;
        tit0Var.q = wq40Var;
        tit0Var.o = wq40Var;
        tit0Var.p = jr40Var;
        tit0Var.n = jr40Var;
        zzs B = plainAddress.B();
        r rVar = this.z;
        rVar.d(rVar.j(B, false));
        this.E.a = plainAddress;
        this.u.a(plainAddress.B(), new rq40(this, 0));
        rjt0 rjt0Var = this.f;
        if (jr40Var2 != null && !jr40Var2.equals(jr40Var)) {
            fde0 fde0Var = rjt0Var.j;
            String str = jr40Var.b;
            String str2 = jr40Var2.b;
            fde0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("currChoiceName", str);
            hashMap.put("prevChoiceName", str2);
            fde0Var.a.a("PositionChoicesChangeChoice", hashMap, 2, new HashMap());
        }
        if (wq40Var2 != null && !wq40Var2.equals(wq40Var)) {
            gde0 gde0Var = rjt0Var.k;
            String str3 = wq40Var.b;
            String str4 = wq40Var2.b;
            gde0Var.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("currPointName", str3);
            hashMap2.put("prevPointName", str4);
            gde0Var.a.a("PositionChoicesChangeChoicePoint", hashMap2, 2, new HashMap());
        }
        ide0 ide0Var = rjt0Var.h;
        ide0Var.getClass();
        ide0Var.a.a("PositionChoicesSelectOnPicker", new HashMap(), 1, new HashMap());
    }

    public final void f(mq40 mq40Var, jr40 jr40Var, wq40 wq40Var) {
        jpv0 b = this.A.b();
        b.getClass();
        int i = 1;
        if (b instanceof hpv0) {
            this.H = true;
        }
        i130 i130Var = this.B;
        i130Var.a().a();
        MultiexitModalView multiexitModalView = this.I;
        if (multiexitModalView != null) {
            multiexitModalView.setAirport(mq40Var);
        } else {
            MultiexitModalView multiexitModalView2 = (MultiexitModalView) i130Var.a().i(MultiexitModalView.class);
            if (multiexitModalView2 != null) {
                multiexitModalView2.setAirport(mq40Var);
                this.I = multiexitModalView2;
            } else {
                ModalViewOrigin modalViewOrigin = this.h.b() == Screen.SUMMARY ? ModalViewOrigin.SUMMARY : ModalViewOrigin.HOME;
                tq40 tq40Var = new tq40(this);
                qq40 qq40Var = new qq40(this, i);
                qq40 qq40Var2 = new qq40(this, 2);
                qq40 qq40Var3 = new qq40(this, 3);
                il40 il40Var = this.m;
                il40Var.getClass();
                modalViewOrigin.getClass();
                mq40Var.getClass();
                int i2 = 0;
                xvf0 b2 = i5m.b(new di20(new a4g(il40Var, i2), new a4g(il40Var, i), n3w.a(mq40Var), 17));
                Context context = il40Var.a;
                q5z.h(context);
                MultiexitModalView multiexitModalView3 = new MultiexitModalView(context, modalViewOrigin, (ru.yandex.taxi.multiexit.a) b2.get(), tq40Var, qq40Var3);
                multiexitModalView3.setOnAppearingListener(new ou4(6, this, qq40Var));
                this.I = multiexitModalView3;
                w030 a = i130Var.a();
                this.J = a.g(new sq40(i2, this, qq40Var2));
                a.k(multiexitModalView3, 2.0f, true);
            }
        }
        this.j.a(MapPositionAction.DEFAULT);
        ((ru.yandex.taxi.routeselector.a) this.p.b.get()).i();
        MultiexitModalView multiexitModalView4 = this.I;
        if (multiexitModalView4 != null) {
            multiexitModalView4.selectEntrance(jr40Var, wq40Var);
        }
        MultiexitModalView multiexitModalView5 = this.I;
        if (multiexitModalView5 != null) {
            multiexitModalView5.enable();
        }
    }

    public final void g(mq40 mq40Var, jr40 jr40Var, wq40 wq40Var) {
        if (((ru.yandex.taxi.orderforanother.router.a) ((aw70) this.v.get())).d.a().r(true, WhoRideSelectorModalView.class) != null) {
            this.K = new l9(this, mq40Var, jr40Var, wq40Var, 18);
        } else {
            f(mq40Var, jr40Var, wq40Var);
        }
    }
}
