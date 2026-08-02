package defpackage;

import com.yandex.go.preorder.map.CameraAnimationFinishType;
import com.yandex.go.preorder.mode.SourcePointMode;
import kotlin.Pair;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class yet0 {
    public final qy41 a;
    public final yq40 b;
    public final e c;
    public final tit0 d;
    public final c9l0 e;
    public final ya20 f;
    public final ab20 g;
    public final r h;
    public final xfv0 i;
    public final zit0 j;
    public final tft0 k;
    public final mrj l;
    public final a m;

    public yet0(qy41 qy41Var, yq40 yq40Var, e eVar, tit0 tit0Var, c9l0 c9l0Var, ya20 ya20Var, ab20 ab20Var, r rVar, xfv0 xfv0Var, zit0 zit0Var, tft0 tft0Var, mrj mrjVar, a aVar) {
        this.a = qy41Var;
        this.b = yq40Var;
        this.c = eVar;
        this.d = tit0Var;
        this.e = c9l0Var;
        this.f = ya20Var;
        this.g = ab20Var;
        this.h = rVar;
        this.i = xfv0Var;
        this.j = zit0Var;
        this.k = tft0Var;
        this.l = mrjVar;
        this.m = aVar;
    }

    public final void a(CameraAnimationFinishType cameraAnimationFinishType, boolean z, String str) {
        String str2;
        this.j.a = null;
        SourcePointMode a = this.c.a.a();
        this.i.a(new qfv0(a.w()));
        if ((!a.q() || ((Boolean) kotlinx.coroutines.flow.e.d(this.m.f).a.getValue()).booleanValue()) && !this.d.j) {
            r rVar = this.h;
            zzs b = ((gh00) rVar.i).e.b();
            wpb0 j = rVar.j(b, false);
            if (j == null || !rVar.e.Kg()) {
                rVar.E = false;
            } else if (!rVar.l.c()) {
                boolean z2 = true;
                if (j.equals(rVar.C) && rVar.E) {
                    rVar.C = null;
                    boolean z3 = cameraAnimationFinishType == CameraAnimationFinishType.ANIMATE_TAP_ON_PICKUP_POINT;
                    rVar.E = z3;
                    if (!z3 || ((str2 = rVar.j.a.Q) != null && !evu0.J(str2))) {
                        z2 = false;
                    }
                    rVar.F = z2;
                } else {
                    rVar.C = j;
                    b = j.b;
                    rVar.o.a(b, null);
                    String str3 = rVar.j.a.Q;
                    if (str3 != null && !evu0.J(str3)) {
                        z2 = false;
                    }
                    rVar.F = z2;
                }
            }
            if (j != null) {
                j.b(rVar.d.c());
            }
            boolean a2 = this.e.a();
            za20 za20Var = new za20(((ry41) this.a).f(), a2, this.h.e.Kg());
            ab20 ab20Var = this.g;
            synchronized (ab20Var) {
                ab20Var.a = za20Var;
            }
            if (str == null) {
                str = this.f.a();
            }
            if (str.equals("manual")) {
                tit0 tit0Var = this.d;
                tit0Var.h = tit0Var.c();
            }
            this.d.g = str;
            mrj mrjVar = this.l;
            if (j == null) {
                mrjVar.getClass();
            } else if (((hp0) mrjVar.c).a()) {
                ((r) ((svw) mrjVar.w)).d(j);
                wb1 wb1Var = (wb1) mrjVar.b;
                wb1Var.getClass();
                wb1Var.l(j.a, UpdateReason.UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP);
                return;
            }
            if (!this.d.c() || z) {
                this.h.d(j);
                b(b, str, j, a2);
                return;
            }
            tit0 tit0Var2 = this.d;
            if (cameraAnimationFinishType != CameraAnimationFinishType.ANIMATE_TAP_ON_PICKUP_POINT) {
                tit0Var2.q = null;
                tit0Var2.p = null;
                tit0Var2.h = tit0Var2.c();
                b(b, "manual", j, false);
                return;
            }
            uq40 uq40Var = (uq40) this.b.b.get();
            tit0 tit0Var3 = uq40Var.n;
            Pair b2 = j != null ? tit0Var3.b(j) : null;
            if (b2 != null) {
                if (uq40Var.d()) {
                    jr40 jr40Var = (jr40) b2.c();
                    wq40 wq40Var = (wq40) b2.f();
                    MultiexitModalView multiexitModalView = uq40Var.I;
                    if (multiexitModalView != null) {
                        multiexitModalView.selectEntrance(jr40Var, wq40Var);
                    }
                } else if (uq40Var.p.b() || ((ir40) uq40Var.o.a.b()).b) {
                    uq40Var.e((jr40) b2.c(), (wq40) b2.f(), false);
                } else {
                    uq40Var.g(tit0Var3.d, (jr40) b2.c(), (wq40) b2.f());
                }
            }
            this.h.d(j);
        }
    }

    public final void b(zzs zzsVar, String str, wpb0 wpb0Var, boolean z) {
        wit0 wit0Var = (wit0) this.k.a(true);
        wit0Var.a(true);
        wit0Var.b(zzsVar);
        ((i) wit0Var.b).o(zzsVar, str, RoutePointType.POINT_A, wpb0Var != null ? wpb0Var.a : null, z, null, PositionInitAction.MAP);
    }
}
